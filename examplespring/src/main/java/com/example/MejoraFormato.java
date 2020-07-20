package com.example;

import org.springframework.stereotype.Component;

@Component
public class MejoraFormato {
	
	public String mejorFormato(String nombre) {
		
		String output = "";
		String [] split = nombre.split(" ");
		for (int i = 0; i< split.length; i ++ ) {
			output += split[i].substring(0, 1).toUpperCase()+split[i].substring(0, 1).toLowerCase()+" ";
		}
		
		return output.trim();
	}
	
	public int edadGato(int edad) {
				
		return edad*7;
	}

}
