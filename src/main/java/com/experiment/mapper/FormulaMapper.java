package com.experiment.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.experiment.entity.Formula;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.velocity.runtime.directive.contrib.For;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sr
 * @since 2018-11-23
 */
public interface FormulaMapper extends BaseMapper<Formula> {



    @Select("select * from formula where 1=1")
    public List<Formula>selectList(Page<Formula>page);

    @Select("select count(*) from formula")
    int selectTotal();
}
