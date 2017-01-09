package FuncionalidadesCaracteres;

public class Caracteres {

	/*cabecera: public static int CompararCaracteres(char a, char b)
	 *
	 *descripcion: funcion que compara si un caracter alfabetico es mayor menor o igual a otro
	 *entradas:dos caracteres 
	 *precondiciones:ninguna
	 *salidas: un entero
	 *postcondiciones: el resultado de la comparacion sera 0 de ser iguales, 1 de ser mayor el primero y -1 de ser menor 
	 *					si la primera letra no esta en el abecedario se devolvera un -2 , si es el segundo caracterse devolvera 2. 
	 */
	public static int CompararCaracteres (char a , char b){
		
		int resultado=0;
		if((a>='a' || a<='Z')&& (b>='a' || b<='Z')){
			if(a==b)
			resultado=0;
			else if(a<b)
				resultado=-1;
			else resultado=1;
		}
		else 
			resultado=(a>='a' && a<='Z') ? 2 : -2;
		
		return resultado;
		
		
	}
	
	/*cabezera:public static boolean LetraMayuscula(char a)
	 * 
	 * descripcion :funcion que comprobara si un letra del alfabeto español es o no mayuscuscuscula
	 * entradas: un caracter 
	 * precondiciones:el caracter debe ser una letra del alfabeto
	 * salidas :un boolean
	 * postcondiciones: el resultado sera true de ser mayor y false de no serlo 
	 */
	public static boolean LetraMayuscula(char a){
			
		return (a>='a'&& a<='z')?false:true;
	}

	/*cabezera:public static boolean LetraMinus(char a)
	 * 
	 * descripcion :funcion que comprobara si un letra del alfabeto español es o no minuscula
	 * entradas: un caracter 
	 * precondiciones:el caracter debe ser una letra del alfabeto
	 * salidas :un boolean
	 * postcondiciones: el resultado sera true de ser menor y false de no serlo 
	 */
	
	public static boolean LetraMinus(char a){
	
	return (a>='A' && a<='Z')?false:true;
	}
	

	/*cabecera: public static boolean digitoDecimal(char n)
	 * descripcion: funcion que comprobara si un numero esta entre 0 y 9 o no
	 * entradas:un caracter
	 * precondiciones:ninguna 
	 * salidas : un boleano
	 * postcondiciones: true si esta comprendido en el rango y false si no
	 * */
	
	public static boolean digitoDecimal(char n){
				
		return(n>='0' || n<='9' )?true:false;
	}
	
	/*cabecera : public static boolean signoPuntuacion(char  c)
	 * descripcion: funcion que comprobara si un caracter es o no un signo de puntuacion
	 * entradas :un caracter
	 * precondiociones:ninguna
	 * salidas : un boleano
	 * postcondiciones: el resultado sera true de ser un signo de puntuacion
	 */
	
	public static boolean signoPuntuacion(char c){
		
	return(c==44 || c==46 || c==58 || c==59 || c==33 || c==63 || c==168 || c==173)?true:false;
	}
}
