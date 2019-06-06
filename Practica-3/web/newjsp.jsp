


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    
<html>
    <head>
        <title> jsp page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="estilo.css">
    </head>
    
        registro
    
        <form action="Respuesta" method="post">
            Nombre: <input type="text" name="nombre">
            <br>
            Apellido: <input type="text" name="ap">
            <br>
            Fecha de nacimiento:<input type="text" name="FN">
            <br>
            Correo:<input type="text" name="correo">
            <br>
            Contrase�a: <input type="text" name="Contrase�a">
            <br>
            <input type="submit" name="listo">
        </form>
        
    </body>
</html>