package com.experiment.service;

import com.experiment.entity.WorkloadTeams;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sr
 * @since 2018-11-25
 */
public interface WorkloadTeamsService extends IService<WorkloadTeams> {
        public void add(WorkloadTeams workloadTeams);
        public List<WorkloadTeams>list();

}
