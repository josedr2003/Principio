/*
 * ENUNCIADO: se desea saber si el numero es positivo o negativo, par e impar
 * FECHA: 5/11/2021
 * AUTOR:Jose...
 *
 */
import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args ) {
		
		Scanner teclado = new Scanner (System.in);// creamos la clase leer tipo Scanner 
		System.out.println("Introduzca un numero" );//Introducimos un numero 
													
		int num= teclado.nextInt();
		
		if (num<0) {
				if ( num % 2==0) {
					System.out.println(num); 
					num ++;
					System.out.println("Numero es negativo y par" );
				}
				else {
					System.out.println("Numero es negativo e impar" );
				}
			
		}
		else {
			System.out.println("Numero es positivo"+ num);
				if(num % 2==0) {
					System.out.println( num);
					num++;
					System.out.println("Numero es positvo y par" + num);
				}
				else {
					System.out.println("Numero es postivo e impar" + num);
				}
		
		}
			teclado.close();
	}

}
