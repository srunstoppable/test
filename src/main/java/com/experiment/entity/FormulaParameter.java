package com.experiment.entity;

import lombok.Data;

/**
 * @author s r
 * @date 2018/11/23
 */
@Data
public class FormulaParameter {
    private static final long serialVersionUID = 1L;

    private Integer ParameterID;
    private String ParameterName;
    private String ParameterSymbol;
    private String ParameterValue;
    private Integer FormulaID;
    private String FormulaName;
}
