/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.interfaces;

import java.util.ArrayList;
import proyecto.clases.*;

/**
 *
 * @author diego
 */
public class EspecificacionesProductoAdmin extends javax.swing.JFrame {
    private Servidor proxy = new Proxy(new ServidorBBDD());
    private LecturaBBDD lectura = new LecturaBBDD(proxy.getVideojuegos(), proxy.getProductividad(), proxy.getAntivirus());
    private String nombreProducto, codigoProducto;
    private String tipoProducto;
    
    /**
     * Creates new form EspecificacionesProductoAdmin
     */
    public EspecificacionesProductoAdmin(String producto, String tipo, String codigo) {
        initComponents();
        
        nombreProducto = producto;
        tipoProducto = tipo;
        codigoProducto = codigo;
        if (tipo.equals("Videojuego")){
            ArrayList<Videojuego> candidatosV = lectura.getListaVideojuegos();
            for (int i=0 ; i< candidatosV.size(); i++){
                if (candidatosV.get(i).getNombre().equals(producto)){
                    jLabel1.setText(candidatosV.get(i).getNombre());
                    jLabel2.setText(candidatosV.get(i).getDescripcion());
                    jLabel3.setText(candidatosV.get(i).getPrecio().toString());
                    jLabel4.setText(candidatosV.get(i).getCaratula());
                    jLabel5.setText(candidatosV.get(i).getLimitacionesTecnicas().toString());
                    jLabel6.setText(tipo);
                    jLabel7.setText(candidatosV.get(i).getJugadores()+"");
                    if (candidatosV.get(i).isMultijugador()){
                        jLabel8.setText("Con Multijugador");
                    }else{
                        jLabel8.setText("Sin Multijugador");
                    }
                    if (candidatosV.get(i).isMultijugador()){
                        jLabel9.setText("Con Online");
                    }else{
                        jLabel8.setText("Sin Online");
                    }
                    jLabel10.setText(candidatosV.get(i).getCreador().toString());
                    jLabel11.setText(candidatosV.get(i).getFechaCreacion().toString());
                    jLabel12.setText(candidatosV.get(i).getGeneros().toString());
                    jLabel13.setText(candidatosV.get(i).getOtrasPlataformas().toString());
                    jLabel14.setText(candidatosV.get(i).getCondigoInterno());
                    if (candidatosV.get(i).getReviews().isEmpty()){
                        jLabel15.setText("Sin Reviews");
                    }else{
                        jLabel15.setText(candidatosV.get(i).getReviews().toString());
                    }
                    jLabel16.setText(candidatosV.get(i).getValoracionGeneral());
                    
                }
            }
        }else if (tipo.equals("Antivirus")){
            ArrayList<Antivirus> candidatosA = lectura.getListaAntivirus();
            for (int i=0 ; i< candidatosA.size(); i++){
                if (candidatosA.get(i).getNombre().equals(producto)){
                    jLabel1.setText(candidatosA.get(i).getNombre());
                    jLabel2.setText(candidatosA.get(i).getDescripcion());
                    jLabel3.setText(candidatosA.get(i).getPrecio().toString());
                    jLabel4.setText(candidatosA.get(i).getCaratula());
                    jLabel5.setText(candidatosA.get(i).getLimitacionesTecnicas().toString());
                    jLabel6.setText(tipo);
                    jLabel7.setText(candidatosA.get(i).getVersionActual());
                    jLabel8.setText(candidatosA.get(i).getCertificaciones().toString());
                    jLabel9.setText(candidatosA.get(i).getFechaVersionActual().toString());
                    jLabel10.setText(candidatosA.get(i).getCreador().toString());
                    jLabel11.setText(candidatosA.get(i).getFechaCreacion().toString());
                    jLabel14.setText(candidatosA.get(i).getCondigoInterno());
                    if (candidatosA.get(i).getReviews().isEmpty()){
                        jLabel12.setText("Sin Reviews");
                    }else{
                        jLabel12.setText(candidatosA.get(i).getReviews().toString());
                    }
                    jLabel13.setText(candidatosA.get(i).getValoracionGeneral());
                    jLabel15.setVisible(false);
                    jLabel16.setVisible(false);
                }
            }
        }else{
            ArrayList<Productividad> candidatosP = lectura.getListaProductividad();
            for (int i=0 ; i< candidatosP.size(); i++){
                if (candidatosP.get(i).getNombre().equals(producto)){
                    jLabel1.setText(candidatosP.get(i).getNombre());
                    jLabel2.setText(candidatosP.get(i).getDescripcion());
                    jLabel3.setText(candidatosP.get(i).getPrecio().toString());
                    jLabel4.setText(candidatosP.get(i).getCaratula());
                    jLabel5.setText(candidatosP.get(i).getLimitacionesTecnicas().toString());
                    jLabel6.setText(tipo);
                    jLabel7.setText(candidatosP.get(i).getTipo());
                    jLabel8.setText(candidatosP.get(i).getVersionActual());
                    jLabel9.setText(candidatosP.get(i).getFechaVersionActual().toString());
                    jLabel10.setText(candidatosP.get(i).getCreador().toString());
                    jLabel11.setText(candidatosP.get(i).getFechaCreacion().toString());
                    jLabel14.setText(candidatosP.get(i).getCondigoInterno());
                    if (candidatosP.get(i).getReviews().isEmpty()){
                        jLabel12.setText("Sin Reviews");
                    }else{
                        jLabel12.setText(candidatosP.get(i).getReviews().toString());
                    }
                    jLabel13.setText(candidatosP.get(i).getValoracionGeneral());
                    jLabel15.setVisible(false);
                    jLabel16.setVisible(false);
                }
            }
        }
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        jLabel14.setText("jLabel14");

        jLabel15.setText("jLabel15");

        jLabel16.setText("jLabel16");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Rechazar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setText("Menú");

        jMenuItem1.setText("Información");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Modificar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Descuentos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Peticiones");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Cerrar Sesión");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(112, 112, 112)
                .addComponent(jButton2)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tipoProducto.equals("Videojuego")){
            ArrayList<Videojuego> candidatosV = proxy.getVideojuegos();
            for (int i=0 ; i< candidatosV.size(); i++){
                if (candidatosV.get(i).getNombre().equals(nombreProducto)){
                    candidatosV.get(i).setAprobado(true);
                    proxy.guardarVideojuegos();
                    proxy.guardarAntivirus();
                    proxy.guardarProductividad();
                    Sujeto sujeto = proxy.getSujetoProducto(candidatosV.get(i));
                    sujeto.setProducto(candidatosV.get(i));
                    sujeto.notificarObservadores();
                    proxy.guardarSujetos();
                    proxy.guardarClientes();
                }
            }
        }else if (tipoProducto.equals("Antivirus")){
            ArrayList<Antivirus> candidatosA = proxy.getAntivirus();
            for (int i=0 ; i< candidatosA.size(); i++){
                if (candidatosA.get(i).getNombre().equals(nombreProducto)){
                    candidatosA.get(i).setAprobado(true);
                    proxy.guardarVideojuegos();
                    proxy.guardarAntivirus();
                    proxy.guardarProductividad();
                    Sujeto sujeto = proxy.getSujetoProducto(candidatosA.get(i));
                    sujeto.setProducto(candidatosA.get(i));
                    sujeto.notificarObservadores();
                    proxy.guardarSujetos();
                    proxy.guardarClientes();
                }
            }
        }else{
            ArrayList<Productividad> candidatosP = proxy.getProductividad();
            for (int i=0 ; i< candidatosP.size(); i++){
                if (candidatosP.get(i).getNombre().equals(nombreProducto)){
                    candidatosP.get(i).setAprobado(true);
                    proxy.guardarVideojuegos();
                    proxy.guardarAntivirus();
                    proxy.guardarProductividad();
                    Sujeto sujeto = proxy.getSujetoProducto(candidatosP.get(i));
                    sujeto.setProducto(candidatosP.get(i));
                    sujeto.notificarObservadores();
                    proxy.guardarSujetos();
                    proxy.guardarClientes();
                }
            }
        }
        this.setVisible(false);
        PantallaPeticiones peticion = new PantallaPeticiones();
        peticion.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (tipoProducto.equals("Videojuego")){
            ArrayList<Videojuego> candidatosV = proxy.getVideojuegos();
            for (int i=0 ; i< candidatosV.size(); i++){
                if (candidatosV.get(i).getNombre().equals(nombreProducto)){
                    proxy.removeSujeto(proxy.getSujetoProducto(proxy.getProductoByCodigo(codigoProducto)));
                    candidatosV.remove(i);
                    proxy.removeVideojuego(codigoProducto);
                }
            }
        }else if (tipoProducto.equals("Antivirus")){
            ArrayList<Antivirus> candidatosA = proxy.getAntivirus();
            for (int i=0 ; i< candidatosA.size(); i++){
                if (candidatosA.get(i).getNombre().equals(nombreProducto)){
                    proxy.removeSujeto(proxy.getSujetoProducto(proxy.getProductoByCodigo(codigoProducto)));
                    candidatosA.remove(i);
                    proxy.removeAntivirus(codigoProducto);
                }
            }
        }else{
            ArrayList<Productividad> candidatosP = proxy.getProductividad();
            for (int i=0 ; i< candidatosP.size(); i++){
                if (candidatosP.get(i).getNombre().equals(nombreProducto)){
                    proxy.removeSujeto(proxy.getSujetoProducto(proxy.getProductoByCodigo(codigoProducto)));
                    candidatosP.remove(i);
                    proxy.removeProductividad(codigoProducto);
                }
            }
        }
        proxy.guardarVideojuegos();
        proxy.guardarAntivirus();
        proxy.guardarProductividad();
        proxy.guardarSujetos();
        proxy.guardarClientes();
        this.setVisible(false);
        PantallaPeticiones peticion = new PantallaPeticiones();
        peticion.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        InformacionAdmin informacion = new InformacionAdmin();
        informacion.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setVisible(false);
        modificacionAdmin modificacion = new modificacionAdmin();
        modificacion.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.setVisible(false);
        GenerarDescuentos descuentos = new GenerarDescuentos();
        descuentos.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.setVisible(false);
        PantallaPeticiones peticion = new PantallaPeticiones();
        peticion.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Inicio inicio = new Inicio();
        this.setVisible(false);
        inicio.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
