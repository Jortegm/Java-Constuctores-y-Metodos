package Caja;

public class Caja {
//Calcular el ancho, alto y profundo de una caja
//crear variables, contructores 
//crear una formula para calcular el volumen de la caja
	int ancho;
	int alto;
	int profundo;
	
	//constructor vacio
	Caja(){}
	
	//constructor con atributos
	Caja(int arg1, int arg2, int arg3){
		this.ancho = arg1;
		this.alto = arg2;
		this.profundo = arg3;
	}
	
	/**
	 * formula para calcular el volumen de la caja
	 * @return volumen
	 */
	int formula() {
		return ancho * alto * profundo;
	}
}
