package com.experiment.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.experiment.Utils.Response;
import com.experiment.Utils.Result;
import com.experiment.entity.FormulaParameter;
import com.experiment.entity.Parameter;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sr
 * @since 2018-11-23
 */
public interface ParameterService extends IService<Parameter> {

    /**
     *  查出公式对应的参数列表，具体用在哪待定
     */
    public List<Parameter> search(String param);
    public List<Parameter> search(int param);
    public void add(FormulaParameter formulaParameter);
    public void delete(int id);
    public void update(Parameter parameter);
    public Response list(Page<FormulaParameter>page);
}
