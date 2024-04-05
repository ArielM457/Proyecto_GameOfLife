package poblaciones;

public class PoblacionInicial {
    public static char[][] matrizInicial(String pob_inicial, int[] variables) {
        char[][] matriz = new char[variables[1]][variables[0]];
        int charIndex = 0;
        int validos;
        boolean cont = false;
        for (int i = 0; i < variables[1]; i++) {
            validos = 0;
            int j;
            for (j = 0; j < variables[0]; j++) {
                if (charIndex < (pob_inicial.length())) {
                    if ((pob_inicial.charAt(charIndex)) != '#') {
                        matriz[i][j] = (pob_inicial.charAt(charIndex));
                        validos++;
                        if (validos == variables[0] - 1) {
                            cont = true;
                        }
                    } else if (pob_inicial.charAt(charIndex) == '#' && (cont == true)) {
                        charIndex++;
                        cont = false;
                    } else if (pob_inicial.charAt(charIndex) == '#' && (cont == false && ((i - 1 != 0)))) {
                        charIndex++;
                        break;
                    }
                    charIndex++;
                }
            }
            if (validos < (variables[0] - 1)) {
                for (j = validos; j < variables[0]; j++) {
                    matriz[i][j] = '0';
                }
            }
        }
        charIndex = 0;
        for (int i = 0; i < variables[1]; i++) {
            for (int j = 0; j < variables[0]; j++) {
                if (charIndex < pob_inicial.length()) {
                    if ((charIndex > 0) && (pob_inicial.charAt(charIndex - 1) == '#')) {
                        matriz[i][0] = pob_inicial.charAt(charIndex);
                    }
                    charIndex++;
                }
            }
        }
        charIndex = 0;
        for (int i = 0; i < variables[1]; i++) {
            for (int j = 0; j < variables[0]; j++) {
                if ((matriz[i][j] != '0') && (matriz[i][j] != '1')) {
                    matriz[i][j] = pob_inicial.charAt(charIndex);
                }
                charIndex++;

            }
        }
        return matriz;
    }
}
