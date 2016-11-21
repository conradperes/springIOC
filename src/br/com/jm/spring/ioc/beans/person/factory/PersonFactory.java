package br.com.jm.spring.ioc.beans.person.factory;

import br.com.jm.spring.ioc.beans.Person;

public class PersonFactory {

	public Person newPerson(){
		return new Person();
	}
}
