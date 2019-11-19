package com.xueduoduo.xddcyapp.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 书中课程内容
 * </p>
 *
 * @author Tj123
 * @since 2019-03-20
 */
@TableName("t_book_content")
public class TBookContent extends Model<TBookContent> {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	/**
	 * 内容JSON：名称图片介绍
	 */
	private String content;
	/**
	 * 所属书本
	 */
	@TableField(value = "bookId")
	private Integer bookId;
	@TableField(value = "createTime")
	private String createTime;
	/**
	 * 所属目录
	 */
	@TableField(value = "catalogId")
	private Integer catalogId;
	/**
	 * 所属二级目录 (不用)
	 */
	@TableField(value = "catalogName")
	private String catalogName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "TBookContent{" + "id=" + id + ", content=" + content + ", bookId=" + bookId + ", createTime=" + createTime + ", catalogId="
				+ catalogId + ", catalogName=" + catalogName + "}";
	}
}
