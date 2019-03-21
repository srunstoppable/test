package com.experiment.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.experiment.Utils.Result;
import com.experiment.entity.Userinfo;
import com.experiment.mapper.UserinfoMapper;
import com.experiment.service.UserinfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sr
 * @since 2018-11-21
 */
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements UserinfoService {


    @Override
    public Result login(Userinfo userinfo) {
       Result result=new Result();
        Userinfo user=selectById(userinfo.getId());
        if(user != null) {
            if (!user.getPassword().equals(userinfo.getPassword())) {
                result.setMessage("用户名或密码错误");
                result.setSuccess(false);
            } else {
                result.setSuccess(true);
//                result.setUserinfo(user);
            }
        } else {
            result.setSuccess(false);
            result.setMessage("用户名或密码错误");
        }
            return result;
    }

    @Override
    public Userinfo getUser(Userinfo userinfo) {
        EntityWrapper<Userinfo>ew=new EntityWrapper<>();
        ew.eq("id",userinfo.getId());
        ew.eq("password",userinfo.getPassword());
        return selectOne(ew);
    }

    @Override
    public Userinfo getUser(String id) {
        return selectById(id);
    }
}
