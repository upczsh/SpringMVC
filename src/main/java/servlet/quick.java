package servlet;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/quick")
public class quick extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        System.out.println("aaaa");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
                doPost(request,response);
    }
}
