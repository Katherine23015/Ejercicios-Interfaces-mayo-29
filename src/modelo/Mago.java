package modelo;

public class Mago extends Personaje {

    public Mago(String nombre, int puntosDeVida) {
        super(nombre, puntosDeVida);
    }

    @Override
    public String atacar() {
        return "El Mago " + nombre + " lanza una bola de fuego.";
    }
}