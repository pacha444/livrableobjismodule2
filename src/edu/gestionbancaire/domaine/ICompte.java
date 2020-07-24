package edu.gestionbancaire.domaine;

public interface ICompte {

	public void versercpte (int montant);
	public void retirercpte (int montant);
	
	public default void affichersolde (long mt)
	{
		
			System.out.println("Ce compte a un solde égale à"+" "+mt);
		
	}
	
}
