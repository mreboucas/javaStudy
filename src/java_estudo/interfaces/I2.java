package java_estudo.interfaces;

public interface I2 extends I3, I1 {

	void teste2();
	
	@Override
	default void comer() {
		// TODO Auto-generated method stub
		
	}
	
	public void testar();
	
	@Override
	default void escutarMusica() {
		// TODO Auto-generated method stub
		I1.super.escutarMusica();
	}
	
}
