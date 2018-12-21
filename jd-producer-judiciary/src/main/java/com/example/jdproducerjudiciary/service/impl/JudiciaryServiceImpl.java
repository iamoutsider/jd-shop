package com.example.jdproducerjudiciary.service.impl;

import com.example.jdproducerjudiciary.dao.JudCategoryDao;
import com.example.jdproducerjudiciary.entity.JudCategory;
import com.example.jdproducerjudiciary.entity.Judiciary;
import com.example.jdproducerjudiciary.dao.JudiciaryDao;
import com.example.jdproducerjudiciary.service.JudiciaryService;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * (Judiciary)表服务实现类
 *
 * @author makejava
 * @since 2018-12-20 21:50:35
 */
@Service
public class JudiciaryServiceImpl implements JudiciaryService {

    @Resource
    private JudiciaryDao judiciaryDao;
    @Resource
    private JudCategoryDao judCategoryDao;

    private static final String solrUrl="http://188.131.133.118:8983/solr/judiciary-core";//司法core
    //创建solrClient同时指定超时时间，不指定走默认配置
    private static HttpSolrClient client=new HttpSolrClient.Builder(solrUrl)
            .withConnectionTimeout(10000)
            .withSocketTimeout(60000).build();

    /**
     * 通过ID查询单条数据
     *
     * @param judId 主键
     * @return 实例对象
     */
    @Override
    public Judiciary queryById(Integer judId) {
        return this.judiciaryDao.queryById(judId);
    }

    /**
     * 查询多条数据 导到solr
     *
     * @return 对象列表
     */
    @Override
    @Scheduled(fixedRate = 5000) //5秒
    public void queryAll() throws IOException, SolrServerException {
        List<Judiciary> judiciaries = judiciaryDao.queryAlljud();
        for (Judiciary x:judiciaries) {
            Integer judCategory = x.getJudCategory();
            JudCategory jud = judCategoryDao.queryById(judCategory);
            x.setJudcategoryStr(jud.getJudCategoryname());
            SolrInputDocument document = new SolrInputDocument();
            document.addField("id",x.getJudId());
            document.addField("judcategoryStr",x.getJudcategoryStr());
            document.addField("judAreacity",x.getJudAreacity());
            switch (x.getJudStatus()){
                case 1:
                    document.addField("judStatusStr","拍卖中");
                    break;
                case 2:
                    document.addField("judStatusStr","预告中");
                    break;
                case 3:
                    document.addField("judStatusStr","已结束");
                    break;
                case 4:
                    document.addField("judStatusStr","已暂缓");
                    break;
                case 5:
                    document.addField("judStatusStr","已中止");
                    break;
                case 6:
                    document.addField("judStatusStr","已测回");
                    break;
            }
            switch (x.getJudFrequency()){
                case 1:
                    document.addField("judFrequencyStr","一拍");
                    break;
                case 2:
                    document.addField("judFrequencyStr","二拍");
                    break;
                case 3:
                    document.addField("judFrequencyStr","变卖");
                    break;
            }
            document.addField("judTradename",x.getJudTradename());
            document.addField("judSite",x.getJudSite());
            document.addField("judLongitude",x.getJudLongitude());
            document.addField("judDimensionality",x.getJudDimensionality());
            document.addField("judAuctiontime", x.getJudAuctiontime());
            System.out.println(x.getJudAuctiontime() + "时间");
            document.addField("judWillnum",x.getJudWillnum());
            document.addField("judOnlooker",x.getJudOnlooker());
            document.addField("judCurrentprice",x.getJudCurrentprice());
            document.addField("judStartingprice",x.getJudStartingprice());
            document.addField("judValuation",x.getJudValuation());
            document.addField("judBidincrement",x.getJudBidincrement());
            document.addField("judCashdeposit",x.getJudCashdeposit());
            document.addField("judRemind",x.getJudRemind());
            document.addField("judPicture",x.getJudPicture());
            document.addField("judDisposeunit",x.getJudDisposeunit());
            document.addField("judLinkman",x.getJudLinkman());
            client.add(document);
        }
        client.commit();
        System.out.println("solr successfully");
    }

    /**
     * 新增数据
     *
     * @param judiciary 实例对象
     * @return 实例对象
     */
    @Override
    public Judiciary insert(Judiciary judiciary) {
        this.judiciaryDao.insert(judiciary);
        return judiciary;
    }

    /**
     * 修改数据
     *
     * @param judiciary 实例对象
     * @return 实例对象
     */
    @Override
    public Judiciary update(Judiciary judiciary) {
        this.judiciaryDao.update(judiciary);
        return this.queryById(judiciary.getJudId());
    }

    /**
     * 通过主键删除数据
     *
     * @param judId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer judId) {
        return this.judiciaryDao.deleteById(judId) > 0;
    }
}