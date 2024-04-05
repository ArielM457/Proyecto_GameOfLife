import argumentos.AsignacionArgs;
import poblaciones.AsignacionValoresMatriz;
import poblaciones.Poblacion;
import poblaciones.PoblacionInicial;
import procesos.GeneracionesImpresion;

/**
 * Pasar los valores iniciales en la configuracion del main en los argumentos iniciales
 * @author Ariel Murillo
 */
public class Main {
    public static void main(String[] args) {
        int variables[] = AsignacionArgs.asignacion(args);
        String pob_inicial = Poblacion.poblacion(args, variables);
        char[][] matriz = PoblacionInicial.matrizInicial(pob_inicial, variables);
        AsignacionValoresMatriz.valoresAlmacenadosMatriz(matriz, variables);
        GeneracionesImpresion.generaciones(variables[2], matriz, variables);
    }
}