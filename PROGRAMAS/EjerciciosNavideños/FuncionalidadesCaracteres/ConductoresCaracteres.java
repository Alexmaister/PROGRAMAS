package FuncionalidadesCaracteres;

public class ConductoresCaracteres {
	public static void main(String[] args) {
		//CaracteresAlfabeto
		System.out.println(CaracteresAlfabeto.CompararCaracteres('b','a'));
		System.out.println(CaracteresAlfabeto.LetraMayuscula('a'));
		System.out.println(CaracteresAlfabeto.LetraMinus('*'));//necesita controlar error por el programa q lo use
		
		
		//CaraceterNumerico
		System.out.println(CaracterNumerico.digitoDecimal('5'));
	}
}
