package com.prosayj.analysis.springsource;

/**
 * LogUtils
 *
 * @author yangjian
 * @date 2021-05-18
 */
public class LogUtils {

	public void beforeMethod() {
		System.out.println("前置通知");
	}

	public void print() {
		System.out.println("print方法业务逻辑执行");
	}
}
