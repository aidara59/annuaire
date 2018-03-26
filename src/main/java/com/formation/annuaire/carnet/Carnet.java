package com.formation.annuaire.carnet;

public class Carnet {
	

private int id;
private Civilite civilite;
private String nom;
private String prenom;
private String dateDeNaissance;
private String tel;
private String email;
private String cp;
private String ville;

public Carnet()	{
	
}

public Carnet(int id, Civilite civilite, String nom, String prenom, String dateDeNaissance, String tel, String email,
		String cp, String ville) {
	super();
	this.id = id;
	this.civilite = civilite;
	this.nom = nom;
	this.prenom = prenom;
	this.dateDeNaissance = dateDeNaissance;
	this.tel = tel;
	this.email = email;
	this.cp = cp;
	this.ville = ville;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Civilite getCivilite() {
	return civilite;
}

public void setCivilite(Civilite civilite) {
	this.civilite = civilite;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getDateDeNaissance() {
	return dateDeNaissance;
}

public void setDateDeNaissance(String dateDeNaissance) {
	this.dateDeNaissance = dateDeNaissance;
}

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCp() {
	return cp;
}

public void setCp(String cp) {
	this.cp = cp;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

}
