/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CouponPostService
 * Author:   RanHaoHao
 * Date:     2018/12/19 17:20
 * Description: 优惠券发布业务接口
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
package com.example.jdproducercouponinfo.cn.service;

import com.example.jdproducercouponinfo.cn.pojo.CouList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈优惠券发布业务接口〉
 *
 * @author RanHaoHao
 * @create 2018/12/19
 * @since 1.0.0
 */
public interface CouponPostService {

    /**
     * @author HHHH
     * @description //TODO RanHaoHao
     * @date  2018/12/19 17:55
     * @param couList 实体类对象
     * @return String 返回添加优惠券状态信息
     */
    String couponpost(CouList couList);
}
