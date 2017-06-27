package model;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.AccesBase;

public class TestBDD {
	ResultSet resultats = null;
	String requete = "SELECT * FROM QCM";
	
	try{
		Statement stmt = AccesBase.getConnection().createStatement();
		resultats = stmt.executeQuery(requete);
	} catch (SQLException e){
		
	}
			

}
