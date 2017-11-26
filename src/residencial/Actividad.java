package residencial;

import java.util.Date;

public class Actividad {
    Cliente cliente;
    Date date = new Date();
    int diaActual = date.getDate();
    int mesActual = date.getMonth();
    int dia;
    int mes;
    
    public Actividad(Cliente cliente, int dia, int mes) {
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
    }
    public String toStringL(){
        return this.cliente.nombre;
    }
}
