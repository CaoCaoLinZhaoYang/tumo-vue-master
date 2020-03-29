package cn.tycoding.common.properties;

import lombok.Data;

/**
 * @author tycoding
 * @date 2019-09-20
 */
//@Data
public class ShiroProperties {

    public long getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(long sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public int getCookieTimeout() {
        return cookieTimeout;
    }

    public void setCookieTimeout(int cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
    }

    public String getAnonUrl() {
        return anonUrl;
    }

    public void setAnonUrl(String anonUrl) {
        this.anonUrl = anonUrl;
    }

    private long sessionTimeout;
    private int cookieTimeout;
    private String anonUrl;



}
