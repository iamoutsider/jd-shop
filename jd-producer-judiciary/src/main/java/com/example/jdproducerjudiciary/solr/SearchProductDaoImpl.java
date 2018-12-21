package com.example.jdproducerjudiciary.solr;

import com.example.jdproducerjudiciary.entity.Judiciary;
import com.example.jdproducerjudiciary.solrpojo.ProductSearch;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public class SearchProductDaoImpl implements SearchProductDao {

    private static final String solrUrl="http://188.131.133.118:8983/solr/judiciary-core";

    //创建solrClient同时指定超时时间，不指定走默认配置
    private static HttpSolrClient client=new HttpSolrClient.Builder(solrUrl)
            .withConnectionTimeout(10000)
            .withSocketTimeout(60000).build();

    @Override
    public List<Judiciary> searchProduct(ProductSearch productSearch) throws Exception {
        SolrQuery solrQuery = new SolrQuery();
        //设置关键字
        solrQuery.setQuery(productSearch.getQueryString());
        //设置默认搜索域
        solrQuery.set("df", "product_keywords");
        //设置过滤条件  *****
        if(null != productSearch.getCatalog_name() && !"".equals(productSearch.getCatalog_name())){
            solrQuery.set("fq", "product_catalog_name:" + productSearch.getCatalog_name());
        }
        if(null != productSearch.getPrice() && !"".equals(productSearch.getPrice())){
            //0-99   500-*  对价格进行过滤
            String[] p = productSearch.getPrice().split("-");
            solrQuery.set("fq", "judCurrentprice:[" + p[0] + " TO " + p[1] + "]");
        }
        // 价格排序
        if ("1".equals(productSearch.getSort())) {
            solrQuery.addSort("judCurrentprice", ORDER.desc);
        } else {
            solrQuery.addSort("judCurrentprice", ORDER.asc);
        }
        // 分页
        solrQuery.setStart(0);//第几行开始
        solrQuery.setRows(16);//一页显示多少行
        // 只查询指定域
        solrQuery.set("fl", "id,judcategoryStr,judAreacity,judStatus,judFrequency,judTradename," +
                "judSite,judLongitude,judDimensionality,judAuctiontime,judWillnum,judOnlooker,judCurrentprice," +
                "judStartingprice,judValuation,judBidincrement,judCashdeposit,judRemind,judPicture,judDisposeunit,judLinkman");
        // 执行查询
        QueryResponse response = client.query(solrQuery);
        // 文档结果集
        SolrDocumentList docs = response.getResults();
        List<Judiciary> jud = new ArrayList<>();
        for (SolrDocument doc : docs) {
            Judiciary judiciary = new Judiciary();
            judiciary.setJudId((Integer) doc.get("id"));
            judiciary.setJudcategoryStr((String) doc.get("judcategoryStr"));
            judiciary.setJudAreacity((String) doc.get("judAreacity"));
            judiciary.setJudStatusStr((String) doc.get("judStatusStr"));
            judiciary.setJudFrequencyStr((String) doc.get("judFrequencyStr"));
            judiciary.setJudTradename((String) doc.get("judTradename"));
            judiciary.setJudSite((String) doc.get("judSite"));
            judiciary.setJudLongitude((String) doc.get("judLongitude"));
            judiciary.setJudDimensionality((String) doc.get("judDimensionality"));
            judiciary.setJudAuctiontime((Date) doc.get("judAuctiontime"));
            judiciary.setJudWillnum((Integer) doc.get("judWillnum"));
            judiciary.setJudOnlooker((Integer) doc.get("judOnlooker"));
            judiciary.setJudCurrentprice((String) doc.get("judCurrentprice"));
            judiciary.setJudStartingprice((String) doc.get("judStartingprice"));
            judiciary.setJudValuation((String) doc.get("judValuation"));
            judiciary.setJudBidincrement((String) doc.get("judBidincrement"));
            judiciary.setJudCashdeposit((String) doc.get("judCashdeposit"));
            judiciary.setJudRemind((Integer) doc.get("judRemind"));
            judiciary.setJudPicture((String) doc.get("judPicture"));
            judiciary.setJudDisposeunit((String) doc.get("judDisposeunit"));
            judiciary.setJudLinkman((String) doc.get("judLinkman"));
            jud.add(judiciary);
        }
        return jud;
    }
}
