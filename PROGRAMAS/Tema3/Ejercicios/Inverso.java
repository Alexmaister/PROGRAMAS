package Ejercicios;
import java.util.*;
/*Realiza un algoritmo que lea un dato de teclado y
 *  calcule e imprima su inverso.
 *   Considere el caso especial del valor 0 mostrando
 *    el mensaje de error correspondiente.*/

/*ANALISIS:
 * 
 * DESCRIPCION:
 * Programa que leera un numero de teclado, calculara su inverso y
 *  lo mostrara por pantalla
 * 
 * REQUISITOS:
 * Calcular inverso
 * 
 * ENTRADAS:
 * Numero para calcular inverso
 * 
 * SALIDAS:
 * Mostrara el resultado por pantalla
 * 
 * RESTRICCIONES:
 * Ninguna
 * 
 * SUPOSICIONES:
 * Supondremos que el dato introducido sera un numero real
 * 
 * */

/*
 *PSEUDOCODIGO
 *
 * INICIO
 * 
 * 	MOSTRAR MESAJE
 * 	LEER DATO
 * 	ECO DEL DATO DE ENTRADA
 * 
 * 	SI NUMERO != 0
 *		CALCULAR INVERSO
 *		MOSTRAR RESULTADO
 *
 * 	SINO
 * 		MOSTRAR MENSAJE
 * 
 * 	FIN SINO
 *
 * 
 * FIN
 */

public class Inverso {
	
	public static void main(String[]args){
		
		double numero=0.0;
		double inverso=0.0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca el numero del cual quiera saber su inverso:");
		numero=teclado.nextDouble();
		
		System.out.println("El numero es :"+numero);
		
		if(numero!=0){
			
			inverso=(1/numero);
			System.out.println("El inverso de "+numero+" es : "+inverso);
			
		}else{
			
			System.out.println("El inverso de 0 es un numero indeterminado, que tiende a infinito");
		}
		
		teclado.close();
	}

}
