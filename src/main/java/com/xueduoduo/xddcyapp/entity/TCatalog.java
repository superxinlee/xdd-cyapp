package com.xueduoduo.xddcyapp.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 书本目录
 * </p>
 *
 * @author Tj123
 * @since 2019-03-20
 */
@TableName("t_catalog")
public class TCatalog extends Model<TCatalog> {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	@TableField(value = "pId")
	private Integer pId;
	@TableField(value = "catalogName")
	private String catalogName;
	private Integer grade;
	@TableField(value = "bookId")
	private Integer bookId;
	private String content;
	@TableField(value = "mainImg")
	private String mainImg;
	@TableField(value = "viceImg")
	private String viceImg;
	@TableField(value = "catalogType")
	private Integer catalogType;// 0 书名 1 二级目录 2 正文目录 3 拓展活动
	@TableField(exist = false)
	private List<TCatalog> children;
	@TableField(exist = false)
	private TBookContent bookContent;

	@TableField(exist = false)
	private Integer status;

	@TableField(value = "orderNum")
	private Integer orderNum;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
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

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	public Integer getCatalogType() {
		return catalogType;
	}

	public void setCatalogType(Integer catalogType) {
		this.catalogType = catalogType;
	}

	public List<TCatalog> getChildren() {
		return children;
	}

	public void setChildren(List<TCatalog> children) {
		this.children = children;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMainImg() {
		return mainImg;
	}

	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}

	public String getViceImg() {
		return viceImg;
	}

	public void setViceImg(String viceImg) {
		this.viceImg = viceImg;
	}

	public TBookContent getBookContent() {
		return bookContent;
	}

	public void setBookContent(TBookContent bookContent) {
		this.bookContent = bookContent;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

}
