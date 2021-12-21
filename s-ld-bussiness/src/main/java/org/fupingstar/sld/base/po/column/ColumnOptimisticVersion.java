package org.fupingstar.sld.base.po.column;

/**
 * 映射数据表乐观锁列.
 *
 * @author <a href="mailto:im.fa.fa63@gmail.com">wangge</a>
 * @date 2021年12月20日 7:50 下午
 * @since JDK11
 */
public interface ColumnOptimisticVersion<OV> {
  
  OV getOptimiticsVersion();
  
  void setOptimiticsVersion(OV var1);
}

