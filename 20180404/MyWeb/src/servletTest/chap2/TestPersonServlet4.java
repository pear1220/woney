package servletTest.chap2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestPersonServlet4 extends HttpServlet {

	private static final long serialVersionUID = 8568774659621592335L;

	
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
		
		String methodName= request.getMethod();
		
		String name = request.getParameter("name");
		String color = request.getParameter("color");
		String[] foodArr = request.getParameterValues("food"); // 체크박스는 여러개의 값을 받을 수 있기때문에 배열로 받아야한다.
		String animal = request.getParameter("animal");
		
		response.setContentType("text/html; charset=UTF-8"); // get 방식은 밑에 한글이 나오는것을 지원해주겠다는 말이다.//한글을 인식해준다.
		PrintWriter out = response.getWriter(); // 웹에 내용을 찍어준다.
		out.println("<html>");
		out.println("<head><title>개인 취향 테스트 결과 화면</title></head>");
		out.println("<body>");
		out.println("<h2>개인 취향 테스트 결과("+methodName+")</h2>");
		out.printf("<span style='color:blue; font-weight:bold;'>%s</span>님의 개인 취향은<br/><br/>",name);
		out.printf("%s색을 좋아하고, %s 동물을 좋아합니다.<br/><br/>",color,animal);
		if(foodArr !=null) {
			out.print("좋아하는 음식은 ");
			 for(int i=0; i<foodArr.length; i++) {
				 if(i==0) {
					 out.printf("%s", foodArr[i]);
				 }else {
					 out.printf(", %s", foodArr[i]);
				 }
				 
			 }// end of for()--------------------------
			 
			 out.println(" 입니다.");
		}else {
			out.println("좋아하는 음식이 없습니다.");
		}
		out.println("</body>");
		out.println("</html>");
			
	}
			
	
}
