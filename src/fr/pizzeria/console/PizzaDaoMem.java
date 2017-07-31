package fr.pizzeria.console;

import fr.pizzeria.model.Pizza;

public class PizzaDaoMem implements IPizzaDao{
	
	Pizza[] pizzas;
	
	public PizzaDaoMem() {
		
	Pizza[] pizzas = new Pizza[100];
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveNewPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePizza(String codePizza, Pizza pizza) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePizza(String codePizza) {
		// TODO Auto-generated method stub
		return false;
	}
}


