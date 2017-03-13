import java.util.*;
public class ComparadorPersonaApellidos implements Comparator<Persona>{

	public int compare(Persona p1, Persona p2){
	
		int resultado=0;
		
		resultado=p1.getApellidos().compareTo(p2.getApellidos());
	
		return resultado;
	}
	
}
