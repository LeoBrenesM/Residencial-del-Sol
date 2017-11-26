/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencial;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class Hora extends Thread{
    
    private JLabel hora;//crea un label llamado hora

    public Hora(JLabel hora) {

        this.hora = hora;
    }

    @Override
    public void run() {

        while (true) {

            Date hoy = new Date();
            SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
            if (hoy.getHours()>12) {
                hora.setText(f.format(hoy)+" PM");
            } else{
                hora.setText(f.format(hoy)+" AM");
            }

            try {
                sleep(100);
            } catch (Exception e) {
            }
        }
    }
}
