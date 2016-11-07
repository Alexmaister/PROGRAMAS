package EjerciciosIterativos;

import java.util.Scanner;

public class PruebaDaniel {

public static void main(String[] args) {
	
	int opcion;
	char ejecutar=' ';
	Scanner teclado=new Scanner(System.in);
	
		do{
			
			System.out.println("sumar 1");
			System.out.println("restar 2");
			System.out.println("SALIR 3");
		
			opcion=teclado.nextInt();
			
			if(opcion!=3){
				//fghsdfhghhfshhsdfhsdf
				switch(opcion){
				
				case 1:
					System.out.println("estas sumando");
					break;
				case 2:
					System.out.println("estas estas restando");
					break;
					
					
				}
				
				System.out.println("volver a ejecutar?");
				ejecutar=Character.toUpperCase(teclado.next().charAt(0));
			}
		}while(opcion !=3 && ejecutar!='N');

	}
}