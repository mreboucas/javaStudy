package java_estudo.ternario;

public class Ternario {
	
	public static void main(String[] args) {

		int a = 3434;
		int b = 66;
		
		String out =  (a ^ b) == 0 ? "Sim" : (a & b) != 0 ? "Talvez" : "Não";
		

		System.out.println(out);
		
	}
	
	protected void verProtecao() {
		
	}
	

}
