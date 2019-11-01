<%-- 
    Document   : cidade
    Created on : 31/10/2019, 23:15:54
    Author     : Jode
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <link href="css/estilo.css" rel="stylesheet" media="screen">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

        <title>Cadastro de cidadese</title>

    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand" href="#">HOME</a>
            <a class="navbar-brand" href="evento.jsp">Eventos</a>
            <a class="navbar-brand" href="cliente.jsp">Clientes</a>
            <a class="navbar-brand" href="cidade.jsp">Cidades</a>
            <a class="navbar-brand" href="#">Relatórios</a>
            <a class="navbar-brand" href="tecnico.jsp">Técnico</a>
            <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
                <ul class="navbar-nav mr-auto mt-2 mt-lg-0">

                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </nav>

        <form class="was-validated">

            <div class="container">
                <div class="row">
                    <div class="col-sm-7">
                        <div class="mb-5">
                            <label for="validationTextarea">NOME</label>
                            <input class="form-control is-invalid" id="validationTextarea" placeholder="Ex:Jode" required>

                        </div>

                        <div class="mb-5">
                            <label for="validationTextarea">URL</label>
                            <input class="form-control is-invalid" id="validationTextarea" placeholder="Ex:Jode" required>
                        </div>
                      
                      
                       
                        <div class="mb-5">
                        </div>
                        <button class="btn btn-success" type="submit">Adicionar</button>
                        <button class="btn btn-danger" type="submit">Excluir</button>
                        <button class="btn btn-dark" type="submit">Alterar</button>
                        <button class="btn btn-primary" type="submit">Cancelar</button>

                 
                </div>
            </div>
        </form>





    </form>


</body>
</html>
