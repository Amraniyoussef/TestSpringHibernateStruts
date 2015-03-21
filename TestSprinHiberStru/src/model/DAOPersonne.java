package model;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class DAOPersonne extends HibernateDaoSupport implements IDAO<Personne> {

	@Override
	public void savePersonne(Personne personne) {
		getHibernateTemplate().save(personne);
		
	}

	@Override
	public void deletePersonne(Personne personne) {
		getHibernateTemplate().delete(personne);
		
	}

	@Override
	public Personne findById(int id) {
		
		return (Personne)getHibernateTemplate().get(Personne.class, id);
	}

}
