/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencial;

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
public class Conserje extends javax.swing.JFrame {
    


    public Conserje() {
        
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        txt_diaA = new javax.swing.JTextField();
        txt_horaA = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_diaB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_horaB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_mostrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_diaC = new javax.swing.JTextField();
        txt_horaC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_anoA = new javax.swing.JTextField();
        btn_atras = new javax.swing.JButton();
        txt_anoB = new javax.swing.JTextField();
        txt_anoC = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1306, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Recoleccion de Basura");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar (2).png"))); // NOI18N
        btn_eliminar.setContentAreaFilled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, 50));
        getContentPane().add(txt_diaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 100, -1));
        getContentPane().add(txt_horaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 100, -1));

        txt_area.setEditable(false);
        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 168, 250));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Dia :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Hora:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Año:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("pasillos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Mantenimiento del Aseo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));
        getContentPane().add(txt_diaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Dia :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));
        getContentPane().add(txt_horaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 100, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Hora:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Año:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        btn_mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thin-printer-.png"))); // NOI18N
        btn_mostrar.setContentAreaFilled(false);
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Mantenimiento de las Areas Verdes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));
        getContentPane().add(txt_diaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 80, -1));
        getContentPane().add(txt_horaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 80, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Dia :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Hora:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Año:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add (4).png"))); // NOI18N
        btn_agregar.setContentAreaFilled(false);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 70, 50));

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eraser.png"))); // NOI18N
        btn_limpiar.setContentAreaFilled(false);
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 70, 50));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Eliminar");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Guardar");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Borrar");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Mostrar");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));
        getContentPane().add(txt_anoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 100, -1));

        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/left-arrow - copia.png"))); // NOI18N
        btn_atras.setContentAreaFilled(false);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));
        getContentPane().add(txt_anoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 100, -1));
        getContentPane().add(txt_anoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 80, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/red-and-white-bars-hd-wallpaper-7530.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed

        this.dispose();
        Empleados in = new Empleados();
        in.show();

    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed

        txt_anoA.setText(null); // limpiar el textfield
        txt_diaA.setText(null); // limpiar el textfield
        txt_anoB.setText(null); // limpiar el textfield
        txt_diaB.setText(null); // limpiar el textfield
        txt_anoC.setText(null); // limpiar el textfield
        txt_diaC.setText(null); // limpiar el textfield

    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        try {

            File f = new File("Conserje.txt");
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

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if (!txt_diaA.getText().equals("")) {
            try {
                if (!(txt_diaA.getText().equals("") && txt_horaA.getText().equals("") && txt_anoA.getText().equals(""))) {

                    File archivo = new File("./Conserje.txt");
                    if (!archivo.exists()) {
                        archivo.createNewFile();
                    }
                    FileWriter fw = new FileWriter(archivo.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);
                    String imprimir = "Recolección de Basura\nDia: ";
                    imprimir += txt_diaA.getText() + "\nHora: ";
                    imprimir += txt_horaA.getText() + "\nAño: ";
                    imprimir += txt_anoA.getText() + ".\n ";
                    imprimir += "---\n";
                    bw.write(imprimir);
                    bw.close();

                    txt_diaA.setText(null);
                    txt_horaA.setText(null);
                    txt_anoA.setText(null);
                    txt_diaB.setText(null);
                    txt_horaB.setText(null);
                    txt_anoB.setText(null);
                    txt_diaC.setText(null);
                    txt_horaC.setText(null);
                    txt_anoC.setText(null);

                    JOptionPane.showMessageDialog(null, "Los datos de recoleccion de basura\nhan sido agregados exitosamente\n");
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Archivo no encontrado.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Hubo un problema al leer el Archivo.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ingresaste unos datos mal, favor intentalo de nuevo");
            }
        } else if (!txt_diaB.getText().equals("")) {
            try {
                if (!(txt_diaB.getText().equals("") && txt_horaB.getText().equals("") && txt_anoB.getText().equals(""))) {

                    File archivo = new File("./Conserje.txt");
                    if (!archivo.exists()) {
                        archivo.createNewFile();
                    }
                    FileWriter fw = new FileWriter(archivo.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);
                    String imprimir = "Mantenimiento de limpieza\nDia: ";
                    imprimir += txt_diaB.getText() + "\nHora: ";
                    imprimir += txt_diaB.getText() + "\nAño del Aseo: ";
                    imprimir += txt_anoB.getText();
                    imprimir += "---\n";
                    bw.write(imprimir);
                    bw.close();

                    txt_diaA.setText(null);
                    txt_horaA.setText(null);
                    txt_anoA.setText(null);
                    txt_diaB.setText(null);
                    txt_horaB.setText(null);
                    txt_anoB.setText(null);
                    txt_diaC.setText(null);
                    txt_horaC.setText(null);
                    txt_anoC.setText(null);

                    JOptionPane.showMessageDialog(null, "Los datos de mantenimiento de limpieza\nhan sido agregados exitosamente\n");
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Archivo no encontrado.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Hubo un problema al leer el Archivo.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ingresaste unos datos mal, favor intentalo de nuevo");
            }
        } else if (!txt_diaC.getText().equals("")) {
            try {
                if (!(txt_diaC.getText().equals("") && txt_horaC.getText().equals("") && txt_anoC.getText().equals(""))) {

                    File archivo = new File("./Conserje.txt");
                    if (!archivo.exists()) {
                        archivo.createNewFile();
                    }
                    FileWriter fw = new FileWriter(archivo.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);
                    String imprimir = "Mantenimiento de las Areas Verdes\nDia: ";
                    imprimir += txt_diaC.getText() + "\nHora de Areas Verdes: ";
                    imprimir += txt_horaC.getText() + "\nAño de Areas Verdes: ";
                    imprimir += txt_anoC.getText() + ",";
                    imprimir += "---\n";
                    bw.write(imprimir);
                    bw.close();

                    txt_diaA.setText(null);
                    txt_horaA.setText(null);
                    txt_anoA.setText(null);
                    txt_diaB.setText(null);
                    txt_horaB.setText(null);
                    txt_anoB.setText(null);
                    txt_diaC.setText(null);
                    txt_horaC.setText(null);
                    txt_anoC.setText(null);

                    JOptionPane.showMessageDialog(null, "Los datos de mantenimiento de areas verdes\nhan sido agregados exitosamente\n");
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Archivo no encontrado.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Hubo un problema al leer el Archivo.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ingresaste unos datos mal, favor intentalo de nuevo");
            }
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed

        try {
            FileInputStream Datos = new FileInputStream("Conserje.txt");
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
                FileWriter Escribir = new FileWriter("Conserje.txt");
                String Texto = txt_area.getText();
                PrintWriter Imprime = new PrintWriter(Escribir);
                Imprime.print(Texto);
                Escribir.close();
                JOptionPane.showMessageDialog(null, "Texto guardado  ");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al abrir archivo  " + e);
            }

    }//GEN-LAST:event_btn_mostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Conserje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conserje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conserje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conserje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conserje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_anoA;
    private javax.swing.JTextField txt_anoB;
    private javax.swing.JTextField txt_anoC;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txt_diaA;
    private javax.swing.JTextField txt_diaB;
    private javax.swing.JTextField txt_diaC;
    private javax.swing.JTextField txt_horaA;
    private javax.swing.JTextField txt_horaB;
    private javax.swing.JTextField txt_horaC;
    // End of variables declaration//GEN-END:variables
}
