/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencial;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Farat
 */
public class Administrador extends javax.swing.JFrame {

    
    public String Archivo;
    
    
    
    boolean b = true;
    
    public Administrador() {
        initComponents();
        
         this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_horaA = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        txt_diaA = new javax.swing.JTextField();
        btn_mostar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_anoA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Dia :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Hora:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eraser.png"))); // NOI18N
        btn_limpiar.setBorderPainted(false);
        btn_limpiar.setContentAreaFilled(false);
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 70, 50));

        btn_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar (2).png"))); // NOI18N
        btn_borrar.setBorderPainted(false);
        btn_borrar.setContentAreaFilled(false);
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 88, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Año:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));
        getContentPane().add(txt_horaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 140, -1));

        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add (4).png"))); // NOI18N
        btn_agregar.setBorderPainted(false);
        btn_agregar.setContentAreaFilled(false);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 70, 50));

        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/left-arrow - copia.png"))); // NOI18N
        btn_atras.setBorderPainted(false);
        btn_atras.setContentAreaFilled(false);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        txt_area.setEditable(false);
        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 103, 170, 250));
        getContentPane().add(txt_diaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 140, -1));

        btn_mostar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thin-printer-.png"))); // NOI18N
        btn_mostar.setBorderPainted(false);
        btn_mostar.setContentAreaFilled(false);
        btn_mostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_mostar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 88, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Administrador");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Guardar");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 360, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Borrar");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 360, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Eliminar");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Mostrar");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));
        getContentPane().add(txt_anoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 140, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/red-and-white-bars-hd-wallpaper-7530.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed

        
        txt_anoA.setText(null); //Limpiar textfield
        txt_diaA.setText(null); // limpiar el textfield
        txt_horaA.setText(null); // limpiar el textfield
       

    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed

        try {                                           
            
            File f = new File("Administrador.txt");
            FileWriter fw = null;
            try {
                fw = new FileWriter(f, false);
            } catch (IOException ex) {
                Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
            fw.write("");
            fw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "\n El Archivo se eliminó exitosamente! \n");
    

    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_mostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostarActionPerformed
            txt_area.setText("");
        try {
            FileInputStream Datos = new FileInputStream("Administrador.txt");
            DataInputStream Entrada = new DataInputStream(Datos);
            BufferedReader br = new BufferedReader(new InputStreamReader(Entrada));
            String Lineas;
            while ((Lineas = br.readLine()) != null) {
                txt_area.append(Lineas + "\n");

            }
            Entrada.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al abrir archivo  " + e);
        }
    }                                         

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            FileWriter Escribir = new FileWriter("Administrador.txt");
            String Texto = txt_area.getText();
            PrintWriter Imprime = new PrintWriter(Escribir);
            Imprime.print(Texto);
            Escribir.close();
            JOptionPane.showMessageDialog(null, "Texto guardado  ");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al abrir archivo  " + e);
        }
        
        
       
    }//GEN-LAST:event_btn_mostarActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        
        
        this.dispose();
        Empleados in = new Empleados();
        in.show();
        
        
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
         try {
            if (b) {

                File archivo = new File("./Administrador.txt");
                if (!archivo.exists()) {
                    archivo.createNewFile();
                }

                FileWriter fw = new FileWriter(archivo.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                String imprimir = "Recoger cuotas del Dia: ";
                imprimir += txt_diaA.getText() + " \nHora: ";
                imprimir += txt_horaA.getText() + "\nAño: ";
                imprimir += txt_anoA.getText()  + ".\n";
                imprimir += "---\n";
                bw.write(imprimir);
                bw.close();

                txt_diaA.setText(null);
                txt_horaA.setText(null);
                txt_anoA.setText(null);
               

            } else {

                String lineaActual;

                String unparsedFiles = "";
                BufferedReader br = null;
                br = new BufferedReader(new FileReader("./Administrador.txt"));

                while ((lineaActual = br.readLine()) != null) {

                    unparsedFiles += lineaActual + "\n";

                }

                br.close();

                FileWriter fw = new FileWriter("./Administrador.txt");

                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(unparsedFiles);

                String imprimir = "Recoger cuotas del Dia: ";
                imprimir += txt_diaA.getText() + "\nHora: ";
                imprimir += txt_horaA.getText() + "\nAño: ";
                imprimir += txt_anoA.getText()  + ".";
                imprimir += "---";
                bw.write(imprimir);
                bw.close();

                txt_diaA.setText(null);
                txt_horaA.setText(null);
                txt_anoA.setText(null);
               

                 
  
      
                
                
                
            }
         
            
            JOptionPane.showMessageDialog(null, "\nLos datos han sido agregados exitosamente\n");

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un problema al leer el Archivo.");
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Seleccione el archivo txt.");

        }

        b = false;
  
        
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_mostar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_anoA;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txt_diaA;
    private javax.swing.JTextField txt_horaA;
    // End of variables declaration//GEN-END:variables
}
