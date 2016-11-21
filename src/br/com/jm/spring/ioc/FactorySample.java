package br.com.jm.spring.ioc;

import static br.com.jm.spring.ioc.utils.PrintUtils.print;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.jm.spring.ioc.beans.Person;

public class FactorySample {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("br/com/jm/spring/ioc/factory.xml");
		Person person = (Person)context.getBean("personByFactory");
		print(person);
		
		person = (Person) context.getBean("personByFactoryInstance");
		print(person);
		
		
	}
}
