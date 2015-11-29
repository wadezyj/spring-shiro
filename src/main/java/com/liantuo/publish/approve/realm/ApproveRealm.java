package com.liantuo.publish.approve.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.io.Serializable;

/**
 * realm
 * Created by ZhangYJ on 15/11/19.
 */
public class ApproveRealm extends AuthorizingRealm implements Serializable {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String currentUsername = (String)super.getAvailablePrincipal(principalCollection);
        SimpleAuthorizationInfo authorization = new SimpleAuthorizationInfo();
        return authorization;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(token.getPrincipal(), token.getPassword(), this.getName());
        return authenticationInfo;
    }
}
