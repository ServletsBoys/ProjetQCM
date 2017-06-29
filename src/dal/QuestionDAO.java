package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

import model.Question;
import util.AccesBase;

public class QuestionDAO {

	public static void ajouter(Question question) throws SQLException, NamingException, ClassNotFoundException{
		Connection cnx=null;
		PreparedStatement rqt=null;

		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("insert into question(libelle, image, type_quest_id, section_id) values (?,?,?,?)");
			rqt.setString(1, question.getLibelle());
			rqt.setString(2, question.getImage());
			rqt.setInt(3, question.getType_question().getId());
			rqt.setInt(4, question.getSection().getId());
			rqt.executeUpdate();
		}finally{
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
	}
	
	public static void supprimer(Question question) throws SQLException, NamingException, ClassNotFoundException{
		Connection cnx=null;
		PreparedStatement rqt=null;
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("delete from question where id = ?");
			rqt.setInt(1, question.getId());
			rqt.executeUpdate();
		}finally{
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
	}
	
	public static void modifier(Question question) throws SQLException, NamingException, ClassNotFoundException{
		Connection cnx=null;
		PreparedStatement rqt=null;
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("update test set libelle = ?, image = ?, type_quest_id = ?, section_id = ? where id = ?");
			rqt.setString(1, question.getLibelle());
			rqt.setString(2, question.getImage());
			rqt.setInt(3, question.getType_question().getId());
			rqt.setInt(4, question.getSection().getId());
			rqt.setInt(5, question.getId());

			rqt.executeUpdate();
		}finally{
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
	}
}
