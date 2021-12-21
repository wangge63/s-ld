package org.fupingstar.sld.pojo.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.fupingstar.sld.base.po.BasePO;

/**
 * User实体类.
 *
 * @author <a href="mailto:im.fa.fa63@gmail.com">wangge</a>
 * @date 2021年12月20日 2:17 下午
 * @since JDK11
 */
@Entity(name = "User")
@Table(
    name = "user",
    uniqueConstraints = {@UniqueConstraint(name = "user_email_unique", columnNames = "EMAIL")}
)
@org.hibernate.annotations.Table(appliesTo = "user", comment = "用户表")
public class User extends BasePO<Long> {

  @Column(
      name = "USER_NAME",
      nullable = false,
      columnDefinition = "varchar(64) default '' comment '用户名'")
  private String userName;

  @Column(
      name = "PASSWORD",
      nullable = false,
      columnDefinition = "varchar(64) default '' comment '密码'")
  private String password;

  @Column(
      name = "REAL_NAME",
      nullable = false,
      columnDefinition = "varchar(64) default '' comment '真实姓名'")
  private String realName;

  @Column(name = "AGE", nullable = false, columnDefinition = "int(11) default 0 comment '年龄'")
  private Integer age;

  @Column(name = "EMAIL", columnDefinition = "varchar(128) default '' comment '邮箱'")
  private String email;

  @Column(
      name = "DEPT",
      nullable = false,
      columnDefinition = "bigint(20) default 0 comment '所在部门id'")
  private Long dept;

  @Column(
      name = "POSITION",
      nullable = false,
      columnDefinition = "bigint(20) default 0 comment '职位id'")
  private Long position;

  public User() {}

  public User(
      String userName,
      String password,
      String realName,
      Integer age,
      String email,
      Long dept,
      Long position) {
    this.userName = userName;
    this.password = password;
    this.realName = realName;
    this.age = age;
    this.email = email;
    this.dept = dept;
    this.position = position;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getDept() {
    return dept;
  }

  public void setDept(Long dept) {
    this.dept = dept;
  }

  public Long getPosition() {
    return position;
  }

  public void setPosition(Long position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "User{"
        + ", userName='"
        + userName
        + '\''
        + ", password='"
        + password
        + '\''
        + ", realName='"
        + realName
        + '\''
        + ", age="
        + age
        + ", email='"
        + email
        + '\''
        + ", dept="
        + dept
        + ", position="
        + position
        + '}';
  }
}
