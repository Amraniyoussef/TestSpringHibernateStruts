package service;

import model.Adresse;
import model.IDAO;
import model.Personne;

public class AdresseBusinessObject implements IBusinessObject<Adresse> {
	IDAO adresseDao;
	
	public void setAdresseDao(IDAO adresseDao) {
		this.adresseDao = adresseDao;
	}

	@Override
	public void create(Adresse adr) {
		adresseDao.savePersonne(adr);
		
	}

	@Override
	public void delete(Adresse adr) {
		adresseDao.deletePersonne(adr);
		
	}

	@Override
	public void update(Adresse adr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Adresse searchPersonById(int id) {
		// TODO Auto-generated method stub
		return (Adresse)adresseDao.findById(id);
	}

}
