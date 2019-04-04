package mreboucas.java_estudo.algoritmos_ordenacao.selectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {15,11,16,18,23,5,10,22,21,12};
		ordenadar(array);
	}
	
	public static void ordenadar(int[] array) {
		int index_min;
		int aux;
		
		
		for (int i = 0; i < array.length; i++) {
		
			index_min = i;
			
			for (int j = i +1; j < array.length; j++) {
				
				System.out.println("array[j]" + array[j]);
				System.out.println("array[index_min]" + array[index_min]);
				
				if (array[j] < array[index_min]) {
					index_min = j;
				}
				
				if (index_min != i) {
					aux = array[index_min];
					array[index_min] = array[i];
					array[i] = aux;
				}
			}
		}
	}
}