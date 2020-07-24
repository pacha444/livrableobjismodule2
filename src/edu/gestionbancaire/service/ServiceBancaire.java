package edu.gestionbancaire.service;

import java.util.Scanner;

import edu.gestionbancaire.domaine.CompteCourantSal;
import edu.gestionbancaire.domaine.CpteEpargnePrev;
import edu.gestionbancaire.domaine.Groupement;
import edu.gestionbancaire.domaine.Persphysique;
import edu.gestionbancaire.exceptions.AgioException;
import edu.gestionbancaire.exceptions.CinException;
import edu.gestionbancaire.exceptions.FraisOuvException;
import edu.gestionbancaire.exceptions.SitMatException;

public class ServiceBancaire {

	public ServiceBancaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	String choixmembre;
	Persphysique pers = null;
	Groupement groupement = null;
	CpteEpargnePrev cpte = null;
	CompteCourantSal cpts = null;
	String cin = "";
	int fraisouv;
	int agios;
	Scanner saisiegenerale = new Scanner(System.in);
	
	public void execthread()
	{
		ServiceThread proc=new ServiceThread();
		proc.executecreateaccount();
	}

	public void operationbancaire() throws CinException, FraisOuvException, AgioException, SitMatException {
		
		System.out.println("Choisissez le type de membre (A pour groupement, B pour personne physique:");
		
		choixmembre = saisiegenerale.nextLine();
		
		if (choixmembre.equals("A")) {

			System.out.println("Veuillez saisir le cin du manndataire :");
			cin = saisiegenerale.next();
			System.out.println("Veuillez saisir les frais d'ouverture de compte :");
			fraisouv = saisiegenerale.nextInt();

			if (cin.length() < 13) {
				throw new CinException("La longueur doit etre egale à 13");
			} 
			if (fraisouv < 5000) {

				throw new FraisOuvException("Les frais d'ouverture doivent etre supérieur ou égal à 5000 F CFA");
			}
			
			else {
				groupement = new Groupement(1, "+221781277881", "pamoussacisse@gmail.com", "Kundal Group", "238761",
						"12JZER", "papa moussa cisse", cin);
					cpte = new CpteEpargnePrev("2", "Dakar Bourguiba", 40000, fraisouv, groupement, pers);
					cpte.versercpte(200000);

				}
			cpte.affichersolde(cpte.getSolde());
			groupement.identifiercli();

		}

		if (choixmembre.equals("B")) {
			int nbreef;
			String sitmat;
			System.out.println("Veuillez saisir le cin du client :");
			cin = saisiegenerale.nextLine();
			if (cin.length() < 13 ) {
				throw new CinException("La longueur doit etre egale à 13");
			} 
			System.out.println("Veuillez saisir la situation matrimoniale du client :");
			sitmat = saisiegenerale.nextLine();

			switch (sitmat)

			{

			case "celibataire":
				break;
			case "marie":
				break;
			case "divorce":
				break;
			// Les autres cas restants
			default:
				throw new SitMatException("Cette situation n'est pas prise en compte");
			}
			System.out.println("Veuillez saisir le nombre d'enfants du client:");
			 nbreef = saisiegenerale.nextInt();
			 System.out.println("Veuillez saisir l'agios appliqué au salaire:");
				agios = saisiegenerale.nextInt();
				if (agios <= 0 || agios > 2000) {

					throw new AgioException("Les agios ne doivent pas dépasser 2000 F CFA");
				} else {
					pers = new Persphysique(2, "772953450", "diopsy@gmail.com", "4567", "Diop", "Sy", cin, nbreef, sitmat);
					cpts = new CompteCourantSal("3", "Dakar Plateau", 200000, 180000, 2000, pers);
				}						
			cpts.affichersolde(cpts.getSolde());
			pers.identifiercli();

		}
	}
}
