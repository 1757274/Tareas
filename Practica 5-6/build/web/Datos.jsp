<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos</title>
    </head>
    <body>
        <%
        String nombre = request.getParameter("nombredelusuario"); 
        String contraseña = request.getParameter("contraseña");
        
        %>
        

    <%
        out.println("<h1> Confirmar sus datos:</h1>"); 
        out.println("<h2> Nombre: " + nombre + " </h2>"); 
        out.println("<h2> Contraseña: " + contraseña + " </h2>");
        
   
    %>
    </body>
</html>
