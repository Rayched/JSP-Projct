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
        rq RQ = new rq(req, resp);

        int dan = RQ.getIntParam("dan",0);
        int limit = RQ.getIntParam("limit", 0);
        //times?dan=(정수 값), limit=(정수 값)
        //원하는 정수 값을 입력하면
        //해당 정수의 구구단을 보여준다.
        //여기서 limit에 값을 넣어주면
        //해당 값까지의 구구단을 보여준다.
        //예시
        //dan = 5, limit = 4를 입력하면
        //구구단 5단을 1에서 4까지만 보여준다.
        //dan의 값을 입력해줘야만 원하는 출력 결과를 볼 수 있다.
        //입력하지 않으면 오류 발생함
        int i = 1;
        String rs = "<h1>%d단</h1>".formatted(dan);
        resp.getWriter().append(rs);

        for (i = 1; i <= limit; i++){
            resp.getWriter().append("<div>%d * %d = %d</div>".formatted(dan, i, dan * i));
        }
    }
}
//Servlet => html 생성기
//request와 responce를 일일히 수동으로 하는 것은 번거롭다.
//자주 사용하는 기능을


