package main;

import model.Adresse;
import model.Personne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.IBusinessObject;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("service/beans.xml");
		IBusinessObject personBusiness=(IBusinessObject)context.getBean("personBusiness");
		IBusinessObject adresseBusiness=(IBusinessObject)context.getBean("adresseBusiness");
		Adresse a = new Adresse();
		a.setNum(196);
		a.setRue("Boulevard Anatole France");
		a.setCodepostale("93200");
		a.setVille("Saint-Denis");
		a.setPays("France");
		adresseBusiness.create(a);
		
		Adresse a1 = new Adresse();
		a1.setNum(137);
		a1.setRue("Haj Fateh 5");
		a1.setCodepostale("20260");
		a1.setVille("Casablanca");
		a1.setPays("Maroc");
		adresseBusiness.create(a1);
		
		Personne person = new Personne();
		person.setAge(23);
		person.setNom("AMRANI");
		person.setAdresse(a);
		personBusiness.create(person);
	}

}
