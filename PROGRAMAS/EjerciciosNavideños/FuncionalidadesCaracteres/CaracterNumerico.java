package FuncionalidadesCaracteres;

public class CaracterNumerico {

	/*cabecera: public static boolean digitoDecimal(char n)
	 * descripcion: funcion que comprobara si un numero esta entre 0 y 9 o no
	 * entradas:un caracter
	 * precondiciones:ninguna 
	 * salidas : un boleano
	 * postcondiciones: true si esta comprendido en el rango y false si no
	 * */
	
	public static boolean digitoDecimal(char n){
		boolean resultado;
		
		if(n>='0' || n<='9' )
			resultado=true;
		else resultado=false;
		return resultado;
	}
}
