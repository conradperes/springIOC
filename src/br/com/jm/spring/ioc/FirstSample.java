package br.com.jm.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.jm.spring.ioc.beans.SimpleBean;
import static br.com.jm.spring.ioc.utils.PrintUtils.print;

public class FirstSample {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("br/com/jm/spring/ioc/beans.xml");
		SimpleBean simpleBean = (SimpleBean)context.getBean("simpleBean");
		print(simpleBean.getSimpleProperty());
	}
}
