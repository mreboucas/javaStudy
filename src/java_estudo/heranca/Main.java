package java_estudo.heranca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

	private static int a = 1;

	public static void main(String[] args) {

		B b = new A();

		b.coisar("a");

		// b.testar();

		System.out.println("terminou com erro de compilação!!!");
		System.out.println(4 / 2.5);
		System.out.println("meu\teste".contains("teste"));
		System.out.println("meu\teste");
		System.out.println("abs".codePointAt(0));
		Set set = new HashSet<>();
		set.add("marcelo");
		set.add(new String("marcelo"));
		System.out.println(set);
	}


}
