package modelo;

public class Guerrero extends Personaje {

    public Guerrero(String nombre, int puntosDeVida) {
        super(nombre, puntosDeVida);
    }

    @Override
    public String atacar() {
        return "El Guerrero " + nombre + " ataca con su espada.";
    }
}