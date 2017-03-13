import java.util.*;
public class ComparadorPersonaApellidos implements Comparator<Persona>{

	public int compare(Persona p1, Persona p2){
	
		int resultado=0;
		
		if(p1.getApellidos().compareTo(p2.getApellidos())==1)
		resultado=1;
		else if(p1.getApellidos().compareTo(p2.getApellidos())==0)
				resultado=0;
		else resultado=-1;
	
		return resultado;
	}
	
}
