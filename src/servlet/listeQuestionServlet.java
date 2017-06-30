package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.TestDAO;
import model.Question;

/**
 * Servlet implementation class listeQuestionServlet
 */
public class listeQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listeQuestionServlet() {
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
	protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Question> lesQuestions = new ArrayList<Question>();
		TestDAO bddtest = new TestDAO();
		
		try {
			lesQuestions = bddtest.rechercherQuestions(Integer.valueOf(request.getParameter("idTest")));
			request.setAttribute("lesQuestions", lesQuestions);
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
		//request.setAttribute("idTest", Integer.valueOf(request.getParameter("idTest")));
		request.getRequestDispatcher("/listeQuestion.jsp").forward(request, response);
	}
}
