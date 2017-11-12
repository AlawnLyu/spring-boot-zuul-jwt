package com.wtown.userauthentication.common.model.userauth;

public class Sys_resource {
  private Long id;
  private String type;
  private String name;
  private String permission;
  private String icon;
  private Long sort;
  private String url;
  private String description;
  private Long status;
  private Long parent_id;
  private Long create_by;
  private java.sql.Timestamp create_at;
  private Long update_by;
  private java.sql.Timestamp update_at;

  @Override
  public String toString() {
    return "Sys_resource{" +
            "id=" + id +
            ", type='" + type + '\'' +
            ", name='" + name + '\'' +
            ", permission='" + permission + '\'' +
            ", icon='" + icon + '\'' +
            ", sort=" + sort +
            ", url='" + url + '\'' +
            ", description='" + description + '\'' +
            ", status=" + status +
            ", parent_id=" + parent_id +
            ", create_by=" + create_by +
            ", create_at=" + create_at +
            ", update_by=" + update_by +
            ", update_at=" + update_at +
            '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public Long getSort() {
    return sort;
  }

  public void setSort(Long sort) {
    this.sort = sort;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public Long getParent_id() {
    return parent_id;
  }

  public void setParent_id(Long parent_id) {
    this.parent_id = parent_id;
  }

  public Long getCreate_by() {
    return create_by;
  }

  public void setCreate_by(Long create_by) {
    this.create_by = create_by;
  }

  public java.sql.Timestamp getCreate_at() {
    return create_at;
  }

  public void setCreate_at(java.sql.Timestamp create_at) {
    this.create_at = create_at;
  }

  public Long getUpdate_by() {
    return update_by;
  }

  public void setUpdate_by(Long update_by) {
    this.update_by = update_by;
  }

  public java.sql.Timestamp getUpdate_at() {
    return update_at;
  }

  public void setUpdate_at(java.sql.Timestamp update_at) {
    this.update_at = update_at;
  }
}
