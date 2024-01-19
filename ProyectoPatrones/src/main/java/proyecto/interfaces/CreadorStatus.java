/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.interfaces;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.clases.Antivirus;
import proyecto.clases.Creador;
import proyecto.clases.LecturaBBDD;
import proyecto.clases.Productividad;
import proyecto.clases.Producto;
import proyecto.clases.Proxy;
import proyecto.clases.Servidor;
import proyecto.clases.ServidorBBDD;
import proyecto.clases.Videojuego;

/**
 *
 * @author diego
 */
public class CreadorStatus extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenu
     */
    private JFrame principal;
    private Creador creador;
    private DefaultTableModel mt = new DefaultTableModel();
    private LecturaBBDD productos = null;
    private Servidor proxy = new Proxy(new ServidorBBDD());
    
    public CreadorStatus(JFrame v, Creador c) {
        initComponents();
        
        principal = v;
        principal.setVisible(false);
        this.setVisible(true);
        creador = c;
        jLabel2.setText("Nombre de usuario: " + c.getNombreUsuario());
        jLabel3.setText("País: " + c.getPais());
        jLabel4.setText("Tipo: " + c.getTipo());
        jLabel5. setText("Número de cuenta: " + c.getCuentaBancaria().getNumeroCuenta());
        
        String [] ids = {"Nombre", "Fecha creación", "Precio", "Valoración", "Estado"};
        
        mt.setColumnIdentifiers(ids);
        
        jTable1.setModel(mt);
        
        cargarTabla();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("CREADOR");

        jLabel2.setText("Nombre de usuario:");

        jLabel3.setText("País:");

        jLabel4.setText("Tipo:");

        jLabel5.setText("Número de cuenta:");

        jLabel6.setText("Productos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Descuentos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Información");

        jButton5.setText("Actualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cerrar sesion");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(300, 300, 300)
                                .addComponent(jLabel4))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarTabla(){
        if (productos == null){
            productos = new LecturaBBDD(proxy.getVideojuegos(),proxy.getProductividad(),
                    proxy.getAntivirus());
        }else {
            productos.setListaVideojuegos(proxy.getVideojuegos());
            productos.setListaProductividad(proxy.getProductividad());
            productos.setListaAntivirus(proxy.getAntivirus());
        }
        
        for (Videojuego v:productos.getListaVideojuegosPorCreador(creador)){
            mt.addRow(new Object[]{v.getNombre(), v.getFechaCreacion(), v.getPrecio(creador), v.getValoracionGeneral(),
                v.isAprobado()});
        }
        
        for (Productividad p:productos.getListaProductividadPorCreador(creador)){
            mt.addRow(new Object[]{p.getNombre(), p.getFechaCreacion(), p.getPrecio(creador), p.getValoracionGeneral(),
                p.isAprobado()});
        }
        
        for (Antivirus a:productos.getListaAntivirusPorCreador(creador)){
            mt.addRow(new Object[]{a.getNombre(), a.getFechaCreacion(), a.getPrecio(creador), a.getValoracionGeneral(), 
                a.isAprobado()});
        }
    }
    private void vaciarTabla(){
        int rows = mt.getRowCount();
        
        for (int i = 0; i < rows; i++){
            mt.removeRow(0);
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CreadorCreacion cc = new CreadorCreacion(this, creador);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        vaciarTabla();
        cargarTabla();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        principal.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int posicion = jTable1.getSelectedRow();
        
        if (posicion >= 0){
            if (posicion < productos.getListaVideojuegosPorCreador(creador).size()){
                CreadorModificacion cm = new CreadorModificacion(this, creador,
                        productos.getListaVideojuegosPorCreador(creador).get(posicion), "Videojuego",false);
            } else{
                posicion -= productos.getListaVideojuegosPorCreador(creador).size();
                
                if (posicion < productos.getListaProductividadPorCreador(creador).size()){
                    CreadorModificacion cm = new CreadorModificacion(this, creador,
                        productos.getListaProductividadPorCreador(creador).get(posicion), "Productividad",false);
                }else {
                    posicion -= productos.getListaProductividadPorCreador(creador).size();
                    CreadorModificacion cm = new CreadorModificacion(this, creador,
                        productos.getListaAntivirusPorCreador(creador).get(posicion), "Antivirus",false);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Error: No ha seleccionado ningún producto.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int posicion = jTable1.getSelectedRow();
        
        if (posicion >= 0){
            if (posicion < productos.getListaVideojuegosPorCreador(creador).size()){
                CreadorDescuentos cd = new CreadorDescuentos(this,
                        (Producto) productos.getListaVideojuegosPorCreador(creador).get(posicion),false);
            } else{
                posicion -= productos.getListaVideojuegosPorCreador(creador).size();
                
                if (posicion < productos.getListaProductividadPorCreador(creador).size()){
                    CreadorDescuentos cd = new CreadorDescuentos(this, 
                            (Producto) productos.getListaProductividadPorCreador(creador).get(posicion),false);
                }else {
                    posicion -= productos.getListaProductividadPorCreador(creador).size();
                    CreadorDescuentos cd = new CreadorDescuentos(this, 
                            (Producto) productos.getListaAntivirusPorCreador(creador).get(posicion),false);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Error: No ha seleccionado ningún producto.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
