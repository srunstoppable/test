package com.experiment.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.experiment.entity.SubmitWorkLoad;
import com.experiment.mapper.SubmitWorkLoadMapper;
import com.experiment.service.SubmitWorkLoadService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author s r
 * @date 2018/11/26
 */
@Service
public class SubmitWorkLoadServiceImp extends ServiceImpl<SubmitWorkLoadMapper,SubmitWorkLoad> implements SubmitWorkLoadService {
    @Override
    public List<SubmitWorkLoad> list(String teams, String userId) {
        return baseMapper.list(teams,userId);
    }
}
