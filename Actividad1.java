public class Actividad1 {
    public static int[] mergeSortedArray(int[] array1, int n,
					 int[] array2, int m) {
	if(n > array1.length || m > array2.length){
	    throw new RuntimeException("Límites no válidos");
	}

	int[] resultado = new int[n + m];
	int[] arregloAuxiliar1 = new int[n + m];
	int[] arregloAuxiliar2 = new int[n + m];
	int contador1 = 0;
	int contador2 = 0;       

	arregloAuxiliar1[0] = array1[0];
	arregloAuxiliar2[0] = array2[0];
	
	for(int i = 0; i < resultado.length; i++) {
	    if (arregloAuxiliar1[ i ] <= arregloAuxiliar2[i + contador2]) {
		resultado[i] = arregloAuxiliar1[ i ];
		arregloAuxiliar1[i + 1] = array1[i + 1];
		arregloAuxiliar2[i + 1] = array2[ i ];
	    } else {
		resultado[i] = arregloAuxiliar2[ i ];
		arregloAuxiliar2[i + 1] = array2[i + 1];
		arregloAuxiliar1[i + 1] = array1[ i ];
	    }	    
	}
	return resultado;
    }

    public static void main(String[] args) {
	int[] arreglo1 = {13,29,58,58,74,90,91};
	int[] arreglo2 = {3,11,13,16,27,56,59,61,88,90};
	int[] arregloOrdenado1 = Practica1.mergeSortedArray(arreglo1,3,arreglo2,5);
	System.out.println(java.util.Arrays.toString(arregloOrdenado1));

	int[] array1 = {1,24,49,51,63,79,99,107,107,126,128,149};
	int[] array2 = {26,54,68,97,103,107,109,123,126,132,155,175,187,208,230};
	int[] arregloOrdenado2 = Practica1.mergeSortedArray(array1,5,array2,5);
	System.out.println(java.util.Arrays.toString(arregloOrdenado2));
    }
}
