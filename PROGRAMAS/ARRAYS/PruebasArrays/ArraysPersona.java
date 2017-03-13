import java.util.*;
public class ArraysPersona{
	
	public static void main(String[]a){
		int position=0;
		
		Persona p1=new Persona("Paco","Mermelo",28,2521865);
		Persona p2=new Persona("Julio","Tentuvida",25,7521865);
		Persona[] arrayP={p2,
		new Persona("Juan","Mininguez",47,5468743),
		new Persona("Manuel","Autensida",45,247186),
		p1};
		Persona[] arrayp2;
		
		
		
		
		
		System.out.println(Arrays.toString(arrayP));
		
		System.out.println("VAMOS A ORDENAR POR ORDEN NATURAL");
		Arrays.sort(arrayP);
		System.out.println(Arrays.toString(arrayP));
	
		//busqueda binaria , posicion del array en el q se encuentra el objeto que buscamos
		position= Arrays.binarySearch(arrayP,p2);
		System.out.println(position);
		
		
		System.out.println("Vamos ahora a ordenar por otro criterio con un Objeto COmparator");
		Arrays.sort(arrayP,new ComparadorPersonaApellidos());
		System.out.println(Arrays.toString(arrayP));
		
		//busqueda binaria , posicion del array en el q se encuentra el objeto que buscamos por comparator
		position =Arrays.binarySearch(arrayP,p2,new ComparadorPersonaApellidos());
		System.out.println(position);
			
		//COPIA
		System.out.println("EL array de copia es");
		arrayp2=Arrays.copyOf(arrayP,4);
		System.out.println(Arrays.toString(arrayp2));
		System.out.println("Se modifico el array de copia");
		arrayp2[1]=new Persona("Julio","Tentuvida",25,7521865);
		System.out.println(Arrays.toString(arrayp2));
		System.out.println("Array original");
		System.out.println(Arrays.toString(arrayP));
		
		ArrayList<Persona> personas=new ArrayList<Persona>( Arrays.asList(arrayP));
		System.out.println("Hemos creado una lista");
		System.out.println(personas.toString());
		System.out.println("Usamos metodos de la clase ArrayList, Collection, List, vector...");
		System.out.println(personas.contains(p2));
		System.out.println("Añadimos una persona al arrayList");
		personas.add(p1);
		System.out.println(personas.toString());
		System.out.println("Pasamos el arrayList de nuevo a array");
		arrayP=new Persona[20];
		personas.toArray(arrayP);
		System.out.println(Arrays.toString(arrayP));
	}
}
