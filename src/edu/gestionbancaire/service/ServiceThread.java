package edu.gestionbancaire.service;

import java.util.Scanner;

import edu.gestionbancaire.thread.CreateAccountRunnable;

public class ServiceThread {
	private static Scanner saisiegenerale;

	@SuppressWarnings("deprecation")
	public void executecreateaccount()
	{
		 saisiegenerale = new Scanner(System.in);
		CreateAccountRunnable customThread=new 	CreateAccountRunnable();
		new Thread (customThread).start();
		
		
		int index=1;
		 try {
		for(int i=0;i<index;i++)
		{
			 System.out.println("Création de compte");
			
				Thread.sleep(2000);
		}
		new Thread (customThread).stop();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} 
		 System.out.println("Renseigner");
		Integer som = saisiegenerale.nextInt();
		customThread.cpteep1.versercpte(som);
		System.out.println(customThread.cpteep1.getSolde());
		}
		
	
	
}
