package model;

public class Theme {
	private int id;
	private String libelle;
	private Qcm qcm;
	
	public Theme(int id, String libelle, Qcm qcm) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.qcm = qcm;
	}
	
	public Theme() {
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
	public Qcm getQcm() {
		return qcm;
	}
	public void setQcm(Qcm qcm) {
		this.qcm = qcm;
	}
	public Theme(String libelle, Qcm qcm) {
		super();
		this.libelle = libelle;
		this.qcm = qcm;
	}
	
	
}
