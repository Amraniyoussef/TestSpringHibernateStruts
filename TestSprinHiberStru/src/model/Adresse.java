package model;

public class Adresse {
private int id ;
@Override
public String toString() {
	return "Adresse [id=" + id + ", num=" + num + ", rue=" + rue
			+ ", codepostale=" + codepostale + ", ville=" + ville + ", pays="
			+ pays + "]";
}
private int num;
private String rue;
private String codepostale;
private String ville;
private String pays;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
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

}
