package com.myhk.console.access.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * Created by Victor on 19/02/2017.
 */

public class TokenCredential implements Serializable {

    private static final long serialVersionUID = 5397166736665654957L;

    /**
     * Access key
     */
    @JSONField(name="access_key")
    private String accessKey;

    /**
     * secret key
     */
    @JSONField(name = "secret_key")
    private String secretKey;


    public TokenCredential() {}

    /**
     * Default constructor
     * @param accessKey access key
     * @param secretKey secret key
     */
    public TokenCredential(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }


    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }




}
