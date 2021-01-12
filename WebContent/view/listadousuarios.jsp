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

    
    <h1>Listado de usuarios</h1>
    <div>
        <table id="usuarios" class="table table-striped table-bordered" style="width:100%">
            <thead>
                <tr>
                    <th>ID Usuario</th>
                    <th>Rut Usuario</th>
                    <th>Nombre Usuario</th>
                    <th>Descripcion</th>
                </tr>
            </thead>

        <tbody>
            <tr>
                <td>1</td>
                <td>11111111-1</td>
                <td>Miguel</td>
                <td>Analista</td>
            </tr>
            <tr>
                <td>2</td>
                <td>22222222-2</td>
                <td>Franco</td>
                <td>Desarrollador</td>
            </tr>
            <tr>
                <td>3</td>
                <td>33333333-3</td>
                <td>Juan</td>
                <td>Contador</td>
            </tr>
            <tr>
                <td>4</td>
                <td>44444444-4</td>
                <td>Manuel</td>
                <td>Desrrollador</td>
            </tr>
        </tbody>

    </table>
</div>

  <script>
    $(document).ready(function () {
        $('#usuarios').DataTable();
        
    });
  </script> 
  
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.22/js/dataTables.bootstrap4.min.js"></script> 
</body>
</html>