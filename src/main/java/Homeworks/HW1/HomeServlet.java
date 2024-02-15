package Homeworks.HW1;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeServlet extends HttpServlet {

    @java.lang.Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, IOException {
        String lastname = req.getParameter("lastname");
        String name = req.getParameter("name");
        String patronymic = req.getParameter("patronymic");
        String tel = req.getParameter("tel");
        String email = req.getParameter("email");
        String old = req.getParameter("old");
        Person person = new Person(lastname, name, patronymic, tel, email, old);

        PrintWriter writer = resp.getWriter();

        writer.println("<table>");
        writer.println("<tr><td>Lastname: " + person.getLastname() + "</td></tr>");
        writer.println("<tr><td>Name: " + person.getName() + "</td></tr>");
        writer.println("<tr><td>Patronymic: " + person.getPatronymic() + "</td></tr>");
        writer.println("<tr><td>Num Tel: " + person.getTel() + "</td></tr>");
        writer.println("<tr><td>Email: " + person.getEmail() + "</td></tr>");
        writer.println("<tr><td>Old year: " + person.getOld() + "</td></tr>");
        writer.println("</table>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<h1>Home</hq>");
    }
}
