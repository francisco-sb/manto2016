var map;
var myCenter=new google.maps.LatLng(16.753056, -93.115556);

function initialize()
{
var mapProp = {
  center:myCenter,
  zoom:6,
  mapTypeId:google.maps.MapTypeId.ROADMAP
  };

  map = new google.maps.Map(document.getElementById("mapa"),mapProp);

  google.maps.event.addListener(map, 'click', function(event) {
    placeMarker(event.latLng);
  });
}

function placeMarker(location) {

  var marker = new google.maps.Marker({
    position: location,
    map: map,
  });

  var latitud = marker.position.lat();
  var longitud = marker.position.lng();

  var infowindow = new google.maps.InfoWindow({
    content: 'Latitud: ' + latitud + '<br>Longitud: ' + longitud
  });

  infowindow.open(map,marker);
  
  var inputLat = document.getElementById("latitud").setAttribute("value",latitud);
  var inputLng = document.getElementById("longitud").setAttribute("value",longitud);
}

google.maps.event.addDomListener(window, 'load', initialize);
