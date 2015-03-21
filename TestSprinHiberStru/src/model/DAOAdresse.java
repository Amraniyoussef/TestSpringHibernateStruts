package model;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class DAOAdresse extends HibernateDaoSupport implements IDAO<Adresse> {

	@Override
	public void savePersonne(Adresse personne) {
		getHibernateTemplate().save(personne);
		
	}

	@Override
	public void deletePersonne(Adresse personne) {
		getHibernateTemplate().delete(personne);
		
	}

	@Override
	public Adresse findById(int id) {
		// TODO Auto-generated method stub
		return (Adresse)getHibernateTemplate().get(Adresse.class, id);
	}
	
}
