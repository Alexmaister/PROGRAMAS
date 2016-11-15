package Azar;
import java.util.*;
public class PruebaRandom {

		public static void main(String[] args) {
			
			Random aleatorio= new Random();
			int dado=0;
			
			for(int i=0;i<10;i++){
			dado=aleatorio.nextInt(6)+1;
			System.out.println("Dado :"+dado);
			}
		}
}
