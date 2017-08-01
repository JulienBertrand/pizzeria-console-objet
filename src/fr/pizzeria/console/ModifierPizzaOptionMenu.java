package fr.pizzeria.console;

import fr.pizzeria.model.Pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class ModifierPizzaOptionMenu extends OptionMenu {

	private Scanner questionUser;
	private IPizzaDao dao;

	public ModifierPizzaOptionMenu(IPizzaDao dao, Scanner questionUser) { // constructeur
		this.dao = dao;
		this.questionUser = questionUser;
	}

	public void execute() {
		System.out.println("Modifier un pizza en saississant son code");
		System.out.println();

		String codePizza = questionUser.next();

		int indexPizza = -1;
		ArrayList<Pizza> pizzas = dao.findAllPizzas();

		for (int i = 0; i < dao.findAllPizzas().size(); i++) {
			if (pizzas != null && dao.findAllPizzas().get(i).getCode().equals(codePizza)) {
				indexPizza = i;
				break;
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

			Pizza nouvellePizza = new Pizza(code, nom, prix);

			dao.updatePizza(codePizza, nouvellePizza);
		}

		else {
			System.out.println("Code inexistant :" + codePizza);
		}

	}

}