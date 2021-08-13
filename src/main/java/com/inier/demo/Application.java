/*
 * Copyright 2021 inier.cn All right reserved. This software is the
 * confidential and proprietary information of inier.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with inier.cn
 */
package com.inier.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 * @date 2021/8/13 15:34
 */
@SpringBootApplication
public class Application {
	public static Logger logger = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		logger.info("SpringApplication starting ...");
		SpringApplication.run(Application.class,args);
	}
}
