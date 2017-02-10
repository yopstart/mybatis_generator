package com.youwin.yws.entity;

import java.io.Serializable;
import java.util.Date;

public class HelpTopic implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 图标
     */
    private String icon;

    /**
     * 主题标题
     */
    private String title;

    /**
     * 排序，数字规则：数字小的在前 null在最后
     */
    private Integer orderRule;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新人
     */
    private Long updateBy;

    /**
     * 更新时间
     */
    private Date updateAt;

    /**
     * 是否删除 0:否 1:是
     */
    private Boolean isDeleted;

    /**
     * 主题热度
     */
    private Long hot;

    /**
     * 主题分类：一级 二级（暂无用）
     */
    private Integer type;

    /**
     * 扩展字段
     */
    private String ext;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取主题标题
     *
     * @return title - 主题标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置主题标题
     *
     * @param title 主题标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取排序，数字规则：数字小的在前 null在最后
     *
     * @return order_rule - 排序，数字规则：数字小的在前 null在最后
     */
    public Integer getOrderRule() {
        return orderRule;
    }

    /**
     * 设置排序，数字规则：数字小的在前 null在最后
     *
     * @param orderRule 排序，数字规则：数字小的在前 null在最后
     */
    public void setOrderRule(Integer orderRule) {
        this.orderRule = orderRule;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_at - 创建时间
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 设置创建时间
     *
     * @param createAt 创建时间
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 获取更新人
     *
     * @return update_by - 更新人
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新人
     *
     * @param updateBy 更新人
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取更新时间
     *
     * @return update_at - 更新时间
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 设置更新时间
     *
     * @param updateAt 更新时间
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 获取是否删除 0:否 1:是
     *
     * @return is_deleted - 是否删除 0:否 1:是
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除 0:否 1:是
     *
     * @param isDeleted 是否删除 0:否 1:是
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取主题热度
     *
     * @return hot - 主题热度
     */
    public Long getHot() {
        return hot;
    }

    /**
     * 设置主题热度
     *
     * @param hot 主题热度
     */
    public void setHot(Long hot) {
        this.hot = hot;
    }

    /**
     * 获取主题分类：一级 二级（暂无用）
     *
     * @return type - 主题分类：一级 二级（暂无用）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置主题分类：一级 二级（暂无用）
     *
     * @param type 主题分类：一级 二级（暂无用）
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取扩展字段
     *
     * @return ext - 扩展字段
     */
    public String getExt() {
        return ext;
    }

    /**
     * 设置扩展字段
     *
     * @param ext 扩展字段
     */
    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    /**
     * ,help_topic
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", icon=").append(icon);
        sb.append(", title=").append(title);
        sb.append(", orderRule=").append(orderRule);
        sb.append(", createBy=").append(createBy);
        sb.append(", createAt=").append(createAt);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", hot=").append(hot);
        sb.append(", type=").append(type);
        sb.append(", ext=").append(ext);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}