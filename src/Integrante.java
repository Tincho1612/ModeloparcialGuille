import java.io.Serializable;

public class Integrante implements Serializable {
    private String nombre;
    private int edad;
    private String apellido;

    public Integrante(String nombre, int edad, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    public Integrante() {
    }
}
