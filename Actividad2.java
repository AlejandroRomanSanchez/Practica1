public class Actividad2 {
    public static boolean isValidBoard(int[][] board){
	int length = board.length;

	int[][] contadores = new int[length + 1][length + 1];

	/*for(int i = 0; i < length; i++){
	    for(int j = 0; j < length; j++){
		if( ( board[i][j] < 0 ) && ( length - 1 < board[i][j]) ){
			return false;
		}
	    }
	    }*/
		    	
	for(int i = 0; i < length; i++){
	    for(int j = 0; j < length; j++){
		contadores[board[i][j]][i]++;	    
		if (contadores[board[i][j]][i] > 1) {
		    return false;
		}
	    }
	}

	for (int i = 0; i < length + 1; i++){
	    for (int j = 0; j < length + 1; j++){
		contadores[i][j] = 0;
	    }
	}

	for(int i = 0; i < length; i++){
	    for(int j = 0; j < length; j++){
		contadores[board[j][i]][j]++;
		if (contadores[board[j][i]][j] > 1){
		    return false;
		}
	    }
	}
	return true;
    }

    public static void main(String[] args){
	int[][] arregloPrueba1 = { {4,5,0,2,3,1},
		{3,1,2,0,4,5},
		{1,0,4,3,5,2},
		{5,2,3,1,0,4},
		{2,3,5,4,1,0},
		{0,4,1,5,2,3}};
        System.out.println(" El resultado para el primer arreglo es: " + Actividad2.isValidBoard(arregloPrueba1));

	int[][] arregloPrueba2 = {
	    {4,5,0,2,3,1},
	    {3,1,2,0,4,5},
	    {2,0,4,3,5,2},
	    {5,2,3,1,0,4},
	    {1,3,5,4,1,0},
	    {0,4,1,5,2,3}};
	System.out.println(" El resultado para el segundo arreglo es: " + Actividad2.isValidBoard(arregloPrueba2));

	int[][] arregloPrueba3 = new int[10][10];
	for (int i = 0; i < arregloPrueba3.length; i++){
	    for (int j = 0; j < arregloPrueba3.length; j++){
		arregloPrueba3[i][j] = 3;
	    }
	}
	System.out.println(" El resultado para el tercer arreglo es: " + Actividad2.isValidBoard(arregloPrueba3));

	int[][] arregloPrueba4 =  new int[20][20];
	for (int i = 0; i < arregloPrueba4.length; i++){
	    for (int j = 0; j < arregloPrueba4[i].length; j++){
		arregloPrueba4[i][j] = i;
	    }
	}
	System.out.println(" El resultado para el cuarto arreglo es: " + Actividad2.isValidBoard(arregloPrueba4));
	
	/*int[][] arregloPrueba5 = { {4,5,0,2,3,1},
		{3,1,2,0,4,5},
		{1,0,4,3,5,2},
		{5,2,3,1,0,4},
		{2,3,5,4,1,0},
		{0,4,1,5,2,7}};
	
		System.out.println(" El resultado para el quinto arreglo es: " + Actividad2.isValidBoard(arregloPrueba5));*/

	int[][] arregloPrueba6 = {
	    {1,2,0},
	    {0,1,2},
	    {2,0,1}};
	System.out.println(" El resultado para el sexto arreglo es: " + Actividad2.isValidBoard(arregloPrueba6));
    }
}
	
		

	
	
