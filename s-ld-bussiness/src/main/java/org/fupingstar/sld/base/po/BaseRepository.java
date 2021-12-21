package org.fupingstar.sld.base.po;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author <a href="mailto:im.fa.fa63@gmail.com">wangge</a>
 * @date 2021年12月20日 8:38 下午
 * @since JDK11
 */
@NoRepositoryBean
public interface BaseRepository<T extends BasePO, ID> extends JpaRepository<T, ID> {
}