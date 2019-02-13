/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：AsyncTaskProperties.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */
package com.paascloud.config.properties;

import lombok.Data;

/**
 * The class Async task properties.
 *
 * @author paascloud.net @gmail.com
 */
@Data
public class AsyncTaskProperties {

	/**
	 * 线程池维护线程的最少数量
	 */
	private int corePoolSize = 50;
	/**
	 * 最大线程数
	 */
	private int maxPoolSize = 100;
	/**
	 * 线程池所使用的缓冲队列
	 */
	private int queueCapacity = 10000;

	/**
	 * 线程池维护线程所允许的空间时间
	 */
	private int keepAliveSeconds = 3000;

	/**
	 * 等待任务在关机时完成 -- 表明等待所有线程执行完成
	 */
	private Boolean waitForTasksToCompleteOnShutDown = true;
	/**
	 * 等待时间(默认为0,此时立即停止,并没等待xx秒后强制停止)
	 */
	private int aWaitTerminationSeconds = 60 * 15;

	/**
	 * 线程名称前缀
	 */
	private String threadNamePrefix = "MallAsync-task-executor-";
}
