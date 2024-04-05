package poblaciones;

public class Poblacion {
    public static String poblacion(String []args, int []variables)
    {
        int b= (variables[0]*variables[1])+(variables[1]-1);
        String []caracteres = new String[b];
        String pob_inicial="";
        int a;
        int c=1;
        String palabra;
        String [] partes = args[4].split("=");
        if(partes[0].equals("p")) {
            if (partes[1].equals("rnd")) {

                for(int j=0; j< caracteres.length;j++){

                    if(c==variables[0]+1 )
                    {
                        caracteres[j]="#";
                        c=1;
                    }
                    else{

                        a =(int) (Math.random() * 2 );
                        palabra= String.valueOf(a);
                        caracteres[j] = palabra;
                        c++;
                    }}
                for(int j=0; j< caracteres.length;j++){
                    pob_inicial = pob_inicial+caracteres[j];
                }
            } else {
                pob_inicial = partes[1];

            }
            if (pob_inicial.startsWith("#")) {
                pob_inicial = "0" + pob_inicial;
            }
            System.out.println(pob_inicial);
        }

        return pob_inicial;
    }
}
