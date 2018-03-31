package com.gzxant.gzxant_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 启动类
 * 
 * @author xiaoyc
 * @since 2018-3-31
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@ServletComponentScan
@EnableTransactionManagement
public class GzxantApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GzxantApiApplication.class, args);
	}
}
