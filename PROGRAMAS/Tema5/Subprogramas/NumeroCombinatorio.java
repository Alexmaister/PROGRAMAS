package Subprogramas;

import java.io.*;
import java.util.*;
import java.lang.*;


/*ANALISIS
 * DESCRIPCION: PROGRAMA QUE PEDIRA DOS NUMEROS AL USUARIO Y MOSTRARA 
 * EL VALOR DEL COMBINATORIO DE AMBOS
  
 * REQUISITOS:
 * CALCULAR EL FACTORIAL DE UN NUMERO
 * CALCULAR EL COMBINATRORIO DE DOS NUMEROS
  
 * ENTRADAS: SE INTRODUCIRA POR TECLADO DOS NUMEROS ENTEROS, Y LA OPCION REPETIR
 * SALIDAS: SE MOSTRARA POR PANTALLA EL RESULTADO DEL COMBINATORIO DE LOS DOS NUMEROS INTRODUCIDOS
  
 * RESTRICCIONES:
 * LOS NUMEROS INTRODUCIDOS SERAN ENTEROS ENTRE 1 Y 10
 * SUPOSICIONES:NINGUNA
 */

/*PSEUDICODIGO:
 * INICIO
  
 * 	HACER
 * 		MOSTRAR MENU LEER Y VALIDAR OPCION
 * 		SI(OPCION != SALIR)
 * 			SEGUN (OPCION)
 * 				CASO 1:
 * 					CALCULAR FACTORIAL
 * 				CASO 2:
 * 					CALCULAR COMBINATORIO
 * 			FIN SEGUN
 * 		FIN SI
 * 	MIENTRAS(OPCION != SALIR)
 * FIN
 */
public class NumeroCombinatorio {
	
	public static void main(String[]args){//Usamos un metodo en el programa que lanza excepcion IOException, por lo que hay que capturarla o lanzarla
		int opcion=0;
		int numero1=0, numero2=0;
		double resultado=0;
		
		Scanner teclado= new Scanner(System.in);
		do{
			
			opcion=menuOpcion();
			
			if(opcion!=0){
				
				switch(opcion){
				
				case 1:
					do{
						System.out.println("Introduzca un numero al que quiera calcular el factorial");
						numero1=teclado.nextInt();
					
						resultado=calcularFactorial(numero1);
						
						if(resultado==-1){
							System.out.println("No se puede calcular el numero del cual desea calcular el factorial");
							System.out.println("Por favor introduzca un numero entero entre 0 y 10");
						}
					}while(resultado==-1);
					
					System.out.println("El factorial de "+numero1+" es : "+resultado);
					break;
				
				case 2:
					do{
		
						System.out.println("Introduzca un numero de combinaciones:");
						numero1=teclado.nextInt();
						System.out.println("Introduzca el numero en que seran tomados:");
						numero2=teclado.nextInt();
							
						resultado=combinatorio(numero1,numero2);
						if(resultado==-1){
							System.out.println("No se puede calcular el combinatorio de esos dos numero");
							System.out.println("Por favor introduzca numeros enteros entre 0 y 10");
						}
					}while(resultado==-1);
					
					System.out.println("El combinatorio de "+numero1+" y "+numero2+" es: "+resultado);
					break;
				}
				
			}
		}while(opcion!=0);
		
		teclado.close();
	}

/*CABECERA: double calcularFactorial(int numero)
  
 * DESCRIPCION:Funcion que calculara el factorial de un numero
  
 * PRECONDICIONES:Ninguna(SE ENCARGA EL SUBPROGRAMA)
  
 * ENTRADAS: Numero (entero) 
  
 * SALIDAS:Resultado(entero)
 
 * POSTCONDICIONES:Se devolvera el resultado (entero) asociado al nombre 
 * o -1 si el numero no es un entero entre 0 y 10
 */

	//resguardo
	/*public static int calcularFactorial(int numero){

		System.out.println("En construccion....");
		
		return 0;
	}*/
	
	public static int calcularFactorial(int numero){
		int contador=0;
		int resultado=0;
		if(numero>=0 && numero<=10){
			resultado=numero;
		for(contador=1;contador<numero;contador++)
			
			resultado*=(numero-contador);
		}else
			resultado=-1;
		
		return resultado;
	}
/*CABECERA: double combinatorio (int numero1, int numero2)
 
 * DESCRIPCION: FUNCION QUE TOMARA DOS NUMEROS PARA CALCULAR SU COMBINATORIO , NECESITANDO 
 * LA DEVOLUCION DE LA FUNCION 'CALCULARFACTORIAL' Y DEVOLVERA UN RESULTADO
 
 * PRECONDICIONES:NINGUNA (SE ENCARGA EL SUBPROGRAMA) 
  
 * ENTRADAS: DOS NUMEROS ENTEROS , FACTORIAL DE CADA NUMERO ASOCIADOS AL NOMBRE
 * DE LA FUNCION CALCULARFACTORIAL
 
 * SALIDAS:UN NUMERO REAL
 
 * POSTCONDICIONES:SE DEVOLVERA UN REAL ASOCIADO AL NOMBRE O -1 EN CASO DE ERROR
 */

	//RESGUARDO
	/*public static double combinatorio(int numero1, int numero2){
		
		return 0.0;
	}*/
	
	public static double combinatorio(int numero1, int numero2){
		double resultado=0.0;
		
				resultado=((calcularFactorial(numero1))/((calcularFactorial(numero2))*(calcularFactorial(numero1-numero2))));
		return resultado;
	}
	
/*CABECERA: int menuOpcion()
  
 * DESCRIPCION: FUNCION QUE MOSTRARA UN MENU Y VALIDARA LA OPCION ELEGIDA POR EL USUARIO 
 * Y DEVOLRA LA OPCION
  
 * PRECONDICIONES:NINGUNA (SE ENCARGA EL SUBPROGRAMA)
  
 * ENTRADAS: NINGUNA
  
 * SALIDAS:LA OPCION ELEGIDA
  
 * POSTCONDICIONES: SE DEVOLVERA ASOCIADO AL NOMBRE LA OPCION ELEGIDA POR EL USUARIO
 * QUE SERA FACTORIAL, COMBINATORIO O SALIR
 * */
	
	//RESGUARDO
	/*public static int menuOpcion(){
		
		return 2;
	}*/
	
	public static int menuOpcion(){//capturamos excepcion, ya que en caso de error la Clase InputStreamReader lanza una excepcion
		
		int opcion=0;
		InputStreamReader corriente=new InputStreamReader(System.in);
		BufferedReader teclado= new BufferedReader(corriente);
		do{
			System.out.println("1--FACTORIAL");
			System.out.println("2--COMBINATORIO");
			System.out.println("0--SALIR");
			
			System.out.println("Elija una opcion: ");
			
			
				try
				{
					opcion=Integer.parseInt(teclado.readLine());//integer clase cobertura, funciona con cadenas, por eso leemos next line.
				}
				catch(NumberFormatException exception){
					
					System.out.println("Introduzca un numero");
					
				}
				catch(IOException io)
				{
					System.out.println("Error , Intentelo en otro momento");
				}
				
				
	
			if(opcion <0 || opcion>2)
				System.out.println("Introduzca una opcion valida");
		}while(opcion <0 || opcion>2);
		
		
		
		return opcion;
	}
}
