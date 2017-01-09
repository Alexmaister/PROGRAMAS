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
	
	/*
	 * 
	 */
}
