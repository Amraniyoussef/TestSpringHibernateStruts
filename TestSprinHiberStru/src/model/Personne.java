package model;

public class Personne {
private int id;
private String nom;
private int age;
private Adresse adresse;

public Adresse getAdresse() {
	return adresse;
}
public void setAdresse(Adresse adresse) {
	this.adresse = adresse;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
