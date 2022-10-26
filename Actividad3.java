public class Actividad3 {
    public static void rotateArray(int[] num, int position) {
	int length = num.length;
	int[] resultado = new int[length];

	for (int i = 0; i < length; i++) {
	    if( (i - position) < 0) {
		resultado[ length  + i - position ] = num[ i ];
	    } else {
		resultado[ i - position ] = num[ i ];
	    }
	}
    }

    public static void main(String[] args) {
	int[] arreglo1 = {1,4,2,1,6,2,9};
	int[] arreglo2 = {4,2,7,5,4,3,7,2,5,3,4,1};
	int[] arreglo3 = {3,2,1,4,2};

	/*int[] resultado1 = Actividad3.rotateArray(arreglo1, 5);
	int[] resultado2 = Actividad3.rotateArray(arreglo2, 0);
	int[] resultado3 = Actividad3.rotateArray(arreglo3, 2);

	System.out.println(java.util.Arrays.toString(resultado1));
	System.out.println(java.util.Arrays.toString(resultado2));
	System.out.println(java.util.Arrays.toString(resultado3));*/
    }
}
		
