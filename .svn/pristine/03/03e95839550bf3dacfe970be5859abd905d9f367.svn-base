package com.experiment.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.experiment.Utils.Response;
import com.experiment.entity.WorkLoad;
import com.experiment.mapper.WorkLoadMapper;
import com.experiment.service.WorkLoadService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sr
 * @since 2018-11-25
 */
@Service
public class WorkLoadServiceImpl extends ServiceImpl<WorkLoadMapper, WorkLoad> implements WorkLoadService {

    @Override
    public Response add(WorkLoad workLoad) {
        try {
            insert(workLoad);
            return Response.success();
        }catch (Exception e){
            return Response.fail("请勿重复提交");
        }
    }



    //管理员查询
    @Override
    public List<WorkLoad> list() {
        EntityWrapper<WorkLoad>ew=new EntityWrapper<>();
        return  selectList(ew);
    }

    //教师查询历年工作量
    @Override
    public List<WorkLoad> searchByUserId(String param) {
        EntityWrapper<WorkLoad>ew=new EntityWrapper<>();
        ew.eq("userid",param);
        return selectList(ew);
    }


}
