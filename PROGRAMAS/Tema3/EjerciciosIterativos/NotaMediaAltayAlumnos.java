package EjerciciosIterativos;

/*ANALISIS:
 * Programa que leera de teclado todas las notas de los examenes de una clase
 * hasta que una de esta sea negativa, y se calculara la nota media ,
 * la mas alta , la mas baja y el numero de alumnos del curso
 * 
 * BUCLES:
 * 
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
 * 			LEER DATOS 
 * 			CALCULAR NOTAS
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
 * 			LEER DATO
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

}
