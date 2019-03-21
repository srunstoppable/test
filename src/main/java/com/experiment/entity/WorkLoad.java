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
@TableName("WorkLoad")
public class WorkLoad  {

    private static final long serialVersionUID = 1L;

    @TableId(value = "WorkLoadID", type = IdType.AUTO)
    private Integer WorkLoadID;
    @TableField("userid")
    private String userid;
    @TableField("WorkLoadValue")
    private Double WorkLoadValue;
    @TableField("teams")
    private String teams;


}
