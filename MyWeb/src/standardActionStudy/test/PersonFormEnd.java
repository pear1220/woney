package standardActionStudy.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonFormEnd extends HttpServlet {

	private static final long serialVersionUID = 3020443018300898019L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException{
		execute(request, response);
	}
	

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException{
		execute(request, response);
	}
	public void execute(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException{
		
		String name = request.getParameter("name");
		String jubun1 = request.getParameter("jubun1");
		String jubun2 = request.getParameter("jubun2");
		
		PersonDTO pdto = new PersonDTO();
		pdto.setName(name);
		pdto.setJubun(jubun1+jubun2);
		
		String gender = pdto.getJgender();// 남자/여자
		int age = pdto.getJage();// 나이
		
		request.setAttribute("name", name);
		request.setAttribute("jubun", jubun1+jubun2);
		request.setAttribute("gender", gender);
		request.setAttribute("age", age);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/standardActionStudy/7personResultView.jsp");
		dispatcher.forward(request, response);
	}
}
