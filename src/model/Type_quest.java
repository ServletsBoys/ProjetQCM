package model;

public class Type_quest {
	private int id;
	private String libelle;
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
	public Type_quest(int id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	public Type_quest(String libelle) {
		super();
		this.libelle = libelle;
	}
	public Type_quest() {
		super();
	}
	
	
}
