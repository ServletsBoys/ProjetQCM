package model;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.jasper.tagplugins.jstl.core.Catch;

import util.AccesBase;

public class TestBDD{
	
	public static void testco() throws SQLException{
		ResultSet resultats = null;
		String requete = "SELECT * FROM QCM";

		try{
			Statement stmt = AccesBase.getConnection().createStatement();
			resultats = stmt.executeQuery(requete);
		} catch (SQLException e){
			
		}		
	}

}
