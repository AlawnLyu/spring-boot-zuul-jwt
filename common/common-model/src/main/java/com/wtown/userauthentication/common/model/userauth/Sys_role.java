package com.wtown.userauthentication.common.model.userauth;

public class Sys_role {
  private Long id;
  private String name;
  private String code;
  private String remark;
  private Long status;
  private Long parent_id;
  private Long create_by;
  private java.sql.Timestamp create_at;
  private Long update_by;
  private java.sql.Timestamp update_at;

  @Override
  public String toString() {
    return "Sys_role{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", code='" + code + '\'' +
            ", remark='" + remark + '\'' +
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
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
