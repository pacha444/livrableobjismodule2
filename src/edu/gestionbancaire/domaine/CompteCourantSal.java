package edu.gestionbancaire.domaine;

import java.io.Serializable;

public class CompteCourantSal extends Compte implements ICompte,Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int sal;
	private int agios;
	private Persphysique persphysique;
	
	
	
	
	
	
	
	public CompteCourantSal(String idcompte, String nomagence, long solde, int sal, int agios,
			Persphysique persphysique) {
		super(idcompte, nomagence, solde);
		this.sal = sal;
		this.agios = agios;
		this.persphysique = persphysique;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getAgios() {
		return agios;
	}
	public void setAgios(int agios) {
		this.agios = agios;
	}
	
	@Override
	public void versercpte(int montant) {
		this.sal=this.sal+montant;
		
	}
	@Override
	public void retirercpte(int montant) {
		this.sal=this.sal-montant;
		
	}
	
	@SuppressWarnings("unused")
	private Persphysique getPersphysique() {
		return persphysique;
	}
	@SuppressWarnings("unused")
	private void setPersphysique(Persphysique persphysique) {
		this.persphysique = persphysique;
	}
	
	
	@Override
	public void affichersolde(long mt) {
		// TODO Auto-generated method stub
		System.out.println("Le solde de ce compte a été obtenu après avoir soustrait le salaire et les agios:"+" "+mt);
	}
	
	
	
	
}
