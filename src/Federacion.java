import java.io.*;
import java.util.ArrayList;

public class Federacion implements Serializable {
    private String nombre;
    private String fechaFundacion;
    private int cantidadMundiales;
    ArrayList<Integrante>miembros;

    public Federacion(String nombre, String fechaFundacion, int cantidadMundiales, ArrayList<Integrante> miembros) {
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.cantidadMundiales = cantidadMundiales;
        this.miembros = miembros;
    }

    public Federacion(String nombre, String fechaFundacion, int cantidadMundiales) {
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.cantidadMundiales = cantidadMundiales;
    }
    public void exportarFederacion(String path){
        File federacion = new File(path);
        try{
            ObjectOutputStream aux = new ObjectOutputStream(new FileOutputStream(federacion));
            aux.writeObject(this);
            aux.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
    public void agregarJugador (Furbolista dato){
        int cantidadFutbolista=0;
        for (Integrante aux:miembros){
            if (aux instanceof Furbolista){
                cantidadFutbolista++;
            }
        }
        if (cantidadFutbolista <23){
            miembros.add(dato);
            System.out.println("Agregado correctamente");

        }
        else {
            System.out.println("El dato no se aniadio porque la capacidad maxima de futbolistas fue alcanzada ");
        }
    }
    public void agregarEntrenador (Entrenador dato) throws IOException{
        int cantidadEntrenadores=0;
        for (Integrante aux:miembros){
            if (aux instanceof Entrenador){
                cantidadEntrenadores++;
            }
        }
        if (cantidadEntrenadores == 0){
            miembros.add(dato);
            System.out.println("Agregado correctamente");

        }
        else {
            System.out.println("El dato no se aniadio porque la capacidad maxima de Entrenadores fue alcanzada ");
            throw new IOException("Dato mal");
        }
    }
}
