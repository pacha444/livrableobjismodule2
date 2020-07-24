package edu.gestionbancaire.thread; 



import edu.gestionbancaire.domaine.*;


public class CreateAccountRunnable implements Runnable {

	 public	 CpteEpargnePrev cpteep1;
	@Override
	public void run() {
		// TODO Auto-generated method stub
     
       Groupement	group= new Groupement(1,"+221781277881", "pamoussacisse@gmail.com", "Chaka Group", "238761", "12JZER", "papa moussa cisse", "1870198802456") ;
   	Persphysique pers=new Persphysique(2, "772953450", "diopsy@gmail.com", "4567", "Diop", "Sy", "1870198702386", 2, "marie");
	
		try {
				
			  cpteep1=new CpteEpargnePrev("A1", "Dakar Bourguiba", 40000, 6000, group, pers);
					group=null;
					System.out.println(cpteep1.getIdcompte());
					 CpteEpargnePrev cpteep2=new CpteEpargnePrev("A2", "Dakar Bourguiba", 40000, 6000, group, pers);
						System.out.println(cpteep2.getIdcompte());
					 CompteCourantSal cptesal=new CompteCourantSal("A3", "Thies", 40000, 180000, 1500, pers);
						System.out.println(cptesal.getIdcompte());
			
				
		
			
				Thread.sleep(2000);
		
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
