package com.myhk.console.access.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * Created by Victor on 19/02/2017.
 */

public class TokenPayload implements Serializable {

    private static final long serialVersionUID = 8685288856441349590L;

    @JSONField(name = "credential")
    private TokenCredential tokenCredential;

    @JSONField(name = "user")
    private UserInfo userInfo;

    public TokenPayload() {}

    public TokenPayload(TokenCredential tokenCredential, UserInfo userInfo) {
        this.tokenCredential = tokenCredential;
        this.userInfo = userInfo;
    }

    public TokenCredential getTokenCredential() {
        return tokenCredential;
    }

    public void setTokenCredential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
