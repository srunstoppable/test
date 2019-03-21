package com.experiment.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.experiment.entity.SubmitWorkLoad;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author s r
 * @date 2018/11/25
 */


@Mapper
public interface SubmitWorkLoadMapper extends BaseMapper<SubmitWorkLoad> {
    @Select("select * from ( select * from course join (select formula.formulaName,parameter.* from formula join parameter on formula.formulaId like parameter.formulaId)tmp on  tmp.FormulaName like '%'+CourseType+'%' where teams like #{teams} and userId=#{userId} )tom")
    List<SubmitWorkLoad>list(@Param("teams") String teams,@Param("userId") String userId);
}
