package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author zoujiayang
 * @date 2022年05月06日
 */
public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test-1-profile.xml");
		Person obj = (Person) context.getBean("person");
		System.out.println(obj.getName());
		Environment environment = context.getEnvironment();
		String xxoo = environment.getRequiredProperty("xxoo");
		System.out.println(xxoo);
	}
}
