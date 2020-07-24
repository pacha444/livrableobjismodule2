package edu.gestionbancaire.domaine;

public class Persphysique extends Client  implements IClient{
	
	// 1. Section Propriétés
	
	private String matmembre;
	private String nom;
	private String prenom;
	private String numcin;
    private int nbreenfants;
    private String sitmatrimoniale;
    
    
	

	// 2. Constructeurs
	
	
     
	public Persphysique(int idclient, String tel, String email, String matmembre, String nom, String prenom,
			String numcin, int nbreenfants, String sitmatrimoniale) {
		super(idclient, tel, email);
		this.matmembre = matmembre;
		this.nom = nom;
		this.prenom = prenom;
		this.numcin = numcin;
		this.nbreenfants = nbreenfants;
		this.sitmatrimoniale = sitmatrimoniale;
	}





	



	// 3. Section Getter/Setter


	public String getMatmembre() {
		return matmembre;
	}




	public void setMatmembre(String matmembre) {
		this.matmembre = matmembre;
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




	


	public String getNumcin() {
		return numcin;
	}




	public void setNumcin(String numcin) {
		this.numcin = numcin;
	}




	public int getNbreenfants() {
		return nbreenfants;
	}




	public void setNbreenfants(int nbreenfants) {
		this.nbreenfants = nbreenfants;
	}




	public String getSitmatrimoniale() {
		return sitmatrimoniale;
	}




	public void setSitmatrimoniale(String sitmatrimoniale) {
		this.sitmatrimoniale = sitmatrimoniale;
	}

	// 4. Section Methodes metiers

	@Override
	public void identifiercli() {
		// TODO Auto-generated method stub
				System.out.println("L'adhérent identifié sous le numéro"+" "+getIdclient()+" "+"s'appelle"+" "+getPrenom()+" "+getNom());
	}
	
	// BONNE PRATIQUE : REDEFINITION DE LA METHODE toString() issue de la classe java.lang.Object (la mère de toutes les classes) --> toString() permet d'avoir l'état de l'Objet lorsqu'on essaie d'afficher la référence d'un objet
	@Override
	public String toString() {
		return "Persphysique [matmembre=" + matmembre + ", nom=" + nom + ", prenom=" + prenom + ", numcin=" + numcin + ", nbreenfants=" + nbreenfants
				+ ", sitmatrimoniale=" + sitmatrimoniale + "]";
	}









	
    
	
	
	

}
