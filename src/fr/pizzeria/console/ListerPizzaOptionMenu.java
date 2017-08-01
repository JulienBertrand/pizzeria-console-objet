package fr.pizzeria.console;

import java.util.ArrayList;

import fr.pizzeria.model.Pizza;

public class ListerPizzaOptionMenu extends OptionMenu {

	// private Pizza[] pizzas; //création d'un constructeur pour le tableau Pizza[]
	// pizza
	private IPizzaDao dao;

	public ListerPizzaOptionMenu(IPizzaDao dao) { // constructeur
		this.dao = dao;
	}

	public void execute() {

		System.out.println("Liste des pizzas");

		ArrayList<Pizza> pizzas = dao.findAllPizzas();

		for (Pizza nouvellePizza : pizzas) {
			System.out.println(nouvellePizza + " \u20AC");
		}

		System.out.println("**************************************");
	}
}
