package org.fupingstar.sld.base.po.column;

import java.io.Serializable;

/**
 * 映射数据表id列.
 *
 * @author <a href="mailto:im.fa.fa63@gmail.com">wangge</a>
 * @date 2021年12月20日 7:48 下午
 * @since JDK11
 */
public interface ColumnId<ID> {

  ID getId();
  
  void setId(ID var1);
}

