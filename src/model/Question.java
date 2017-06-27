package model;

public class Question {
	private int id;
	private String libelle;
	private String image;
	private Type_quest type_question;
	private Section section;
	public Question(int id, String libelle, String image,
			Type_quest type_question, Section section) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.image = image;
		this.type_question = type_question;
		this.section = section;
	}
	
	
	public Question(String libelle, String image, Type_quest type_question,
			Section section) {
		super();
		this.libelle = libelle;
		this.image = image;
		this.type_question = type_question;
		this.section = section;
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
	public Type_quest getType_question() {
		return type_question;
	}
	public void setType_question(Type_quest type_question) {
		this.type_question = type_question;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	
	
	
	
}
