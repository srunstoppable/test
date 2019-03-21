package com.experiment.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.experiment.Utils.Response;
import com.experiment.entity.Formula;
import com.experiment.entity.FormulaParameter;
import com.experiment.entity.Parameter;
import com.experiment.mapper.ParameterMapper;
import com.experiment.service.FormulaService;
import com.experiment.service.ParameterService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sr
 * @since 2018-11-23
 */
@Service
public class ParameterServiceImpl extends ServiceImpl<ParameterMapper, Parameter> implements ParameterService {

    @Autowired
    private FormulaService formulaService;


    @Override
    public List<Parameter> search(int id) {
        EntityWrapper<Parameter> ew=new EntityWrapper<>();
        ew.eq("FormulaID",id);
        return selectList(ew);
    }

    @Override
    public List<Parameter> search(String param) {
        EntityWrapper<Formula> ew=new EntityWrapper<>();
        ew.like("FormulaName",param);
       EntityWrapper<Parameter>entityWrapper=new EntityWrapper<>();
       ew.eq("formulaID",formulaService.selectList(ew).get(0).getFormulaID());
        return selectList(entityWrapper);
    }
    @Override
    public void add(FormulaParameter formulaParameter) {
        Formula formula=formulaService.search(formulaParameter.getFormulaName());
        Parameter parameter=new Parameter().setParameterName(formulaParameter.getParameterName())
                         .setFormulaID(formula.getFormulaID())
                         .setParameterValue(formulaParameter.getParameterValue());

        List<Parameter> list = search(parameter.getFormulaID());
        List<Character> list1 = new ArrayList<>();
        for (Parameter p : list) {
            list1.add(p.getParameterSymbol().charAt(0));
        }
        char c=list1.get(list1.size()-1);
        baseMapper.insert(parameter.setParameterSymbol(String.valueOf((char)(c+1) )));
    }

    @Override
    public void delete(int id) {
        deleteById(id);
    }

    @Override
    public void update(Parameter parameter) {
        baseMapper.updateById(parameter);
    }

    @Override
    public Response list(Page<FormulaParameter>page) {
        Page<Parameter>p=new Page<>();
        EntityWrapper<Parameter> entityWrapper=new EntityWrapper<>();
        EntityWrapper<FormulaParameter> ew=new EntityWrapper<>();
        page.setTotal(selectPage(p,entityWrapper).getRecords().size());
//        page.setRecords(baseMapper.selectJoin());

//        List<FormulaParameter>list=page.getRecords();
        Map<Integer,Object> map=new TreeMap<>();
        for (FormulaParameter formulaParameter:baseMapper.selectJoin(page)){
//        for(FormulaParameter formulaParameter:list){
            map.put(formulaParameter.getParameterID(),formulaParameter);
        }
        return Response.success((int)page.getTotal()).putAllT(map);
    }
}
