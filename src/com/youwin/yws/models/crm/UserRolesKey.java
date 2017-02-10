package com.youwin.yws.models.crm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class UserRolesKey implements Serializable {
    /**
     * 用户主键ID
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 角色主键ID
     */
    @Id
    @Column(name = "role_id")
    private Long roleId;

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
     * 获取角色主键ID
     *
     * @return role_id - 角色主键ID
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色主键ID
     *
     * @param roleId 角色主键ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}