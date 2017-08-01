package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class NouvellePizzaOptionMenu extends OptionMenu{

	 // création d'un constructeur pour le tableau Pizza[] pizza
	private Scanner questionUser;
	private IPizzaDao dao;

	public NouvellePizzaOptionMenu(IPizzaDao dao, Scanner questionUser) { // constructeur
		this.dao = dao;
		this.questionUser = questionUser;
	}
	
	public void execute() {

		System.out.println("Ajouter une nouvelle pizza");
		System.out.println();

		System.out.println("Veuillez saisir le code"); // je demande à l'utlilsateur le code de la nouvelle pizza
		String code = questionUser.next();

		System.out.println("Veuillez saisir le nom"); // je demande à l'utlilsateur le nom de la nouvelle pizza
		String nom = questionUser.next();

		System.out.println("Veuillez saisir le prix"); // je demande à l'utlilsateur le prix de la nouvelle pizza
		String prixStr = questionUser.next();

		double prix = Double.parseDouble(prixStr); // conversion du prix en double
		
		Pizza nouvellePizza = new Pizza (code, nom, prix);
		
		dao.saveNewPizza(nouvellePizza);
	}
}
