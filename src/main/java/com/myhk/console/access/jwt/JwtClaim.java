package com.myhk.console.access.jwt;

import com.myhk.console.access.model.UserInfo;

import java.io.Serializable;

/**
 * Created by Victor on 19/02/2017.
 */

public class JwtClaim implements Serializable {

    private static final long serialVersionUID = -1198303234412049L;

    private String issuer;
    private String issuedAt;
    private UserInfo user;
    private long expired;

    public JwtClaim(String issuer, String issuedAt, UserInfo user, long expired) {
        this.issuer = issuer;
        this.issuedAt = issuedAt;
        this.user = user;
        this.expired = expired;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public long getExpired() {
        return expired;
    }

    public void setExpired(long expired) {
        this.expired = expired;
    }

    @Override
    public String toString() {
        return "JwtClaim [issuer=" + issuer
                + ", "
                + "issuedAt=" + issuedAt
                + "object=" + user
                + "expired" + expired
                + "]";
    }
}
