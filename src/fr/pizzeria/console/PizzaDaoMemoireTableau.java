package fr.pizzeria.console;

import fr.pizzeria.model.Pizza;

public class PizzaDaoMemoireTableau implements IPizzaDao {

	Pizza[] pizzas;

	public PizzaDaoMemoireTableau() {

		pizzas = new Pizza[100];
		pizzas[0] = new Pizza("PEP", "Pépéroni", 12.50);
		pizzas[1] = new Pizza("MAR", "Margherita", 14.00);
		pizzas[2] = new Pizza("REI", "La Reine", 11.50);
		pizzas[3] = new Pizza("FRO", "La 4 fromages", 12.00);
		pizzas[4] = new Pizza("CAN", "La cannibale", 12.50);
		pizzas[5] = new Pizza("SAV", "La savoyarde", 13.00);
		pizzas[6] = new Pizza("ORI", "L'orientale", 13.50);
	}

	@Override
	public Pizza[] findAllPizzas() {
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i] != null) {
				System.out.println(
						pizzas[i].getCode() + ">" + pizzas[i].getNom() + ">" + pizzas[i].getPrix() + " \u20AC");
			}
		return pizzas;
	}

	@Override
	public boolean saveNewPizza(Pizza pizza) {
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i] == null) {
				pizzas[i] = pizza; // = new Pizza(code, nom, prix);
				break;
			}
		}
		return false;
	}

	@Override
	public boolean updatePizza(String codePizza, Pizza pizza) {
		int indexPizza = -1;
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i] != null && pizzas[i].getCode().equals(codePizza)) {
				pizzas[i] = pizza;
			}
		}

		pizzas[indexPizza] = pizza;
		return false;
	}

	@Override
	public boolean deletePizza(String codePizza) {
		int indexPizza = -1;
		
		for (int i = 0; i < pizzas.length - 1; i++) {
			if (pizzas[i].getCode().equals(codePizza)) {
				indexPizza = i;
			break;
			}
		}
		
		if (indexPizza != -1) {
			pizzas[indexPizza] = null;
		}

		else {
			System.out.println("Code inexistant :" + codePizza);
		}

		return false;
	}
}
