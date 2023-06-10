import java.io.Serializable;

public class Furbolista extends Integrante implements Serializable {
    private int numeroCamiseta;
    private String puesto;

    public Furbolista(String nombre, int edad, String apellido, int numeroCamiseta, String puesto) {
        super(nombre, edad, apellido);
        this.numeroCamiseta = numeroCamiseta;
        this.puesto = puesto;
    }

    public Furbolista(int numeroCamiseta, String puesto) {
        this.numeroCamiseta = numeroCamiseta;
        this.puesto = puesto;
    }
}
