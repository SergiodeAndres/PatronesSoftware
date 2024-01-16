/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.interfaces;

import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JFrame;
import proyecto.clases.Creador;

/**
 *
 * @author diego
 */
public class CreadorCreacion extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenu
     */
    private JFrame principal;
    private Creador creador;
    public CreadorCreacion(JFrame v, Creador c) {
        initComponents();
        
        principal = v;
        principal.setVisible(false);
        this.setVisible(true);
        creador = c;
        
        jLabel10.setVisible(false);
        jTextField5.setVisible(false);
        jCheckBox1.setVisible(false);
        jCheckBox2.setVisible(false);
        jLabel11.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("CREADOR");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Descripción:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Limitaciones ténicas:");

        jLabel6.setText("Carátula:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel7.setText("Tipo producto:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Productividad", "Videojuego" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Versión actual:");

        jLabel9.setText("Tipo:");

        jLabel10.setText("Jugadores:");

        jCheckBox1.setText("Multijugador");

        jCheckBox2.setText("Online");

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Errores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(252, 252, 252))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2)
                                        .addComponent(jTextField3)
                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField2)
                                        .addComponent(jTextField4)
                                        .addComponent(jTextField5))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jButton1)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex()==0){
            jLabel8.setText("Versión actual:");
            jLabel9.setText("Tipo:");
            jLabel10.setVisible(false);
            jTextField5.setVisible(false);
            jCheckBox1.setVisible(false);
            jCheckBox2.setVisible(false);
        } else{
            jLabel8.setText("Géneros:");
            jLabel9.setText("Otras plataformas:");
            jLabel10.setVisible(true);
            jTextField5.setVisible(true);
            jCheckBox1.setVisible(true);
            jCheckBox2.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private String generarCodigoInterno(){
        String codigo = String.valueOf(LocalDateTime.now());
        codigo = codigo.replace("-", "");
        codigo = codigo.replace(".", "");
        codigo = codigo.replace(":", "");
        return codigo.replace("T","");
    }
    
    private ArrayList<String> procesarString(String texto){
        ArrayList<String> lista = new ArrayList<>();
        
        String [] partes = texto.split(", ");
        
        for (String parte:partes){
            lista.add(parte);
        }
        
        return lista;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = jTextField1.getText();
        String codigoInterno = generarCodigoInterno();
        String descripcion = jTextArea1.getText();
        LocalDate fecha = LocalDate.now();
        double precio = Double.valueOf(jTextField3.getText());
        String valoracion = "0.0";
        ArrayList<String> reviews = new ArrayList<>();
        String limitacionesTecnicas = jTextArea2.getText();
        boolean aprobado = false;
        
        if (jComboBox1.getSelectedIndex() == 0){
            String versionActual = jTextField2.getText();
            String tipo = jTextField4.getText();
            
            if (nombre.isEmpty()||descripcion.isEmpty()||limitacionesTecnicas.isEmpty()||
                    versionActual.isEmpty()||tipo.isEmpty()){
                
                
                
            }else {
                jLabel11.setText("Error: Relleno todos los campos.");
                jLabel11.setVisible(true);
                jLabel11.setForeground(Color.red);
            }
            
        }else {
            String generos = jTextField2.getText();
            String otrasPlataformas = jTextField4.getText();
            int jugadores = Integer.valueOf(jTextField5.getText());
            boolean multijugador = jCheckBox1.isSelected();
            boolean online = jCheckBox2.isSelected();
            
            if (nombre.isEmpty()||descripcion.isEmpty()||limitacionesTecnicas.isEmpty()||
                    generos.isEmpty()||otrasPlataformas.isEmpty()){
                
            }else {
                jLabel11.setText("Error: Rellene todos los campos.");
                jLabel11.setVisible(true);
                jLabel11.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}