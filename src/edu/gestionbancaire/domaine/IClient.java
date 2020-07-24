
package edu.gestionbancaire.domaine;

public interface IClient {

public void identifiercli();

public default void statutemp (String status)
{
	if(status.equals("salarie"))
	{
		System.out.println("Ce client est un salarié");
	}
	else
	{
		System.out.println("Ce client est un self made man");
	}
}

}
