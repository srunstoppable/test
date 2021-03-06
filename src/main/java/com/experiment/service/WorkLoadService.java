package com.experiment.service;

import com.experiment.Utils.Response;
import com.experiment.entity.WorkLoad;
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
public interface WorkLoadService extends IService<WorkLoad> {
    public Response add(WorkLoad workLoad);
    public List<WorkLoad>list();
    public List<WorkLoad>searchByUserId(String param);
}
