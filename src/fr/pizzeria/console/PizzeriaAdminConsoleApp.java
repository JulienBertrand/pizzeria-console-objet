package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

/**
 * 
 * 
 * @author julienBertrand
 *
 */

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner questionUser = new Scanner(System.in);
		int choix = 0;

		Pizza[] pizzas = new Pizza[100];
		pizzas[0] = new Pizza("PEP", "Pépéroni", 12.50);
		pizzas[1] = new Pizza("MAR", "Margherita", 14.00);
		pizzas[2] = new Pizza("REI", "La Reine", 11.50);
		pizzas[3] = new Pizza("FRO", "La 4 fromages", 12.00);
		pizzas[4] = new Pizza("CAN", "La cannibale", 12.50);
		pizzas[5] = new Pizza("SAV", "La savoyarde", 13.00);
		pizzas[6] = new Pizza("ORI", "L'orientale", 13.50);

		do {
			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");
			System.out.println("Veuillez faire un choix s'il vous plait");

			choix = questionUser.nextInt();

			if (choix == 1) {

				System.out.println("Liste des pizzas");
				System.out.println();

				for (int i = 0; i < pizzas.length; i++) {
					if (pizzas[i] != null) {
						System.out.println(
								pizzas[i].getCode() + ">" + pizzas[i].getNom() + ">" + pizzas[i].getPrix() + " \u20AC");
					}
				}

				System.out.println();
				System.out.println("**************************************");
			}
			if (choix == 2) {

				System.out.println("Ajouter une nouvelle pizza");
				System.out.println();

				String nouveauNom = null;
				String nouveauCode = null;
				double nouveauPrix = 0;

				System.out.println("Veuillez saisir le code"); // je demande à l'utlilsateur le code de la nouvelle pizza

					
					nouveauCode = questionUser.toString();
				

				System.out.println("Veuillez saisir le nom"); // je demande à l'utlilsateur le nom de la nouvelle pizza
				
				
					nouveauNom = questionUser.toString();
				
				

				System.out.println("Veuillez saisir le prix"); // je demande à l'utlilsateur le prix de la nouvelle pizza
				nouveauPrix = questionUser.nextInt();

				Pizza nouvellePizza = new Pizza(nouveauCode, nouveauNom, nouveauPrix); // je créé la nouvelle pizza

				
				
				

				// ajouter nouvelle pizza

				

				// je recherche un emplacement libre dans le tableau pour y insérer la nouvelle
				// pizza

			}
			if (choix == 3) {

				System.out.println("Modifier un pizza");
				System.out.println();
			}
			if (choix == 4) {

				System.out.println("Suppression d'une pizza");
				System.out.println();
			}
			if (choix == 99) {

				System.out.println("Au revoir");
			}

		} while (choix != 99);

		questionUser.close();

	}
}
