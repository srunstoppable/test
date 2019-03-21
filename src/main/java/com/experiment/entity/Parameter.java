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
@TableName("Parameter")
public class Parameter  {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ParameterID", type = IdType.AUTO)
    private Integer ParameterID;
    @TableField("ParameterName")
    private String ParameterName;
    @TableField("ParameterSymbol")
    private String ParameterSymbol;
    @TableField("ParameterValue")
    private String ParameterValue;
    @TableField("FormulaID")
    private Integer FormulaID;


}
