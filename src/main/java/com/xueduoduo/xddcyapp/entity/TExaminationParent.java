package com.xueduoduo.xddcyapp.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 题库
 * </p>
 *
 * @author Tj123
 * @since 2018-11-13
 */
@TableName("t_examination_parent")
public class TExaminationParent extends Model<TExaminationParent> {

    private static final long serialVersionUID = 1L;

    /**
     * 题目id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
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
     * 试卷id
     */
    @TableField("examinationId")
    private Integer examinationId;
    /**
     * 题目附件json
     */
    @TableField("attachmentUrl")
    private String attachmentUrl;
    private String uuid;
    /**
     * 排序
     */
    @TableField("orderNum")
    private Integer orderNum;
    private Integer proportion;
    private Integer score;
    
    /**
     * 非绑定字段 小题list
     */
    @TableField(exist=false)
    private   List<TExaminationItem> examItemList=new ArrayList<>() ; 


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getProportion() {
        return proportion;
    }

    public void setProportion(Integer proportion) {
        this.proportion = proportion;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    public List<TExaminationItem> getExamItemList() {
		return examItemList;
	}

	public void setExamItemList(List<TExaminationItem> examItemList) {
		this.examItemList = examItemList;
	}

	@Override
    public String toString() {
        return "TExaminationParent{" +
        "id=" + id +
        ", title=" + title +
        ", topic=" + topic +
        ", itemType=" + itemType +
        ", isValid=" + isValid +
        ", examinationId=" + examinationId +
        ", attachmentUrl=" + attachmentUrl +
        ", uuid=" + uuid +
        ", orderNum=" + orderNum +
        ", proportion=" + proportion +
        ", score=" + score +
        "}";
    }
}
