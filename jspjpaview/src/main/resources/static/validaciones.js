function validaraccidente() {
  var nombrecliente;
  var descripsion;

  nombrecliente = document.getElementById("nombrecliente").value;
  descripsion = document.getElementById("descripsion").value;
  var fechaaccidente = document.getElementById("fechaaccidente").value;

  if (nombrecliente === "" || descripsion === "" || fechaaccidente === "") {
    alert("todos los campos son obligatorios");
    return false;
  } else if (nombrecliente.length < 5 && nombrecliente.length > 50) {
    alert("nombre debe ser entre 5 y 50 caracteres");
    return false;
  } else if (descripsion.length < 1000) {
    alert("descrision no superior a 1000 caracteres.");
    return false;
  }
}
