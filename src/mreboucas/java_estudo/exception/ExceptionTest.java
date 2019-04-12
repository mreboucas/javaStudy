package mreboucas.java_estudo.exception;

import org.junit.Test;

/**
 * @author Marcelo Rebouças [marceloreboucas10@gmail.com] - 20 de fev de 2019 as 13:48:52 
 */

public class ExceptionTest {
	
	@Test
	public void checarExcecaoAluno() {
		
		Aluno aluno = new Aluno();
		
		try {
			
			aluno.getNome().toString();
			
		}catch (Exception e) {
			try {
				throw new NomeAlunoNaoEcontradoException();
			} catch (NomeAlunoNaoEcontradoException e1) {
				e1.printStackTrace();
				Throwable th = e1.fillInStackTrace();
			}
		} 
	}
}
