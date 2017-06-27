package model;

public class Test {
	private int id;
	private String libelle;
	private int timer;
	private Formateur formateur;
	private Type_test type_test;
	public Test(int id, String libelle, int timer, Formateur formateur,
			Type_test type_test) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.timer = timer;
		this.formateur = formateur;
		this.type_test = type_test;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getTimer() {
		return timer;
	}
	public void setTimer(int timer) {
		this.timer = timer;
	}
	public Formateur getFormateur() {
		return formateur;
	}
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}
	public Type_test getType_test() {
		return type_test;
	}
	public void setType_test(Type_test type_test) {
		this.type_test = type_test;
	}
	public Test(String libelle, int timer, Formateur formateur,
			Type_test type_test) {
		super();
		this.libelle = libelle;
		this.timer = timer;
		this.formateur = formateur;
		this.type_test = type_test;
	}
	
	
	
	
}
