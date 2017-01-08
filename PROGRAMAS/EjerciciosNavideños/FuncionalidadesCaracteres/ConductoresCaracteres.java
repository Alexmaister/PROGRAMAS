package FuncionalidadesCaracteres;

public class ConductoresCaracteres {
	public static void main(String[] args) {
		//CaracteresAlfabeto
		System.out.println(Caracteres.CompararCaracteres('b','a'));
		System.out.println(Caracteres.LetraMayuscula('a'));
		System.out.println(Caracteres.LetraMinus('*'));//necesita controlar error por el programa q lo use
		
		
		//CaraceterNumerico
		System.out.println(Caracteres.digitoDecimal('5'));
		
		//Signo de Puntucion
		System.out.println(Caracteres.signoPuntuacion('-'));
	}
}
