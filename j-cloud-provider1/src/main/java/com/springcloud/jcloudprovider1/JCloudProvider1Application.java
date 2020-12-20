package com.springcloud.jcloudprovider1;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class})//不关联数据库时配置
@EnableEurekaClient
public class JCloudProvider1Application {

	public static void main(String[] args) {
		SpringApplication.run(JCloudProvider1Application.class, args);
	}

}
