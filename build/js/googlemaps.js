var map;
var myCenter=new google.maps.LatLng(9.814103, -83.118708);

function initialize()
{
var mapProp = {
  center:myCenter,
  zoom:5,
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
  var infowindow = new google.maps.InfoWindow({
    content: 'Latitud: ' + location.lat() + '<br>Longitud: ' + location.lng()
  });
  infowindow.open(map,marker);
}

google.maps.event.addDomListener(window, 'load', initialize);