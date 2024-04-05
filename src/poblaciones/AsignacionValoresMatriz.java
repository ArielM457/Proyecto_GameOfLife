package poblaciones;

public class AsignacionValoresMatriz {
    public static void valoresAlmacenadosMatriz(char[][] matriz, int[] variables) {

        for (int i = 0; i < variables[1]; i++) {
            for (int j = 0; j < variables[0]; j++) {
                if (matriz[i][j] == '0') {
                    matriz[i][j] = '_';
                } else if (matriz[i][j] == '1') {
                    matriz[i][j] = 'X';
                }
            }
        }
    }
}
