/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.interfaces;
import proyecto.clases.*;
import javax.swing.JFrame;

/**
 *
 * @author sergi
 */
public class ClienteLlavero extends javax.swing.JFrame {

    /**
     * Creates new form ClienteLlavero
     */
    private JFrame principal;
    private Cliente cliente; 
    public ClienteLlavero(JFrame v, Cliente c) {
        initComponents();
        principal = v;
        principal.setVisible(false);
        this.setVisible(true);
        cliente = c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemLibreria = new javax.swing.JMenuItem();
        jMenuItemLlavero = new javax.swing.JMenuItem();
        jMenuItemSaldo = new javax.swing.JMenuItem();
        jMenuItemTienda = new javax.swing.JMenuItem();
        jMenuItemNotificacion = new javax.swing.JMenuItem();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Menú");

        jMenuItemLibreria.setText("Librería");
        jMenuItemLibreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLibreriaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemLibreria);

        jMenuItemLlavero.setText("Llavero");
        jMenuItemLlavero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLlaveroActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemLlavero);

        jMenuItemSaldo.setText("Saldo");
        jMenuItemSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaldoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSaldo);

        jMenuItemTienda.setText("Tienda");
        jMenuItemTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTiendaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemTienda);

        jMenuItemNotificacion.setText("Notificaciones");
        jMenuItemNotificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNotificacionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNotificacion);

        jMenuItemCerrarSesion.setText("Cerrar Sesión");
        jMenuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCerrarSesion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemLibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLibreriaActionPerformed
        ClienteLibreria c = new ClienteLibreria(this, cliente);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItemLibreriaActionPerformed

    private void jMenuItemLlaveroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLlaveroActionPerformed
        ClienteLlavero c = new ClienteLlavero(this, cliente);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItemLlaveroActionPerformed

    private void jMenuItemSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaldoActionPerformed
        ClienteSaldo c = new ClienteSaldo(this, cliente);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItemSaldoActionPerformed

    private void jMenuItemTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTiendaActionPerformed
        Tienda c = new Tienda(this, cliente);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItemTiendaActionPerformed

    private void jMenuItemNotificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNotificacionActionPerformed
        ClienteNotificaciones c = new ClienteNotificaciones(this, cliente);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItemNotificacionActionPerformed

    private void jMenuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarSesionActionPerformed
        Inicio inicio = new Inicio();
        this.setVisible(false);
        inicio.setVisible(true);
    }//GEN-LAST:event_jMenuItemCerrarSesionActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemLibreria;
    private javax.swing.JMenuItem jMenuItemLlavero;
    private javax.swing.JMenuItem jMenuItemNotificacion;
    private javax.swing.JMenuItem jMenuItemSaldo;
    private javax.swing.JMenuItem jMenuItemTienda;
    // End of variables declaration//GEN-END:variables
}