package com.wechat_springboot.standand.wx_util;

import java.io.Serializable;
import java.util.Objects;

public class Wechat_Session_model implements Serializable {
    private String session_key;
    private String openid;

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wechat_Session_model that = (Wechat_Session_model) o;
        return Objects.equals(session_key, that.session_key) &&
                Objects.equals(openid, that.openid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(session_key, openid);
    }

    @Override
    public String toString() {
        return "Wechat_Session_model{" +
                "session_key='" + session_key + '\'' +
                ", openid='" + openid + '\'' +
                '}';
    }
}
