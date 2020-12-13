package com.shenlan.springcloud.jcloud;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class})//不关联数据库时配置
public class JCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JCloudApplication.class, args);
	}

}
