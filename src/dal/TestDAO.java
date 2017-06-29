package dal;

import java.sql.*;
import java.util.*;

import javax.naming.NamingException;

import model.*;
import util.*;

public class TestDAO {

	public static void ajouter(Test test) throws SQLException, NamingException, ClassNotFoundException{
		Connection cnx=null;
		PreparedStatement rqt=null;

		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("insert into test(libelle, timer, utilisateur_id) values (?,?,?)");
			rqt.setString(1, test.getLibelle());
			rqt.setInt(2, test.getTimer());
			rqt.setInt(3, test.getUtilisateur().getId());
			rqt.executeUpdate();
		}finally{
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
	}
	
	public static void supprimer(Test test) throws SQLException, NamingException, ClassNotFoundException{
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
	
	public static void modifier(Test test) throws SQLException, NamingException, ClassNotFoundException{
		Connection cnx=null;
		PreparedStatement rqt=null;
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("update test set libelle = ?, timer = ? where id = ?");
			rqt.setString(1, test.getLibelle());
			rqt.setInt(2, test.getTimer());
			rqt.setInt(3, test.getId());

			rqt.executeUpdate();
		}finally{
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
	}
	
	public static ArrayList<Test> rechercher() throws SQLException, NamingException, ClassNotFoundException{
		Connection cnx=null;
		Statement rqt=null;
		ResultSet rs=null;
		ArrayList<Test> listeTests = new ArrayList<Test>();
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.createStatement();
			rs=rqt.executeQuery("select t.id as tid, t.libelle, t.timer, t.utilisateur_id,"
					+ "u.id as uid, u.nom, u.prenom, u.mail, u.login, u.password, Count(test_id) as nb "
					+ "FROM test t "
					+ "INNER JOIN utilisateur u ON t.utilisateur_id = u.id "
					+ "LEFT JOIN SEC_TEST st ON st.test_id = t.id "
					+ "GROUP BY t.id, t.libelle, t.timer, t.utilisateur_id,u.id, u.nom, u.prenom, u.mail, u.login, u.password");
			Test test;
			while (rs.next()){
				test = new Test(
									rs.getInt("tid"),
									rs.getString("libelle"),
									rs.getInt("timer"),
									new Utilisateur(rs.getInt("uid"), 
											rs.getString("nom"), 
											rs.getString("prenom"),
											rs.getString("mail"),
											rs.getString("login"),
											rs.getString("password"))
						);
				test.setNbQuestion(rs.getInt("nb"));
				listeTests.add(test);				
			}
		}finally{
			if (rs!=null) rs.close();
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
		
		return listeTests;
	}
	
	public static Test rechercher(int id) throws SQLException, NamingException, ClassNotFoundException{
		Connection cnx=null;
		PreparedStatement rqt=null;
		ResultSet rs=null;
		Test test = null;
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("select t.id as tid, t.libelle, t.timer, t.utilisateur_id, u.id as uid, u.nom, u.prenom, u.mail, u.login, u.password "
					+ "FROM test t "
					+ "INNER JOIN utilisateur u "
					+ "ON t.utilisateur_id = u.id "
					+ "WHERE t.id = ?");
			rqt.setInt(1, id);
			rs=rqt.executeQuery();
			while (rs.next()){
				if (test==null) test = new Test();
				test.setLibelle(rs.getString("libelle"));				
				test.setTimer(rs.getInt("timer"));
				test.setUtilisateur(new Utilisateur(rs.getInt("uid"), 
						rs.getString("nom"), 
						rs.getString("prenom"),
						rs.getString("mail"),
						rs.getString("login"),
						rs.getString("password")));
			}
		}finally{
			if (rs!=null) rs.close();
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
		
		return test;
	}
	
	public static Question rechercherQuestions(int id) throws SQLException, NamingException, ClassNotFoundException{
		Connection cnx=null;
		PreparedStatement rqt=null;
		ResultSet rs=null;
		Question question = null;
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("select q.libelle as lib, image, tq.libelle as tqlib, sec.libelle as seclib "
					+ "FROM question q "
					+ "INNER JOIN sec_test st ON st.question_id = q.id "
					+ "LEFT JOIN TYPE_QUEST tq ON tq.id = q.type_quest_id "
					+ "LEFT JOIN SECTION sec ON sec.id = q.section_id "
					+ "WHERE st.test_id = ?");
			rqt.setInt(1, id);
			rs=rqt.executeQuery();
			while (rs.next()){
				if (question==null) question = new Question();
				question.setLibelle(rs.getString("lib"));				
				question.setImage(rs.getString("image"));
				question.setType_question(new Type_quest(rs.getString("tqlib")));
				question.setSection(new Section(rs.getString("seclib")));
			}
		}finally{
			if (rs!=null) rs.close();
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
		
		return question; 
	}
}
