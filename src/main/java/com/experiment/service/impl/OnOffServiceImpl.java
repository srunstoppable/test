package com.experiment.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.experiment.Utils.Result;
import com.experiment.entity.OnOff;
import com.experiment.mapper.OnOffMapper;
import com.experiment.service.OnOffService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sr
 * @since 2018-11-22
 */
@Service
public class OnOffServiceImpl extends ServiceImpl<OnOffMapper, OnOff> implements OnOffService {

    @Override
    public Result open(OnOff onOff) {
        Result result=new Result();
        onOff.setOnOffState("开放");
        EntityWrapper<OnOff>ew=new EntityWrapper<>();
        ew.eq("id",1);
        baseMapper.update(onOff,ew);
        result.setMessage("已开放提交功能!");
        result.setSuccess(true);
        return result;
    }

    @Override
    public Result close(OnOff onOff) {
        Result result=new Result();
        onOff.setOnOffState("关闭");
        EntityWrapper<OnOff>ew=new EntityWrapper<>();
        ew.eq("id",1);
        baseMapper.update(onOff,ew);
        result.setMessage("已关闭提交功能!");
        result.setSuccess(true);
        return result;

    }

    @Override
    public Result check() {
        Result result=new Result();
        int i=1;
        OnOff onOff=baseMapper.selectById(i);
        if(onOff.getOnOffState().equals("开放")) {
            result.setMessage("success");
        }else {
            result.setSuccess(false);
            result.setMessage("提交功能尚未开放！");
        }
        return result;
    }
}
