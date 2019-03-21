package com.experiment.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.experiment.entity.UserRole;
import com.experiment.mapper.UserRoleMapper;
import com.experiment.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * @author s r
 * @date 2018/12/26
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper,UserRole> implements UserRoleService {
    @Override
    public int  get(String id) {
        EntityWrapper<UserRole>ew=new EntityWrapper<>();
        ew.eq("userid",id);
        return selectList(ew).get(0).getRoleid();

    }
}
