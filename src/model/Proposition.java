package model;

public class Proposition {
	private int id;
	private String libelle;
	private String reponse;
	private Question question;
	public Proposition(int id, String libelle, String reponse, Question question) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.reponse = reponse;
		this.question = question;
	}
	public Proposition( String libelle, String reponse, Question question) {
		super();
		this.libelle = libelle;
		this.reponse = reponse;
		this.question = question;
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
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
	
}
