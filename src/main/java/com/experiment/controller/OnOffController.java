package com.experiment.controller;


import com.experiment.Utils.Result;
import com.experiment.entity.OnOff;
import com.experiment.entity.Userinfo;
import com.experiment.service.OnOffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.experiment.Utils.BaseController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sr
 * @since 2018-11-22
 */
@Api(value = "工作量提交开放功能Api" ,description = "工作量提交开放功能Api")
@RestController
@RequestMapping("/onOff")
public class OnOffController extends BaseController {


    @Autowired
    private OnOffService onOffService;


    @ApiOperation(value = "开放工作量提交功能",notes = "开放工作量提交功能" ,response = Result.class)
    @ApiImplicitParam(name = "Authorization", value = "Authorization", required = true, paramType = "header")
    @RequiresRoles("管理员")
    @PutMapping("/open")
    public Result open(){
        OnOff onOff=new OnOff();
        return onOffService.open(onOff);

    }

    @ApiOperation(value = "关闭工作量提交功能",notes = "关闭工作量提交功能" ,response =  Result.class)
    @ApiImplicitParam(name = "Authorization", value = "Authorization", required = true, paramType = "header")
    @RequiresRoles("管理员")
    @PutMapping("/close")
    public Result close(){
        OnOff onOff=new OnOff();
        return onOffService.close(onOff);
    }

    @ApiOperation(value = "检查是否开放",notes = "用户点击提交时，检查是否开放，根据 success属性对用户操作进行反应" ,response =  Result.class)
    @ApiImplicitParam(name = "Authorization", value = "Authorization", required = true, paramType = "header")
    @PostMapping("/check")
    public Result check(){
            return onOffService.check();

    }
}

