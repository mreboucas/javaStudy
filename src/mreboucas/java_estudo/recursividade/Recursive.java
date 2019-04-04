package mreboucas.java_estudo.recursividade;

public class Recursive {

	public static void main(String[] args) {
		System.out.println(procedimentoMisterioso(5));
	}
	
	public static int procedimentoMisterioso(int num) {
		
		if (num >= 10) {

			return 10;

		} else {

			return procedimentoMisterioso(num + 3) + num;

		}
		
	}

}
