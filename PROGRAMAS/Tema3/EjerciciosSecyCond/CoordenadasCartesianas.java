package EjerciciosSecyCond;
import java.util.*;
/*ANALISIS:
 * Programa que leera de teclado las coordenadas cartesianas (x,y,z)
 * y nos dira en que octante se encuentra el punto descrito por las coordenadas
 * 
 * REQUISITOS:
 * Determinar un octante con tres coordenadas dadas
 * 
 * ENTRADAS:
 * Coordenadas (x , y , z)
 * 
 * SALIDAS:
 * Se mostrara por pantalla el octante al que pertenece el punto
 * 
 * RESTRICCIONES:
 * Ninguna
 * 
 * SUPOSICIONES:
 * Ninguna
 * */

/*PSEUDOCODIGO:
 * 
 * INICIO
 * 
 * 	LEER DATOS 
 * 	ECO DE LOS DATOS DE ENTRADA
 * 
 * 	SI(X=0 && Y=0 && Z=0)
 * 		MOSTRAR MENSAJE
 * 
 * 	SINO SI(X!=0 && Y=0 && Z=0)
 * 
 * 		SI(X>0)
 * 			MOSTRAR MENSAJE
 * 		SINO
 * 			MOSTRAR MENSAJE
 * 		FIN SINO
 * 
 * SINO SI(X=0 && Y!=0 && Z=0)
 * 
 * 		SI(Y>0)
 * 			MOSTRAR MENSAJE
 * 		SINO
 * 			MOSTRAR MENSAJE
 * 		FIN SINO
 * 
 * SINO SI(X=0 && Y=0 && Z!=0)
 * 
 * 		SI(Z>0)
 * 			MOSTRAR MENSAJE
 * 		SINO
 * 			MOSTRAR MENSAJE
 * 		FIN SINO
 * 
 * SINO SI(X=0 && Y!=0 && Z!=0)
 * 
 * 		SI(Y>0 && Z>0)
 * 			MOSTRAR MENSAJE
 * 
 * 		SINO SI (Y<0 && Z<0)
 * 			MOSTRAR MENSAJE
 * 
 * 		SINO SI (Y>0 && Z<0)
 * 			MOSTRAR MENSAJE
 * 
 * 		SINO
 * 			MOSTRAR MENSAJE
 * 		FIN SINO
 * 
 * SINO SI(X!=0 && Y!=0 && Z=0)
 * 
 * 		SI(X>0 && Y>0)
 * 			MOSTRAR MENSAJE
 * 
 * 		SINO SI (X<0 && Y<0)
 * 			MOSTRAR MENSAJE
 * 
 * 		SINO SI (X>0 && Y<0)
 * 			MOSTRAR MENSAJE
 * 
 * 		SINO
 * 			MOSTRAR MENSAJE
 * 		FIN SINO
 * 
 * SINO SI(X!=0 && Y=0 && Z!=0)
 * 
 * 		SI(X>0 && Z>0)
 * 			MOSTRAR MENSAJE
 * 
 * 		SINO SI (X<0 && Z<0)
 * 			MOSTRAR MENSAJE
 * 
 * 		SINO SI (X>0 && Z<0)
 * 			MOSTRAR MENSAJE
 * 
 * 		SINO
 * 			MOSTRAR MENSAJE
 * 		FIN SINO
 * 
 * SINO SI(X!=0 && Y!=0 && Z!=0)
 * 		
 * 		SI(X>0 && Y>0 && Z>0)	
 * 			MOSTRAR MENSAJE
 * 		
 * 		SINO SI (X<0 && Y<0 && Z<0)
 * 			MOSTRAR MENSAJE
 * 		
 * 		SINO SI(X>0)
 * 			SI (Y>0 && Z<0)
 *				MOSTRAR MENSAJE
 *
 * 			SINO SI(Y<0 && Z>0)
 * 				MOSTRAR MENSAJE
 * 			
 * 			FIN SINO
 * 
 * 		SINO SI(X<0)
 * 			SI (Y>0 && Z<0)
 *				MOSTRAR MENSAJE
 *
 * 			SINO SI(Y<0 && Z>0)
 * 				MOSTRAR MENSAJE
 * 			
 * 			FIN SINO
 * 
 * 		SINO SI(Y>0)
 * 			SI (X>0 && Z<0)
 *				MOSTRAR MENSAJE
 *
 * 			SINO SI(X<0 && Z>0)
 * 				MOSTRAR MENSAJE
 * 			
 * 			FIN SINO
 * 
 * 		SINO SI(Y<0)
 * 			SI (X>0 && Z<0)
 *				MOSTRAR MENSAJE
 *
 * 			SINO SI(X<0 && Z>0)
 * 				MOSTRAR MENSAJE
 * 			
 * 			FIN SINO
 * 
 * 		SINO SI(Z>0)
 * 			SI (X>0 && Y<0)
 *				MOSTRAR MENSAJE
 *
 * 			SINO SI(X<0 && Y>0)
 * 				MOSTRAR MENSAJE
 * 			
 * 			FIN SINO
 * 
 * 		FIN SINO
 * 
 * 	FIN SINO
 * 
 * FIN
 * */
