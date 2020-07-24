package edu.gestionbancaire.domaine;

public class Groupement extends Client implements IClient {
	
	private String raisonsociale;
	private String numrecepisse;
	private String matgroupe;
	private String mandataire;
	private String cinmandataire;
	
	
   
	public Groupement(int idclient, String tel, String email, String raisonsociale, String numrecepisse,
			String matgroupe, String mandataire, String cinmandataire) {
		super(idclient, tel, email);
		this.raisonsociale = raisonsociale;
		this.numrecepisse = numrecepisse;
		this.matgroupe = matgroupe;
		this.mandataire = mandataire;
		this.cinmandataire = cinmandataire;
	}
	public String getRaisonsociale() {
		return raisonsociale;
	}
	public void setRaisonsociale(String raisonsociale) {
		this.raisonsociale = raisonsociale;
	}
	public String getNumrecepisse() {
		return numrecepisse;
	}
	public void setNumrecepisse(String numrecepisse) {
		this.numrecepisse = numrecepisse;
	}
	public String getMatgroupe() {
		return matgroupe;
	}
	public void setMatgroupe(String matgroupe) {
		this.matgroupe = matgroupe;
	}
	public String getMandataire() {
		return mandataire;
	}
	public void setMandataire(String mandataire) {
		this.mandataire = mandataire;
	}
	public String getCinmandataire() {
		return cinmandataire;
	}
	public void setCinmandataire(String cinmandataire) {
		this.cinmandataire = cinmandataire;
	}
	@Override
	public void identifiercli() {
		// TODO Auto-generated method stub
		System.out.println("L'adhérent identifié sous le numéro"+" "+getIdclient()+" "+"est le groupement"+" "+getRaisonsociale());
	}
	
	
	
   
}
