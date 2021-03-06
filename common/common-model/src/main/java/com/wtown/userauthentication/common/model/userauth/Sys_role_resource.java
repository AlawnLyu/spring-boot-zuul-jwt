package com.wtown.userauthentication.common.model.userauth;

public class Sys_role_resource {
  private Long id;
  private Long role_id;
  private Long resource_id;

  @Override
  public String toString() {
    return "Sys_role_resource{" +
            "id=" + id +
            ", role_id=" + role_id +
            ", resource_id=" + resource_id +
            '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getRole_id() {
    return role_id;
  }

  public void setRole_id(Long role_id) {
    this.role_id = role_id;
  }

  public Long getResource_id() {
    return resource_id;
  }

  public void setResource_id(Long resource_id) {
    this.resource_id = resource_id;
  }
}
