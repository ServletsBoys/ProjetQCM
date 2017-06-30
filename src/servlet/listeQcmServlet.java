package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Test;
import model.Type_Utilisateur;
import model.Utilisateur;
import dal.TestDAO;

/**
 * Servlet implementation class listeQcmServlet
 */
public class listeQcmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String ACCES_PUBLIC     = "/index.jsp";
    public static final String ACCES_FORMATEUR  = "/listeQcm.jsp";
    public static final String ACCES_CANDIDAT  = "/index.jsp";
    public static final String ATT_SESSION_USER = "sessionUtilisateur";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listeQcmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Récupération de la session depuis la requête */
        HttpSession session = request.getSession();

        /*
         * Si l'objet utilisateur n'existe pas dans la session en cours, alors
         * l'utilisateur n'est pas connecté.
         */
        
        Utilisateur utilisateur = null;
        Type_Utilisateur type = null;
        if ( session.getAttribute( ATT_SESSION_USER ) != null ) {
        	utilisateur = (Utilisateur) session.getAttribute(ATT_SESSION_USER);
        	type = utilisateur.getType_Utilisateur();
        }
        
        
		if ( session.getAttribute( ATT_SESSION_USER ) == null ) {
            /* Redirection vers la page publique */
            response.sendRedirect( request.getContextPath() + ACCES_PUBLIC );
        } else if ( type.getId() == 1 ){
            /* Affichage de la page restreinte */
            doWork(request, response);
        } else {
            this.getServletContext().getRequestDispatcher( ACCES_CANDIDAT ).forward( request, response );
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doWork(request, response);
	}
	protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Utilisateur user1 = new Utilisateur();
		user1.setId(14);
		
		ArrayList<Test> lesTests = new ArrayList<Test>();
		TestDAO bddtest = new TestDAO();
		try {
			lesTests = bddtest.rechercher();
			//bddtest.ajouter(new Test("logique", 955, user1));
			request.setAttribute("lesTests", lesTests);
//			System.out.println(lesTests);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/listeQcm.jsp").forward(request, response);
	}
}
