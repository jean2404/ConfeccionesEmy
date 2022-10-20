<%-- 
    Document   : CategoriaListar
    Created on : 09-jul-2021, 1:10:49
    Author     : sagit
--%>

<%@page import="vista.PedidoPresentador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100&display=swap" rel="stylesheet">
        <style>@import"estiloRegistro.css";</style>
    </head>
    <body>
        <div class="container">
            <div class="col-sm-8 mx-auto my-5">
                <p class="text-center tituloF">Categoria de Productos<p>
                    <% PedidoPresentador pedPre = (PedidoPresentador) session.getAttribute("pedPre");%>

                <table class="table">
                    <thead>
                        <tr>
                            <th scope="col">Codigo</th>
                            <th scope="col">Nombre</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (int i = 1; i < pedPre.getLis().size(); i++) { %>
                        <% Object[] f = (Object[]) pedPre.getLis().get(i);%>
                        <tr>
                    <form action="PedidoControl" method="post">
                        <td><input type="text" name="codCateg" size="5" value="<%= f[0]%>" /></td>
                        <td><input type="text" name="nom" size="10" value="<%= f[1]%>" /></td>
                        <td><input type="submit" name="acc" size="5" value="Ver Articulos" /></td>
                    </form>
                    </tr>
                    <% }%>
                    </tbody>
                </table>

            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

    </body>
</html>
