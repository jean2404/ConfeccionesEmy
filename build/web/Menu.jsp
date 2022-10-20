<%-- 
    Document   : Menu
    Created on : 03-jun-2021, 16:46:31
    Author     : sagit
--%>

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
            <div class="col-sm-6 mx-auto my-5">
                <p class="text-center tituloF">Confecciones EMY</p>
                <% Object[] fil = (Object[]) session.getAttribute("fil");%>
                <!--
                <div class="row">
                    <div class="col-sm-6">
                        <p>Codigo: <%= fil[0]%></p>
                    </div>
                    <div class="col-sm-6">
                        <p>Nombre: <%= fil[1]%></p>
                    </div>
                </div> 
                -->

            </div>

        </div>

        <div class="container-fluid">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="#">Bienvenido <%= fil[1]%></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Mi Perfil
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <form class="dropdown-item" action="PerfilControl" method="post">
                                    <input type="hidden" name="cod" value="<%= fil[0]%>" />
                                    <input type="submit" name="acc" value="Gestionar Perfil"/> 
                                </form>
                            </div>
                        </li>

                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Clientes
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <form class="dropdown-item" action="ClienteControl" method="post">
                                    <input type="submit" name="acc" value="Gestionar Cliente"/> 
                                </form>
                            </div>
                        </li>

                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Pedidos
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <form class="dropdown-item" action="PedidoControl" method="post">
                                    <input type="hidden" name="cod" value="<%= fil[0]%>" />
                                    <input type="submit" name="acc" value="Nuevo Pedido"/> 
                                </form>
                            </div>
                        </li>

                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Productos
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <form class="dropdown-item" action="ProductoControl" method="post">
                                    <input type="submit" name="acc" value="Gestionar Productos"/> 
                                </form>
                            </div>
                        </li>

                        <li class="nav-item active">
                            <a class="nav-link" href="Portal.jsp">Salir</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>

        <div class="row">
            <div class="col-sm-7 p-5">
                <h1 class="h1 text-center">Bienvenido a Confecciones EMY</h1><br>
                <hr class="border-info w-50 m-auto p-4">
                <p class="lead font-weight-normal text-justify">En Confecciones EMY tenemos el compromiso de brindar a nuestros valiosos
                    clientes los mejores articulos de ropa de Lima. Utilizamos solo
                    materiales de la más alta calidad para brindar una mejor experiencia
                    a nuestros usuarios.Este negocio familiar nació con el objetivo de brindar
                    un buen servicio al usuario con un precio accesible a todo público.</p>
                <br><br>
                <figure>
                    <img src="fondoEmy.jpg" alt="" class=" mx-auto d-block rounded" width="80%">
                </figure>
            </div>
            <div class="col-sm-5 p-5">
                <h2 class="h1 text-center ">Articulos Destacados</h2><br>
                <hr class="border-info w-50 m-auto p-4">
                <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                        <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                        <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img src="jeans.jpg" class="d-block w-100" alt="Jeans EMY">
                            <div class="carousel-caption d-none d-md-block">
                                <h5>Jeans EMY</h5>
                                <p>Confecciones EMY</p>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img src="chavito.jpg" class="d-block w-100" alt="Chavito EMY">
                            <div class="carousel-caption d-none d-md-block">
                                <h5>Chavito</h5>
                                <p>Confecciones EMY</p>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img src="chompa.jpg" class="d-block w-100" alt="Chompa Cuello ">
                            <div class="carousel-caption d-none d-md-block">
                                <h5>Chompa Mini</h5>
                                <p>Confecciones EMY</p>
                            </div>
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
                <br>
                <h2 class="h1 text-center">Trayectoria</h2><br>

                <p class="lead font-weight-normal text-justify">Durante 2 años hemos cumplido con las expectativas de nuestros clientes, brindándole los mejores articulos de ropa de la más alta calidad y con los más destacados modelos de la capital.
                    La constante asistencia de nuestros clientes es una muestra del buen servicio de venta de ropa que brindamos.</p>
            </div>

        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

    </body>
</html>
