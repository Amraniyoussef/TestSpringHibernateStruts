package service;

import model.Personne;

public interface IBusinessObject<T> {
void create(T person);
void delete(T person);
void update(T person);
T searchPersonById(int id);
}
