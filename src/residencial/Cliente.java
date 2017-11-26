package residencial;

public class Cliente extends Persona {

    int montoAPagar; //Atributo del monto que debe pagar el cliente
    boolean familia; //Atributo que verifica si el cliente tiene o no familia

    public Cliente(int montoAPagar, boolean familia, int id, String nombre, String apellidos, String genero, int edad) {
        super(id, nombre, apellidos, genero, edad);
        this.montoAPagar = montoAPagar;
        this.familia = familia;
    }

    @Override
    public String toString() {
        String fam;
        if (familia) {
            fam = "Si";
        } else {
            fam = "No";
        }
        return "Cliente " + nombre + " " + apellidos + "\n   Cedula: " + id + ", genero: "
                + genero + ", edad: " + edad + '.' + "\n   Monto a pagar: " + montoAPagar + ", familia: " + fam + '.';
    }

}
