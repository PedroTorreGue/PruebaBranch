/*
 * Matematicas.java
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



public class Matematicas {
	
	
	public static boolean esPar (int entrada) {
		boolean par=false;
		if (entrada % 2==0) {
			par=true;	
		}
		return par;
	}
	
	public static boolean esDivisiblePorTres (int entrada) {
		boolean div3=false;
		if (entrada%3==0)
			div3=true;
			
		return div3;
	}
	
	public static boolean esDivisiblePorCinco (int entrada) {
		boolean div5=false;
		if (entrada%5==0)
			div5=true;
			
		return div5;
	}
}

