package com.experiment.exception;


import com.experiment.Utils.Response;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLSyntaxErrorException;

@ControllerAdvice
public class UnauthorizedException extends RuntimeException {

        @ExceptionHandler(UnauthorizedException.class)
        public Response shiroException(){
            return Response.fail("你没有权限访问！");
        }

        @ExceptionHandler(AuthorizationException.class)
        public Response ShowException(){
            return Response.fail("你没有权限访问!");
        }




}
