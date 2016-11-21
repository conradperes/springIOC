package br.com.jm.spring.ioc.scope;

import static br.com.jm.spring.ioc.utils.PrintUtils.print;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeSample {
	static ApplicationContext context = new ClassPathXmlApplicationContext("br/com/jm/spring/ioc/scope/scope.xml");
	public static void main(String[] args) throws IOException {
		print("------SINGLETON-------");
//		SimpleBean simpleBean = (SimpleBean)context.getBean("simpleBean");
//		print(simpleBean.getSimpleProperty());
		dumpBeanInfo("simpleBean");
		
		print("------PROTOTYPE-------");
		dumpBeanInfo("verySimplePrototypeBean");
		
	}
	
	public static void dumpBeanInfo(String beanName){
		for(int i=0;i<5;i++){
			print(context.getBean(beanName));
		}
	}
	
	
}
