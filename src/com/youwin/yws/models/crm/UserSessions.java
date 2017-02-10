package com.youwin.yws.models.crm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class UserSessions implements Serializable {
    /**
     * 用户主键ID
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户账号
     */
    private String account;

    /**
     * 登录标记
     */
    private String token;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户主键ID
     *
     * @return user_id - 用户主键ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户主键ID
     *
     * @param userId 用户主键ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户账号
     *
     * @return account - 用户账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置用户账号
     *
     * @param account 用户账号
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取登录标记
     *
     * @return token - 登录标记
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置登录标记
     *
     * @param token 登录标记
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", account=").append(account);
        sb.append(", token=").append(token);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}