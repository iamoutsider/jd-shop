package com.example.jdproducerjudiciary.solrpojo;
/**
 * 商品实体
 * @author scw
 *
 */
public class ProductModel {
    // 商品编号
    private String pid;
    // 商品名称
    private String name;
    // 商品分类
    private String catalog_name;
    // 价格
    private String price;
    // 商品描述
    private String description;
    //商品规格
    private String type;
    // 图片名称
    private String picture;


    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCatalog_name() {
        return catalog_name;
    }
    public void setCatalog_name(String catalog_name) {
        this.catalog_name = catalog_name;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
}
