import java.io.Serializable;

public class Entrenador extends Integrante implements Serializable {
    private String sistemaDeJuego;
    private String estilo;

    public Entrenador(String nombre, int edad, String apellido, String sistemaDeJuego, String estilo) {
        super(nombre, edad, apellido);
        this.sistemaDeJuego = sistemaDeJuego;
        this.estilo = estilo;
    }

    public Entrenador(String sistemaDeJuego, String estilo) {
        this.sistemaDeJuego = sistemaDeJuego;
        this.estilo = estilo;
    }
}
