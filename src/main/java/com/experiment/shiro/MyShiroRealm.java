package com.experiment.shiro;

import com.experiment.entity.Userinfo;
import com.experiment.service.AuthorityService;
import com.experiment.service.RoleService;
import com.experiment.service.UserinfoService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;

/**
 * @author s r
 * @date 2018/11/28
 */
@Service
public class MyShiroRealm extends AuthorizingRealm {
    private static org.slf4j.Logger logger=LoggerFactory.getLogger(MyShiroRealm.class);

    @Autowired
    private RoleService roleService;
    @Autowired
    private UserinfoService userinfoService;
    @Autowired
    private AuthorityService authorityService;



    @Override
    public boolean supports(AuthenticationToken token){
        return token instanceof  JWTToken;
    }

    /**
     * 授权 3
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.info("---------------- 执行 Shiro 权限获取 ---------------------");
       String id=JWTUtil.getUsername(principalCollection.toString());
       Set<String>set=authorityService.findPermissionsByUserId(id);
       SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
       simpleAuthorizationInfo.setStringPermissions(set);
       Set<String>set1=roleService.findRoleNameByUserId(id);
       simpleAuthorizationInfo.setRoles(set1);
       return simpleAuthorizationInfo;

    }
    /**
     * 认证信息.(身份验证) : Authentication 是用来验证用户身份
     *
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String token=(String)authenticationToken.getCredentials();
        String id=JWTUtil.getUsername(token);
        if(id==null){
            throw new AuthenticationException("认证失败!");
        }
        Userinfo userinfo=userinfoService.getUser(id);
        if(userinfo==null){
            throw  new AuthenticationException("用户不存在！");
        }
        if(!JWTUtil.verify(token,id,userinfo.getPassword())){
            throw new AuthenticationException("用户名或密码错误");
        }
        return new SimpleAuthenticationInfo(token, token, "my_realm");
    }
}
