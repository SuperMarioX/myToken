package com.myhk.console.access.jwt;

import java.io.Serializable;

/**
 * Created by Victor on 19/02/2017.
 */

public class JwtHeader implements Serializable {

    private static final long serialVersionUID = -8945910287449896746L;

    private String typ;
    private String alg;

    public JwtHeader(String typ, String alg) {
        this.typ = typ;
        this.alg = alg;
    }

    @Override
    public String toString() {

        return "JwtHeader [typ=" + typ
                + ", "
                + "alg=" + alg
                + "]";
    }
}
