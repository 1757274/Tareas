<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta charset="UTF-8"> 
      <title>Login</title>
   </head>
       <h1>Iniciar Sesión</h1>
       <form action="PROCESO" method="POST">
            <table>
                <tr>
                    <td>
                        <p>Usuario</p>
                    </td>
                    <td>
                        <input type="text" name="usuario"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Contraseña</p>
                    </td>
                    <td>
                        <input type="password" name="contrasena"/>
                    </td>
                </tr>
            </table>
           <table>
               <tr>
                   <td>
                       <input type="submit" name="ENTRAR" value="LOG IN"/>
                   </td>
                   <td>
                       <a href="registro.jsp">Registrarse</a>
                   </td>
               </tr>
           </table>
       </form>
   </center
   </body>
</html>