/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3A;

import java.awt.event.KeyEvent;

/**
 *
 * @author Rubén
 */
public class Calcular_Imc extends javax.swing.JFrame {

    Persona p = new Persona();
    /**
     * Creates new form Calcular_Imc
     */
    public Calcular_Imc() {
        initComponents();
        this.setTitle("Calcular Imc");
        txt_titulo.setText("Calcular Imc");
        jLabel1.setText("Nombre:");
        jLabel2.setText("Ocupación:");
        jLabel3.setText("Lugar de estudio:");
        ch_profesion.setText("Profesión");
        jLabel5.setText("Peso:");
        jLabel6.setText("Estatura:");
        jLabel7.setText("Edad");
        txt_imc.setText("IMC:");
        txt_profesion.setText("Profesión:");
        txt_mayor.setText("Mayor de edad:");
        b_guardar.setText("Guardar");
        b_limpiar.setText("Limpiar");
        ch_profesion.isSelected();
    }

    public void Guardar() {
        try {
            p.setNombre(txf_nombre.getText());
            p.setOcupacion(txf_ocupacion.getText());
            p.setLugar_de_estudio(txf_lugar_de_estudio.getText());
            p.setPeso(Float.parseFloat(txf_peso.getText()));
            p.setEstatura(Float.parseFloat(txf_estatura.getText()));
            p.setEdad(Byte.parseByte(txf_edad.getText()));
            if(ch_profesion.isSelected())
            {
                p.setProfesion(txf_profesion.getText());
                txt_profesion.setText("Profesión: "+p.getProfesion());
            }
            else
                txt_profesion.setText("Profesión: No tiene.");
            txt_imc.setText("IMC: "+p.CalculoIMC());
            txt_mayor.setText(p.Checar_Edad());
        } catch (Exception ex) {
            System.out.println("Error: "+ex);
        }

    }

    public void Teclado(int teclado) {
        if (teclado == KeyEvent.VK_ENTER) {
            Guardar();
        }
    }

    public void Limpiar() {
        // Limpiar cálculo IMC
        txt_imc.setText("IMC:");
        // Limpiar jTextField
        txf_nombre.setText("");
        txf_ocupacion.setText("");
        txf_lugar_de_estudio.setText("");
        txf_peso.setText("");
        txf_estatura.setText("");
        txf_edad.setText("");
        txf_profesion.setText("");
        txt_profesion.setText("Profesión:");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txf_lugar_de_estudio = new javax.swing.JTextField();
        txf_peso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txf_estatura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txf_edad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txf_profesion = new javax.swing.JTextField();
        b_guardar = new javax.swing.JButton();
        txt_imc = new javax.swing.JLabel();
        txf_nombre = new javax.swing.JTextField();
        txf_ocupacion = new javax.swing.JTextField();
        txt_titulo = new javax.swing.JLabel();
        b_limpiar = new javax.swing.JButton();
        ch_profesion = new javax.swing.JCheckBox();
        txt_profesion = new javax.swing.JLabel();
        txt_mayor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        txf_profesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txf_profesionKeyPressed(evt);
            }
        });

        b_guardar.setText("jButton1");
        b_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_guardarActionPerformed(evt);
            }
        });

        txt_imc.setText("jLabel8");

        txt_titulo.setText("jLabel8");

        b_limpiar.setText("jButton1");
        b_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limpiarActionPerformed(evt);
            }
        });

        ch_profesion.setText("jCheckBox1");
        ch_profesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_profesionActionPerformed(evt);
            }
        });

        txt_profesion.setText("jLabel4");

        txt_mayor.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txt_titulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(b_guardar)
                                .addGap(61, 61, 61)
                                .addComponent(b_limpiar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ch_profesion)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_lugar_de_estudio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txf_ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txf_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(58, 58, 58)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_mayor)
                                            .addComponent(txt_profesion)
                                            .addComponent(txt_imc)))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 148, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_titulo)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_imc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txf_ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txf_lugar_de_estudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_profesion))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txf_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mayor))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txf_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ch_profesion))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_guardar)
                    .addComponent(b_limpiar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_guardarActionPerformed
        // Botón Guardar
        Guardar();
    }//GEN-LAST:event_b_guardarActionPerformed

    private void txf_profesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_profesionKeyPressed
        // Teclado Enter
        Teclado(evt.getKeyCode());
    }//GEN-LAST:event_txf_profesionKeyPressed

    private void b_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiarActionPerformed
        // Botón Limpiar
        Limpiar();
    }//GEN-LAST:event_b_limpiarActionPerformed

    private void ch_profesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_profesionActionPerformed
        if (ch_profesion.isSelected()) {
            txf_profesion.show();
        } else {
            txf_profesion.hide();
        }
    }//GEN-LAST:event_ch_profesionActionPerformed

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
            java.util.logging.Logger.getLogger(Calcular_Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcular_Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcular_Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcular_Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcular_Imc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_guardar;
    private javax.swing.JButton b_limpiar;
    private javax.swing.JCheckBox ch_profesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txf_edad;
    private javax.swing.JTextField txf_estatura;
    private javax.swing.JTextField txf_lugar_de_estudio;
    private javax.swing.JTextField txf_nombre;
    private javax.swing.JTextField txf_ocupacion;
    private javax.swing.JTextField txf_peso;
    private javax.swing.JTextField txf_profesion;
    private javax.swing.JLabel txt_imc;
    private javax.swing.JLabel txt_mayor;
    private javax.swing.JLabel txt_profesion;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}