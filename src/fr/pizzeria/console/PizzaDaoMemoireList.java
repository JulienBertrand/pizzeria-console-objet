package fr.pizzeria.console;

import java.util.ArrayList;

import fr.pizzeria.model.Pizza;

public class PizzaDaoMemoireList implements IPizzaDao {

	ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

	public PizzaDaoMemoireList() {

		pizzas.add(new Pizza("PEP", "Pépéroni", 12.50));
		pizzas.add(new Pizza("MAR", "Margherita", 14.00));
		pizzas.add(new Pizza("REI", "La Reine", 11.50));
		pizzas.add(new Pizza("FRO", "La 4 fromages", 12.00));
		pizzas.add(new Pizza("CAN", "La cannibale", 12.50));
		pizzas.add(new Pizza("SAV", "La savoyarde", 13.00));
		pizzas.add(new Pizza("ORI", "L'orientale", 13.50));

	}

	@Override
	public ArrayList<Pizza> findAllPizzas() {
		return pizzas;
	}

	@Override
	public boolean saveNewPizza(Pizza pizza) {
		pizzas.add(pizza);
		return false;
	}

	@Override
	public boolean updatePizza(String codePizza, Pizza pizza) {
		int indexPizza = -1;
		for (int i = 0; i < pizzas.size(); i++) {
			if (pizzas != null && findAllPizzas().get(i).getCode().equals(codePizza)) {
				indexPizza=i;
				pizzas.set(indexPizza, pizza);
			}
		}
		return false;
	}

	@Override
	public boolean deletePizza(String codePizza) {
		int indexPizza = -1;

		for (int i = 0; i < pizzas.size(); i++) {
			if (findAllPizzas().get(i).getCode().equals(codePizza)) {
				indexPizza = i;
				break;
			}
		}
		if (indexPizza != -1) {
			pizzas.remove(indexPizza);
		} else {
			System.out.println("Code inexistant :" + codePizza);
		}
		return false;
	}
}
