package util.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class EncodeFilter
 */

/*
	필터란 Servlet 2.3 버전에 추가된것으로 
	클라이언트의 요청을 서블릿이 받기전에 가로채어 필터에 작성된 내용을 수행하는 것을 말한다.
	따라서 필터를 사용하면 클라이언트의 요청을 가로채서 서버 컴포넌트의 추가적인 다른 기능을 수행을 시킬수 있다.
	
	<< 필터 적용 순서 >>
	1. Filter 인터페이스를 구현하는 자바 클래스를 생성
	2. /WEB-INF/web.xml에 filter 엘리먼트를 사용하여 필터 클래스를 등록하는데
	하지만 /web.xml을 사용하지 않고 @WebFilter 어노테이션을 많이 사용한다.
*/

@WebFilter("/*")
public class EncodeFilter implements Filter {

    /**
     * Default constructor. 
     */
    public EncodeFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		//필터 인스턴스를 종료시키기전에 호출하는 메소드
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 필터의 로직을 작성하는 메소드
		// ==> doPost()에서 한글이 안깨지려면
		// request.getParameter("name");을 하기 전에 
		// request.setCharacterEncoding("UTF-8");을 먼저 해줘야한다.
		request.setCharacterEncoding("UTF-8");
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	
	public void init(FilterConfig fConfig) throws ServletException {
		// 서블릿 컨테이너가 필터 인스턴스를 초기화하기 위해서 호출하는 메소드
		// 여기는 기술할 필요가 없다.
	}

}
