package com.experiment.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.experiment.Utils.Response;
import com.experiment.Utils.Result;
import com.experiment.entity.Formula;
import com.experiment.service.FormulaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.velocity.runtime.directive.contrib.For;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.experiment.Utils.BaseController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sr
 * @since 2018-11-23
 */

@Api(value = "公式操作api",description = "公式操作api")
@RequiresRoles("管理员")
@RestController
@RequestMapping("/formula")
public class FormulaController extends BaseController {

    @Autowired
    private FormulaService formulaService;


    @ApiOperation(value = "分页查询公式表",notes="分页查询公式表",response = Page.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "Authorization", required = true, paramType = "header"),
            @ApiImplicitParam(name = "page", value = "分页当前页,不传默认第一页", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "分页一页多少条记录,不传默认12条", dataType = "String", paramType = "query"),
    })
    @GetMapping("/list")
    public Response list(){
        Integer[] pageInfo = getPageSizeFromGetRequest();
        Page<Formula> page=new Page<>(pageInfo[0],pageInfo[1]);
        return formulaService.query(page);
    }

    @ApiOperation(value = "根据name查询单个公式",notes = "根据name查询单个公式",response = Formula.class)
    @ApiImplicitParam(name = "Authorization", value = "Authorization", required = true, paramType = "header")
    @GetMapping("/search")
    public Formula search(@RequestParam("name") int id){
        return formulaService.search(id);
    }

    @ApiOperation(value = "更新公式",notes = "更新公式",response =Formula.class)
    @ApiImplicitParam(name = "Authorization", value = "Authorization", required = true, paramType = "header")
    @PutMapping("/update")
    public Response update(@RequestBody Formula formula){
            formulaService.update(formula);
            return Response.success();
    }

    @ApiOperation(value = "新增公式",notes = "新增公式",response =Formula.class)
    @ApiImplicitParam(name = "Authorization", value = "Authorization", required = true, paramType = "header")
    @PostMapping(value = "add")
    public Response add(@RequestBody Formula formula){
            formulaService.add(formula);
            return Response.success();
    }


    @ApiOperation(value = "检查公式参数是否正确",notes = "检查公式参数是否正确",response = Formula.class)
    @ApiImplicitParam(name = "Authorization", value = "Authorization", required = true, paramType = "header")
    @PostMapping(value = "/check")
    public Result check(@RequestBody Formula formula){

        Result result=new Result();
        if(formulaService.check(formula))
            result.setMessage("success");
       else
           result.setMessage("fail");

       return result;
    }


    @ApiOperation(value = "删除公式",notes = "删除公式",response = Response.class)
    @ApiImplicitParam(name = "Authorization", value = "Authorization", required = true, paramType = "header")
    @DeleteMapping(value ="/delete")
    public Response delete(@RequestBody Formula formula){
        formulaService.delete(formula);
        return Response.success();
    }

}

