
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
       Administration admin = new Administration(username, password);
      
       
       if(admin.checkUsersList()){
       
           PrintWriter out = response.getWriter();
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Signed In! </title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>");
                out.println("Bienvenido Admin");
                out.println("</h1>");
                out.println("</body>");
                out.println("</html>");
                
       
       
       }
       
       else{
                PrintWriter out = response.getWriter();
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Signed In! </title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>");
                out.println("Incorrect password!:C");
                out.println("</h1>");
                out.println("<a href = loginAdmin.html>");
                out.println("Try again");
                out.println("</a>");
                out.println("</body>");
                out.println("</html>");
       
       }
    }

    private static class Administration {

        public Administration() {
        }

        private Administration(String username, String password) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private boolean checkUsersList() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    
    

}
