package fr.pizzeria.console;

import java.util.Scanner;

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
			}
			if (choix == 2) {

				System.out.println("Mise à jour d’une pizza");
				System.out.println();
			}
			if (choix == 3) {

				System.out.println("Ajout d'une nouvelle pizza");
				System.out.println();
			}
			if (choix == 4) {

				System.out.println("Suppression d’une pizza");
				System.out.println();
			}
			if (choix == 99) {

				System.out.println("Au revoir");
			}

		} while (choix != 99);
		
		 questionUser.close();
	}
}
