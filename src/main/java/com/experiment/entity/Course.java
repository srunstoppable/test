package com.experiment.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sr
 * @since 2018-11-25
 */
@Data

@Accessors(chain = true)
@TableName("Course")
public class Course {

    private static final long serialVersionUID = 1L;

    @TableId(value = "CourseID", type = IdType.AUTO)
    private Integer CourseID;
    @TableField("userid")
    private String userid;
    @TableField("CourseName")
    private String CourseName;
    @TableField("CourseType")
    private String CourseType;
    @TableField("teams")
    private String teams;


}