public class CoordenadasCartesianas {
	
	public static void main(String[]args){
		
		//declaracion de variables
		double coordenadaX=0;
		double coordenadaY=0;
		double coordenadaZ=0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("INTRODUZCA LAS COORDENADAS DEL PUNTO");
		System.out.print("X: ");
		
		//leer datos
		coordenadaX= teclado.nextDouble();
		
		System.out.print("\nY: ");
		coordenadaY= teclado.nextDouble();
		
		System.out.print("\nZ: ");
		coordenadaZ= teclado.nextDouble();
		
		//eco de los datos de entrada
		System.out.println("EL PUNTO INTRODUCIDO ES : ("+coordenadaX+","+coordenadaY+","+coordenadaZ+")");
		
		
		 // SI(X=0 && Y=0 && Z=0)
		 // 		MOSTRAR MENSAJE
		 if(coordenadaX==0 && coordenadaY==0 && coordenadaZ==0){
			 
			 		System.out.println("El punto coincide con el origen de coordenadas");
		
         //	SINO SI(X!=0 && Y=0 && Z=0)
		 }else if(coordenadaX!=0 && coordenadaY==0 && coordenadaZ==0){
			 
         //		 	SI(X>0)	 
			 		if(coordenadaX>0)
		 //			 		MOSTRAR MENSAJE	 			
			 				System.out.println("El punto se encuentra sobre la parte positiva del eje X");
		//			SINO	 		
			 		else
		//		 			MOSTRAR MENSAJE
			 				System.out.println("El punto se encuentra sobre la parte negativa del eje X");
			
	 	// SINO SI(X=0 && Y!=0 && Z=0)	 		
		 }else if(coordenadaX==0 && coordenadaY!=0 && coordenadaZ==0){
			 
		//		 	SI(Y>0)
			 		if(coordenadaY>0)
		// 					MOSTRAR MENSAJE			
			 				System.out.println("El punto se encuentra sobre la parte positiva del eje Y");
		//	 		SINO
			 		else
		//			 		MOSTRAR MENSAJE	 			
			 				System.out.println("El punto se encuentra sobre la parte negativa del eje Y");
			 		
		// SINO SI(X=0 && Y=0 && Z!=0)	 		
		 }else if(coordenadaX==0 && coordenadaY==0 && coordenadaZ!=0){
		//			SI(Z>0)
			 		if(coordenadaZ>0)
		// 					MOSTRAR MENSAJE
			 				System.out.println("El punto se encuentra sobre la parte positiva del eje Z");
		// 		SINO
			 		else
		// 					MOSTRAR MENSAJE	 
			 				System.out.println("El punto se encuentra sobre la parte negativa del eje Z");
			 
		// SINO SI(X=0 && Y!=0 && Z!=0)	 
		 }else if(coordenadaX==0 && coordenadaY!=0 && coordenadaZ!=0){
		//		 	SI(Y>0 && Z>0)
			 		if(coordenadaY>0 && coordenadaZ>0)
		// 					MOSTRAR MENSAJE
			 				System.out.println("El punto se encuentra en el plano que divide el primer y segundo octante");
		// 			SINO SI (Y<0 && Z<0)
			 		else if(coordenadaY<0 && coordenadaZ<0)
		// 					MOSTRAR MENSAJE
			 				System.out.println("El punto se encuentra en el plano que divide el septimo y octavo octante");
		// 			SINO SI (Y>0 && Z<0)
			 		else if(coordenadaY>0 && coordenadaZ<0)
		// 					MOSTRAR MENSAJE
			 				System.out.println("El punto se encuentra en el plano que divide el quinto y sexto octante");
		// 			SINO
			 		else
		// 					MOSTRAR MENSAJE	 
			 				System.out.println("El punto se encuentra en el plano que divide el tercero y cuarto octante");
			 		
		// SINO SI(X!=0 && Y!=0 && Z=0)	 		
		 }else if(coordenadaX!=0 && coordenadaY!=0 && coordenadaZ==0){
			 
		//		 	SI(X>0 && Y>0)
			 		if(coordenadaX>0 && coordenadaY>0)
		// 					MOSTRAR MENSAJE
			 				System.out.println("El punto se encuentra en el plano que divide el primero y quinto octante");
		// 			SINO SI (X<0 && Y<0)
			 		else if(coordenadaX<0 && coordenadaY<0)
		// 					MOSTRAR MENSAJE
			 				System.out.println("El punto se encuentra en el plano que divide el tercero y septimo octante");
		// 			SINO SI (X>0 && Y<0)
			 		else if(coordenadaX>0 && coordenadaY<0)
		// 					MOSTRAR MENSAJE
			 				System.out.println("El punto se encuentra en el plano que divide el cuarto y octavo octante");
		// 			SINO
			 		else
		// 					MOSTRAR MENSAJE	 
			 				System.out.println("El punto se encuentra en el plano que divide el segundo y sexto octante");
			 
		// SINO SI(X!=0 && Y=0 && Z!=0)	 		
		 }else if(coordenadaX!=0 && coordenadaY==0 && coordenadaZ!=0){
		// 			SI(X>0 && Z>0)
			 		if(coordenadaX>0 && coordenadaZ>0)
		 // 				MOSTRAR MENSAJE
			 				System.out.println("El punto se encuentra en el plano que divide el primero y cuarto octante");
		 // 		SINO SI (X<0 && Z<0)
			 		else if(coordenadaX<0 && coordenadaZ<0)
		 // 				MOSTRAR MENSAJE
			 				System.out.println("El punto se encuentra en el plano que divide el sexto y septimo octante");
		 //			SINO SI (X>0 && Z<0)
			 		else if(coordenadaX>0 && coordenadaZ<0)
		 // 				MOSTRAR MENSAJE
			 				System.out.println("El punto se encuentra en el plano que divide el quinto y octavo octante");
		 // 		SINO
			 		else
		 // 				MOSTRAR MENSAJE
			 				System.out.println("El punto se encuentra en el plano que divide el segundo y tercer octante");
	
		 // SINO SI(X!=0 && Y!=0 && Z!=0) 		
		 }else if(coordenadaX!=0 && coordenadaY!=0 && coordenadaZ!=0){
		
		//		 	SI(X>0 && Y>0 && Z>0)
			 		if(coordenadaX>0 && coordenadaY>0 && coordenadaZ>0)
		// 					MOSTRAR MENSAJE
			 				System.out.println("El punto se encuentra en el primer octante");
		// 			SINO SI (X<0 && Y<0 && Z<0)
			 		else if(coordenadaX<0 && coordenadaY<0 && coordenadaZ<0)
		// 					MOSTRAR MENSAJE 
			 				System.out.println("El punto se encuentra en el septimo octante");
			 		
		//	 		SINO
			 		else{
			 			
		//			 		SI (X>0 && Y>0 && Z<0)
			 				if(coordenadaX>0 && coordenadaY>0 && coordenadaZ<0)
		//							MOSTRAR MENSAJE
			 						System.out.println("El punto se encuentra en el quinto octante");
		// 					SINO SI(X>0 && Y<0 && Z<0)
			 				else if(coordenadaX>0 && coordenadaY<0 && coordenadaZ<0)
		// 							MOSTRAR MENSAJE
			 						System.out.println("El punto se encuentra en el octavo octante");
		//	 				SINO SI(X>0 && Y<0 && Z>0)
			 				else if(coordenadaX>0 && coordenadaY>0 && coordenadaZ<0)
		//	 						MOSTRAR MENSAJE
			 						System.out.println("El punto se encuentra en el cuarto octante");
		//	 				SINO SI(X<0 && Y>0 && Z>0)
			 				else if(coordenadaX<0 && coordenadaY>0 && coordenadaZ>0)
		//	 						MOSTRAR MENSAJE
			 						System.out.println("El punto se encuentra en el segundo octante");
		//	 				SINO SI(X<0 && Y<0 && Z>0)
			 				else if(coordenadaX<0 && coordenadaY<0 && coordenadaZ>0)
		//	 						MOSTRAR MENSAJE
			 						System.out.println("El punto se encuentra en el tercer octante");
		//	 				SINO SI(X<0 && Y>0 && Z<0)
			 				else if(coordenadaX<0 && coordenadaY>0 && coordenadaZ<0)
		//	 						MOSTRAR MENSAJE
			 						System.out.println("El punto se encuentra en el sexto octante");
			 		}//FIN SINO
			 		
		 }//FIN SINO
		 
				teclado.close();
				
	}//FIN

}//FIN CLASE
