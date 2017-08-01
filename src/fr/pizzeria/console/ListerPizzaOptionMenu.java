package fr.pizzeria.console;

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
		System.out.println();
		Pizza[] pizzas = dao.findAllPizzas();
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i] != null) {
				System.out.println(
						pizzas[i].getCode() + ">" + pizzas[i].getNom() + ">" + pizzas[i].getPrix() + " \u20AC");
			}
		}
		System.out.println();
		System.out.println("**************************************");
	}
}
