import java.util.*;
import java.io.*;

public class EnterosArrays{

	public static void main(String[]args){
	
		int[] a={3,2,5,4,6,7,2,10,9,0};
		int b[]=new int[15];
		
		System.out.println("El array es: ");
		System.out.println(Arrays.toString(a));
		
		//metodo: public static void sort(int[]a)	
		System.out.println("Array ordenado :");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//metodo: public static int binarySearch(int[]a, int key)	
		System.out.println("Buscamos la posicion donde se encuentra un elemento : (2)");	
		System.out.println(Arrays.binarySearch(a,2));
		
		//metodo public static void fill(int[]a, int value)
		Arrays.fill(b,10);
		System.out.println("Rellenamos array B, con el elemento 10");	
		System.out.println(Arrays.toString(b));
		System.out.println("Buscamos la posicion del elemento 2 en el array B:");	
		System.out.println(Arrays.binarySearch(b,2));
		
		//metodo public static int[] copyOf(int[]a,int newLength)
		//copiamos el array A en B y establecemos una nueva longitud
		b=Arrays.copyOf(a,10);
		System.out.println(Arrays.toString(b));
		
		
	}
}
