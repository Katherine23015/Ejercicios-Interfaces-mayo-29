import datos.IRegistroBatallas;
import datos.RegistroEnMemoria;
import vista.VentanaBatalla;

public class Main {
    public static void main(String[] args) {
        IRegistroBatallas persistenciaDeDatos = new RegistroEnMemoria();
        VentanaBatalla app = new VentanaBatalla(persistenciaDeDatos);
        app.setVisible(true);
    }
}