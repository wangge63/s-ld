package org.fupingstar.sld.base.po;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author <a href="mailto:im.fa.fa63@gmail.com">wangge</a>
 * @date 2021年12月20日 8:05 下午
 * @since JDK11
 */
@MappedSuperclass
public class BasePO<ID extends Serializable> extends AbstarctBasePO<ID> {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(
          name = "ID",
          updatable = false
  )
  private ID id;
  
  public ID getId() {
    return id;
  }
  
  public void setId(ID id) {
    this.id = id;
  }
}
