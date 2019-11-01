<%-- 
    Document   : computador
    Created on : 27/10/2019, 15:39:30
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
        <title>Computador</title>
    </head>
    <body>
        <h1>Resultado do calculo</h1>
        <form>
            Disntancia maxima
            <input type="text" size="10" value="<%=request.getAttribute("distancia") %>"><br>
            Valor gasto para abastecer
            <input type="text" size="10" value="<%=request.getAttribute("valor") %>"><br>
            <input type="button" value="retornar" onclick="history.back()"
        </form>
        
        
    </body>
</html>
