<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="author" content="Colorlib">
    <meta name="description" content="#">
    <meta name="keywords" content="#">
    <!-- Page Title -->
    <title>Agenda RoneaWork</title>
    
    <spring:url value="/resources/css/style.css" var="estilos" />
	<link href="${estilos}" rel="stylesheet" /> 
    
    <spring:url value="/resources/css/bootstrap.min.css" var="bootstrap" />
	<link href="${bootstrap}" rel="stylesheet" />
	
	<spring:url value="/resources/css/simple-line-icons.css" var="line" />
	<link href="${line}" rel="stylesheet" />
	
	<spring:url value="/resources/css/themify-icons.css" var="icon" />
	<link href="${icon}" rel="stylesheet" />
	
	<spring:url value="/resources/css/set1.css" var="set" />
	<link href="${set}" rel="stylesheet" />
	
	
	
	
    
    <!-- Bootstrap CSS
    <link rel="stylesheet" href="css/bootstrap.min.css"> -->
    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,400i,500,700,900" rel="stylesheet">
    <!-- Simple line Icon 
    <link rel="stylesheet" href="css/simple-line-icons.css">-->
    <!-- Themify Icon 
    <link rel="stylesheet" href="css/themify-icons.css">-->
    <!-- Hover Effects 
    <link rel="stylesheet" href="css/set1.css">-->
    <!-- Main CSS 
    <link rel="stylesheet" href="/style.css">-->
</head>

<body>
    <!--============================= HEADER =============================-->
    <div class="nav-menu">
        <div class="bg transition">
            <div class="container-fluid fixed">
                <div class="row">
                    <div class="col-md-12">
                        <nav class="navbar navbar-expand-lg navbar-light">
                            <a class="navbar-brand" href="index.html">RoneaWork</a>
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="icon-menu"></span>
              </button>
                            <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
                                <ul class="navbar-nav">
                                   
                                    <li class="nav-item active">
                                        <a class="nav-link" href="mostrar"><strong>Empleados</strong></a>
                                    </li>
                                    <li class="nav-item active">
                                        <a class="nav-link" href="#"><strong>Categoría</strong></a>
                                    </li>
                                    <li class="nav-item active">
                                        <a class="nav-link" href="#"><strong>Departamentos</strong></a>
                                    </li>
                                    <li class="nav-item active">
                                        <a class="nav-link" href="#"><strong>Personas</strong></a>
                                    </li>
                                    
                                </ul>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- SLIDER -->
    <section class="slider d-flex align-items-center">
        <!-- <img src="images/slider.jpg" class="img-fluid" alt="#"> -->
        <div class="container">
            <div class="row d-flex justify-content-center">
                <div class="col-md-12">
                    <div class="slider-title_box">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="slider-content_wrap">
                                    <h1>Agenda empresarial</h1>
                                    <h5>Bienvenido a tu agenda personal empresarial, todo lo que necesitas saber a tu alcance con un solo click</h5>
                                </div>
                            </div>
                        </div>
                        <div class="row d-flex justify-content-center">
                            <div class="col-md-10">
                                <form class="form-wrap mt-4" method="post" action="buscar">
                                    <div class="btn-group" role="group" aria-label="Basic example">
                                        <input type="text" placeholder="Primer Apellido" class="btn-group1">
                                        <input type="text" placeholder="Segundo apellido" class="btn-group2">
                                        <button type="submit" class="btn-form"><span class="icon-magnifier search-icon"></span>SEARCH<i class="pe-7s-angle-right"></i></button>
                                    </div>
                                </form>
                                <div class="slider-link">
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--// SLIDER -->
    <!--//END HEADER -->
    <!--============================= FIND PLACES =============================-->
   
    <!--//END FIND PLACES -->
    <!--============================= FEATURED PLACES =============================-->
   
    <!--//END FEATURED PLACES -->
    <!--============================= CATEGORIES =============================-->

    <!--//END ADD LISTING -->
    <!--============================= FOOTER =============================-->
    <footer class="main-block dark-bg">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="copyright">
                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        <p>Copyright &copy; 2018 RoneaWork. All rights reserved </p>
                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        <ul>
                            <li><a href="#"><span class="ti-facebook"></span></a></li>
                            <li><a href="#"><span class="ti-twitter-alt"></span></a></li>
                            <li><a href="#"><span class="ti-instagram"></span></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!--//END FOOTER -->




    <!-- jQuery, Bootstrap JS. -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

    <script>
        $(window).scroll(function() {
            // 100 = The point you would like to fade the nav in.

            if ($(window).scrollTop() > 100) {

                $('.fixed').addClass('is-sticky');

            } else {

                $('.fixed').removeClass('is-sticky');

            };
        });
    </script>
</body>

</html>
