package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractRefreshableConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author zoujiayang
 * @date 2022年05月11日
 */

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
	@Override
	protected void initPropertySources() {
		System.out.println("初始化自定义属性。。。。。。");
		getEnvironment().getSystemProperties().put("xxoo","ssss");
	}

	public MyClassPathXmlApplicationContext(String... configLocations) {
		super();
		setDisplayName("Root WebApplicationContext");
	}


}
