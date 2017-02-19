package com.myhk.console.access.util;

import com.alibaba.fastjson.JSON;
import com.myhk.console.access.model.TokenCredential;
import com.myhk.console.access.model.TokenPayload;
import org.springframework.util.StringUtils;

/**
 * Created by Victor on 19/02/2017.
 */

public class TokenResourceUtil {

    /**
     * Could not be newed
     */
    private TokenResourceUtil() {
    }

    public static boolean CheckDefaultCredentialValid(String payload) {

        if (!StringUtils.isEmpty(payload)) {
            TokenPayload tokenPayload = JSON.parseObject(payload, TokenPayload.class);
            if (!StringUtils.isEmpty(tokenPayload)) {
                TokenCredential tokenCredential = tokenPayload.getTokenCredential();
                if (!StringUtils.isEmpty(tokenCredential)) {
                    if (tokenCredential.getAccessKey().equals("a") && tokenCredential.getSecretKey().equals("b")) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
