/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.interfaces;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import proyecto.clases.*;

/**
 *
 * @author sergi
 */
public class ClienteNotificaciones extends javax.swing.JFrame {
    private Servidor proxy=new Proxy(new ServidorBBDD());
    /**
     * Creates new form ClienteNotificaciones
     */
    private JFrame principal;
    private Cliente cliente;
    public ClienteNotificaciones(JFrame v, Cliente c) {
        initComponents();
        principal = v;
        principal.setVisible(false);
        this.setVisible(true);
        cliente = c;
        String notificaciones = "";
        for (String n: cliente.getNotificaciones())
        {
            notificaciones += n;
            notificaciones += "\n";
        }
        jTextAreaNotificaciones.setText(notificaciones);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaNotificaciones = new javax.swing.JTextArea();
        jButtonBorrarNotificaciones = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemLibreria = new javax.swing.JMenuItem();
        jMenuItemLlavero = new javax.swing.JMenuItem();
        jMenuItemSaldo = new javax.swing.JMenuItem();
        jMenuItemTienda = new javax.swing.JMenuItem();
        jMenuItemNotificacion = new javax.swing.JMenuItem();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Notificaciones");

        jTextAreaNotificaciones.setEditable(false);
        jTextAreaNotificaciones.setColumns(20);
        jTextAreaNotificaciones.setRows(5);
        jScrollPane2.setViewportView(jTextAreaNotificaciones);

        jButtonBorrarNotificaciones.setText("Borrar Notificaciones");
        jButtonBorrarNotificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarNotificacionesActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jButtonBorrarNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBorrarNotificaciones)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBorrarNotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarNotificacionesActionPerformed
        cliente.setNotificaciones(new ArrayList<>());
        proxy.guardarClientes();
        String notificaciones = "";
        for (String n: cliente.getNotificaciones())
        {
            notificaciones += n;
            notificaciones += "\n";
        }
        jTextAreaNotificaciones.setText(notificaciones);
    }//GEN-LAST:event_jButtonBorrarNotificacionesActionPerformed

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
    private javax.swing.JButton jButtonBorrarNotificaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemLibreria;
    private javax.swing.JMenuItem jMenuItemLlavero;
    private javax.swing.JMenuItem jMenuItemNotificacion;
    private javax.swing.JMenuItem jMenuItemSaldo;
    private javax.swing.JMenuItem jMenuItemTienda;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaNotificaciones;
    // End of variables declaration//GEN-END:variables
}
