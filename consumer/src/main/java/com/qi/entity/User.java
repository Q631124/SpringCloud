package com.qi.entity;

/**
 * Created by Administrator on 2019/11/27.
 */
public class User {
    private String id;

    private String password;

    private String nickName;

    private Integer sex;

    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", sex=" + sex +
                ", status='" + status + '\'' +
                '}';
    }
}
