package com.xueduoduo.xddcyapp.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 用户拓展活动答案
 * </p>
 *
 * @author Tj123
 * @since 2019-05-06
 */
@TableName("t_extend_answer")
public class TExtendAnswer extends Model<TExtendAnswer> {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	@TableField(value = "userName")
	private String userName;
	@TableField(value = "className")
	private String className;
	@TableField(value = "classId")
	private Integer classId;
	private Integer grade;
	@TableField(value = "bookId")
	private Integer bookId;
	@TableField(value = "catalogId")
	private Integer catalogId;
	@TableField(value = "createTime")
	private String createTime;
	private Integer year;
	private Integer month;
	@TableField(value = "dayOfMonth")
	private Integer dayOfMonth;
	@TableField(value = "weekOfYear")
	private Integer weekOfYear;
	@TableField(value = "weekOfMonth")
	private Integer weekOfMonth;
	@TableField(value = "userId")
	private Integer userId;
	@TableField(value = "userCode")
	private String userCode;
	@TableField(value = "answerContent")
	private String answerContent;

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

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(Integer dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public Integer getWeekOfYear() {
		return weekOfYear;
	}

	public void setWeekOfYear(Integer weekOfYear) {
		this.weekOfYear = weekOfYear;
	}

	public Integer getWeekOfMonth() {
		return weekOfMonth;
	}

	public void setWeekOfMonth(Integer weekOfMonth) {
		this.weekOfMonth = weekOfMonth;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getAnswerContent() {
		return answerContent;
	}

	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

}
