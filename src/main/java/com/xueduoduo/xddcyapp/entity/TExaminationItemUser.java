package com.xueduoduo.xddcyapp.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 学生答题表
 * </p>
 *
 * @author Tj123
 * @since 2018-11-14
 */
@TableName("t_examination_item_user")
public class TExaminationItemUser extends Model<TExaminationItemUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 学生id
     */
    @TableField("userId")
    private Integer userId;
    /**
     * 学生名称
     */
    @TableField("userName")
    private String userName;
    /**
     * 小题目id
     */
    @TableField("examItemId")
    private Integer examItemId;
    /**
     * 试卷id
     */
    @TableField("examId")
    private Integer examId;
    /**
     * 创建时间
     */
    @TableField("createTime")
    private String createTime;
    /**
     * 班级id
     */
    @TableField("classId")
    private Integer classId;
    /**
     * 班级名称
     */
    @TableField("className")
    private String className;
    /**
     * 年级
     */
    private Integer grade;
    /**
     * 年级名称
     */
    @TableField("gradeName")
    private String gradeName;
    /**
     * 做题时长
     */
    private Integer duration;
    /**
     * 大题id
     */
    @TableField("examinationPid")
    private Integer examinationPid;
    /**
     * 错误次数
     */
    @TableField("errorNum")
    private Integer errorNum;
    
    @TableField(exist=false)
    private String examPTitle;
    @TableField(exist=false)
    private String examItemTitle;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getExamItemId() {
        return examItemId;
    }

    public void setExamItemId(Integer examItemId) {
        this.examItemId = examItemId;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getExaminationPid() {
        return examinationPid;
    }

    public void setExaminationPid(Integer examinationPid) {
        this.examinationPid = examinationPid;
    }

    public Integer getErrorNum() {
        return errorNum;
    }

    public void setErrorNum(Integer errorNum) {
        this.errorNum = errorNum;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TExaminationItemUser{" +
        "id=" + id +
        ", userId=" + userId +
        ", userName=" + userName +
        ", examItemId=" + examItemId +
        ", examId=" + examId +
        ", createTime=" + createTime +
        ", classId=" + classId +
        ", className=" + className +
        ", grade=" + grade +
        ", gradeName=" + gradeName +
        ", duration=" + duration +
        ", examinationPid=" + examinationPid +
        ", errorNum=" + errorNum +
        "}";
    }

	public String getExamPTitle() {
		return examPTitle;
	}

	public void setExamPTitle(String examPTitle) {
		this.examPTitle = examPTitle;
	}

	public String getExamItemTitle() {
		return examItemTitle;
	}

	public void setExamItemTitle(String examItemTitle) {
		this.examItemTitle = examItemTitle;
	}
}
