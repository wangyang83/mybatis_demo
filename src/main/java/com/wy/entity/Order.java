package com.wy.entity;

import java.io.Serializable;

/**
 * @author: 王阳
 * Date:     2020/5/15 16:41
 * Description:
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -1251779432561635521L;
    private Integer id;
    private Integer userId;
    private String productName;
    private String productType;
    private Double  quantity;
    private Double price;
    private Double totalMoney;
    private Boolean isPutAway;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Boolean getPutAway() {
        return isPutAway;
    }

    public void setPutAway(Boolean putAway) {
        isPutAway = putAway;
    }
}
