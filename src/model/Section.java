package model;

public class Section {
	private int id;
	private String libelle;
	private Formateur formateur;
	public Section(int id, String libelle, Formateur formateur) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.formateur = formateur;
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
	public Formateur getFormateur() {
		return formateur;
	}
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}
	public Section(String libelle, Formateur formateur) {
		super();
		this.libelle = libelle;
		this.formateur = formateur;
	}
	
	
}
