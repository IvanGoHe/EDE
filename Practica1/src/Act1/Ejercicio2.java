package Act1;

public class Ejercicio2 {

	public static void main(String[] args) {

		int num = 0;
		int suma = 0;
		int suma1 = 0;
		int total = 0;

		int[][] arrayBi = new int[3][3];

		for (int i = 0; i < arrayBi.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Introduzca un valor");
				num = Entrada.entero();
				arrayBi[i][j] = num;
			}
		}

		for (int i = 0; i < arrayBi.length; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(arrayBi[i][j] + "  ");

				if (i == j) {
					suma += arrayBi[i][j];
				}

				if ((i == 0 && j == 2) || (j == 0 && i == 2) || (i == 1 && j == 1)) {
					suma1 += arrayBi[i][j];
				}

			}
		}

		System.out.println("\n\n");
		System.out.println(suma);
		System.out.println("\n" + suma1);
		
		total = suma + suma1;
		
		System.out.println("\n"+suma + " + " + suma1 + " : " + total);

	}

}
