package com.myhk.console.access.jwt;


import org.springframework.util.StringUtils;

import java.security.Signature;
import java.util.Base64;

/**
 * Created by Victor on 19/02/2017.
 */

public class JwtGenerator {

    private JwtHeader header;
    private JwtClaim claim;
    private JwtAlgo jwtAlgo;

    public JwtGenerator(JwtHeader header, JwtClaim claim, JwtAlgo algo) {
        this.header = header;
        this.claim = claim;
        this.jwtAlgo = algo;
    }

    public String buildJwtToken() throws Exception {

        if (StringUtils.isEmpty(header) || StringUtils.isEmpty(claim)) {
            throw new Exception();
        } else {
            String encodedHeader = Base64.getEncoder().encodeToString(header.toString().getBytes());
            String encodedClaim = Base64.getEncoder().encodeToString(claim.toString().getBytes());
            String originals = encodedHeader + "." + encodedClaim;

            //String signed = Signature.getInstance()
        }


        return null;
    }



}
