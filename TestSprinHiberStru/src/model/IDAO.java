package model;

public interface IDAO<T>{
public void savePersonne(T personne);
public void deletePersonne(T personne);
public T findById(int id);

}
