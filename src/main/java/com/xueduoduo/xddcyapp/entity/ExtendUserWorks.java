package com.xueduoduo.xddcyapp.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 用户拓展活动的作品
 * </p>
 *
 * @author Tj123
 * @since 2019-05-08
 */
@TableName("t_extend_user_works")
public class ExtendUserWorks extends Model<ExtendUserWorks> {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	@TableField(value = "userName")
	private String userName;
	@TableField(value = "className")
	private String className;
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
	@TableField(value = "attachUrl")
	private String attachUrl;
	@TableField(value = "logoUrl")
	private String logoUrl;
	@TableField(value = "catalogName")
	private String catalogName;
	@TableField(value = "pCatalogId")
	private Integer pCatalogId;
	@TableField(value = "pCatalogName")
	private String pCatalogName;
	@TableField(value = "isTop")
	private Integer isTop;
	/**
	 * 附件类型
	 */
	@TableField(value = "attachType")
	private String attachType;
	@TableField(value = "exerciseUUID")
	private String exerciseUUID;
	@TableField(value = "classId")
	private Integer classId;
	@TableField(exist = false)
	private Integer praseNum;
	@TableField(exist = false)
	private Integer isPrase; // 1 是已点赞 0是未点赞

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

	public String getAttachUrl() {
		return attachUrl;
	}

	public void setAttachUrl(String attachUrl) {
		this.attachUrl = attachUrl;
	}

	public String getAttachType() {
		return attachType;
	}

	public void setAttachType(String attachType) {
		this.attachType = attachType;
	}

	public String getExerciseUUID() {
		return exerciseUUID;
	}

	public void setExerciseUUID(String exerciseUUID) {
		this.exerciseUUID = exerciseUUID;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "ExtendUserWorks{" + "id=" + id + ", userName=" + userName + ", className=" + className + ", grade=" + grade + ", bookId=" + bookId
				+ ", catalogId=" + catalogId + ", createTime=" + createTime + ", year=" + year + ", month=" + month + ", dayOfMonth=" + dayOfMonth
				+ ", weekOfYear=" + weekOfYear + ", weekOfMonth=" + weekOfMonth + ", userId=" + userId + ", userCode=" + userCode + ", attachUrl="
				+ attachUrl + ", attachType=" + attachType + ", exerciseUUID=" + exerciseUUID + ", classId=" + classId + "}";
	}

	public Integer getPraseNum() {
		return praseNum;
	}

	public void setPraseNum(Integer praseNum) {
		this.praseNum = praseNum;
	}

	public Integer getIsPrase() {
		return isPrase;
	}

	public void setIsPrase(Integer isPrase) {
		this.isPrase = isPrase;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public Integer getpCatalogId() {
		return pCatalogId;
	}

	public void setpCatalogId(Integer pCatalogId) {
		this.pCatalogId = pCatalogId;
	}

	public String getpCatalogName() {
		return pCatalogName;
	}

	public void setpCatalogName(String pCatalogName) {
		this.pCatalogName = pCatalogName;
	}

	public Integer getIsTop() {
		return isTop;
	}

	public void setIsTop(Integer isTop) {
		this.isTop = isTop;
	}
}
