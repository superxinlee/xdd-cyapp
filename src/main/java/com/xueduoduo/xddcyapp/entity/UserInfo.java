package com.xueduoduo.xddcyapp.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Tj123
 * @since 2018-12-07
 */
@TableName("user_info")
public class UserInfo extends Model<UserInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 账号
     */
    @TableField("userCode")
    private String userCode;
    /**
     * 用户名称
     */
    @TableField("userName")
    private String userName;
    /**
     * 用户密码
     */
    @TableField("userPwd")
    private String userPwd;
    /**
     * 用户昵称
     */
    @TableField("nickName")
    private String nickName;
    /**
     * 用户状态：0，注销，1，正常
     */
    @TableField("userStatus")
    private Integer userStatus;
    /**
     * 用户头像
     */
    @TableField("logoUrl")
    private String logoUrl;
    /**
     * 用户性别
     */
    @TableField("userSex")
    private String userSex;
    /**
     * 用户类型：老师（teacher），学生（student），管理员（admin），超级管理员（super）
     */
    @TableField("userType")
    private String userType;
    /**
     * 身份证号
     */
    private String idno;
    /**
     * 学籍号
     */
    private String xjh;
    /**
     * 认证令牌
     */
    private String token;
    /**
     * 备注
     */
    private String remark;
    /**
     * 用户生日
     */
    private Date birthday;
    /**
     * 创建者ID
     */
    private Integer creator;
    /**
     * 创建时间
     */
    @TableField("createTime")
    private Date createTime;
    /**
     * 更新者ID
     */
    private Integer updator;
    /**
     * 更新时间
     */
    @TableField("updateTime")
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getXjh() {
        return xjh;
    }

    public void setXjh(String xjh) {
        this.xjh = xjh;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdator() {
        return updator;
    }

    public void setUpdator(Integer updator) {
        this.updator = updator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
        "id=" + id +
        ", userCode=" + userCode +
        ", userName=" + userName +
        ", userPwd=" + userPwd +
        ", nickName=" + nickName +
        ", userStatus=" + userStatus +
        ", logoUrl=" + logoUrl +
        ", userSex=" + userSex +
        ", userType=" + userType +
        ", idno=" + idno +
        ", xjh=" + xjh +
        ", token=" + token +
        ", remark=" + remark +
        ", birthday=" + birthday +
        ", creator=" + creator +
        ", createTime=" + createTime +
        ", updator=" + updator +
        ", updateTime=" + updateTime +
        "}";
    }
}
