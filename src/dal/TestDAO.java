package dal;

import java.sql.*;
import java.util.*;

import javax.naming.NamingException;

import model.*;
import util.*;

public class TestDAO {

	public static void ajouter(Test test) throws SQLException, NamingException{
		Connection cnx=null;
		PreparedStatement rqt=null;

		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("insert into test(libelle, timer, type_test_id, formateur_id) values (?,?,?,?)");
			rqt.setString(1, test.getLibelle());
			rqt.setInt(2, test.getTimer());
			rqt.setInt(3, test.getType_test().getId());
			rqt.setInt(4, test.getFormateur().getId());
			rqt.executeUpdate();
		}finally{
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
	}
	
	public static void supprimer(Test test) throws SQLException, NamingException{
		Connection cnx=null;
		PreparedStatement rqt=null;
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("delete from test where id = ?");
			rqt.setInt(1, test.getId());
			rqt.executeUpdate();
		}finally{
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
	}
	
	public static void modifier(Test test) throws SQLException, NamingException{
		Connection cnx=null;
		PreparedStatement rqt=null;
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("update test set libelle = ?, timer = ?, type_test_id = ?, formateur_id = ? where id = ?");
			rqt.setString(1, test.getLibelle());
			rqt.setInt(2, test.getTimer());
			rqt.setInt(3,test.getType_test().getId());
			rqt.setInt(4,test.getFormateur().getId());
			rqt.setInt(5, test.getId());

			rqt.executeUpdate();
		}finally{
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
	}
	
	public static ArrayList<Test> rechercher() throws SQLException, NamingException{
		Connection cnx=null;
		Statement rqt=null;
		ResultSet rs=null;
		ArrayList<Test> listeTests = new ArrayList<Test>();
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.createStatement();
			rs=rqt.executeQuery("select id, libelle, timer, type_test_id, formateur_id from test t, ");
			Test test;
			while (rs.next()){
				test = new Test(
									rs.getInt("id"),
									rs.getString("libelle"),
									rs.getInt("timer"),
									new Formateur ,
									rs.getInt("formateur_id")
						);
				listeTests.add(test);				
			}
		}finally{
			if (rs!=null) rs.close();
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
		
		return listeTests;
	}
}
