package edu.gestionbancaire.domaine;

public abstract class Compte {
	protected String idcompte;
	private String nomagence;
	protected long solde;
	
	
	
	
	public Compte(String idcompte, String nomagence, long solde) {
		super();
		this.idcompte = idcompte;
		this.nomagence = nomagence;
		this.solde = solde;
	
	}
	public String getIdcompte() {
		return idcompte;
	}
	public void setIdcompte(String idcompte) {
		this.idcompte = idcompte;
	}
	public String getNomagence() {
		return nomagence;
	}
	public void setNomagence(String nomagence) {
		this.nomagence = nomagence;
	}
    
	
	public long getSolde() {
		return solde;
	}
	public void setSolde(long solde) {
		this.solde = solde;
	}

	

}
