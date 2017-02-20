
import java.io.*;
import java.util.*;
import java.lang.*;
/*ANALISIS:
 * Programa que gestionara un grupo de senderistas,
 *  nos permitira crear personas , saber cuantas calorias gastan cada uno
 *  y cuantas personas realizan cierta actividad
 *
 *REQUISITOS
 *		Recoger datos de las personas por teclado
 *		Calcular calorias gastadas en una actividad
 *		Contar cuantas personas realizan una actividad  
 *  
 *ENTRADAS
 *
 *		caracter para seguir
 *		entero para opcion de menu
 *		entero nivel de actividad
 *		entero tiempo de actividad
 *		entero que representa el identificador de la persona
 *
 *SALIDAS
 *		se mostrara por pantalla las calorias perdidas por una persona
 *		se mostrara por pantalla cuantas personas realizan una actividad
 *
 *SUPOSICIONES
 *		Ninguna
 *
 *RESTRICCIONES
 *		La opcion solo puede ser crear,calcular o contar
 *		el nivel debe estar entre 1 y 3
 *		el tiempo no puede ser negativo
 * */

/*PSEUDOCODIGO GENERALIZADO
 * INICIO
 * 	HACER
 * 		LEER Y VALIDAR MENU*
 * 		SI OPCION DISTINTO DE SALIR
 * 		 SEGUN OPCION DE MENU
 * 			CASO 1:
 * 				HACER
 * 					CREAR PERSONA
 * 					LEER Y VALIDAR SEGUIR
 * 				MIENTRAS SE QUIERA SEGUIR CREANDO PERSONAS
 * 			CASO 2:
 * 				HACER
 * 					LEER Y VALIDAR IDENTIFICADOR PERSONA
 * 					LEER Y VALIDAR NIVEL ACTIVIDAD
 * 					CALCULAR CALORIAS
 * 					LEER Y VALIDAR SEGUIR
 * 				MIENTRAS
 * 
 *  		CASO 3:
 *  			LEER Y VALIDAR ACTIVIDAD
 *  			CONTAR PERSONAS
 *  			MOSTRAR PERSONAS QUE REALIZAN ACTIVIDAD
 *  	FIN SEGUN
 * 	MIENTRAS OPCION NO SEA SALIR
 * FIN
 * */


public class ProgramaSenderismo {
	
	/*cabecera:int leeryValidarMenu()
	 * descripcion: funcion que devolvera la opcion de menu elegida
	 * entradas:ninguna
	 * salidas:un entero
	 * precondiciones:ninguna
	 * postcondiciones:se devolvera asociado al nombre
	 * */

	public static int leeryValidarMenu(){
		int opcion=0;
		InputStreamReader flujo=new InputStreamReader(System.in);
		BufferedReader teclado=new BufferedReader(flujo);
		
		
		do{
			if(opcion<0||opcion>4)//para indicar el error
				System.out.println("La opcion debe estar contenida en el menu");
			
			
			presentarMenu();
			
			System.out.println("Introduzca la opcion elegida");
			
			try{
			opcion=Integer.parseInt(teclado.readLine());
			}catch(IOException e){
				System.out.println(e);
			}
			
		}while(opcion<0 || opcion>4);
		
		
		return opcion;
	}
	
	/*cabecera:void presentarMenu()
	 * descripcion:procedimiento que presentara el menu en pantalla
	 * entradas:ninguna
	 * salidas:ninguna
	 * precondiciones:ninguna
	 * postcondiciones:ninguna
	 * */
	public static void presentarMenu(){
		System.out.println("0-SALIR");
		System.out.println("1-CREAR SOCIO");
		System.out.println("2-CALCULAR CALORIAS PERDIDAS");
		System.out.println("3-NUMERO DE PERSONA EN UNA ACTIVIDAD");
		System.out.println("4-MOSTRAR SOCIOS");
	}
	/*cabecera: char leeryValidarSeguir()
	 * descripcion:funcion leera y validara un caracter
	 * entradas:ninguna
	 * salidas:un caracter
	 * precondiciones:ninguna
	 * postcondiciones:el caracter se devolvera asociado al nombre
	 * */
	
	public static char leeryValidarSeguir(){
		
		InputStreamReader flujo=new InputStreamReader(System.in);
		BufferedReader teclado=new BufferedReader(flujo);
		char seguir=' ';
		do{
		System.out.println("¿Desea seguir? (S/N)");
		try {
			seguir=teclado.readLine().charAt(0);
		} catch (IOException e) {
			System.out.println(e);
		}
		}while((seguir!='S' && seguir!='s') && (seguir!='N' && seguir!='n'));
	
		return seguir;
		
		}
		
		
	/*cabecera: int leeryValidarActividad()
	 * descripcion:funcion leera y validara un entero
	 * entradas:ninguna
	 * salidas:un entero
	 * precondiciones:ninguna
	 * postcondiciones:el entero se devolvera asociado al nombre con un valor entre 1 y 5
	 * */
	
	public static int leeryValidarActividad(){
			
			InputStreamReader flujo=new InputStreamReader(System.in);
			BufferedReader teclado=new BufferedReader(flujo);
			
			int resultado=0;
			do{
				try{
					resultado=Integer.parseInt(teclado.readLine());
				}catch(IOException e){System.out.println(e);}
			}while(resultado<1||resultado>5);
			
			return resultado;
	}
	
	//metodo principal
	public static void main(String[]args){
		
		InputStreamReader flujo=new InputStreamReader(System.in);
		BufferedReader teclado=new BufferedReader(flujo);
		
		int opcion=0,actividad=0,identificador=0,tiempo=0;
		double cet=0;
		char seguir=' ';
		ArrayList<Persona> personas=new ArrayList();
		Calorimetro calorimetro=new Calorimetro();
		
		do{
			
			while(personas.size()<=0){
				System.out.println("Debe haber personas guardadas para ejecutar el programa");
				
				do{
						
							personas.add(GestionPersona.crearPersona());
						
					seguir=Character.toUpperCase(leeryValidarSeguir());	
					}while(seguir=='S');
			}
			
			opcion=leeryValidarMenu();
			if(opcion!=0){
				
				switch(opcion){
				
				case 1:
					
					do{
							
							personas.add(GestionPersona.crearPersona());
						
					seguir=Character.toUpperCase(leeryValidarSeguir());	
					}while(seguir=='S');
					
					break;
				case 2:
					try{
						do{
							GestionPersona.mostrarPersonas(personas);
							System.out.println("Elija una persona :");
							identificador=Integer.parseInt(teclado.readLine());
							calorimetro.setPeso(personas.get(identificador).getPeso());
						}while(identificador<0 || identificador >(personas.size())-1);
						
						System.out.println("Introduzca el tiempo q estuvo realizando la actividad:");
						
						calorimetro.setTiempo(Integer.parseInt(teclado.readLine()));
						
								
						cet=GestionPersona.leeryValidaCET();
						calorimetro.setCET(cet);
						System.out.println("Las calorias gastadas son:"+calorimetro.getCalorias());
						
								
						
					}catch(IOException ioe){System.out.println(ioe);}
							
					break;
				case 3: 
					System.out.println("Indique la actividad de la cual quiere saber el numero de personas");
					
					actividad=leeryValidarActividad();
				
					System.out.println("El número de personas de la actividad :"+actividad+" es :"+GestionPersona.contarPorActividad(personas,actividad));
					break;
				case 4:
						GestionPersona.mostrarPersonas(personas);
					break;
				}
			}
			
		}while(opcion!=0);
		
	
	}
	
}
