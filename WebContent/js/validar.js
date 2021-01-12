function  valida(){
    let idaux = document.getElementById("asist").value;
    let idnombre = document.getElementById("nombre").value;
    let idedad = document.getElementById("edad").value;
    let idmail = document.getElementById("mail").value;
    let idphone = document.getElementById("phone").value;



   if ((idaux>=0 && idaux<=10000) && idaux!="") {
   }else {
       alert("Id fuera de rango");
       return false;  
    }

   if ((idnombre>=0 && idnombre<=100) && idnombre!="") {
    }else {
        alert("Nombre fuera de rango");
        return false;    
    }

    if ((idedad>=0 && idedad<=150) && idedad!="") {
    }else {
        alert("Edad fuera de rango");
        return false;    
    }
        

 }           
                                               

