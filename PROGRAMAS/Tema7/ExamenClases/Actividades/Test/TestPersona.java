package Test;
import Excepciones.*;
import Clases.*;

public class TestPersona {
	public static void main(String[]args)throws ExcepcionPersona{
		
		Persona p=new Persona();
		Persona p1=new Persona("Alejandro Ortiz",1,75.5);
		Persona copiaP1=new Persona(p1);
		
		System.out.println(p);
		System.out.println(p1);
		System.out.println(copiaP1);
		System.out.println(p.getIdentificador()+","+p.getApellidosNombre()+","+p.getCategoria()+","+p.getTipoActividad()+","+p.getPeso());
		Persona clonP1=p1.clone();
		System.out.println(clonP1);
		System.out.println(p1.equals(clonP1));
		System.out.println(p1.compareTo(copiaP1));
		System.out.println(clonP1.hashCode()+","+p1.hashCode());
		copiaP1.setApellidosNOmbre("Alvaro Benitez");
		copiaP1.setPeso(99);
		copiaP1.setTipoActividad(2);
		System.out.println(copiaP1);
		
	}
}
