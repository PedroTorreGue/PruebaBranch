//TestMatematicas
/**
 * Creamos este archivo para comprobar la funcionalidad
 * de Matematicas.java
 * @author Pedro Torrebejano
 * @version 0.0 
 * @param introducido por el usuario
 * @return si es par o no, si es divisible por 3 y por 5
 **/

import java.util.Scanner;

public class TestMatematicas {
	
	public static void main (String args[]) {
		System.out.println("Introduce un número entero");
		Scanner sc= new Scanner(System.in);
		int entrada= sc.nextInt();	
		boolean par=Matematicas.esPar(entrada);
		boolean div3=Matematicas.esDivisiblePorTres(entrada);
		boolean div5=Matematicas.esDivisiblePorCinco(entrada);
		if (par==true)
			System.out.println("El número "+entrada+" es par");
		else
			System.out.println("El número "+entrada+" es impar");
		if (div3==true)
			System.out.println("También es divisible por 3");
		if (div5==true)
			System.out.println("También es divisible por 5");
		{
			
		}
		
	}
}

