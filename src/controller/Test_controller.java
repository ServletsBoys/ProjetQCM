package controller;

import model.Candidat;

public class Test_controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prenom = "toto";
		String nom = "jean";
		String mail = "jean.toto@gmail.com";
		String login = "logtoto";
		String password = "azerty7894";
		Candidat michel = new Candidat(nom, prenom, mail, login, password);
		System.out.println(michel.toString());
		
	}

}
