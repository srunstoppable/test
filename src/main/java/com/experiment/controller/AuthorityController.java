package com.experiment.controller;
import com.experiment.shiro.JWTUtil;
import com.experiment.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author s r
 * @date 2018/11/30
 */

@Api(value = "权限菜单分配Api",description = "权限菜单分配Api")
@RestController
@RequestMapping("/auth")
public class AuthorityController {

    @Autowired
    private RoleService roleService;

    @ApiOperation(value = "查询权限list",notes = "登录后查询权限list，动态生成功能菜单栏")
    @ApiImplicitParam(name = "Authorization",value ="Authorization" ,paramType = "header",required = true)
    @GetMapping("/list")
    public  String list(HttpServletRequest request){

        return roleService.get(JWTUtil.getUsername(JWTUtil.getToken(request)));


    }


}
