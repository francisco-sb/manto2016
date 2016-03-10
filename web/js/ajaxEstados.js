
function listandoEstados(){
	var xhttp = new XMLHttpRequest();
	var src = document.getElementById("bestado").value;
	xhttp.onreadystatechange = function() {
		if(xhttp.status == 400){
			
		}
		if (xhttp.readyState == 4 && xhttp.status == 200) {
			document.getElementById("listaEstados").innerHTML = xhttp.responseText;
		}
	};
	xhttp.open("GET", "ListarEstados.do?nombre="+src, true);
	xhttp.send();
}