package Ejercicios;
/*ANALISIS:
	 *     * Programa que hallara el valor absoluto de un numero
	 * 
	 * Requisitos:
	 *     * Calcular valor absoluto
	 * 
	 * Entradas
	 *     * Numero del cual se calculara su valor absoluto
	 * 
	 * Salidas:
	 *     * Se mostraran por pantalla el resultado del valor absoluto
	 * 
	 * Precondiciones:
	 *     * Los datos introducidos deben ser numeros enteros o reales(si son reales deben estar escritos con ",")
	 * 
	 * Postcondiciones:
	 *     * El resultado sera un numero real
	 *    
	 * Restrincciones: 
	 *     * Ninguna
	 *     
	 * Suposiciones: 
	 *     * Ninguna
 * 
 * PSEUDOCODIGO GENERALIZADO:
 * 
 * INICIO
 * 	
 * 	ESCRIBIR MENSAJE
 * 	LEER NUMERO
 *  ESCRIBIR ECO DEL DATO DE ENTRADA
 * 	
 * 	SI NUMERO <0
 * 		HALLAR VALOR ABSOLUTO NUMERO NEGATIVO
 * 		MOSTRAR RESULTADO
 * 
 * 	SINO SI NUMERO >0
 * 		HALLAR VALOR ABSOLUTO NUMERO POSITIVO
 * 		MOSTRAR RESULTADO
 * 
 *  SINO SI NUMERO =0
 *  	MOSTRAR VALOR ABSOLUTO DE 0
 * 
 * 	FIN SI
 * 
 * FIN
 * 
 * */
 
import java.util.*;
 
public class ValorAbsoluto{
	
	public static void main(String[]args){
		
		//abrimos flujo del teclado
		Scanner teclado=new Scanner(System.in);
		
		//creamos variables
		double numero=0;
		double absoluto=0;
		
		//mostramos mensaje
		System.out.println("Inrtroduzca el numero del cual quiera saber su valor absoluto :");
		
		//leemos de teclado
		numero=teclado.nextDouble();
		
		//eco del dato de entrada
		System.out.println("|"+numero+"|");
		
		
		if(numero<0){
			//calculo del valor absoluto numero negativo
			absoluto=-(numero*numero)/numero;
		
			//mostramos resultado
			System.out.println("|"+numero+"| ="+absoluto);
		
		}else if(numero>0){
			//calculo del valor absoluto numero positivo
			absoluto=(numero*numero)/numero;
		
			//mostramos resultado
			System.out.println("|"+numero+"| ="+absoluto);
			
		}else if(numero==0){
			
			//mostramos resultado valor absoluto de 0
			System.out.println("|"+numero+"| ="+numero);
			
		}//fin si
		
	}//fin main
	
}//fin de clase


