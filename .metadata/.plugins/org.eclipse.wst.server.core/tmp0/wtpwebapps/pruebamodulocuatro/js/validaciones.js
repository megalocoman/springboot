/**
 * 
 */
// window.onload(){
// window.alert("Inicio...");
// alert("Inicio...");
// }
var rutsal = true;
function valida() {
	var todo_correcto = true;

//	alert("Entro a valida ...");
//	alert("form..."+document.formcrea.txtrutcli.value);
//	alert("formlength..."+document.formcrea.txtrutcli.value.length);
	
	if (document.formcrea.txtfecact.value.length == 0) {
		todo_correcto = false;
		window.alert("Debe ingresar Fecha de Actividad...");
		return;
		System.exit(0);
	}

	// if (document.formcrea.txtval.value.length == 0) {
	// todo_correcto = false;
	// window.alert("Valor se encuentra en 0...");
	// return;
	// System.exit(0);
	// }
	//
	// if (document.formcrea.txtpag.value.length == 0) {
	// todo_correcto = false;
	// window.alert("Pago se encuentra en 0...");
	// return;
	// System.exit(0);
	// }

	if (document.formcrea.txtstatact.value.length == 0) {
		todo_correcto = false;
		window.alert("Debe ingresar un comentario para Status de actividad...");
		return;
		System.exit(0);
	}

//	window.alert(document.formcrea.txtrutcli.value);
	var rutcliente = "";
	rutsal = true;
	if (document.formcrea.txtrutcli.value.length > 0) {
//		window.alert("entro a cli.. "+document.formcrea.txtrutcli.value);
		rutcliente = document.formcrea.txtrutcli.value;
		if (rutsal = false){
			todo_correcto = false;
			window.alert("Debe ingresar un Rut de Cliente válido...");
			return;
			System.exit(0);
		}
	} 

//	window.alert(document.formcrea.txtrutprof.value);
	var rutprof="";
	rutsal = true;
	if (document.formcrea.txtrutprof.value.length > 0) {
//		window.alert("entro a prof.. "+document.formcrea.txtrutprof.value);
		rutprof = document.formcrea.txtrutprof.value;
		if (rutsal = false){
			todo_correcto = false;
			window.alert("Debe ingresar un Rut de Profesional válido...");
			return;
			System.exit(0);
		}
	} 

	if (document.formcrea.txtcodact.value.length == 0) {
		todo_correcto = false;
		window.alert("Debe ingresar un Código de actividad válido...");
		return;
		System.exit(0);
	}
	if (todo_correcto == false) {
		document.formcrea.txtval.value = 0;
		document.formcrea.txtpag.value = 0;
		document.formcrea.txtcodact.value = 0;
	}

	return todo_correcto;
}

// $(function () {
$(function() {
	$("#datepicker").datepicker({
		// closeText: 'Cerrar',
		// prevText: ' nextText: Sig>',
		// currentText: 'Hoy',
		// monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio',
		// 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre',
		// 'Diciembre'],
		// monthNamesShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun',
		// 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'],
		// dayNames: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves',
		// 'Viernes', 'Sábado'],
		// dayNamesShort: ['Dom', 'Lun', 'Mar', 'Mié;', 'Juv', 'Vie', 'Sáb'],
		// dayNamesMin: ['Do', 'Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sá'],
		// weekHeader: 'Sm',
		dateFormat : 'dd/mm/yy',
	// isRTL: false,
	// showMonthAfterYear: false,
	});

});

// }
// $(function(){
// $("#datepicker").datepicker(){
// dateFormat: 'dd/mm/yy';
// };
// $.datepicker.setDefaults($.datepicker.regional["es"]);
// });

////////////////////
//VALIDA RUT
//
//Validador de Rut
//Descargado desde http://www.juque.cl/
//
function revisarDigito( dvr )
{	
	dv = dvr + "";	
	if ( dv != '0' && dv != '1' && dv != '2' && dv != '3' && dv != '4' && dv != '5' && dv != '6' && dv != '7' && dv != '8' && dv != '9' && dv != 'k'  && dv != 'K')	
	{		
		alert("Debe ingresar un digito verificador valido");		
		window.document.form1.rut.focus();		
		window.document.form1.rut.select();
		rutsal = false;
		return false;	
	}	
	rutsal = true;
	return true;
}

