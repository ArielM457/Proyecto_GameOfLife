package procesos;

public class TiempoEjecucion {
    public static void tiempo(int tiempo) {
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
