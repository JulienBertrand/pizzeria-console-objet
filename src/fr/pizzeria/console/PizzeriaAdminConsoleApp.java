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

//		Pizza[] pizzas = new Pizza[100];
//		pizzas[0] = new Pizza("PEP", "Pépéroni", 12.50);
//		pizzas[1] = new Pizza("MAR", "Margherita", 14.00);
//		pizzas[2] = new Pizza("REI", "La Reine", 11.50);
//		pizzas[3] = new Pizza("FRO", "La 4 fromages", 12.00);
//		pizzas[4] = new Pizza("CAN", "La cannibale", 12.50);
//		pizzas[5] = new Pizza("SAV", "La savoyarde", 13.00);
//		pizzas[6] = new Pizza("ORI", "L'orientale", 13.50);
		
		PizzaDaoMemoire dao = new PizzaDaoMemoire();

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
				ListerPizzaOptionMenu afficherMenu = new ListerPizzaOptionMenu(dao);
				afficherMenu.execute();
			}
			if (choix == 2) {
				NouvellePizzaOptionMenu nouvellePizza = new NouvellePizzaOptionMenu(dao, questionUser);
				nouvellePizza.execute();
			}
			if (choix == 3) {
				ModifierPizzaOptionMenu modifierPizza = new ModifierPizzaOptionMenu(dao, questionUser);
				modifierPizza.execute();
			}
			if (choix == 4) {
				SupprimerPizzaOptionMenu supprimerPizza = new SupprimerPizzaOptionMenu(dao, questionUser);
				supprimerPizza.execute();
			}
			if (choix == 99) {
				System.out.println("Au revoir");
			}
		} while (choix != 99);

		questionUser.close();

	}
}
