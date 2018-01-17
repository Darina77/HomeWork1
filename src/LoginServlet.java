
import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {



    protected void processRequest(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        try {
            String login = request.getParameter("login");

            String password = request.getParameter("pass");

            out.println("<html>");

            out.println("<head>");

            out.println("<title>Перший сервлет</title>");

            out.println("</head>");

            out.println("<body>");

            if (login.equals("login")&&password.equals("pass"))
            {
                out.println("Hello!");
            } else {
                out.print("Error");
            }

            out.println("</body>");

            out.println("</html>");


        } finally {

            out.close();

        }

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        processRequest(request, response);

    }



    protected void doPost(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        processRequest(request, response);

    }

}
