package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesBase {
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		Connection connexion;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String DBurl = "jdbc:sqlserver://10.1.0.186;databasename=QCM" ;
        connexion = DriverManager.getConnection(DBurl, "sa", "Pa$$w0rd") ;
        return connexion;
	}
}
