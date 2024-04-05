package procesos;

public class GeneracionesImpresion {
    public static void imprimir(char[][] matriz, int[] variables) {
        for (int i = 0; i < variables[1]; i++) {
            for (int j = 0; j < variables[0]; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void generaciones(int generaciones, char matriz[][], int[] variables) {
        if (generaciones == 0) {
            int generacionActual = 1;
            while (true) {
                System.out.println("---------- GENERACION :" + generacionActual + " ----------");
                imprimir(matriz, variables);
                ReglasJuego.reglas_juego(matriz, variables);
                TiempoEjecucion.tiempo(variables[3]);
                generacionActual++;
            }
        } else {
            for (int i = 0; i < generaciones; i++) {
                System.out.println("---------- GENERACION :" + (i + 1) + " ----------");
                imprimir(matriz, variables);
                ReglasJuego.reglas_juego(matriz, variables);
                TiempoEjecucion.tiempo(variables[3]);
            }
        }
    }
}
