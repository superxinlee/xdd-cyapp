package com.xueduoduo.xddcyapp.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 绘本
 * </p>
 *
 * @author Tj123
 * @since 2019-03-20
 */
@TableName("t_book_info")
public class TBookInfo extends Model<TBookInfo> {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	private Integer grade;
	@TableField(value = "bookName")
	private String bookName;
	@TableField(value = "gradeName")
	private String gradeName;
	/**
	 * 书本介绍
	 */
	private String introduce;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "TBookInfo{" + "id=" + id + ", grade=" + grade + ", gradeName=" + gradeName + ", bookName=" + bookName + ", introduce=" + introduce
				+ "}";
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
}
