package com.myhk.console.access.jwt;

import com.myhk.console.access.model.UserInfo;
import sun.misc.BASE64Encoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Victor on 21/02/2017.
 */

public class JustTest {

    public static void main(String[] args) {


        BASE64Encoder base64Encoder = new BASE64Encoder();


        List aa = new ArrayList<String>();
        aa.add("aa");
        aa.add("bb");
        JwtClaim jwtClaim = new JwtClaim("www", "ashskjh", new UserInfo("123", "hk", aa), 1000);

        String en = base64Encoder.encodeBuffer(jwtClaim.toString().getBytes()).replace("\n", "");

        System.out.println(en);

    }

}
