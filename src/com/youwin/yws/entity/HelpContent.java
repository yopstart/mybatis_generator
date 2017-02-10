package com.youwin.yws.entity;

import java.io.Serializable;
import java.util.Date;

public class HelpContent implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 主题id
     */
    private Integer helpTopicId;

    /**
     * 内容标题
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
     * 内容热度
     */
    private Long hot;

    /**
     * 扩展字段
     */
    private String ext;

    /**
     * 图文内容 html
     */
    private String content;

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
     * 获取主题id
     *
     * @return help_topic_id - 主题id
     */
    public Integer getHelpTopicId() {
        return helpTopicId;
    }

    /**
     * 设置主题id
     *
     * @param helpTopicId 主题id
     */
    public void setHelpTopicId(Integer helpTopicId) {
        this.helpTopicId = helpTopicId;
    }

    /**
     * 获取内容标题
     *
     * @return title - 内容标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置内容标题
     *
     * @param title 内容标题
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
     * 获取内容热度
     *
     * @return hot - 内容热度
     */
    public Long getHot() {
        return hot;
    }

    /**
     * 设置内容热度
     *
     * @param hot 内容热度
     */
    public void setHot(Long hot) {
        this.hot = hot;
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
     * 获取图文内容 html
     *
     * @return content - 图文内容 html
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置图文内容 html
     *
     * @param content 图文内容 html
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * ,help_content
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", helpTopicId=").append(helpTopicId);
        sb.append(", title=").append(title);
        sb.append(", orderRule=").append(orderRule);
        sb.append(", createBy=").append(createBy);
        sb.append(", createAt=").append(createAt);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", hot=").append(hot);
        sb.append(", ext=").append(ext);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}