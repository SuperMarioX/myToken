package com.myhk.console.access.db;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by Victor on 26/02/2017.
 */

public class AKSKInfo implements Serializable {

    private static final long serialVersionUID = 1944981816922143472L;

    private UUID uuid;
    private String userId;
    private String ak;
    private String sk;
    private Timestamp issued;
    private Timestamp expired;
    private boolean disabled;

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public Timestamp getExpired() {
        return expired;
    }

    public void setExpired(Timestamp expired) {
        this.expired = expired;
    }

    public Timestamp getIssued() {
        return issued;
    }

    public void setIssued(Timestamp issued) {
        this.issued = issued;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
