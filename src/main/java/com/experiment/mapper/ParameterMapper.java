package com.experiment.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.experiment.entity.FormulaParameter;
import com.experiment.entity.Parameter;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sr
 * @since 2018-11-23
 */

@Mapper
public interface ParameterMapper extends BaseMapper<Parameter> {



    @Select("select Parameter.*,formula.formulaname from  dbo.Parameter  join formula on formula.formulaid=parameter.formulaid ")
    public List<FormulaParameter> selectJoin(Page<FormulaParameter>page);
}
