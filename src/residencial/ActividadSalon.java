/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencial;

/**
 *
 * @author lbren
 */
public class ActividadSalon extends Actividad{
    
    public ActividadSalon(Cliente cliente, int dia, int mes) {
        super(cliente, dia, mes);
    }
    @Override
    public String toStringL(){
        return this.cliente.nombre;
    }
}
