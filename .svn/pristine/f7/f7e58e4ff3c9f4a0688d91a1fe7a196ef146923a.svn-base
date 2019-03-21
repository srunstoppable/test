package com.experiment.mapper;

import com.experiment.entity.Role;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sr
 * @since 2018-11-28
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

    @Select("select r.name from role r,userinfo u,user_role ur where u.id=ur.userid and r.id=ur.roleid and u.id=#{id}")
    List <String>findRoleNameByUserId(String id);


}
