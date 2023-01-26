//request, responce 자동 입력을 위한 클래스

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class rq {
    private final HttpServletRequest req;
    private final HttpServletResponse resp;

    public rq(HttpServletRequest req, HttpServletResponse resp){
        this.req = req;
        this.resp = resp;

        //UTF-8 인코딩 logic
        try {
            req.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset-utf-8");

    }

    public int getIntParam(String paramName, int defaultValue) {
        String value = req.getParameter(paramName);

        if (value == null) {
            return defaultValue;
        }

        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

        public void appendBody(String str){
            try {
                resp.getWriter().append(str);
            } catch (IOException e){
                throw new RuntimeException(e);
        }
    }
}
