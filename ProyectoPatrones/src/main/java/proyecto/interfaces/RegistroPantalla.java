/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.interfaces;

import java.awt.Color;
import java.util.ArrayList;
import proyecto.clases.*;

/**
 *
 * @author diego
 */
public class RegistroPantalla extends javax.swing.JFrame {
    private Servidor proxy=new Proxy(new ServidorBBDD());
    /**
     * Creates new form RegistroPantalla
     */
    public RegistroPantalla() {
        
        initComponents();
        jComboBox3.setVisible(false);
        jTextField3.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Correo: ");

        jLabel3.setText("Contraseña: ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Registrate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("País:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "España", "E.E.U.U", "Francia", "Portugal", "Reino Unido" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Creador" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Rol:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AAA", "Indie" }));

        jLabel6.setText("Tipo de creador:");

        jLabel7.setText("Cuenta: ");

        jTextField3.setToolTipText("");

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Error: Tarjeta no introducida");

        jButton2.setText("Atrás");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, 269, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(68, 68, 68)
                .addComponent(jLabel8)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTextField1.getAccessibleContext().setAccessibleName("TextNombre");
        jTextField2.getAccessibleContext().setAccessibleName("Correo Texto");
        jButton1.getAccessibleContext().setAccessibleName("BotonRegistro");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Se guaardan las variables de usuario comunes
        String usuarioNombre = jTextField1.getText();
        String usuarioCorreo = jTextField2.getText();
        String usuarioContrasena = jPasswordField1.getText();
        String usuarioPais = jComboBox1.getSelectedItem().toString();
        if (jTextField1.getText().isEmpty()){
            jLabel8.setText("Error: Nombre de usuario no valido");
            jLabel8.setVisible(true);
            jLabel8.setForeground(Color.red);
        }else if (jTextField2.getText().isEmpty()){
            jLabel8.setText("Error: Correo de usuario no valido");
            jLabel8.setVisible(true);
            jLabel8.setForeground(Color.red);
        }else if (jPasswordField1.getText().isEmpty()){
            jLabel8.setText("Error: Contraseña no valida");
            jLabel8.setVisible(true);
            jLabel8.setForeground(Color.red);
        }else{
            if (jComboBox2.getSelectedIndex()==0){
            
                ArrayList<String> notificaciones = new ArrayList<>();
                ArrayList<CodigoDescuento> llavero = new ArrayList<>();
                ArrayList<Producto> libreria = new ArrayList<>();
                Cliente cl = new Cliente(usuarioNombre,usuarioPais,notificaciones,llavero,libreria,0,usuarioCorreo,usuarioContrasena);
                switch (proxy.correoValido(usuarioCorreo)) {
                    case 0 -> {
                        proxy.addCliente(cl);
                        proxy.guardarClientes();
                        jLabel8.setText("Registro Exitoso");
                        jLabel8.setForeground(Color.green);
                        jLabel8.setVisible(true);
                        Inicio inicio = new Inicio();
                        this.setVisible(false);
                        inicio.setVisible(true);
                    }
                    case 1 -> {
                        jLabel8.setText("Correo ya existente");
                        jLabel8.setVisible(true);
                        jLabel8.setForeground(Color.red);
                    }
                    default -> {
                        jLabel8.setText("Correo no existente");
                        jLabel8.setVisible(true);
                        jLabel8.setForeground(Color.red);
                    }
                }

            } else {
                String tipoCreador = jComboBox3.getSelectedItem().toString();
                String tarjeta = jTextField3.getText();
                if (jTextField3.getText().isEmpty()){
                    jLabel8.setVisible(true);
                }else{
                    CuentaBancaria cb = new CuentaBancaria(tarjeta,0);
                    Creador cr = new Creador(usuarioNombre,usuarioPais,tipoCreador,cb,usuarioCorreo,usuarioContrasena);
                    switch (proxy.correoValido(usuarioCorreo)) {
                        case 0 -> {
                            proxy.addCreadores(cr);
                            proxy.guardarCreadores();
                            jLabel8.setText("Registro Exitoso");
                            jLabel8.setForeground(Color.green);
                            jLabel8.setVisible(true);
                            Inicio inicio = new Inicio();
                            this.setVisible(false);
                            inicio.setVisible(true);
                        }
                        case 1 -> {
                            jLabel8.setText("Correo ya existente");
                            jLabel8.setVisible(true);
                            jLabel8.setForeground(Color.red);
                        }
                        default -> {
                            jLabel8.setText("Correo no existente");
                            jLabel8.setVisible(true);
                            jLabel8.setForeground(Color.red);
                        }
                    }
                }
            }
        }
        
        
        
        
        //proxy.guardarClientes();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if (jComboBox2.getSelectedIndex() == 0){
            jComboBox3.setVisible(false);
            jTextField3.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
        }else{
            jComboBox3.setVisible(true);
            jTextField3.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio inicio = new Inicio();
        this.setVisible(false);
        inicio.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
