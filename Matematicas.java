//clase Matematicas
/**esta clase contiene los métodos necesario para 
 * sacar numero par o no
 * divisible por 3
 * divisible por 5
 * @param numero entero = entrada
 * @return boolean
 * @version	0.0
 * @author Pedro Torrebejano
 **/



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

