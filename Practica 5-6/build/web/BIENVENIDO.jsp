<%@page import="MODELO.USUARIO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        HttpSession sesion = request.getSession();
        String usuario,contrasena;
        usuario = sesion.getAttribute("username").toString();
        contrasena = sesion.getAttribute("password").toString();
        USUARIO U = new USUARIO(usuario,contrasena);
%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>Bienvenido!!</title>
        <script>
            
        </script>
    </head>
  
    <center>
        <h1>Bienvenido, <%=U.getUsuario()%>!</h1>
     
        
        
       
        <br>
        <a href="COOKIE">
            <input type="submit" value="Revisar cookies" name="Revisar cookies"/>
                  
        </a>
        <form action="cerrarSesion.jsp">
            <input type="submit" name="CERRAR SESIÓN" value="CERRAR SESIÓN"/>
            <p> Tu contraseña es: <%= U.getContrasena()%> </p>
        </form>
        <br>
        
    </center>
    </body>
</html>
