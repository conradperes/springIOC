package br.com.jm.spring.ioc;

import static br.com.jm.spring.ioc.utils.PrintUtils.print;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.jm.spring.ioc.beans.Person;

public class PNamespace {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("br/com/jm/spring/ioc/pNamespace.xml");
		Person person = (Person)context.getBean("person");
		print(person);
		
//		Address address = (Address)context.getBean("address");
//		print(address);
		
		
	}
}
