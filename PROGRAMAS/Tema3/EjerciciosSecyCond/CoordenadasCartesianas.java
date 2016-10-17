package EjerciciosSecyCond;
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
 * 
 * FIN
 * */
public class CoordenadasCartesianas {

}
