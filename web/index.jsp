<%-- 
    Document   : index
    Created on : 20-ago-2022, 15:43:48
    Author     : daniela
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
        <title>APiacere</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col ">
                    <h1>Login</h1>
                    <hr>
                    <div class=" d-flex  justify-content-center ">
                    <form class="col-8  mt-5  ">
                        <div class="col">
                            <label for="mail" class="mb-2">Email</label>
                            <input type="email"  class="form-control mb-2" id="mail" name="mail" placeholder="email@example.com">
                        </div>
                        <div class="col">
                            <label for="clave" class="mb-2">Password</label>
                            <input type="password" class="form-control" id="clave" name="clave" placeholder="Password">
                        </div>
                        <div class="col">
                             <a href="recuperarClave.jsp">me olvide la contraseña</a>
                        </div>
                        <div class="col">
                            <button type="submit" class="btn btn-primary my-3">Entrar</button>
                        </div>
                    </form>
                   </div>
                </div>
            </div>
        </div>

    </body>
</html>
