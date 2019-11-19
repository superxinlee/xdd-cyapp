package com.xueduoduo.xddcyapp.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 题目子表
 * </p>
 *
 * @author Tj123
 * @since 2018-11-13
 */
@TableName("t_examination_item")
public class TExaminationItem extends Model<TExaminationItem> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 模板id
     */
    private Integer temp;
    /**
     * 题目
     */
    private String title;
    /**
     * 题干
     */
    private String topic;
    /**
     * 类型
     */
    @TableField("itemType")
    private String itemType;
    /**
     * 是否有效，1：有效，0：无效
     */
    @TableField("isValid")
    private Integer isValid;
    /**
     * 占比
     */
    private Integer proportion;
    /**
     * 排序
     */
    @TableField("orderNum")
    private Integer orderNum;
    @TableField("attachmentUrl")
    private String attachmentUrl;
    /**
     * 正确答案
     */
    private String correct;
    private String uuid;
    private String content;
    private String score;
    /**
     * 大题id
     */
    @TableField("examinationPid")
    private Integer examinationPid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getProportion() {
        return proportion;
    }

    public void setProportion(Integer proportion) {
        this.proportion = proportion;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Integer getExaminationPid() {
        return examinationPid;
    }

    public void setExaminationPid(Integer examinationPid) {
        this.examinationPid = examinationPid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TExaminationItem{" +
        "id=" + id +
        ", temp=" + temp +
        ", title=" + title +
        ", topic=" + topic +
        ", itemType=" + itemType +
        ", isValid=" + isValid +
        ", proportion=" + proportion +
        ", orderNum=" + orderNum +
        ", attachmentUrl=" + attachmentUrl +
        ", correct=" + correct +
        ", uuid=" + uuid +
        ", content=" + content +
        ", score=" + score +
        ", examinationPid=" + examinationPid +
        "}";
    }
}
