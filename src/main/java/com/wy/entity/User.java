package com.wy.entity;

import java.io.Serializable;

/**
 * @author: 王阳
 * Date:     2020/5/15 10:17
 * Description:
 */
public class User implements Serializable {
    private static final long serialVersionUID = -8378140888485473863L;

    private Integer id;
    private String userName;
    private String password;
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
