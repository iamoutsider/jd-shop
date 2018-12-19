/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CouponPostServiceImpl
 * Author:   RanHaoHao
 * Date:     2018/12/19 17:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 * 　　　　　　　 ┏┓       ┏┓+ +
 * 　　　　　　　┏┛┻━━━━━━━┛┻┓ + +
 * 　　　　　　　┃　　　　　　 ┃
 * 　　　　　　　┃　　　━　　　┃ ++ + + +
 * 　　　　　　 █████━█████  ┃+
 * 　　　　　　　┃　　　　　　 ┃ +
 * 　　　　　　　┃　　　┻　　　┃
 * 　　　　　　　┃　　　　　　 ┃ + +
 * 　　　　　　　┗━━┓　　　 ┏━┛
 * 　　　　　　　　　┃　　  ┃ + + + +
 * 　　　　　　　　　┃　　　┃　Code is far away from     bug with the animal protecting
 * 　　　　　　　　　┃　　　┃ + 　　　　         神兽保佑,代码无bug
 * 　　　　　　　　　┃　　　┃
 * 　　　　　　　　　┃　　　┃　　+
 * 　　　　　　　　　┃　 　 ┗━━━┓ + +
 * 　　　　　　　　　┃ 　　　　　┣┓
 * 　　　　　　　　　┃ 　　　　　┏┛
 * 　　　　　　　　　┗┓┓┏━━━┳┓┏┛ + + + +
 * 　　　　　　　　　 ┃┫┫　 ┃┫┫
 * 　　　　　　　　　 ┗┻┛　 ┗┻┛+ + + + *
 */
package com.example.jdproducercouponinfo.cn.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.jdproducercouponinfo.cn.pojo.CouList;
import com.example.jdproducercouponinfo.cn.service.CouponPostService;
import com.example.jdproducercouponinfo.cn.util.MakeCouponId;
import com.example.jdproducercouponinfo.mapper.CouponPost;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author RanHaoHao
 * @create 2018/12/19
 * @since 1.0.0
 */
@Service
public class CouponPostServiceImpl implements CouponPostService {
    @Resource
    private CouponPost couponPost;

    /**
     * @param couList 实体类对象
     * @return String 返回添加优惠券状态信息
     * @author HHHH
     * @description //TODO RanHaoHao
     * @date 2018/12/19 17:55
     */
    @Override
    public String couponpost(CouList couList) {
        MakeCouponId makeCouponId = new MakeCouponId();
        couList.setCouCid(makeCouponId.makeCouponID());
        couList.setCouStauts(0);
        if(couponPost.insertSelective(couponPost) >= 0){
            return JSON.toJSONString("添加成功");
        } else {
            return JSON.toJSONString("添加失败");
        }
    }
}
