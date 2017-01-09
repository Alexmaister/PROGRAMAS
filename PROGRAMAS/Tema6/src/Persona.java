/**
 * Created by aortiz on 02/12/2016.
 */
public class Persona {

    private String Nombre;
    private int Edad;

    public Persona(){}

    public Persona(String nombre, int edad){

        this.Nombre=nombre;
        this.Edad=edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
}
