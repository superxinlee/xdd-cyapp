package com.xueduoduo.xddcyapp.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 用户点赞作品记录表
 * </p>
 *
 * @author Tj123
 * @since 2019-05-08
 */
@TableName("t_user_prase_info")
public class UserPraseInfo extends Model<UserPraseInfo> {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	@TableField(value = "workId")
	private Integer workId;
	@TableField(value = "userId")
	private Integer userId;
	@TableField(value = "createTime")
	private String createTime;
	/**
	 * 1表示已取消点赞
	 */
	private Integer status;
	@TableField(exist = false)
	private Integer count;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getWorkId() {
		return workId;
	}

	public void setWorkId(Integer workId) {
		this.workId = workId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "UserPraseInfo{" + "id=" + id + ", workId=" + workId + ", userId=" + userId + ", createTime=" + createTime + ", status=" + status
				+ "}";
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}
