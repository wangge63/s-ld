package org.fupingstar.sld.base.po;

import javax.persistence.MappedSuperclass;

/**
 * @author <a href="mailto:im.fa.fa63@gmail.com">wangge</a>
 * @date 2021年12月20日 7:55 下午
 * @since JDK11
 */
@MappedSuperclass
public abstract class AbstractCommonBasePO<ID, OV, TS> {
  
  public AbstractCommonBasePO() {};
  
}
