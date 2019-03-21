package com.experiment.controller;


import com.experiment.shiro.JWTUtil;
import com.experiment.Utils.Response;
import com.experiment.service.SubmitWorkLoadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.experiment.Utils.BaseController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sr
 * @since 2018-11-25
 */

@Api(value = "教师提交工作量相关api",description = "教师提交工作量相关api")
@RestController
@RequestMapping("/course")
public class CourseController extends BaseController {

    @Autowired
    private SubmitWorkLoadService submitWorkLoadService;


    @ApiOperation(value = "查询出所有要输入的参数",notes = "查询出所有要输入的参数")
    @ApiImplicitParams({
    @ApiImplicitParam(name = "teams",value = "teams",paramType = "query"),
    @ApiImplicitParam(name = "Authorization" ,value = "Authorization",required = true,paramType = "header")
    })
    @RequiresRoles("教师")
    @GetMapping("/list")
    public Response list(@RequestParam("teams")String teams, HttpServletRequest request){
        return Response.success(submitWorkLoadService.list("%"+teams+"%",JWTUtil.getUsername(JWTUtil.getToken(request))));
    }
}

