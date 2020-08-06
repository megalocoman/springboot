function validaraccidente() {
  var nombrecliente = document.getElementById("nombrecliente").value;
  var descripsion = document.getElementById("descripsion").value;
  var fechaaccidente = document.getElementById("fechaaccidente").value;

  if (nombrecliente === "" || descripsion === "" || fechaaccidente === "") {
    alert("todos los campos son obligatorios");
    return false;
  } else if (nombrecliente.length < 5 && nombrecliente.length > 50) {
    alert("nombre cliente debe ser entre 5 y 50 caracteres");
    return false;
  } else if (descripsion.length < 1000) {
    alert("descripcion no superior a 1000 caracteres.");
    return false;
  }
}

function validarActividad() {
  var nomact = document.getElementById("nomact").value;
  var descact = document.getElementById("descact").value;

  if (nomact === "" || descact === "") {
    alert("Todos los cambios son obligatorios");
    return false;
  } else if (nomact.length < 5 && nomact.length > 20) {
    alert("nombre actividad debe ser entre 5 y 50 caracteres");
    return false;
  } else if (descact.length < 1000) {
    alert("descripcion no superior a 1000 caracteres.");
    return false;
  }
}

function validarCliente() {
  var rutcliente = document.getElementById("rutcliente").value;
  var nombrecliente = document.getElementById("nombrecliente").value;
  var direccion = document.getElementById("direccion").value;
  var telefono = document.getElementById("telefono").value;
  var correo = document.getElementById("correo").value;
  var contacto = document.getElementById("contacto").value;

  var expresion = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;

  if (
    rutcliente === "" ||
    nombrecliente === "" ||
    direccion === "" ||
    telefono === "" ||
    correo === "" ||
    contacto === ""
  ) {
    alert("Todos los cambios son obligatorios");
    return false;
  } else if (rutcliente.length > 12) {
    alert("numero de digitos es incorrecto");
    return false;
  } else if (nombrecliente.length < 5 && nombrecliente.length > 30) {
    alert("nombre actividad debe ser entre 5 y 50 caracteres");
    return false;
  } else if (direccion.length < 5 && direccion.length > 100) {
    alert("nombre actividad debe ser entre 5 y 100 caracteres");
    return false;
  } else if (isNaN(telefono)) {
    alert("Debe ingresar sólo numeros");
    return false;
  } else if (!expresion.test(correo)) {
    alert("correo no valido");
    return false;
  } else if (contacto.length < 5 && contacto.length > 30) {
    alert("nombre actividad debe ser entre 5 y 50 caracteres");
    return false;
  }
}
