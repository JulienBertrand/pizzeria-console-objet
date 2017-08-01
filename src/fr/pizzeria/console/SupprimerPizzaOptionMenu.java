package fr.pizzeria.console;

import java.util.Scanner;

public class SupprimerPizzaOptionMenu extends OptionMenu {

	private Scanner questionUser;
	private IPizzaDao dao;

	public SupprimerPizzaOptionMenu(IPizzaDao dao, Scanner questionUser) { // constructeur
		this.dao = dao;
		this.questionUser = questionUser;
	}

	public void execute() {

		System.out.println("Suppression d'une pizza");
		System.out.println();

		System.out.println("Veuillez choisir le code de la pizza à supprimer");
		String codePizza = questionUser.next();

		dao.deletePizza(codePizza);

	}
}
