/*
 * TestMatematicas.java
 * 
 * Copyright 2015 Ciclo DAM <matinal@DAM>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

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

