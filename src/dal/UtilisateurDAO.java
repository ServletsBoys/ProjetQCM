package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.NamingException;

import model.Utilisateur;
import util.AccesBase;

public class UtilisateurDAO {

	public static Utilisateur rechercher(String mail, String password) throws SQLException, NamingException, ClassNotFoundException{
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		Utilisateur utilisateur=null;
		try{
			cnx = AccesBase.getConnection();
			rqt = cnx.prepareStatement("select id, nom, prenom, mail from utilisateur where mail=? and password=?");
			rqt.setString(1, mail);
			rqt.setString(2, password);
			rs=rqt.executeQuery();
			// SI on trouve au moins 1 r�sultat, on prend le 1er pour mettre � jour les informations de l'animateur utilis� pour la recherche.
			if (rs.next()){
				utilisateur = new Utilisateur();
				utilisateur.setId(rs.getInt("id"));
				utilisateur.setNom(rs.getString("nom"));
				utilisateur.setPrenom(rs.getString("prenom"));
				utilisateur.setMail(rs.getString("mail"));
			}
			// ...sinon on renvoie null
			else {
				utilisateur = null;
			}
			
		}finally{
			if (rs!=null) rs.close();
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
		return utilisateur;
	}
	
	
	public static ArrayList<Utilisateur> rechercher() throws SQLException, NamingException, ClassNotFoundException{
		Connection cnx=null;
		Statement rqt=null;
		ResultSet rs=null;
		ArrayList<Utilisateur> listeUtilisateurs = new ArrayList<Utilisateur>();
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.createStatement();
			rs=rqt.executeQuery("select id, nom, prenom, mail, login, password, type_utilisateur_id FROM utilisateur");
			Utilisateur utilisateur;
			while (rs.next()){
				utilisateur = new Utilisateur(
									rs.getInt("id"),
									rs.getString("nom"),
									rs.getString("prenom"),
									rs.getString("mail"),
									rs.getString("login"),
									rs.getString("password")
						);
				listeUtilisateurs.add(utilisateur);				
			}
		}finally{
			if (rs!=null) rs.close();
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
		
		return listeUtilisateurs;
	}
}
