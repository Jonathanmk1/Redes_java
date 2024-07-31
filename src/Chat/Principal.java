
package Chat;

/**
 *
 * @author Jonathan sanro
 */

public class Principal {

    public static void main(String[] args) {
        // Inicia el servidor en un hilo separado
        new Thread(new Runnable() {
            public void run() {
                Servidor.main(new String[]{});
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                Cliente.main(new String[]{});
            }
        }).start();
    }
}