package model;

public class Section {
	private int id;
	private String libelle;
	public Section(int id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	public Section() {
		super();
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
	public Section(String libelle) {
		super();
		this.libelle = libelle;
	}
	
	
}
