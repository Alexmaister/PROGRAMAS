package Ejercicios;

import java.util.*;

/*
 * ANALISIS:
 * Programa para calcular el �rea lateral, total y el volumen del cilindro cuyos datos se leen por teclado.
 * 
 * REQUISITOS:
 * Calcular el area lateral total y volumen de un cilindro
 * 
 * ENTRADAS:
 * Radio y altura del cilindro
 * 
 * SALIDAS:
 * Se mostrara por pantalla el area lateral , total y el volumen del cilindro
 * 
 * PRECONDICIONES:
 * El radio y la altura pueden ser enteros o reales
 * 
 * POSTCONDICIONES
 * Se mostraran en pantalla los resultados
 * 
 * RESTRICCIONES:
 * Ninguna
 * 
 * SUPOSICIONES:
 * Supondremos que los datos introducidos seran numeros
 * 
 * */

public class CilindroAreaVolumen {
	
	public static void main (String[]args){
		
		//declaracion de constantes
		final double PI=3.14;
		//declaracion de variables
		double radio=0.0;
		double altura=0.0;
		double areaTotal=0.0;
		double areaLateral=0.0;
		double volumen=0.0;
		
		//abrimos flujo de teclado
		Scanner teclado=new Scanner(System.in);
		
		//mostrar mensaje del radio
		System.out.println("Introduzca el area del cilindro:");
		
		//leemos radio de teclado
		radio=teclado.nextDouble();
		
		//eco de del radio
		System.out.println("El radio del cilindro es :"+radio);
		
		//mostramos mensaje de la altura
		System.out.println("Introducza la altura del cilindro :");
		
		//leemos altura de teclado
		altura=teclado.nextDouble();
		
		//eco de la altura
		System.out.println("La altura del cilindro es:"+altura);
		
		//calculamos el areaLateral
		areaLateral=(2+PI+radio)*altura;		
		
		//mostramos resultado de areaTotal
		System.out.println("El area lateral del cilindro de radio: "+radio+" y altura: "+altura+" es: "+areaLateral);
		//calculamos el area total
		areaTotal=(2*(2*PI*(radio*radio)))+areaLateral;
		
		//mostramos resultado de areaTotal
		System.out.println("El area total del cilindro de radio: "+radio+" y altura: "+altura+" es: "+areaTotal);
		
		//calculamos el volumen
		volumen=2*PI*(radio*radio)*altura;
		
		//mostramos resultado del volumen
		System.out.println("El volumen del cilindro de radio: "+radio+" y altura: "+altura+" es: "+volumen);
		
	}

}