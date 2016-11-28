package Subprogramas;

import java.util.*;

/*ANALISIS
 * DESCRIPCION: PROGRAMA QUE PEDIRA DOS NUMEROS AL USUARIO Y MOSTRARA 
 * EL VALOR DEL COMBINATORIO DE AMBOS
 * 
 * REQUISITOS:
 * CALCULAR EL FACTORIAL DE UN NUMERO
 * CALCULAR EL COMBINATRORIO DE DOS NUMEROS
 * 
 * ENTRADAS: SE INTRODUCIRA POR TECLADO DOS NUMEROS ENTEROS, Y LA OPCION REPETIR
 * SALIDAS: SE MOSTRARA POR PANTALLA EL RESULTADO DEL COMBINATORIO DE LOS DOS NUMEROS INTRODUCIDOS
 * 
 * RESTRICCIONES:
 * LOS NUMEROS INTRODUCIDOS SERAN ENTEROS ENTRE 1 Y 10
 * SUPOSICIONES:NINGUNA
 */

/*PSEUDICODIGO:
 * INICIO
 * 
 * 	HACER
 * 		MOSTRAR MENSAJE
 * 		LEER DATOS
 * 		CALCULAR COMBINATORIO
 * 		MOSTRAR RESULTADO
 * 		LEER REPETIR
 * 	MIENTRAS(REPETIR IGUAL A SI)
 * FIN
 */
public class NumeroCombinatorio {
	
	public static void main(){
		char repetir=' ';
		int numero1=0, numero2=0;
		double resultado=0;
		
		Scanner teclado= new Scanner(System.in);
		do{
			System.out.println("Introduzca el primer numero del combinatorio");
			numero1=teclado.nextInt();
			System.out.println("Introduzca el segundo numero del combinatorio");
			numero2=teclado.nextInt();
			
			resultado=calcularFactorial(numero1);
			
		}while(repetir=='S');
		
		teclado.close();
	}

/*CABEZERA: double calcularFactorial(int numero)
 * 
 * DESCRIPCION:Funcion que calculara el factorial de un numero
 * 
 * PRECONDICIONES:Ninguna(SE ENCARGA EL SUBPROGRAMA)
 * 
 * ENTRADAS: Numero (entero) 
 * 
 * SALIDAS:Resultado(real)
 * 
 * POSTCONDICIONES:Se devolvera el resultado (numnro real) asociado al nombre 
 * o 0 si el numero no es un entero entre 1 y 10
 */

	
	public static double calcularFactorial(int numero){

		System.out.println("En construccion....");
		
		return 0;
	}
	

}
