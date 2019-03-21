package com.experiment.mapper;

import com.experiment.entity.Authority;
import com.baomidou.mybatisplus.mapper.BaseMapper;
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
public interface AuthorityMapper extends BaseMapper<Authority> {

    @Select("select a.name from authority a,role_authority ra,role r\n" +
            "\n" +
            "where r.id=ra.roleid and ra.authorityid=a.id and r.id in (select r.id from  userinfo u,role r,user_role ur where u.id=#{id} and u.id=ur.userid and ur.roleid=r.id) order by a.parent_id")
    public List<String>get(String id);

    @Select("select a.* from authority a,role_authority ra,role r\n" +
            "\n" +
            "where r.id=ra.roleid and ra.authorityid=a.id and r.id in (\n" +
            "select r.id from  userinfo u,role r,user_role ur where u.id=#{id} and u.id=ur.userid and ur.roleid=r.id) order by a.parent_id")
    public List<Authority>list(String id);

}
