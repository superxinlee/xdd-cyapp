package com.xueduoduo.xddcyapp.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Tj123
 * @since 2018-12-03
 */
@TableName("t_examination_itemtype")
public class TExaminationItemtype extends Model<TExaminationItemtype> {

    private static final long serialVersionUID = 1L;
    @TableField("itemCode")
    private String itemCode;
    @TableField("itemName")
    private String itemName;


    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    protected Serializable pkVal() {
        return this.itemCode;
    }

    @Override
    public String toString() {
        return "TExaminationItemtype{" +
        "itemCode=" + itemCode +
        ", itemName=" + itemName +
        "}";
    }
}
