package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

import model.Reponse;
import util.AccesBase;

public class ReponseDAO {

	public static void ajouter(Reponse reponse) throws SQLException, NamingException, ClassNotFoundException{
		Connection cnx=null;
		PreparedStatement rqt=null;

		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("insert into reponse(libelle, reponse, reponseCandidat, question_qcm_id) values (?,?,?,?)");
			rqt.setString(1, reponse.getLibelle());
			rqt.setString(2, reponse.getReponse());
			rqt.setString(3, reponse.getReponseCandidat());
			rqt.setInt(4, reponse.getQuestion_qcm().getId());
			rqt.executeUpdate();
		}finally{
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
	}
	
	public static void supprimer(Reponse reponse) throws SQLException, NamingException, ClassNotFoundException{
		Connection cnx=null;
		PreparedStatement rqt=null;
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("delete from reponse where id = ?");
			rqt.setInt(1, reponse.getId());
			rqt.executeUpdate();
		}finally{
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
	}
}
