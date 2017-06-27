package util;

import java.util.ResourceBundle;

public class Parametre {

	public static String lire(String cle){
		ResourceBundle bundle = ResourceBundle.getBundle("param");
		
		return (null!=bundle) ? bundle.getString(cle) : null;
	}

}
