package fr.pizzeria.console;

import fr.pizzeria.model.Pizza;

public class ListerPizzaOptionMenu extends OptionMenu{

	private Pizza[] pizzas; //création d'un constructeur pour le tableau Pizza[] pizza

	public ListerPizzaOptionMenu(Pizza[] pizzas) { // constructeur
		this.pizzas = pizzas;
	}

	public void execute() {

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
}
