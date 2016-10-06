package EjerciciosSecyCond;

import java.util.*;

/*
 * ANALISIS:
 * Programa para calcular el área lateral, total y el volumen del cilindro cuyos datos se leen por teclado.
 * 
 * REQUISITOS:
 * Calcular el area lateral total y volumen de un cilindro
 * 
 * ENTRADAS:
 * Radio y altura del cilindro
 * 
 * RESTRICCIONES:
 * Ninguna
 * 
 * SUPOSICIONES:
 * Supondremos q los numeros decimales se separaran con comas
 * 
 * */
/*
 * PSEUDOCODIGO:
 * 
 * INICIO
 * 	
 * 	MOSTRAR MENSAJE
 * 	LEER DATO
 * 	ECO DE LOS DATOS
 * 	CALCULAR AREA LATERAL
 * 	MOSTRAR RESULTADO
 * 	CALCULAR AREA TOTAL
 * 	MOSTRAR RESULTADO
 * 	CALCULAR VOLUMEN
 * 	MOSTRAR RESULTADO
 * 	
 * FIN
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
		areaLateral=(2*PI*radio)*altura;		
		
		//mostramos resultado de areaTotal
		System.out.println("El area lateral del cilindro de radio: "+radio+" y altura: "+altura+" es: "+areaLateral);
		//calculamos el area total
		areaTotal=(2*PI*(radio*radio))+areaLateral;
		
		//mostramos resultado de areaTotal
		System.out.println("El area total del cilindro de radio: "+radio+" y altura: "+altura+" es: "+areaTotal);
		
		//calculamos el volumen
		volumen=PI*(radio*radio)*altura;
		
		//mostramos resultado del volumen
		System.out.println("El volumen del cilindro de radio: "+radio+" y altura: "+altura+" es: "+volumen);
		
	}

}
