
package mreboucas.java_estudo.merge.md5;

/**
 * @author: Marcelo Rebou�as
 * @date: second semester - 2011
 * @description:
 *
 */
public class MD5 {

	public String encrypt(String enc) {
		String RESULTADO = "";
		for (int i = 0; i < enc.length(); i++) {
			RESULTADO += getNUMBER();
			RESULTADO += getKEY();
			RESULTADO += enc.substring(i, i + 1);
		}
		return RESULTADO;
	}

	public String getKEY() {
		return new Character((char) (Math.random() * 23 + 97)).toString();
//		  return new Character((char)(Math.random())).toString();   
	}

	public String getNUMBER() {
		return String.valueOf(Math.round(Math.random() * 1000 % 999));
	}

	public static void main(String[] args) {
		String senhaCriptografada = new MD5().encrypt("dswsmS1");
		String senhaDescriptografada = new String();
		String index = senhaCriptografada;
		System.out.println("Tamanho da senha ecriptada: " + senhaCriptografada.length());
		System.out.println("Senha encriptada: " + senhaCriptografada);

		// senhaCriptografada = senhaCriptografada.replaceAll("[0-9]+", "");
//			System.out.println("Senha encriptada sem n�meros: " + senhaCriptografada);

	}

	public String desencriptSenha(String senhaEncriptada, Integer ValorInicial, Integer ValorIncrementado) {
		StringBuilder senhaDeciptada = new StringBuilder();
		System.out.println("Senha encriptada: " + senhaEncriptada);
		System.out.println("Tamanho da senha ecriptada: " + senhaEncriptada.length());
		int j = ValorInicial;
		try {
			for (int i = 0; i < senhaEncriptada.length(); i++) {
				char b = senhaEncriptada.charAt(j);
				senhaDeciptada.append(b);
				j += ValorIncrementado;
			}
		} catch (StringIndexOutOfBoundsException e) {

		}

		return senhaDeciptada.toString();
	}

}
