package com.example.jdproducerjudiciary.entity;

import java.io.Serializable;

/**
 * (JudSku)实体类
 *
 * @author makejava
 * @since 2018-12-20 18:23:44
 */
public class JudSku implements Serializable {
    private static final long serialVersionUID = 712775843578143047L;
    //司法拍品SKUID
    private Integer skuId;


    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

}