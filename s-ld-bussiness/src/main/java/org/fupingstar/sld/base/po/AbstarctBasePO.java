package org.fupingstar.sld.base.po;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.persistence.Version;

/**
 * @author <a href="mailto:im.fa.fa63@gmail.com">wangge</a>
 * @date 2021年12月20日 7:57 下午
 * @since JDK11
 */
@MappedSuperclass
public abstract class AbstarctBasePO<ID> extends AbstractCommonBasePO<ID, Integer, Timestamp> {
  
  @Column(
          name = "UPDATE_TIME",
          columnDefinition = "datetime"
  )
  private Timestamp updateTime;
  
  @Column(
          name = "CREATE_TIME",
          columnDefinition = "datetime"
  )
  private Timestamp createTime;
  
  @Version
  @Column(
          name = "OPTIMISTIC_LOCK_VERSION",
          columnDefinition = "int(11)"
  )
  private Integer optimisticLockVersion;
  
  @Transient
  private Boolean limitFlag;
  
  public Timestamp getUpdateTime() {
    return updateTime;
  }
  
  public void setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
  }
  
  public Timestamp getCreateTime() {
    return createTime;
  }
  
  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }
  
  public Integer getOptimisticLockVersion() {
    return optimisticLockVersion;
  }
  
  public void setOptimisticLockVersion(Integer optimisticLockVersion) {
    this.optimisticLockVersion = optimisticLockVersion;
  }
  
  public Boolean getLimitFlag() {
    return limitFlag;
  }
  
  public void setLimitFlag(Boolean limitFlag) {
    this.limitFlag = limitFlag;
  }
}

