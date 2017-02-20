

import java.util.*;
import java.lang.*;
import java.io.*;
;
//supprogramas de gestion para la clase persona
public class GestionPersona {
	
	/*cabecera: Persona crearPersona()
	 * decripcion:funcion que creará una persona con los datos 
	 * entradas: por teclado
	 * salidas: un objeto persona
	 * precondiciones:ninguna
	 * postcondiciones:la persona se devolvera asociada al nombre
	 * */
		public static Persona crearPersona(){

			double peso=0;
			InputStreamReader flujo=new InputStreamReader(System.in);
			BufferedReader teclado=new BufferedReader(flujo);
			Persona p =null;
				System.out.println("Introduzca el nombre y apellidos del socio");
			try{
				p=new Persona();
				p.setApellidosNombre(teclado.readLine());
				do{
				System.out.println("Introduzca su peso");
				peso=Double.parseDouble(teclado.readLine());
				}while(peso<0);
				p.setPeso(peso);
			
				System.out.println("Indique a que actividad pertenece");
				p.setTipoActividad(Integer.parseInt(teclado.readLine()));
				
			}catch(IOException ioE){System.out.println(ioE);}
			catch(ExcepcionPersona exP){System.out.println(exP);}
			
			
			return p;
			
		}
	/*cabecera: mostrarPersonas(Persona[]personas)
	 * descripcion: procedimiento que mostrara en pantalla todas las personas
	 * entradas:array de personas
	 * salidas:ninguna
	 * precondiciones:ninguna
	 * postcondiciones:se veran los datos en pantalla
	 * */
	 public static void mostrarPersonas(ArrayList<Persona> personas){
		 
		 for(Persona p:personas)
		 System.out.print(p.getIdentificador()+","+p.getApellidosNombre()+","+p.getPeso()+"\n");
		 
		 }
		 
	/*cabecera:Persona recogerPersona(arrayList<Persona>p, int id)
	 * descripcion:funcion que devolvera una persona segun su id
	 * entradas=un arraylist de personas y un id
	 * salidas:una persona
	 * precondiciones:ninguna
	 * postcondiciones:se devolvera una persona asociada al nombre
	 * */
	public static Persona recogerPersona(ArrayList<Persona> p,int id){
		Persona persona=null;
		for(Persona pe:p)
			if(pe.getIdentificador()==id)
			try{
				persona=new Persona(pe);
			}catch(ExcepcionPersona ep){System.out.println(ep);}
		
		return persona;
		}
	/*cabecera: int contarPorActividad(Persona[]p, int actividad)
	 * decripcion:funcion que devolvera el numero de personas que realizaron una actividad
	 * entradas: un array de personas y un entero
	 * salidas:un entero
	 * precondiciones:ninguna
	 * postcondiciones:el entero se devulve asociado al nombre, e indicara cuantas personas realizan cierta actividad
	 * */
	//resguardo
	/*public static int contarPorActividad(Persona[]p,int actividad){return 1;}*/
	public static int contarPorActividad(ArrayList<Persona> p,int actividad){
		int contador=0;
		for(Persona per:p){
		if(per.getTipoActividad()==actividad)
		contador++;
		}
		return contador;
	}
	
	/*cabecera: double leeryValidarCET()
	 * descripcion: funcion que validará un coeficiente CET de los elegidos y lo devolvera
	 * entradas: ninguna
	 * salidas: un real 
	 * precondiciones:ninguna
	 * postcondiciones: el resultado se devolvera asociado al nombre
	 * */
		
	public static double leeryValidaCET(){
	
		InputStreamReader flujo=new InputStreamReader(System.in);
		BufferedReader teclado=new BufferedReader(flujo);
		double resultado=0;
		String opcion=" ";
		
			
		do{
			System.out.println("Indique si el CET de la actividad es : (BAJO/MEDIO/ALTO)");
			try{
				opcion=teclado.readLine().toUpperCase();
				
			}catch(IOException ioe){System.out.println(ioe);}
			System.out.println(opcion);
		}while(!opcion.equals("BAJO") && !opcion.equals("MEDIO") && !opcion.equals("ALTO"));
		
		switch(opcion){
			
		 case "BAJO":
			
			resultado=0.15;
			
			break;
		 case "MEDIO":
		 
			resultado=0.25;
			break;
			
		 case "ALTO":
		 
			resultado=0.35;
			break;
		}
			
		return resultado;
	}
}
