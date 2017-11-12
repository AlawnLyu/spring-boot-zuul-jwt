package com.wtown.userauthentication.common.model.userauth;

public class Sys_user {
  private Long id;
  private String mobile_phone;
  private String user_name;
  private String nickname;
  private String pwd;
  private String salt;
  private String signature;
  private Long gender;
  private Long qq;
  private String email;
  private String avatar;
  private String province;
  private String city;
  private String reg_ip;
  private Long score;
  private Long status;
  private Long create_by;
  private java.sql.Timestamp create_at;
  private Long update_by;
  private java.sql.Timestamp update_at;

  @Override
  public String toString() {
    return "Sys_user{" +
            "id=" + id +
            ", mobile_phone='" + mobile_phone + '\'' +
            ", user_name='" + user_name + '\'' +
            ", nickname='" + nickname + '\'' +
            ", pwd='" + pwd + '\'' +
            ", salt='" + salt + '\'' +
            ", signature='" + signature + '\'' +
            ", gender=" + gender +
            ", qq=" + qq +
            ", email='" + email + '\'' +
            ", avatar='" + avatar + '\'' +
            ", province='" + province + '\'' +
            ", city='" + city + '\'' +
            ", reg_ip='" + reg_ip + '\'' +
            ", score=" + score +
            ", status=" + status +
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

  public String getMobile_phone() {
    return mobile_phone;
  }

  public void setMobile_phone(String mobile_phone) {
    this.mobile_phone = mobile_phone;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public Long getGender() {
    return gender;
  }

  public void setGender(Long gender) {
    this.gender = gender;
  }

  public Long getQq() {
    return qq;
  }

  public void setQq(Long qq) {
    this.qq = qq;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getReg_ip() {
    return reg_ip;
  }

  public void setReg_ip(String reg_ip) {
    this.reg_ip = reg_ip;
  }

  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
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
