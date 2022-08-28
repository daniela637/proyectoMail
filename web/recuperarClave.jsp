<%-- 
    Document   : recuperarClave
    Created on : 20-ago-2022, 20:59:54
    Author     : daniela
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
             <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
        <title>Recuperar Password</title>
    </head>
    <body>
        <div class="container">
            <h1>Recuperar la contraseña</h1>
            <hr>
            <div class="row">
                <div class="col-12 my-5 d-flex ">
                    <form method="POST" action="RecuperoClave" >
                         <label>Ingrese su mail</label>
                         <input type="email" name="mailRecupero">
                          <input class="btn btn-danger btn-block" type="submit" name="accionRecupero" value="Enviar" >
                    </form>                  
                </div>
            </div>
        </div>
    </body>
</html>
