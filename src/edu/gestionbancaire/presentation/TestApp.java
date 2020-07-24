package edu.gestionbancaire.presentation;
import edu.gestionbancaire.exceptions.*;
import edu.gestionbancaire.service.ServiceBancaire;



public class TestApp {

	
	

	public static void main(String[] args) throws CinException, FraisOuvException, AgioException, SitMatException  {
		// TODO Auto-generated method stub
		
	
	ServiceBancaire servbank=new ServiceBancaire();
	servbank.execthread();
	servbank.operationbancaire();
	

}
}