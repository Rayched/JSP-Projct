import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/times")

public class Times_Table extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        rq Rq = new rq(req, resp);

        int dan = Rq.getIntParam("dan",0);
        int limit = Rq.getIntParam("limit",0);

        Rq.appendBody("<div class=\"a\"></div>\n".formatted(dan));
        for(int i = 1; i <= limit; i++){
            resp.getWriter().append("<div>%d * %d = %d</div>".formatted(dan, i, dan * i));
        }
    }
}
//Servlet => html 생성기
//request와 responce를 일일히 수동으로 하는 것은 번거롭다.
//자주 사용하는 기능을


