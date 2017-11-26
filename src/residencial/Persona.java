package residencial;

public class Persona {
    int id;
    String nombre;
    String apellidos;
    String genero;
    int edad;

    public Persona(int id, String nombre, String apellidos, String genero, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona\r\n" + "nombre: " + nombre + ", id: " + id + ", apellidos: " + apellidos + ", genero: " + genero + ", edad: " + edad + '.';
    }
}
