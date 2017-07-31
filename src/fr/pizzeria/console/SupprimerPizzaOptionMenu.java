package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class SupprimerPizzaOptionMenu extends OptionMenu{

	private Pizza[] pizzas; // création d'un constructeur pour le tableau Pizza[] pizza
	private Scanner questionUser;

	public SupprimerPizzaOptionMenu(Pizza[] pizzas, Scanner questionUser) { // constructeur
		this.pizzas = pizzas;
		this.questionUser = questionUser;
	}

	public void execute() {

		System.out.println("Suppression d'une pizza");
		System.out.println();

		System.out.println("Veuillez choisir le code de la pizza à supprimer");
		String codePizza = questionUser.next();
		int indexPizza = -1;
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i] != null && pizzas[i].getCode().equals(codePizza)) {
				indexPizza = i;

			}
		}
		System.out.println("Pizza supprimée");
		System.out.println("\n");
		
		if (indexPizza != -1) {
			pizzas[indexPizza] = null;
		} else {
			System.out.println("Code inexistant :" + codePizza);
		}
	}
}
