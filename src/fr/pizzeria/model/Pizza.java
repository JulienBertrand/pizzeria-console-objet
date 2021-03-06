package fr.pizzeria.model;

public class Pizza {
	private static int nextId = 0;
	private int id;
	private String code;
	private String nom;
	private double prix;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pizza(String code, String nom, double prix) {
		this.id = nextId;
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		nextId++;
	}

	public String toString() {
		return this.code + " > " + this.nom + " > " + this.prix;

	}

}
