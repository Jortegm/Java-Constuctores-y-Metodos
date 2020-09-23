package Caja;

import java.util.Scanner;

public class PruebaCaja {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		System.out.println("Calculo con datos fijos");
		//creacion de variables con valores fijos.
		int ancho = 3;
		int alto = 2;
		int profundo = 6;
		
		//creamos objeto
		Caja c = new Caja(ancho, alto, profundo);
		
		//formula Resultado;
		System.out.println("El resultado de la caja para con:");
		System.out.println("un ancho de "+ancho);
		System.out.println("un alto de "+alto);
		System.out.println("y un profundo de "+profundo);
		System.out.println("El Resultado es "+c.formula());
		
		
		//creamos otras variables 
		System.out.println("\nCalculo con datos introducidos por usuario");
		System.out.println("\nIntroduce Datos nuevos:");
		int ancho1;
		int alto1;
		int profundo1;
		
		//el usuario intruduzca datos por pantalla
		System.out.println("Introduce el ancho:");
		Scanner entradaEscaner = new Scanner(System.in); //creacion elemento escaner para leer datos
		ancho1 = entradaEscaner.nextInt(); //leemos el valor proporcionado por el usario
		System.out.println("Introduce el alto:");
		Scanner entradaEscaner1 = new Scanner(System.in); //creacion elemento escaner para leer datos
		alto1 = entradaEscaner1.nextInt(); //leemos el valor proporcionado por el usario
		System.out.println("Introduce la profundidad:");		
		Scanner entradaEscaner2 = new Scanner(System.in); //creacion elemento escaner para leer datos
		profundo1 = entradaEscaner2.nextInt(); //leemos el valor proporcionado por el usario
		
		//creamos objeto
		Caja c1 = new Caja(ancho1,alto1,profundo1);
		
		//formula Resultado;
		System.out.println("El resultado de la caja para con:");
		System.out.println("un ancho de "+ancho1);
		System.out.println("un alto de "+alto1);
		System.out.println("y un profundo de "+profundo1);
		System.out.println("El Resultado es "+c1.formula());
		
		
	}

}
