package org.fupingstar.sld.base.po.column;

/**
 * 映射数据表更新时间列.
 *
 * @author <a href="mailto:im.fa.fa63@gmail.com">wangge</a>
 * @date 2021年12月20日 7:52 下午
 * @since JDK11
 */
public interface ColumnUpdateTime<TS> {
  
  TS getUpdateTime();
  
  void setUpdateTime(TS var1);
}
