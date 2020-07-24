                                       **************************************************** 
                                                 Présentation du livrable du module 2    
                                       ****************************************************
GestionBancaire est une application ayant les fonctionnalités suivantes:

* Lancer un thread permettant la création de trois comptes bancaires.
* Créditer l'un des comptes créé par le thread
* Possibilités de créer un compte pour un groupement ou une personne physique
* Les quatres exceptions suivantes sont gérées par l'application:

     °FraisOuvException: Elle est levée si les frais d'ouverture sont inférieurs à 5000 F CFA.
     
     °CinException: Elle est levée si la longueur du n° de la carte d'identité nationale est inférieure à 13.
     
     °SitMatException: Elle est levée si la situation matrimoniale n'est pas compris dans la liste
      suivante (marie, celibataire, divorce).
      
     °AgioException: Elle est levée si l'agio est supérieur à 2000 F CFA
	
                                       **************************************************** 
                                                Documentation
                                       ****************************************************
Veuillez suivre les indications suivantes:

1) Rendez vous dans le dossier 'doc/'.

2) Double cliquez sur 'index.html'.

                                     ****************************************************
                                               Execution de l'application:    		
	                                  ****************************************************
Veuillez suivre les indications suivantes:
	
1) 	A l'aide de votre interpretteur de commande (cmd.exe),
	placer vous dans le dossier où vous avez téléchargé
	le fichier compressé "GestionBancaire.jar"
	('cd [chemin]/[dossier cible]').

2)	Entrer la commande 'java -jar GestionBancaire.jar'.
