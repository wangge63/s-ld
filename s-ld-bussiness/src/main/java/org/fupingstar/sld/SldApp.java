package org.fupingstar.sld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
