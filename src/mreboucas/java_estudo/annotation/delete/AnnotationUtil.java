package mreboucas.java_estudo.annotation.delete;

import java.lang.reflect.Field;
import java.util.List;

public class AnnotationUtil {
	
	public static <T> void deletarListarMarcadasParaDelecao(Object obj) throws IllegalArgumentException, IllegalAccessException {

		if (obj != null) {
			
			for (Field field : obj.getClass().getDeclaredFields()) {

				if (field != null && field.isAnnotationPresent(Delete.class)) {
					field.setAccessible(Boolean.TRUE);
					
					if (List.class.isAssignableFrom(field.getType())) {
						
						T tabacoDeletar = (T) field.get(List.class);
					}
					
					
					//TODO deletar
					
				}
			}
		}
		
	}
}