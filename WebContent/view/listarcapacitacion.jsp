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


<h1>Listado Capacitaciones</h1>
 
<div class="row">
<div class="col-9 col-s-12" class="lista">  
<table>
  <tr id="lista">
      <td>idcapacitacion</td>
      <td>Fecha</td>
      <td>Hora</td>
      <td>Nombre cliente</td>
  </tr>
   <tr>
      <td>1</td>
      <td>15/10/2020</td>
      <td>11:00</td>
      <td>José Campos</td>
  </tr>
</table>
</div> 
<div class="col-3 cols-s-12" class="boton" >      
<form action="crearcapacitacion.html">       
   <input type="submit" value="Crear capacitación">
</form> 
</div>
</div>           
</body>
</html>