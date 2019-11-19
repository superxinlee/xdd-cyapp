package com.xueduoduo.xddcyapp.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 试卷表
 * </p>
 *
 * @author Tj123
 * @since 2018-12-07
 */
@TableName("t_examination")
public class TExamination extends Model<TExamination> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("examName")
    private String examName;
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
     * 学科代码
     */
    @TableField("disciplineCode")
    private String disciplineCode;
    /**
     * 学科名称
     */
    @TableField("disciplineName")
    private String disciplineName;
    /**
     * 试卷状态1上线0下线
     */
    private Integer status;
    /**
     * 创建时间
     */
    @TableField("createTime")
    private String createTime;
    /**
     * 非绑定字段 大题list
     */
    @TableField(exist = false)
    private List<TExaminationParent> examParentList = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
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

    public String getDisciplineCode() {
        return disciplineCode;
    }

    public void setDisciplineCode(String disciplineCode) {
        this.disciplineCode = disciplineCode;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    public List<TExaminationParent> getExamParentList() {
        return examParentList;
    }

    public void setExamParentList(List<TExaminationParent> examParentList) {
        this.examParentList = examParentList;
    }

    @Override
    public String toString() {
        return "TExamination{" +
                "id=" + id +
                ", examName=" + examName +
                ", grade=" + grade +
                ", gradeName=" + gradeName +
                ", disciplineCode=" + disciplineCode +
                ", disciplineName=" + disciplineName +
                ", status=" + status +
                ", createTime=" + createTime +
                "}";
    }
}
