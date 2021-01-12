<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
	<link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="style.css">
	<script type="javascript" src="js/valida.js"></script>
	<script type="javascript" src="validar.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <link rel="shortcut icon" href="Readme.ico">

</head>
<body>

<div class="topnav">
  <a class="active" href="index.html">Inicio</a>
  <a href="contacto.html">Contacto</a>
  <a href="listarcapacitaciones.html">Listado Capacitaciones</a>
  <a href="listadousuarios.html">Listado Usuarios</a>
  <a href="listadoasesorias.html">Listado Asesorias</a>
  <a href="listadovisitas.html">Listado Visitas</a>
  <a href="listadopago.html">Listado Pago</a>
  <a href="reportes.html">Reportes</a>
  <a href="login.html">Ingresar</a>
</div>

  
<body>
	<div class="container">
		<div class="row text-center login-page">
			<div class="col-md-12 login-form">
			
				<form action="/listadousuarios.html" method="GET"> 
					
					<div class="row">
						<div class="col-md-12 login-form-header">
							<p class="login-form-font-header">Login<span> Seguridad</span><p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12 login-from-row">
							<input id="usuario" name="usuario" type="text" placeholder="Rut" required/>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12 login-from-row">
							<input id="clave" name="password" type="password" placeholder="Contraseña" required/>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12 login-from-row">
							<input type="submit" id="Acceso" value="Acceso" class="btn btn-success" onclick="valida()">
							
						</div>
					</div>
				</form>
			</div>
		</div>
		
	</div>
	
</body>
</html>