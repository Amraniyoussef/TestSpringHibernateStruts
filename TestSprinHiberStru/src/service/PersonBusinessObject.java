package service;

import model.IDAO;
import model.Personne;

public class PersonBusinessObject implements IBusinessObject<Personne>{
IDAO personDao;
	@Override
	
	public void create(Personne person) {
		personDao.savePersonne(person);
		
	}

	public void setPersonDao(IDAO personDao) {
		this.personDao = personDao;
	}

	@Override
	public void delete(Personne person) {
		personDao.deletePersonne(person);
		
	}

	@Override
	public void update(Personne person) {
		//hdhd
		
	}

	@Override
	public Personne searchPersonById(int id) {
		// TODO Auto-generated method stub
		return (Personne)personDao.findById(id);
	}

}
