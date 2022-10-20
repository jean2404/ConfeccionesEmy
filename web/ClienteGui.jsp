<%-- 
    Document   : ClienteGui
    Created on : 15-jul-2021, 12:58:07
    Author     : sagit
--%>

<%@page import="vista.ClientePresentador"%>
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

        <% ClientePresentador cliPre = (ClientePresentador) session.getAttribute("cliPre"); %>


        <% Object[] f1 = cliPre.getFil();%>
        <div class="container">
            <div class="col-sm-8 mx-auto my-5">
                <p class="text-center tituloF">Mantenimiento de datos del cliente<p>            	
                <form action="ClienteControl" method="post">
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">DNI</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" name="dni" value="<%= f1[0]%>">
                        </div>
                        <div class="col-sm-2">
                            <input type="submit" name="acc" class="btn btn-light" value="Buscar">
                        </div>

                    </div>
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">Nombre</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="nom" value="<%= f1[1]%>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">Dirección</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="dir" value="<%= f1[2]%>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">Telefono</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="tel" value="<%= f1[3]%>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">Correo</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="cor" value="<%= f1[4]%>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-sm-12 mx-auto">
                            <input type="submit" name="acc" class="btn btn-light" value="Grabar" />
                            <input type="submit" name="acc" class="btn btn-light" value="Modificar" />
                            <input type="submit" name="acc" class="btn btn-light" value="Limpiar" />
                            <input type="submit" name="acc" class="btn btn-light" value="Eliminar" />
                            <input type="submit" name="acc" class="btn btn-light" value="Listar" />
                            <a href="Menu.jsp" class="btn btn-light">Volver</a>
                        </div>
                    </div>

                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">DNI</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Direccion</th>
                                <th scope="col">Telefono</th>
                                <th scope="col">Correo</th>
                            </tr>
                        </thead>
                        <tbody>

                            <% for (int i = 1; i < cliPre.getLis().size(); i++) { %>
                            <% Object[] f = (Object[]) cliPre.getLis().get(i);%>
                            <tr>
                                <td><input type="text" size="12" value="<%= f[0]%>" /> </td>
                                <td><input type="text" size="12" value="<%= f[1]%>" /> </td>
                                <td><input type="text" size="12" value="<%= f[2]%>" /> </td>
                                <td><input type="text" size="12" value="<%= f[3]%>" /> </td>
                                <td><input type="text" size="12" value="<%= f[4]%>" /> </td>
                            </tr>
                            <% }%>

                        </tbody>
                    </table>
                    <p class="h5">
                        <%= cliPre.getMsg()%>
                    </p>        
                </form> 
            </div>

        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>


    </body>
</html>
