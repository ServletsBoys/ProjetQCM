package model;

public class Question_qcm {
	private int id;
	private String libelle;
	private String image;
	private int marque;
	private Theme theme;
	private Type_quest type_question;
	public Question_qcm(int id, String libelle, String image, int marque,
			Theme theme, Type_quest type_question) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.image = image;
		this.marque = marque;
		this.theme = theme;
		this.type_question = type_question;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getMarque() {
		return marque;
	}
	public void setMarque(int marque) {
		this.marque = marque;
	}
	public Theme getTheme() {
		return theme;
	}
	public void setTheme(Theme theme) {
		this.theme = theme;
	}
	public Type_quest getType_question() {
		return type_question;
	}
	public void setType_question(Type_quest type_question) {
		this.type_question = type_question;
	}
	
	
}
