function myFunction() {
    var response = confirm("¿Desea validar y modificar los chequeos de esta visita?");
        if (response == true) {
            window.location.href = "responderchecklist.html";
        } else {
            window.location.href = "listadovisitas.html"; 
     }
}

function validate() {
    var x = document.forms["payForm"]["mont"].value;
    var y = document.forms["payForm"]["rut"].value;
    var z = document.forms["payForm"]["year_list"].value;
    if (x == "" || x <= 0 || x > 99999999) {
      alert("Ingrese un valor valido");
      return false  
    } else if (y == "" || y <= 0 || y > 99999999) {
        alert("Ingrese un rut valido");
        return false 
    } else if (z <=2009  || z > 2050 ){
        alert("Ingrese un año valido");
        return false 
    } else {
      alert("Los datos ingresados son validos ");  
    }
  }