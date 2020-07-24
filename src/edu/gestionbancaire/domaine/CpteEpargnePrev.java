package edu.gestionbancaire.domaine;

import java.io.Serializable;

public class CpteEpargnePrev extends Compte implements ICompte,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int fraisouverture;

    private Groupement groupement;
	
	private Persphysique persphysique;
	
   

	public CpteEpargnePrev(String idcompte, String nomagence, long solde, int fraisouverture, Groupement groupement, Persphysique persphysique)
	{
		super(idcompte, nomagence, solde);
		this.fraisouverture = fraisouverture;
		this.groupement = groupement;
		this.persphysique = persphysique;
	}

	public int getFraisouverture() {
		return fraisouverture;
	}

	public void setFraisouverture(int fraisouverture) {
		this.fraisouverture = fraisouverture;
	}
	
	@SuppressWarnings("unused")
	private Groupement getGroupement() {
		return groupement;
	}

	@SuppressWarnings("unused")
	private void setGroupement(Groupement groupement) {
		this.groupement = groupement;
	}

	public Persphysique getPersphysique() {
		return persphysique;
	}

	public void setPersphysique(Persphysique persphysique) {
		this.persphysique = persphysique;
	}

	@Override
	public void versercpte(int montant) {
		this.solde=this.solde+montant+200;
		
	}

	@Override
	public void retirercpte(int montant) {
		this.solde=this.solde-montant;
		
	}

	

    
	

	}


