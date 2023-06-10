import java.io.Serializable;

public class Masajista extends Integrante implements Serializable {
    private String titulo;
    private int aniosExp;

    public Masajista(String nombre, int edad, String apellido, String titulo, int aniosExp) {
        super(nombre, edad, apellido);
        this.titulo = titulo;
        this.aniosExp = aniosExp;
    }

    public Masajista(String titulo, int aniosExp) {
        this.titulo = titulo;
        this.aniosExp = aniosExp;
    }
}
