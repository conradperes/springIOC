package br.com.jm.spring.ioc.lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.jm.spring.ioc.beans.SimpleBean;
import static br.com.jm.spring.ioc.utils.PrintUtils.print;

import java.io.IOException;

public class LazyInitSample {
	public static void main(String[] args) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("br/com/jm/spring/ioc/lazy/lazyInit.xml");
		System.in.read();
		SimpleBean simpleBean = (SimpleBean)context.getBean("simpleBean");
		print(simpleBean.getSimpleProperty());
	}
}
