package Azar;
/*DESRIPCION :
 *	Diseña un algoritmo para simular el juego de ¿dónde está la bolita? (trile),
 *  famoso timo practicado por los llamados trileros .
 *  En nuestro caso el ordenador será un honrado trilero 
 *  que no engañará al usuario que juegue con él.*/


/*ANALISIS:
 * Programa que mostrara por pantalla la opcion de elegir entre tres cubiletes
 * el cual uno de ellos contrendra una bola, cada cubilete tendra la misma probabilidad 
 * de que la bola este en su interior y se mostrara el resultado en pantalla, tambien se tendra 
 * la oportunidad de apostar una cantidad de dinero que se doblara en caso de acierto y se podra elegir volver a jugar.
 * El trilero tendra en cuenta a cual cubilete se apuesta para intentar que el jugador no gane su apuesta
  
 * ENTRADAS:
 * opcion de menu
 * apuesta
 * cubilete elegido
 * opcionJugada
 
 * SALIDAS:
 * menu (por pantalla)
 * saldo	(por pantalla)
 * resultado del cubilete (por pantalla)
 
 * RESTRICCIONES:
 * La apuesta no podra ser mayor que el saldo
 * La opcion elegida debe estar en el menu
 * Solo se podra elegir entre 3 cubiletes , uno por tirada
 
 * SUPOSICIONES:
 * Ninguna
  
  */

/*ESTUDIO DE BUCLES:
 
 * <1>
 * TIPO:Controlado por centinela (do{}while())
 * VCB:Centinela
 * INICIALIZACION:Por lectura en la primera iteraccion
 * ACTUALIZACION:Por lectura en la segunda iteraccion, si procede (coincide fisicamente con la inicializacion)
 * INICIO:Valor del centinela distinto de salir (al menos una vez)
 * FIN:Valor del centinela igual salir
 
 * <2>
 * TIPO:Controlado por centinela (do{}while())
 * VCB:Centinela
 * INICIALIZACION:En la primera iteraccion
 * ACTUALIZACION:En la segunda iteraccion, si procede (coincide fisicamente con la inicializacion)
 * INICIO:Valor del centinela distinto de menu  (al menos una vez)
 * FIN:Valor del centinela contenido en el menu
 
 * <3>
 * TIPO:Controlado por centinela y acumulador (while())
 * VCB:Centinela , acumulador
 * INICIALIZACION:Lectura anticipada (antes de la primera iteraccion)
 * ACTUALIZACION:Lectura y comprobacion antes de finalizar la primera iteraccion
 * INICIO:Cuando el centinela sea entrar y el acumulador mayor que 0
 * FIN:Cuando el valor del centinela sea salir o el acumulador menor que 1
 
 * <4>
 * TIPO:Controlado por bandera (while())
 * VCB:Bandera
 * INICIALIZACION:Comprobacion antes de la primera iteraccion
 * ACTUALIZACION:Comprobacion en la primera iteraccion
 * INICIO:Si Bandera es falso (sera falo cuando la apuesta sea mayor que el saldo)
 * FIN:Si bandera igual a verdadero (sera verdadero cuando apuesta sea menor o igual que el saldo)
  
 * <5>
 * TIPO:Controlado por centinela (do{}while())
 * VCB:Centinela
 * INICIALIZACION:Por lectura en la primera iteraccion
 * ACTUALIZACION:Por lectura en la segunda iteraccion (coincide fisicamente con la inicializacion)
 * INICIO:Valor del centinela distinto de 'S' y 'N' (al menos una vez)
 * FIN:Valor del centinela igual a 'S' o 'N'
  
  */

/*PSEUDOCODIGO GENERALIZADO:
  
 * INICIO
  
 * 	HACER <1>
 * 		MOSTRAR Y VALIDAR OPCION MENU	<2>
 * 		SI (LA OPCION !=SALIR)
 * 			SEGUN (OPCION)
  			
 * 				CASO 1:
 * 					JUGADA CUBILETE
 * 				CASO 2:
 * 					JUGADA CUBILETE CON APUESTA
 * 			FIN SEGUN
  
 * 		FIN SI
 * 	MIENTRAS (OPCION !=SALIR)
  
 * FIN
 */

/*PSEUDOCODIGO DETALLADO JUGADA CUBILETE:
 * INICIO
 * 	CONFIGURAR CUBILETES
 * 	MOSTRAR CUBILETES
 * 	ELEGIR CUBILETES
 * 	COMPROBAR CUBILETE
 * 	MOSTRAR RESULTADO
 * FIN
 * */

/*PSEUDOCODIGO DETALLADO JUGADA CUBILETE CON APUESTA:
 * INICIO
 * 	MOSTRAR MENSAJE
 * 	LEER Y VALIDAR OPCIONJUGADA <5> (inicializacion)
 * 	MIENTRAS (SALDO MAYOR QUE 0 O OPCIONJUGADA !=SALIR)<3>
 * 		MOSTRAR SALDO
 * 		MOSTRAR CUBILETES
 * 		HACER Y VALIDAR APUESTA <4>
 * 		CONFIGURAR CUBILETES
 * 		MOSTRAR RESULTADOS
 * 		MODIFICAR SALDO
 * 		LEER Y VALIDAR OPCIONJUGADA <5> (actualizacion)
 * 	FIN MIENTRAS
 * 	
 * 
 * FIN
 * */
public class Trileros {

	
}
