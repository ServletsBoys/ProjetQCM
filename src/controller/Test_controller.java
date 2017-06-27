package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Formateur;
import model.Test;
import model.Type_test;
import util.AccesBase;

public class Test_controller {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String prenom = "toto";
		String nom = "jean";
		String mail = "jean.toto@gmail.com";
		String login = "logtoto";
		String password = "azerty7894";
		Formateur michel = new Formateur(nom, prenom, mail, login, password);
		System.out.println(michel.toString());
		Type_test typetest1 = new Type_test("rapidité");
		Test testLogique = new Test("logique", 60, michel, typetest1);
		Test testLogique2 = new Test("logique2", 6000, michel, typetest1);
		Test testLogique3 = new Test("logique3", 605, michel, typetest1);
		Test testLogique4 = new Test("logique4", 600, michel, typetest1);
	
		ArrayList<Test> listTest = new ArrayList<Test>();
		listTest.add(testLogique);
		listTest.add(testLogique2);
		listTest.add(testLogique3);
		listTest.add(testLogique4);
		
		System.out.println(listTest.size());
		
		for(Test test : listTest){
			System.out.println(test.getLibelle());
		}
		
		System.out.println(testLogique.getType_test().toString());
		
		
		 //exemple récupération de données
		Connection connexion = null;
		
		try {
			connexion = AccesBase.getConnection() ;
		} catch (ClassNotFoundException | SQLException e) {
			throw new Exception("probleme de Driver") ;
		}
		
		String sql = "select * from type_test" ;
		
		PreparedStatement stmt ;
		try {
			stmt = connexion.prepareStatement(sql) ;
			ResultSet rs = stmt.executeQuery();
		
			while(rs.next())
			{
				System.out.println(rs.getString("libelle")) ;
			}
			connexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("probleme de select");
		}
		
	}

}
