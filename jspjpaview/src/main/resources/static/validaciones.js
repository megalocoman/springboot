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
  } else if (descripsion.length > 1000) {
    alert("descrision no superior a 1000 caracteres.");
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
  var rutexpresion = /^[0-9]+[-|‐]{1}[0-9kK]{1}$/;

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
    alert("numero de digitos de rut es incorrecto");
    return false;
  } else if (nombrecliente.length < 5 && nombrecliente.length > 30) {
    alert("nombre cliente debe ser entre 5 y 50 caracteres");
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
  } else if (!/^[0-9]+[-|‐]{1}[0-9kK]{1}$/.test(rutcliente)) {
    alert("formato no valido, ejemplo: 12345678-k");
    return false;
  }
}

function validarOT() {
  var datepicker = document.getElementById("datepicker").value;
  var val = document.getElementById("val").value;
  var pag = document.getElementById("pag").value;
  var statact = document.getElementById("statact").value;
  var rutcli = document.getElementById("rutcli").value;
  var rutprof = document.getElementById("rutprof").value;
  var codact = document.getElementById("codact").value;

  if (
    datepicker === "" ||
    val === "" ||
    pag === "" ||
    statact === "" ||
    rutcli === "" ||
    rutprof === "" ||
    codact === ""
  ) {
    alert("Todos los cambios son obligatorios");
    return false;
  } else if (isNaN(val)) {
    alert("ingrese monto numerico");
    return false;
  } else if (isNaN(pag)) {
    alert("ingrese monto numerico");
    return false;
  } else if (statact.length < 5 && statact.length > 20) {
    alert("nombre cliente debe ser entre 5 y 20 caracteres");
    return false;
  } else if (rutcliente.length > 12) {
    alert("numero de digitos es incorrecto");
    return false;
  } else if (rutprof.length > 12) {
    alert("numero de digitos es incorrecto");
    return false;
  } else if (!/^[0-9]+[-|‐]{1}[0-9kK]{1}$/.test(rutcli)) {
    alert("formato no valido, ejemplo: 12345678-k");
    return false;
  } else if (!/^[0-9]+[-|‐]{1}[0-9kK]{1}$/.test(rutprof)) {
    alert("formato no valido, ejemplo: 12345678-k");
    return false;
  } else if (isNaN(codact)) {
    alert("ingrese numero actividad");
    return false;
  }

  if (
    statact.value != "Sin Status" &&
    statact.value != "Pendiente" &&
    statact.value != "En Proceso" &&
    statact.value != "Planificada" &&
    statact.value != "Finalizada" &&
    statact.value != "Cancelada" &&
    statact.value != "Otro"
  ) {
    alert(
      "Status validos:\nSin Status\nPendiente\nEn Proceso\nPlanificada\nFinalizada\nCancelada\nOtro"
    );
    return false;
  }

  if (
    codact.value != "0" &&
    codact.value != "1" &&
    codact.value != "2" &&
    codact.value != "3" &&
    codact.value != "4" &&
    codact.value != "5" &&
    codact.value != "6" &&
    codact.value != "7"
  ) {
    alert(
      "Actividades validas:\n0: Sin Definicion\n1: Capacitacion\n2: Curso\n3: Asesoria\n4: Gestion\n5: Visita\n6: Soporte\n7: Otra"
    );
    return false;
  }
}

function validarProfesional() {
  var rutprofesional = document.getElementById("rutprofesional").value;
  var nombre = document.getElementById("nombre").value;
  var correo = document.getElementById("correo").value;
  var telefono = document.getElementById("telefono").value;
  var expresion = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
  if (
    rutprofesional === "" ||
    nombre === "" ||
    correo === "" ||
    telefono === ""
  ) {
    alert("Todos los cambios son obligatorios");
    return false;
  } else if (rutprofesional.length > 12) {
    alert("numero de digitos es incorrecto");
    return false;
  } else if (!/^[0-9]+[-|‐]{1}[0-9kK]{1}$/.test(rutprofesional)) {
    alert("formato no valido, ejemplo: 12345678-k");
    return false;
  } else if (nombre.length < 5 && nombre.length > 30) {
    alert("nombre cliente debe ser entre 5 y 50 caracteres");
    return false;
  } else if (!expresion.test(correo)) {
    alert("correo no valido");
    return false;
  } else if (isNaN(telefono)) {
    alert("Debe ingresar sólo numeros");
    return false;
  }
}
