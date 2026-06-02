package datos;

import java.util.List;

public interface IRegistroBatallas {
    void registrarAtaque(String accion);
    List<String> obtenerHistorial();
}