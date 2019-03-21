package com.experiment.service.impl;

import com.experiment.entity.Authority;
import com.experiment.mapper.AuthorityMapper;
import com.experiment.service.AuthorityService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
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
public class AuthorityServiceImpl extends ServiceImpl<AuthorityMapper, Authority> implements AuthorityService {

    @Override
    public Set<String> findPermissionsByUserId(String id) {
        return new HashSet<>(baseMapper.get(id));
    }

    @Override
    public List<Authority> list(String id) {
        return baseMapper.list(id);
    }
}
