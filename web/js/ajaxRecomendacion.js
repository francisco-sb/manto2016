function select_lugar() {
    var valor = document.getElementById("lugar").value;
    var xmlhttp=new XMLHttpRequest();
                
    xmlhttp.onreadystatechange=function(){
      if(xmlhttp.status==404){
          document.getElementById("estado").value="Page not found";
      }
      if (xmlhttp.readyState==4 && xmlhttp.status==200){
          document.getElementById("estado").value=xmlhttp.responseText;
      }
    };
    xmlhttp.open("GET","ListarEstado.do?nombre="+valor,true);
    xmlhttp.send();

}

function buscar_lugar() {
    var valor = document.getElementById("buscar").value;
    var xmlhttp=new XMLHttpRequest();
                
    xmlhttp.onreadystatechange=function(){
      if(xmlhttp.status==404){
          document.getElementById("lugar").innerHTML="Page not found";
      }
      if (xmlhttp.readyState==4 && xmlhttp.status==200){
          document.getElementById("lugar").innerHTML=xmlhttp.responseText;
      }
    };
    xmlhttp.open("GET","BuscarLugares.do?nombre="+valor,true);
    xmlhttp.send();

}
