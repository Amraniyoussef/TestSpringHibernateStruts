package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Adresse;
import model.Personne;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;


import service.IBusinessObject;

import form.AdresseForm;
import form.PersonneForm;

public class PersonneAction extends ActionSupport{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
	//	IBusinessObject personBusiness = (IBusinessObject) ServiceFinder.getContext(request).getBean("personBusiness");
		
	//	IBusinessObject adresseBusiness = (IBusinessObject) ServiceFinder.getContext(request).getBean("adresseBusiness");
		
		PersonneForm pr = (PersonneForm)form;
		
		System.out.println("Nom : " + pr.getNom());
		System.out.println("Age : " + pr.getAge());
		System.out.println("CodeP : " + pr.getCodepostale());

		System.out.println("Ville : " + pr.getVille());
		
		//ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		//IBusinessObject personBusiness=(IBusinessObject)context.getBean("personBusiness");
		//IBusinessObject adresseBusiness=(IBusinessObject)context.getBean("adresseBusiness");
		
		IBusinessObject personBusiness=(IBusinessObject)getWebApplicationContext().getBean("personBusiness");
		IBusinessObject adresseBusiness=(IBusinessObject)getWebApplicationContext().getBean("adresseBusiness");
		
		Adresse a = new Adresse();
		a.setNum(pr.getNum());
		a.setRue(pr.getRue());
		a.setCodepostale(pr.getCodepostale());
		a.setVille(pr.getVille());
		a.setPays(pr.getPays());
		adresseBusiness.create(a);
		
		
		Personne person = new Personne();
		person.setAge(pr.getAge());
		person.setNom(pr.getNom());
		person.setAdresse(a);
		personBusiness.create(person);
	
		
	
			return mapping.findForward("suite");
	
		
	}
}
