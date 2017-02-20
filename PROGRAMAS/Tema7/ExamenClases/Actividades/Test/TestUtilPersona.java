

public class TestUtilPersona {
	public static void main(String[]args)throws ExcepcionPersona{
		
		Persona p=new Persona();
		p.setPeso(90);
		Persona[]pA = new Persona[2];
		
		System.out.println(p.getPeso());
		
		
		
		System.out.println(UtilPersona.caloriasSenderismo(p,2,10));
		
		
		
		System.out.println(UtilPersona.caloriasSenderismo(p,1,30));
		
		System.out.println(UtilPersona.contarPorActividad(pA, 1));
	}
}
