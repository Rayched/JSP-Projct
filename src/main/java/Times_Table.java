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
        //UTF-8 인코딩 logic
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset-utf-8");

        int dan = Integer.parseInt(req.getParameter("dan"));
        //times?dan=정수 값
        //원하는 정수 값을 입력하면
        //해당 정수의 구구단을 보여준다.
        //dan의 값을 입력해줘야만 원하는 출력 결과를 볼 수 있다.
        //입력하지 않으면 오류 발생함
        int i = 1;


        resp.getWriter().append("<h1>%d단</h1>".formatted(dan));

        for (i = 1; i < 10; i++){
            resp.getWriter().append("<div>%d * %d = %d</div>".formatted(dan, i, dan * i));
        }
    }
}

