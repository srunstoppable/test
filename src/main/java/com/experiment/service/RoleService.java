package com.experiment.service;

import com.experiment.entity.Role;
import com.baomidou.mybatisplus.service.IService;

import java.util.Set;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sr
 * @since 2018-11-28
 */
public interface RoleService extends IService<Role> {
    public Set<String> findRoleNameByUserId(String id);
    public String get(String id);
}
