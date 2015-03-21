package form;

import model.Adresse;

import org.apache.struts.action.ActionForm;

public class PersonneForm extends ActionForm{
	private int id;
	private String nom;
	private int age;
	private Adresse adresse;
	private int num;
	private String rue;
	private String codepostale;
	private String ville;
	private String pays;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCodepostale() {
		return codepostale;
	}
	public void setCodepostale(String codepostale) {
		this.codepostale = codepostale;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
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
	public Adresse  getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	
}
