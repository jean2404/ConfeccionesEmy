<%-- 
    Document   : ProductoGui
    Created on : 16-jul-2021, 15:17:31
    Author     : sagit
--%>

<%@page import="vista.ProductoPresentador"%>
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

        <% ProductoPresentador pp = (ProductoPresentador) session.getAttribute("pp"); %>


        <% Object[] f1 = pp.getFil();%>
        <div class="container">
            <div class="col-sm-12 mx-auto my-5">
                <p class="text-center tituloF">Mantenimiento de datos del Producto<p>            	
                <form action="ProductoControl" method="post">
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">Codigo</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" name="codPro" value="<%= f1[0]%>">
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
                        <label class="col-sm-3 col-form-label lab">Precio</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="pre" value="<%= f1[2]%>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">Stock</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="sto" value="<%= f1[3]%>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">Codigo Categoria</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="codCateg" value="<%= f1[4]%>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">Marca</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="mar" value="<%= f1[5]%>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">Talla</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="tal" value="<%= f1[6]%>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">Color</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="col" value="<%= f1[7]%>">
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
                                <th scope="col">Codigo</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Precio</th>
                                <th scope="col">Stock</th>
                                <th scope="col">Codigo Categoria</th>
                                <th scope="col">Marca</th>
                                <th scope="col">Talla</th>
                                <th scope="col">Color</th>
                            </tr>
                        </thead>
                        <tbody>

                            <% for (int i = 1; i < pp.getLis().size(); i++) { %>
                            <% Object[] f = (Object[]) pp.getLis().get(i);%>
                            <tr>
                                <td><input type="text" size="12" value="<%= f[0]%>" /> </td>
                                <td><input type="text" size="12" value="<%= f[1]%>" /> </td>
                                <td><input type="text" size="12" value="<%= f[2]%>" /> </td>
                                <td><input type="text" size="12" value="<%= f[3]%>" /> </td>
                                <td><input type="text" size="12" value="<%= f[4]%>" /> </td>
                                <td><input type="text" size="12" value="<%= f[5]%>" /> </td>
                                <td><input type="text" size="12" value="<%= f[6]%>" /> </td>
                                <td><input type="text" size="12" value="<%= f[7]%>" /> </td>
                            </tr>
                            <% }%>

                        </tbody>
                    </table>

                    <p class="h5">

                        <%= pp.getMsg()%>

                    </p>        
                </form> 
            </div>



            <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

    </body>
</html>
