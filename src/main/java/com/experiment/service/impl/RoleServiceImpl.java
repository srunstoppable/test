package com.experiment.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.experiment.entity.Role;
import com.experiment.mapper.RoleMapper;
import com.experiment.service.RoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.experiment.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sr
 * @since 2018-11-28
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {


    @Autowired
    private UserRoleService userRoleService;
    @Override
    public Set<String> findRoleNameByUserId(String id) {
        return new HashSet<>(baseMapper.findRoleNameByUserId(id));
    }

    @Override
    public String get(String id) {
        int param=userRoleService.get(id);
        EntityWrapper<Role>ew=new EntityWrapper<>();
        ew.eq("id",param);
        return selectList(ew).get(0).getName();
    }
}
