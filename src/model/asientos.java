package model;

public class asientos {
	public static void main(String[] args) {
		int nFilas = 13, nColumnas = 16;
		int cont = 1;
		String[][] cine = new String[nFilas][nColumnas];
		String[][] asientos = llenarMatrisAsientos(cine, nFilas, nColumnas);
		mostrarMatriz(asientos, nFilas, nColumnas);
	}

	public static String[][] llenarMatrisAsientos(String[][] asientos, int nFilas, int nColumnas) {
		int aux = 1;
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nColumnas; j++) {
				asientos[i][j] = "" + (char) (i + 'A') + aux;
				aux++;
			}
			aux = 1;
		}
		return asientos;
	}

	public static void mostrarMatriz(String[][] asientos, int nFilas, int nColumnas) {
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nColumnas; j++) {
				System.out.print(asientos[i][j] + " ");
			}
			System.out.println();
		}
	}

}
