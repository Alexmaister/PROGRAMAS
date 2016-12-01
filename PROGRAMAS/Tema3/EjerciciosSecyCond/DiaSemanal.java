package EjerciciosSecyCond;
import java.util.*;
/*
 * ANALISIS:
 * 
 * DESCRIPCION:Programa que leera un numero del 1 al 7 por teclado
 * y mostrara el dia de la semana con el que corresponda
 * 
 * REQUISITOS:Detectar el dia de la semana segun el numero introducido
 * 
 * ENTRADAS:NUmero del 1 al 7
 * 
 * SALIDAS:Mostrara por pantalla el dia correspondiente segun el numero leido
 * 
 * RESTRICCIONES:EL numero debe estar entre 1 y 7
 * 
 * SUPOSICIONES:Suponemos que el dato introducido es un numero entero
 * 
 * */
/*
 * PSEUDOCODIGO:
 * 
 * INICIO.
 * 
 * 	MOSTRAR MENSAJE
 * 	LEER DATOS 
 * 	ECO DE LOS DATOS
 * 	
 * 		SI NUMERO >0
 * 			
 * 			SI NUMERO==1
 * 				MOSTRAR LUNES
 * 			SINO SI NUMERO==2
 * 				MOSTRAR MARTES
 * 			SINO SI NUMERO==3
 * 				MOSTRAR MIERCOLES
 * 			SINO SI NUMERO==4
 * 				MOSTRAR JUEVES
 * 			SINO SI NUMERO==5
 * 				MOSTRAR VIERNES
 * 			SINO SI NUMERO==6
 * 				MOSTRAR SABADO
 * 			SINO
 * 				MOSTRAR DOMINGO
 * 		SINO 
 * 			MOSTRAR MENSAJE
 * 
 * FIN
 * 
 * 
 * */
public class DiaSemanal {
	
	public static void main(String[]args){
		
		int numero=0;
		
		Scanner teclado=new Scanner(System.in);																																																																										
		
		System.out.println("Introduzca el numero de la semana deseado");
		numero=teclado.nextInt();
		
		System.out.println("El numero introducido es :"+numero);
		
		if(numero>0 && numero<8){
			
			if(numero==1){
				
				System.out.println("Y el dia de la semana es: Lunes");
				
			}else if(numero==2){
				
				System.out.println("Y el dia de la semana es: Martes");
				
			}else if(numero==3){
				
				System.out.println("Y el dia de la semana es: Miercoles");
				
			}else if(numero==4){
				
				System.out.println("Y el dia de la semana es: Jueves");
				
			}else if(numero==5){
				
				System.out.println("Y el dia de la semana es: Viernes");
			
			}else if(numero==6){
				
				System.out.println("Y el dia de la semana es: Sabado");
				
			}else {
				
				System.out.println("Y el dia de la semana es: Domingo");
				
			}
			
			
		}else{
			
			System.out.println("El numero: "+numero+" no coincide con ningun dia de la semana");
		
		}
		teclado.close();
	}

}
