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
                    <h1 class="text-info">Login</h1>
                    <hr>
                    <div class=" d-flex  justify-content-center ">
                    <form class="col-8  mt-5 d-flex flex-column align-items-center">
                        <div class="col-6">
                            <label for="mail" class="mb-2 fs-3 fw-bold">Email</label>
                            <input type="email"  class="form-control mb-2 border border-primary" id="mail" name="mail" placeholder="email@example.com">
                        </div>
                        <div class="col-6">
                            <label for="clave" class="mb-2 fs-3 fw-bold">Password</label>
                            <input type="password" class="form-control border border-primary" id="clave" name="clave" placeholder="Password">
                        </div>
                        <div class="col mt-3">
                             <a href="recuperarClave.jsp" class="text-decoration-none">¿Olvidó su contraseña?</a>
                        </div>
                        <div class="col">
                            <button type="submit" class="btn btn-primary my-3 fw-bold">Entrar</button>
                        </div>
                    </form>
                   </div>
                </div>
            </div>
        </div>

    </body>
</html>
