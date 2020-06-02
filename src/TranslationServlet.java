import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslationServlet",urlPatterns = "/translate")
public class TranslationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        Map<String,String> dictionary=new HashMap<>();
        dictionary.put("hello","xin chao");
        dictionary.put("how","thế nào");
        dictionary.put("book","sách");
        dictionary.put("computer","máy tính");
        dictionary.put("goodbye","tạm biệt");
        dictionary.put("ask","hỏi");
        String search=request.getParameter("txtsearch");
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        String result=dictionary.get(search);
        if (result!=null){
            writer.println("word:" +search);
            writer.println("result:" +result);
        }
        else {
            writer.println("not found");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
