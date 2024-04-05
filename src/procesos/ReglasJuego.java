package procesos;

public class ReglasJuego {
    public static void reglas_juego (char[][] matriz, int[] variables) {
        int contador;
        int [][]contando = new int[variables[1]][variables[0]];
        for (int i = 0; i < variables[1]; i++) {
            for (int j = 0; j < variables[0]; j++) {
                contador=0;
                if ((i > 0) && (j > 0) && (i < variables[1] - 1) && (j < variables[0] - 1)) {
                    for (int a = (i - 1); a <= (i + 1); a++) {
                        for (int b = (j - 1); b <= (j + 1); b++) {
                            if((i==a)&&(j==b)){}else{
                                if (matriz[a][b] == 'X') {
                                    contando[i][j] = contador++;
                                }}

                        }
                    }
                }
                else if ((i == 0) && (j == 0)) {
                    for (int a = i; a <= i + 1; a++) {
                        for (int b = j; b <= j + 1; b++) {
                            if((i==a)&&(j==b)){}else{
                                if (matriz[a][b] == 'X') {
                                    contando[i][j] = contador++;
                                }}
                        }
                    }
                }
                else if( (i==variables[1]-1) &&(j==variables[0]-1) )
                {
                    for (int a = i-1; a <= i; a++) {
                        for (int b = j-1; b <= j; b++) {
                            if((i==a)&&(j==b)){}else{
                                if (matriz[a][b] == 'X') {
                                    contando[i][j] = contador++;
                                }}
                        }
                    }
                }
                else if( (i==0) &&(j==variables[0]-1) )
                {
                    for (int a = i; a <= i+1; a++) {
                        for (int b = j-1; b <= j; b++) {
                            if((i==a)&&(j==b)){}else{
                                if (matriz[a][b] == 'X') {
                                    contando[i][j] = contador++;
                                }}
                        }
                    }
                }
                else if( (i==variables[1]-1) &&(j==0) )
                {
                    for (int a = i-1; a <= i; a++) {
                        for (int b = j; b <= j+1; b++) {
                            if((i==a)&&(j==b)){}else{
                                if (matriz[a][b] == 'X') {
                                    contando[i][j] = contador++;
                                }}
                        }
                    }
                }
                else if((i!=0)&&(j==0)&& (i!=variables[1]-1)){
                    for (int a = i-1; a <= i + 1; a++) {
                        for (int b = j; b <= j+1; b++) {
                            if((i==a)&&(j==b)){}else{
                                if (matriz[a][b] == 'X') {
                                    contando[i][j] = contador++;
                                }}
                        }
                    }
                }
                else if((j!=0)&&(i==0)&& (j!=variables[1]-1)){
                    for (int a = i; a <= i + 1; a++) {
                        for (int b = j-1; b <= j + 1; b++) {
                            if((i==a)&&(j==b)){}else{
                                if (matriz[a][b] == 'X') {
                                    contando[i][j] = contador++;
                                }}
                        }
                    }
                }
                else if((j!=0)&&(i==variables[1]-1)&& (j!=variables[0]-1)){
                    for (int a = i-1; a <= i; a++) {
                        for (int b = j-1; b <= j + 1; b++) {
                            if((i==a)&&(j==b)){}else{
                                if (matriz[a][b] == 'X') {
                                    contando[i][j] = contador++;
                                }}
                        }
                    }
                }
                else if((j==variables[0]-1)&&(i!=0)&& (i!=variables[1]-1)){
                    for (int a = i-1; a <= i + 1; a++) {
                        for (int b = j-1; b <= j; b++) {
                            if((i==a)&&(j==b)){}else{
                                if (matriz[a][b] == 'X') {
                                    contando[i][j] = contador++;
                                }}
                        }
                    }
                }

            }
        }

        for (int i = 0; i < variables[1]; i++) {
            contador=0;
            for (int j = 0; j < variables[0]; j++) {
                if (contando[i][j] < 1) {
                    matriz[i][j] = '_';
                } else if (contando[i][j] > 2) {
                    matriz[i][j] = '_';
                } else if (contando[i][j] == 2) {
                    matriz[i][j] = 'X';
                }
            }}
    }
}
