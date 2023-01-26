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
        resp.getWriter().append("Hello World");
    }
}
//Hello Servlet 추가
//local host 주소로 들어간 다음
//상단 주소 칸에 "/Hello"를 입력하면
//상단의 문장이 웹에 출력되는 것을 확인할 수 있다.
