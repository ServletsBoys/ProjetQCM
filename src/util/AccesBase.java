package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesBase {
	public static Connection getConnection() throws SQLException{
		
		String uri = Parametre.lire("dbUrl");
		String user = Parametre.lire("dbUser");
		String password = Parametre.lire("dbPassword");
		Connection connexion = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//DriverManager.registerDriver(new SQLServerDriver());
			connexion =  DriverManager.getConnection(uri, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connexion;		
	}
}
