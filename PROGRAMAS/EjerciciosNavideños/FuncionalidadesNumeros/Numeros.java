package FuncionalidadesNumeros;

public class Numeros {
	
	/*cabecera: public static boolean numeroPrimo(int n)
	 *descripcion: funcion que devolvera true si el numero introducido es un numero Primo y false de no serlo
	 *entradas: un entero
	 *precondiciones: el numero debe ser entero positivo
	 *salidas: un booleano 
	 *postcondiciones: true de ser primo ,false de no serlo
	 */

	public static boolean numeroCompuesto(int n){
		int contador=0,acumulador=0;
		for(contador=n;contador>0;contador--)
			if(n%contador==0)
				acumulador++;
		return (acumulador>2)?true:false;
	}
	
	/*cabecera: public static boolean numPerfecto(int num)
	 * descripcion: funcion que comprobara si un numero es perfecto
	 * entradas:un entero 
	 * precondiciones: que el numero no sea negativo 
	 * salidas : un boleano
	 * postcondiciones: el resultado sera true cuando el numero sea perfecto y false cuando no
	 */
	
	/*public static boolean numPerfecto(int num){
		
		return (num==num-Math.floor(num))?true:false;
	}
	public static int enteroSuperior(double num){
		int decimal=0;
		decimal=
		if()
		return int 
	}*///intento 1
	
	
	
	public static boolean numPerfecto(int num){
		
		return((num%2==0) && num==SumaDivisoresNumPerfecto(num-(int)Math.round(num/2.0)))?true:false;

	}
	
	
	
	/*cabecera: public static int siguienteDivisorPerf(int n)
	 * descripcion: funcion que calculara el siguiente divisor de un numero
	 * entradas:un entero
	 * precondiciones: el numero debe ser positivo y divisor de un numero perfecto 
	 * salidas: un entero
	 * postcondiciones: el resultado sera un numero divisor siguiente mas pequeño del numero dado
	 *
	*/
	public static int SumaDivisoresNumPerfecto(int a){
		
		int acumulador=0;
		if(a!=1){
		acumulador=a+ SumaDivisoresNumPerfecto((int)Math.round(a/2.0));
		}else
		acumulador=1;
		return acumulador;
	} //intento 4,5,...
	
	
	
	
	
	
	/*cabecera: public static boolean numeroSemiperfecto()
	 * decripcion: funcion que comprobara si un numero es o no Semiperfecto
	 * entradas: un entero
	 * precondiciones: el numero debe ser un numero entero positivo y distinto de cero
	 * salidas : un booleano
	 * postcondiciones: el resultado sera true si el numero es semiperfecto y false si no
	 * */
	
	public static boolean numeroSemiperfecto(int num){
		double variable=2.0;
		boolean resultado=false;
		while((num/variable>1&&num>=SumaDivisoresNumPerfecto((int)Math.round(num/variable)))&& resultado==false){
			if (num==SumaDivisoresNumPerfecto((int)Math.round(num/variable)))
				resultado=true;
			else resultado=false;
			variable+=2;
		}
		return resultado;
	}

	
}
