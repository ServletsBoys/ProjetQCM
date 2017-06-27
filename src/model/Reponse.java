package model;

public class Reponse {
	private int id;
	private String libelle;
	private String reponse;
	private String reponseCandidat;
	private Question_qcm question_qcm;
	public Reponse(int id, String libelle, String reponse,
			String reponseCandidat, Question_qcm question_qcm) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.reponse = reponse;
		this.reponseCandidat = reponseCandidat;
		this.question_qcm = question_qcm;
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
	public String getReponseCandidat() {
		return reponseCandidat;
	}
	public void setReponseCandidat(String reponseCandidat) {
		this.reponseCandidat = reponseCandidat;
	}
	public Question_qcm getQuestion_qcm() {
		return question_qcm;
	}
	public void setQuestion_qcm(Question_qcm question_qcm) {
		this.question_qcm = question_qcm;
	}
	public Reponse(String libelle, String reponse, String reponseCandidat,
			Question_qcm question_qcm) {
		super();
		this.libelle = libelle;
		this.reponse = reponse;
		this.reponseCandidat = reponseCandidat;
		this.question_qcm = question_qcm;
	}
	
	
}
