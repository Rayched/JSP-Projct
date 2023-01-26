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

        resp.getWriter().append("안녕하세요. 반갑습니다. 그것이 나다.");
    }
}
//Hello Servlet 추가
//local host 주소로 들어간 다음
//상단 주소 칸에 "/Hello"를 입력하면
//상단의 문장이 웹에 출력되는 것을 확인할 수 있다.

//이전 코드에서는 문장에 한글을 입력해도 글자가 깨져서 나왔다.
//이를 해결하기 위해서 들어오는 데이터를 UTF-8로 인코딩을 할 수 있는 코드를 추가함

//문장 수정을 하면 프로그램을 재실행하지 않아도 바로 반영될 수 있도록 설정함
//IntelliJ 자체 세팅 및 tomcat 세팅 수정을 했기 때문에
//코드 자체의 변화는 없다.
//단, 반영되는 속도는 느린 편이다.

