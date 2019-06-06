
    
        <title>Practica-4</title>
        
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         
    
         
                <h1>Formulario</h1>
         <form:form method = "POST" action = "/Practica-4/addPersona"></form:form>
         
                        
                <h2>Registro de usuario</h2>
                <table>
                    <tr>
                
                        <td><form:label from='' path = "name">Nombre</form:label></td>
                        <td><form:input  path = "name"/></td>
                    </tr>
                    
                    <tr>
                        
                        <td><form:label path = "email">Email</form:label></td>
                        <td><form:input path = "email"/></td>
                    </tr>
                    
                    <tr>
                        
                        <td><form:label path = "password">Contraseña</form:label></td>
                        <td><form:input path = "password"/></td>
                     
                     </tr>
                     
                     <tr>
                         
                         <td><form:label path = "date">Fecha de nacimiento</form:label></td>
                         <td><form:input path = "date"/></td>
                     
                     </tr>
                     <tr>
                         <td colspan="2">
                             <input type="submit" value="Enviar"/>
                             
                         </td>
                     </tr>
              
                </table>
            </form:form>
        </div>
    

