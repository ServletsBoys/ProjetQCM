package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Question;
import model.Test;
import dal.QuestionDAO;
import dal.TestDAO;

/**
 * Servlet implementation class deleteQuestionServlet
 */
public class deleteQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteQuestionServlet() {
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
		QuestionDAO bddQuestion = new QuestionDAO();
		System.out.println("supprimer");
		Integer idQuestion = Integer.parseInt(request.getParameter("idQuestion"));
		System.out.println(idQuestion);
		Question question = new Question();
		question.setId(idQuestion);
		try {
			bddQuestion.supprimer(question);
			System.out.println("suppression reussi ! :) ");
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
		request.getRequestDispatcher("listeQuestionServlet").forward(request, response);
	}

}
