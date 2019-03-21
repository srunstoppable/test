package com.experiment.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.experiment.entity.WorkloadTeams;
import com.experiment.mapper.WorkloadTeamsMapper;
import com.experiment.service.WorkloadTeamsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
public class WorkloadTeamsServiceImpl extends ServiceImpl<WorkloadTeamsMapper, WorkloadTeams> implements WorkloadTeamsService {

    @Override
    public void add(WorkloadTeams workloadTeams) {
        baseMapper.insert(workloadTeams);
    }

    @Override
    public List list() {
        EntityWrapper<WorkloadTeams> ew=new EntityWrapper<>();
        List<WorkloadTeams>list=selectList(ew);
        List list1=new ArrayList();
        for(WorkloadTeams workloadTeams:list) {
            list1.add(workloadTeams.getContext());
        }
        return list1;
    }

}
