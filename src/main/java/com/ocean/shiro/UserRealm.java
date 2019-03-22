package com.ocean.shiro;

import com.ocean.pojo.TUser;
import com.ocean.service.ITUserService;
import com.ocean.service.impl.TUserServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class UserRealm extends AuthorizingRealm {
    private ITUserService itUserService;
  //注入业务
    @Autowired
    private void setItUserService(ITUserService itUserService){
        this.itUserService=itUserService;
    }

    /**
     * 获取身份验证信息
     * Shiro中，最终是通过 Realm 来获取应用程序中的用户、角色及权限信息的。
     *
     * @param authenticationToken 用户身份信息 token
     * @return 返回封装了用户信息的 AuthenticationInfo 实例
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        System.out.println("————身份认证方法————");
//        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        // 从数据库获取对应用户名密码的用户
//        String password = itUserService.getPassWord(token.getUsername());
//        if (null == password) {
//            throw new AccountException("用户名不正确");
//        } else if (!password.equals(new String((char[]) token.getCredentials()))) {
//            throw new AccountException("密码不正确");
//        }
//        return new SimpleAuthenticationInfo(token.getPrincipal(), password, getName());
//           TUser tUser=itUserService.selectByUserId(token.getUsername());//将ID即电话号码作为username查询
//           if(tUser==null){
//               return null;
//           }
//           String credentials = new String((char[])token.getCredentials());    // 得到认证/凭证（密码）
//           return new SimpleAuthenticationInfo(tUser,String.valueOf(credentials),"");
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        TUser tUser = itUserService.selectByUserId(token.getUsername());
        if(tUser==null){
            //用户名不存在
            return null;
        }

        //2.判断密码
        return new SimpleAuthenticationInfo(tUser,tUser.getPassWord(),"");
    }

    /**
     * 获取授权信息
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("————权限认证————");
        //获取用户名实体（ji电话号码）
        TUser tUser = (TUser) SecurityUtils.getSubject().getPrincipal();
        //给资源进行授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

//        String username = (String) SecurityUtils.getSubject().getPrincipal();
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        //获得该用户角色
//        String role = userMapper.getRole(username);
//        Set<String> set = new HashSet<>();
//        //需要将 role 封装到 Set 作为 info.setRoles() 的参数
//        set.add(role);
//        //设置该用户拥有的角色
//        info.setRoles(set);
//        return info;
//
//        TUser tUser=itUserService.selectByUserId(userName);
       // info.addStringPermission(tUser.getUserType());
        TUser dbUser=itUserService.selectByUserId(tUser.getUserId());
        String type=dbUser.getUserType();
        Set<String> set = new HashSet<>();
//        //需要将 role 封装到 Set 作为 info.setRoles() 的参数
        set.add(type);
//        //设置该用户拥有的角色
        info.setRoles(set);
        return info;
    }
}