function revisarDigito2( crut )
{	
	largo = crut.length;	
	if ( largo < 2 )	
	{		
		alert("Debe ingresar el rut completo");		
		window.document.form1.rut.focus();		
		window.document.form1.rut.select();
		rutsal = false;
		return false;	
	}	
	if ( largo > 2 )		
		rut = crut.substring(0, largo - 1);	
	else		
		rut = crut.charAt(0);	
	dv = crut.charAt(largo-1);	
	revisarDigito( dv );	

	if ( rut == null || dv == null )
		return 0;

	var dvr = '0';	
	suma = 0;
	mul  = 2;

	for (i= rut.length -1 ; i >= 0; i--)	
	{	
		suma = suma + rut.charAt(i) * mul;		
		if (mul == 7)
			mul = 2	;	
		else    			
			mul++;
	}	
	res = suma % 11;	
	if (res==1)		
		dvr = 'k';
	else if (res==0)		
		dvr = '0';
	else	
	{		
		dvi = 11-res;
		dvr = dvi + "";	
	}
	if ( dvr != dv.toLowerCase() )	
	{		
		alert("EL rut es incorrecto");		
		window.document.form1.rut.focus();		
		window.document.form1.rut.select();
		rutsal = false;
		return false;
	}
	rutsal = true;
	return true;
}

function rut(texto)
{	
	var tmpstr = "";
	var i=0;
	for ( i=0; i < texto.length ; i++ )		
		if ( texto.charAt(i) != ' ' && texto.charAt(i) != '.' && texto.charAt(i) != '-' )
			tmpstr = tmpstr + texto.charAt(i);	
	texto = tmpstr;	
	largo = texto.length;	

	if ( largo < 2 )	
	{		
		alert("Debe ingresar el rut completo");		
		window.document.form1.rut.focus();		
		window.document.form1.rut.select();
		rutsal = false;
		return false;	
	}	

	for (i=0; i < largo ; i++ )	
	{			
		if ( texto.charAt(i) !="0" && texto.charAt(i) != "1" && texto.charAt(i) !="2" && texto.charAt(i) != "3" && texto.charAt(i) != "4" && texto.charAt(i) !="5" && texto.charAt(i) != "6" && texto.charAt(i) != "7" && texto.charAt(i) !="8" && texto.charAt(i) != "9" && texto.charAt(i) !="k" && texto.charAt(i) != "K" )
		{			
			alert("El valor ingresado no corresponde a un R.U.T valido");			
			window.document.form1.rut.focus();			
			window.document.form1.rut.select();
			rutsal = false;
			return false;		
		}	
	}	

	var invertido = "";	
	for ( i=(largo-1),j=0; i>=0; i--,j++ )		
		invertido = invertido + texto.charAt(i);	
	var dtexto = "";	
	dtexto = dtexto + invertido.charAt(0);	
	dtexto = dtexto + '-';	
	cnt = 0;	

	for ( i=1,j=2; i<largo; i++,j++ )	
	{		
		//alert("i=[" + i + "] j=[" + j +"]" );		
		if ( cnt == 3 )		
		{			
			dtexto = dtexto + '.';			
			j++;			
			dtexto = dtexto + invertido.charAt(i);			
			cnt = 1;		
		}		
		else		
		{				
			dtexto = dtexto + invertido.charAt(i);			
			cnt++;		
		}	
	}	

	invertido = "";	
	for ( i=(dtexto.length-1),j=0; i>=0; i--,j++ )		
		invertido = invertido + dtexto.charAt(i);	

	window.document.form1.rut.value = invertido.toUpperCase();

	if ( revisarDigito2(texto) ){
		rutsal = true;
		return true;	
	}
	rutsal = false;
	return false;
}

////////////////////////////////////////////

