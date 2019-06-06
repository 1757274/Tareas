
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.UserDatabase;


public class UserRegister extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String usertype = request.getParameter("suscribertype");
        String adminequals = "admin";
        String normalequals = "normal";
        
        
        Factory user = Factory.getInstance();
               
        if("admin".equals(usertype)){
        String userAdmin = request.getParameter("username");
        String userId = request.getParameter("userid");
        User admin = user.creatUser(usertype);
        admin = new Administration(username, password, email, usertype, userAdmin, userId) {
            @Override
            public String getFullName() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setFullName(String string) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Iterator<Group> getGroups() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String getPassword() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setPassword(String string) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Iterator<Role> getRoles() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public UserDatabase getUserDatabase() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String getUsername() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setUsername(String string) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void addGroup(Group group) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void addRole(Role role) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isInGroup(Group group) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isInRole(Role role) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void removeGroup(Group group) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void removeGroups() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void removeRole(Role role) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void removeRoles() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String getName() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        admin.addUsers();
        PrintWriter out = response.getWriter();
         
         out.println("<!DOCTYPE html>");
         out.println("<html>");
         out.println("<head>");
         out.println("<meta charset=\"UTF-8\">");
         out.println("<tittle>");
         out.println("Signed up!");
         out.println("</tittle>");
         out.println("</head>");
         out.println("<body>");
         out.println("<h1>");
         out.println("Estas Adentro:");
         out.println("</h1>");
         out.println("<a href = loginAdmin.html>");
         out.println("Sign in");
         out.println("</a>");
         out.println("</body>");
         out.println("</html>");
        }
        
        if("normal".equals(usertype)){
        
        String userNormal = request.getParameter("username");
        String name = request.getParameter("name");
        String subscribeType = request.getParameter("subscribetype");
        String address = request.getParameter("address");
        User normal = user.creatUser(usertype);
        normal = new Usuario(username, password, email, usertype, userNormal, name, subscribeType, address);
        normal.addUsers();
        PrintWriter out = response.getWriter();
         
         out.println("<!DOCTYPE html>");
         out.println("<html>");
         out.println("<head>");
         out.println("<meta charset=\"UTF-8\">");
         out.println("<tittle>");
         out.println("Signed up!");
         out.println("</tittle>");
         out.println("</head>");
         out.println("<body>");
         out.println("<h1>");
         out.println("You are in!C:");
         out.println("</h1>");
         out.println("<a href = loginNormal.html>");
         out.println("Sign in");
         out.println("</a>");
         out.println("</body>");
         out.println("</html>");      
        
        }
        
    
  
