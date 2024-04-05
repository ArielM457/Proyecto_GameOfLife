package argumentos;

public class AsignacionArgs {
    public static int[] asignacion(String[] args) {
        int[] variables = new int[4];
        for (int i = 0; i < args.length; i++) {
            String[] partes = args[i].split("=");
            if (partes[0].equals("w")) {
                int valor_w = Integer.parseInt(partes[1]);
                if ((valor_w == 10) || (valor_w == 20) || (valor_w == 40) || (valor_w == 80)) {
                    variables[0] = valor_w;
                } else {
                    System.out.println("no ingreso un valor valido: 10, 20, 40, 80 el codigo no funcionara");
                    System.exit(1);
                }
            } else if (partes[0].equals("h")) {
                int valor_h = Integer.parseInt(partes[1]);
                if ((valor_h == 10) || (valor_h == 20) || (valor_h == 40)) {
                    variables[1] = valor_h;
                } else {
                    System.out.println("no ingreso un valor valido: 10, 20, 40 el codigo no funcionara");
                    System.exit(1);
                }
            } else if (partes[0].equals("g")) {
                int valor_g = Integer.parseInt(partes[1]);
                if (valor_g >= 0) {
                    variables[2] = valor_g;
                } else {
                    System.out.println("no ingreso un valor valido:250, 1000 el codigo no funcionara");
                    System.exit(1);
                }
            } else if (partes[0].equals("s")) {
                int valor_s = Integer.parseInt(partes[1]);
                if ((valor_s == 250) || (valor_s == 1000)) {
                    variables[3] = valor_s;
                } else {
                    System.out.println("no ingreso un valor valido:250, 1000 el codigo no funcionara");
                    System.exit(1);
                }
            }
        }
        return variables;
    }
}
