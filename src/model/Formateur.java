package model;

public class Formateur {
	private int id;
	private String nom;
	private String prenom;
	private String mail;
	private String login;
	private String password;
	
	public Formateur(int id, String nom, String prenom, String mail,
			String login, String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.login = login;
		this.password = password;
	}
	
	public Formateur( String nom, String prenom, String mail,
			String login, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.login = login;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Formateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ ", mail=" + mail + ", login=" + login + ", password="
				+ password + "]";
	}
	
	
	
}
