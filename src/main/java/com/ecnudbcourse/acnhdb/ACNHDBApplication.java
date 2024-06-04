package com.ecnudbcourse.acnhdb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ecnudbcourse.acnhdb.mapper")
// 扫描 mapper数据层的接口们
public class ACNHDBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ACNHDBApplication.class, args);
	}
}
