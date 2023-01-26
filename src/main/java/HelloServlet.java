import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/Hello")

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); //들어오는 데이터를 UTF-8로 해석하겠다.
        resp.setCharacterEncoding("UTF-8"); //완성되는 HTML의 인코딩을 UTF-8로 설정하겠다.
        resp.setContentType("text/html; charset-utf-8");
        //웹 브라우저에게 우리가 만드는 결과물이 UTF-8이라고 알려주는 역할을 한다.

        resp.getWriter().append("안녕하세요.");
    }
}
//Hello Servlet 추가
//local host 주소로 들어간 다음
//상단 주소 칸에 "/Hello"를 입력하면
//상단의 문장이 웹에 출력되는 것을 확인할 수 있다.
