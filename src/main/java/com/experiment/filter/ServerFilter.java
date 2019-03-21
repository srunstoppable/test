//package com.experiment.filter;
//
//
//import com.experiment.entity.Userinfo;
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//
//@WebFilter
//public class ServerFilter implements Filter {
//    /**
//    *过滤器，控制登录访问
//    *未登录的用户无法进如的操作界面
//    */
//    private final  String list[]={"/login_view.html","/login","/logout","/swagger-ui.html"};
//
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest httpServletRequest=(HttpServletRequest)servletRequest;
//        Userinfo user=(Userinfo)httpServletRequest.getSession().getAttribute("userToken");
//        if(user!=null){
//            filterChain.doFilter(servletRequest,servletResponse);
//        } else{
//            String url=httpServletRequest.getRequestURI();
//            boolean flag=true;
//            for(String s:list){
//                if(url.contains(s)){
//                    flag=false;
//                     break;
//                }
//            }
//            if(!flag){
//                filterChain.doFilter(servletRequest,servletResponse);
//            }else{
//                ((HttpServletResponse)servletResponse).sendRedirect("login_view.html");
//            }
//        }
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
