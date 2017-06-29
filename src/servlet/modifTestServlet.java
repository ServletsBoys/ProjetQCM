package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xpath.internal.operations.Bool;

import model.Test;
import dal.TestDAO;

/**
 * Servlet implementation class modifTestServlet
 */
public class modifTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modifTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doWork(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doWork(request, response);
	}
	
	protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		TestDAO bddtest = new TestDAO();
		Test test;
		try {
			System.out.println(request.getParameter("idTest"));
			test = bddtest.rechercher(Integer.valueOf(request.getParameter("idTest")));
			test.setId(Integer.valueOf(request.getParameter("idTest")));
			request.setAttribute("test", test);
			System.out.println(test.getLibelle());
			System.out.println("on passe dans le if si c'est pas vide : "+request.getParameter("libelle"));
			if(request.getParameter("libelle") == null ){
				request.getRequestDispatcher("/modifTest.jsp").forward(request, response);
			}else{
				Test nouvtest = new Test();
				nouvtest.setLibelle(request.getParameter("libelle"));
				nouvtest.setTimer(Integer.valueOf(request.getParameter("timer")));
				nouvtest.setId(Integer.valueOf(request.getParameter("idTest")));
				bddtest.modifier(nouvtest);
				System.out.println("test bien modifier");
				request.setAttribute("test", nouvtest);
				request.getRequestDispatcher("/modifTest.jsp").forward(request, response);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		

		
		
	}
}
