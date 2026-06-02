package datos;

import java.util.ArrayList;
import java.util.List;

public class RegistroEnMemoria implements IRegistroBatallas {
    private List<String> historial;

    public RegistroEnMemoria() {
        this.historial = new ArrayList<>();
    }

    @Override
    public void registrarAtaque(String accion) {
        this.historial.add(accion);
    }

    @Override
    public List<String> obtenerHistorial() {
        return new ArrayList<>(this.historial);
    }
}
