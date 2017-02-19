package com.myhk.console.access.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Victor on 19/02/2017.
 */

public class UserInfo implements Serializable {

    private static final long serialVersionUID = 8196024312627292243L;

    @JSONField(name = "userId")
    private String userId;

    @JSONField(name = "userName")
    private String userName;

    @JSONField(name = "roles")
    private List<String> roles;

    public UserInfo() {}

    public UserInfo(String userId, String userName, List roles) {
        this.userId = userId;
        this.userName = userName;
        this.roles = roles;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
