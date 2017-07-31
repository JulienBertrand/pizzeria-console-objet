package fr.pizzeria.console;

import fr.pizzeria.model.Pizza;
import java.util.Scanner;

public class ModifierPizzaOptionMenu extends OptionMenu{

	private Pizza[] pizzas; // création d'un constructeur pour le tableau Pizza[] pizza
	private Scanner questionUser;

	public ModifierPizzaOptionMenu (Pizza[] pizzas, Scanner questionUser) { // constructeur
		this.pizzas = pizzas;
		this.questionUser = questionUser;
	}

	public void execute() {
		System.out.println("Modifier un pizza en saississant son code");
		System.out.println();

		String codePizza = questionUser.next();
		int indexPizza = -1;
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas [i] != null && pizzas[i].getCode().equals(codePizza)) {
				indexPizza = i;

			}
		}

		if (indexPizza != -1) {
			System.out.println("Veuillez saisir le code:");
			String code = questionUser.next();

			System.out.println("Veuillez saisir le nom (sans espace):");
			String nom = questionUser.next();

			System.out.println("Veuillez saisir le prix:");
			String prixStr = questionUser.next();

			double prix = Double.parseDouble(prixStr);

			pizzas[indexPizza] = new Pizza(code, nom, prix);
		} else {
			System.out.println("Code inexistant :" + codePizza);

		}
	}

}
