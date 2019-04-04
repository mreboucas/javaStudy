package mreboucas.java_estudo.algoritmo;

public class Algoritmo1 {
	
	public static void main(String[] args) {

		Integer a = new Integer(7631);
		String b = a.toString();
		String c = "";
		int d = 0;
		
		for (int i = b.length(); i > 0; i--) {
			
			c += b.substring(i-1, i);
			
			d += Integer.valueOf(b.substring(i-1, i));
		}
		System.out.println(c);
		System.out.println(d);
		
	}
}
