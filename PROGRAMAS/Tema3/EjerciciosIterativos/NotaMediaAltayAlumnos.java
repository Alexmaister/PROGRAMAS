package EjerciciosIterativos;

import java.util.Scanner;

/*ANALISIS:
 * Programa que leera de teclado todas las notas de los examenes de una clase
 * hasta que una de esta sea negativa, y se calculara la nota media ,
 * la mas alta , la mas baja y el numero de alumnos del curso
 * 
 * BUCLES:
 * (1)(2)VALIDAR ENTRADA (WHILE)
 * VCB: CENTINELA 
 * VALORES DEL CENTINELA: S O N
 * LECTURA ANTICIPADA ANTES DE ENTRAR EN EL BUCLE
 * ACTUALIZACION AL FINAL DE LA PRIMERA ITERACCION pior lectura final
 * CONDICION DE SALIDA: QUE EL CENTINELA SEA IGUAL A S O N
 * 
 * (3)VALIDAR DATO (WHILE)
 * VCB:CENTINELA
 * VALORES DEL CENTINELA DE -1 A 10
 * LECTURA ANTICIPADA ANTES DE LA PRIMERA ITERACCION
 * ACTUALIZACION AL FINAL DE LA PRIMERA ITERACCION por lectura final
 * CONDICION DE SALIDA: QUE EL NUMERO ESTE ENTRE LOS DATOS DEL CENTINELA(>=-1 Y <=10)
 * 
 * (4)MIENTRAS DATO NO SEA SALIR(WHILE)
 * VCB:CENTINELA VALOR -1
 * LECTURA ANTICIPADA ANTES DE LA PRIMERA ITERACCION
 * ACTUALIZACION ANTES DE LA SEGUNDA ITERACCION POR LECTURA INICIAL
 * CONDICION DE SALIDA: DATO =-1
 * 
 * REQUISITOS:
 * hacer media de todas las notas
 * contar alumnos 
 * Calcular nota mas alta y nota mas baja
 * 
 * ENTRADAS:
 * Se introduciran tanto datos como el usuario quiera hasta que este introduzca
 * un numero menor que cero
 * 
 * SALIDAS:
 * Se mostrara por pantalla la media de todas las notas, el numero de alumnos
 * la nota mas baja de todas y la mas alta
 * 
 * RESTRICCIONES:
 * Las notas validas estaran en el rango de 0 a 10
 * La nota -1 servira para salir
 * 
 * SUPOSICIONES:
 * Ninguna
 * */

/*PSEUDOCODIGO GENERALIZADO:
 * 
 * INICIO
 * PREGUNTAR Y VALIDAR EJECUTAR (1)
 * 	MIENTRAS EJECUTAR SEA SI	(2)	
 * 		LEER Y VALIDAR DATO		(3)
 * 		MIENTRAS DATO NO  SEA SALIR	(4)
 * 			CALCULAR NOTAS
 * 			LEER Y VALIDAR DATO (3)
 * 		FIN MIENTRAS
 * 		
 * 		MOSTRAR RESULTADOS
 * 		ACTUALIZAR Y VALIDAR EJECUTAR (1)
 * 	FIN MIENTRAS
 * FIN
 */

