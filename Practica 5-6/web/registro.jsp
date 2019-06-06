<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta charset="UTF-8">
      <title>Registrarse</title>
      <script type="text/javascript">
          function validar(){
              var caracter_invalido = " ";
              var contra1 = document.login.contra1.value;
              var contra2 = document.login.contra2.value;
              
              if(contra1 != contra2){
                  alert("Las contraseñas no son iguales");
                  return false;
              }
              else if(contra1 == '' || contra2 == ''){
                  alert("introducir la contraseña en los dos campos")
                  return false;
              }
              else{
                  return true;
              }
          }
      </script>
   </head>
 
   <center>
       <h1>Registrarse</h1>
       <form action="REGISTRARSE" method="POST" name="login" onSubmit="return validar()"
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
                        <input type="password" name="contra1"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Volver a introducir la contraseña</p>
                    </td>
                    <td>
                        <input type="password" name="contra2"/>
                    </td>
                </tr>
            </table>
           <table>
               <tr>
                   <td>
                       <input type="submit" name="ENTRAR" value="Enviar"/>
                   </td>
               </tr>
           </table>
       </form>
   </center>
   </body>
</html>