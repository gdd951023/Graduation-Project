package com.gdd.po;

/**
 * @Author: 郭冬
 * @Date: 2019/1/5 0005 14:37
 * @Description: user用户表的pojo对象
 */
public class User {
    private int uid;
    private String userName;
    private String email;
    private String passWord;
    private String imguser;
    private String phone;
    private String dis;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getImguser() {
        return imguser;
    }

    public void setImguser(String imguser) {
        this.imguser = imguser;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }
}
