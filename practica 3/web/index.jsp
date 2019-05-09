

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro con JSP</h1>
        
        Nombre:<%=request.getParameter("nombre")%>
       <br><br>
      
       Apellido:<%=request.getParameter("apellido")%>
       <br><br>
       
       Fecha de Nacimiento:<%=request.getParameter("fecha")%>
       <br><br>
       
       Correo:<%=request.getParameter("correo")%>
       <br><br>
       
       Contraseña:<%=request.getParameter("contraseña")%>
       <br><br>
        
    </body>
</html>
