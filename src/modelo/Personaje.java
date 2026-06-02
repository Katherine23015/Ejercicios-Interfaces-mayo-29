package modelo;

public abstract class Personaje {
    protected String nombre;
    protected int puntosDeVida;

    public Personaje(String nombre, int puntosDeVida) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
    }

    public abstract String atacar();

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}