/*PSEUDOCODIGO DETALLADO:
 * 
 * INICIO
 * 
 * 	PREGUNTAR EJECUTAR PROGRAMA
 * 	LEER EJECUTAR
 * 	MIENTRAS (EJECUTAR SEA DIFERENTE A SI O A NO)
 *		MENSAJE1
 *		PREGUNTAR EJECUTAR PROGRAMA 
 *		LEER EJECUTAR
 *	FIN MIENTRAS
 *
 * MIENTRAS (EJECUTAR ES IGUAL A SI)
 * 		MENSAJE 2
 * 		LEER DATO
 * 		MIENTRAS (DATO SEA MENOR QUE -1 O MAYOR QUE 10)
 * 			MENSAJE 3
 * 			MENSAJE 2
 * 			LEER DATO
 * 		FIN MIENTRAS
 * 		MIENTRAS (DATO SEA DIFERENTE A -1)
 * 			COMPROBAR NOTA MENOR
 * 			COMPROBAR NOTA MAYOR
 * 			SUMAR DATO
 * 			CONTADOR MAS 1
 * 			MENSAJE 2
 * 			LEER  DATO
 * 			MIENTRAS (DATO SEA MENOR QUE -1 O MAYOR QUE 10)
 * 				MENSAJE 3
 * 				MENSAJE 2
 * 				LEER DATO
 * 			FIN MIENTRAS
 * 		FIN MIENTRAS
 * 		
 * 		MOSTRAR NOTA MENOR
 * 		MOSTRAR NOTA MAYOR
 * 		MOSTRAR MEDIA
 * 		MOSTRAR CONTADOR
 * 
 * 		PREGUNTAR EJECUTAR PROGRAMA
 * 		LEER EJECUTAR
 * 		MIENTRAS (EJECUTAR SEA DIFERENTE A SI O A NO)
 *			MENSAJE1
 *			PREGUNTAR EJECUTAR PROGRAMA 
 *			LEER EJECUTAR
 *		FIN MIENTRAS
 * 
 * FIN MIENTRAS
 * 		
 * FIN
 * */

public class NotaMediaAltayAlumnos {

	
	public static void main(String[]args){
	 
		double nota=0,notaAlta=0, notaBaja=10/*inicializo a 10, porque si es a 0 ninguna nota sera mas baja*/,sumadorNota=0, media=0;
		int alumnos=0;
		char ejecutar;
		Scanner teclado=new Scanner(System.in);
		// PREGUNTAR Y VALIDAR EJECUTAR (1)
		
		System.out.println("¿Desea ejecutar el programa?");
		ejecutar=Character.toUpperCase(teclado.next().charAt(0));
		
		while(ejecutar!='N' && ejecutar!='S' ){
			System.out.println("Introduzca 'S' o 'N'");
			System.out.println("¿Desea ejecutar el programa?");
			ejecutar=Character.toUpperCase(teclado.next().charAt(0));
		}
	  //	MIENTRAS EJECUTAR SEA SI	(2)	
		while(ejecutar=='S'){
	  //		LEER Y VALIDAR DATO		(3)
			System.out.println("Introduzca una nota (utilize -1 para salir)");
			nota=teclado.nextDouble();
			while(nota<-1 || nota>10){
				
				System.out.println("La nota no es correcta el rango es de 0 a 10 ");
				System.out.println("Introduzca una nota (utilize -1 para salir)");
				nota=teclado.nextDouble();
				
			}
	  //		MIENTRAS DATO NO  SEA SALIR	(4)
			while(nota!=-1){
	  
	  //			CALCULAR NOTAS
				if(nota!=-1){
					
					if(nota>notaAlta)
						notaAlta=nota;
					if(nota<notaBaja)
						notaBaja=nota;
					alumnos++;
					sumadorNota+=nota;
					media=(double)sumadorNota/alumnos;
				}
			
//			LEER Y VALIDAR DATOS
				System.out.println("Introduzca una nota (utilize -1 para salir)");
				nota=teclado.nextDouble();
				while(nota<-1 || nota>10){
					
					System.out.println("La nota no es correcta el rango es de 0 a 10 ");
					System.out.println("Introduzca una nota (utilize -1 para salir)");
					nota=teclado.nextDouble();
					
				}
			}
	  		
	  // 	MOSTRAR RESULTADOS
			System.out.println("El numero de alumnos es: "+alumnos);
			System.out.println("La nota mas alta es: "+notaAlta);
			System.out.println("La nota mas baja es: "+notaBaja);
			System.out.println("La media de todas las notas es: "+media);
			
			
	  //	ACTUALIZAR Y VALIDAR EJECUTAR (1)
			System.out.println("¿Desea ejecutar el programa?");
			ejecutar=Character.toUpperCase(teclado.next().charAt(0));
			
			while(ejecutar!='N' && ejecutar!='S' ){
				System.out.println("Introduzca 'S' o 'N'");
				System.out.println("¿Desea ejecutar el programa?");
				ejecutar=Character.toUpperCase(teclado.next().charAt(0));
			}//FIN VALIDAR
		}	//	FIN MIENTRAS
	  
		teclado.close();
	}//FIN
	
}//FIN DE LA CLASE
