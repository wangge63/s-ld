package org.fupingstar.sld.repository;

import org.fupingstar.sld.pojo.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author <a href="mailto:im.fa.fa63@gmail.com">wangge</a>
 * @date 2021年12月21日 12:02 下午
 * @since JDK11
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
