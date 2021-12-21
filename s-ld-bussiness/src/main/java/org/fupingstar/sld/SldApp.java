package org.fupingstar.sld;

import org.fupingstar.sld.pojo.po.User;
import org.fupingstar.sld.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

/**
 * 项目启动类.
 *
 * @author <a href="mailto:im.fa.fa63@gmail.com">wangge</a>
 * @date 2021年12月20日 7:17 上午
 * @since JDK11
 */
@SpringBootApplication
@RestController
public class SldApp {
  
  public static void main(String[] args) {
    SpringApplication.run(SldApp.class, args);
  }
  
  /**
   * 测试请求.
   *
   * @return 响应文案
   */
  @GetMapping()
  public String testApp() {
    return "SLD START";
  }
  
  /**
   * 测试JPA.
   *
   * @param userRepository
   * @return
   */
  @Bean
  CommandLineRunner commandLineRunner(UserRepository userRepository) {
    return args -> {
      User maria = new User();
      maria.setUserName("fuxx");
      maria.setRealName("xxxx");
      maria.setPassword("111");
      maria.setAge(21);
      maria.setEmail("im.fa.fa63@gmail.com");
      maria.setDept(1L);
      maria.setPosition(1L);
      maria.setCreateTime(new Timestamp(System.currentTimeMillis()));
      maria.setUpdateTime(new Timestamp(System.currentTimeMillis()));
      maria.setOptimisticLockVersion(1);
      userRepository.save(maria);
    };
  }
}
