/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import JDBC.JDBCConection;

/**
 *
 * @author Diego
 */
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String user = request.getParameter("user");
            String password = request.getParameter("password");
            JDBCConection db = new JDBCConection();
            if (user.equals(db.conectUser(user))){
                if (password.equals(db.conectPassword(password))){
                    response.sendRedirect("/Practica-8/Usuario.html");
                }else
                    response.sendRedirect("/Practica-8/Error.html");
            }else {
                db.addUser(user, password);
                response.sendRedirect("/Practica-8/Registro.html");
            }            
        }
    }

}
