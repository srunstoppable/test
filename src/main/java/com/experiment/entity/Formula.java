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
 * @since 2018-11-23
 */
@Data

@Accessors(chain = true)
@TableName("Formula")
public class Formula  {

    private static final long serialVersionUID = 1L;

    @TableId(value = "FormulaID", type = IdType.AUTO)
    private Integer FormulaID;
    @TableField("FormulaName")
    private String FormulaName;
    @TableField("FormulaValue")
    private String FormulaValue;


}
