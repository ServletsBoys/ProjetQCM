package model;

public class Test {
	private int id;
	private String libelle;
	private int timer;
	private Utilisateur utilisateur;
	private int nbQuestion;
	
	public Test(int id, String libelle, int timer, Utilisateur utilisateur) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.timer = timer;
		this.utilisateur = utilisateur;
	}
	
	public Test(){
		super();
	}
	
	public int getNbQuestion() {
		return nbQuestion;
	}

	public void setNbQuestion(int nbQuestion) {
		this.nbQuestion = nbQuestion;
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
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Test(String libelle, int timer, Utilisateur utilisateur) {
		super();
		this.libelle = libelle;
		this.timer = timer;
		this.utilisateur = utilisateur;
	}
	
	
	
	
}
