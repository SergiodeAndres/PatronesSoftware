
package proyecto.interfaces;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import proyecto.clases.*;
public class ClienteInfoProducto extends javax.swing.JFrame {

    private Servidor proxy = new Proxy(new ServidorBBDD());
    Cliente cliente;
    Producto producto;
    private JFrame principal;
    public ClienteInfoProducto(JFrame v, Cliente c, Producto p) {
        initComponents();
        principal = v;
        principal.setVisible(false);
        this.setVisible(true);
        cliente = c;
        producto = p;
        jLabelNombreProducto.setText("Nombre: " + producto.getNombre());
        String rutaImagen = "./portadas/" + producto.getCaratula();
        ImageIcon portada_original = new ImageIcon(rutaImagen);
        ImageIcon portada_img = new ImageIcon(portada_original.getImage().getScaledInstance(jLabelCaratula.getWidth(), jLabelCaratula.getHeight(), java.awt.Image.SCALE_SMOOTH));
        jLabelCaratula.setIcon(portada_img);
        jLabelNombreCreador.setText("Creador: " + producto.getCreador().getNombreUsuario());
        jLabelDescripcionProducto.setText("Descripción: " + producto.getDescripcion());
        jLabelFechaCreacion.setText("Fecha de creación: " + producto.getFechaCreacion().toString());
        jLabelPrecio.setText("Precio: " + producto.getPrecio(c));
        jLabelValoracionGeneral.setText("Valoración General: " + producto.getValoracionGeneral());
        String comentarios = "";
        for (Review r:producto.getReviews())
        {
            String comentarioI = "";
            if (r.isPositiva())
            {
               comentarioI = r.getCliente().getNombreUsuario() + "(positiva): " + r.getComentario();
            }
            else 
            {
                comentarioI = r.getCliente().getNombreUsuario() + "(negativa): " + r.getComentario();
            }
            comentarios += comentarioI;
            comentarios += "\n";
        }
        jTextAreaComentarios.setText(comentarios);
        String limitaciones = "";
        for (String l: producto.getLimitacionesTecnicas())
        {
            limitaciones += l;
            limitaciones += "\n";
        }
        jTextAreaLimitaciones.setText(limitaciones);
        if (producto instanceof Videojuego)
        {
            Videojuego videojuego = (Videojuego) producto;
            String infoExtra = "Géneros: ";
            for (String genero: videojuego.getGeneros())
            {
                infoExtra += genero;
                infoExtra += " ";
            }
            infoExtra += "\n";
            infoExtra += "Otras Plataformas: ";
            for (String plataforma: videojuego.getOtrasPlataformas())
            {
                infoExtra += plataforma;
                infoExtra += " ";
            }
            infoExtra += "\n";
            infoExtra += "Multijugador: ";
            if (videojuego.isMultijugador())
            {
                infoExtra += "Sí";
            }
            else
            {
                infoExtra += "No";
            }
            infoExtra += "\n";
            infoExtra += "Número de jugadores: " + videojuego.getJugadores() + "\n";
            infoExtra += "Modo Online: ";
            if (videojuego.isOnline())
            {
                infoExtra += "Sí";
            }
            else
            {
                infoExtra += "No";
            }
            jTextAreaInfoConcreta.setText(infoExtra);
        }
        else if (producto instanceof Productividad)
        {
            Productividad productividad = (Productividad) producto;
            String infoExtra = "Versión Actual: " + productividad.getVersionActual() + 
                    "\nFecha de la versión actual: " + productividad.getFechaVersionActual().toString() + 
                    "\nTipo: " + productividad.getTipo();
            jTextAreaInfoConcreta.setText(infoExtra);
        }
        else 
        {
            Antivirus antivirus = (Antivirus) producto;
            String infoExtra = "Versión Actual: " + antivirus.getVersionActual() + 
                    "\nFecha de la versión actual: " + antivirus.getFechaVersionActual().toString() + 
                    "\nEntidades Certificadoras: ";
            for (String ec: antivirus.getCertificaciones())
            {
                infoExtra += ec; 
                infoExtra += " ";
            }
            jTextAreaInfoConcreta.setText(infoExtra);
        }
        
        if(producto.isAprobado() && !cliente.getLibreria().contains(producto))
        {
            jButtonAccion.setText("Comprar");
        }
        else if (producto.isAprobado() && cliente.getLibreria().contains(producto))
        {
            jButtonAccion.setText("Ya en librería");
        }
        else if (!producto.isAprobado() && !proxy.clienteSuscritoProducto(cliente, producto))
        {
            jButtonAccion.setText("Suscribirse");
        }
        else 
        {
            jButtonAccion.setText("Ya suscrito");
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

        jLabelNombreProducto = new javax.swing.JLabel();
        jLabelNombreCreador = new javax.swing.JLabel();
        jLabelDescripcionProducto = new javax.swing.JLabel();
        jLabelFechaCreacion = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelValoracionGeneral = new javax.swing.JLabel();
        jLabelCaratula = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaComentario = new javax.swing.JTextArea();
        jRadioButtonPositivo = new javax.swing.JRadioButton();
        jButtonEnviarComentario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaLimitaciones = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaInfoConcreta = new javax.swing.JTextArea();
        jButtonAccion = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaComentarios = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemLibreria = new javax.swing.JMenuItem();
        jMenuItemLlavero = new javax.swing.JMenuItem();
        jMenuItemSaldo = new javax.swing.JMenuItem();
        jMenuItemTienda = new javax.swing.JMenuItem();
        jMenuItemNotificacion = new javax.swing.JMenuItem();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNombreProducto.setText("Nombre");

        jLabelNombreCreador.setText("jLabel1");

        jLabelDescripcionProducto.setText("jLabel1");

        jLabelFechaCreacion.setText("jLabel1");

        jLabelPrecio.setText("jLabel1");

        jLabelValoracionGeneral.setText("jLabel1");

        jLabelCaratula.setText("jLabel1");

        jLabel1.setText("Comentario:");

        jTextAreaComentario.setColumns(20);
        jTextAreaComentario.setRows(5);
        jScrollPane2.setViewportView(jTextAreaComentario);

        jRadioButtonPositivo.setText("Thumbs-up");

        jButtonEnviarComentario.setText("Enviar Comentario");
        jButtonEnviarComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarComentarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Limitaciones");

        jTextAreaLimitaciones.setEditable(false);
        jTextAreaLimitaciones.setColumns(20);
        jTextAreaLimitaciones.setRows(5);
        jScrollPane3.setViewportView(jTextAreaLimitaciones);

        jTextAreaInfoConcreta.setEditable(false);
        jTextAreaInfoConcreta.setColumns(20);
        jTextAreaInfoConcreta.setRows(5);
        jScrollPane4.setViewportView(jTextAreaInfoConcreta);

        jButtonAccion.setText("jButton1");
        jButtonAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccionActionPerformed(evt);
            }
        });

        jTextAreaComentarios.setEditable(false);
        jTextAreaComentarios.setColumns(20);
        jTextAreaComentarios.setRows(5);
        jScrollPane5.setViewportView(jTextAreaComentarios);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jRadioButtonPositivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEnviarComentario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelNombreCreador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabelDescripcionProducto)
                                    .addComponent(jLabelFechaCreacion)
                                    .addComponent(jLabelPrecio)
                                    .addComponent(jLabelValoracionGeneral))
                                .addGap(0, 284, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2)))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCaratula, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelNombreProducto))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNombreCreador)
                                .addGap(20, 20, 20)
                                .addComponent(jLabelDescripcionProducto)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelFechaCreacion))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPrecio)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelValoracionGeneral))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCaratula, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPositivo)
                    .addComponent(jButtonEnviarComentario))
                .addContainerGap(11, Short.MAX_VALUE))
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

    private void jButtonAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccionActionPerformed
        if (!producto.isAprobado() && !proxy.clienteSuscritoProducto(cliente, producto))
        {
            Observador o = new ObservadorConcreto(cliente, proxy.getSujetoProducto(producto));
            proxy.guardarSujetos();
            jButtonAccion.setText("Ya suscrito");
        }
        else if(producto.isAprobado() && !cliente.getLibreria().contains(producto))
        {
            ClienteConfCompra c = new ClienteConfCompra(this, cliente, producto);
            c.setLocationRelativeTo(null);
            c.setVisible(true);
        }
        
    }//GEN-LAST:event_jButtonAccionActionPerformed

    private void jButtonEnviarComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarComentarioActionPerformed
        String comentario = jTextAreaComentario.getText();
        if (jRadioButtonPositivo.isSelected())
        {
            producto.addReview(new Review(true, comentario, cliente));
        }
        else 
        {
            producto.addReview(new Review(false, comentario, cliente));
        }
        proxy.guardarVideojuegos();
        proxy.guardarAntivirus();
        proxy.guardarProductividad();
        jLabelValoracionGeneral.setText("Valoración General: " + producto.getValoracionGeneral());
        String comentarios = "";
        for (Review r:producto.getReviews())
        {
            String comentarioI = "";
            if (r.isPositiva())
            {
               comentarioI = r.getCliente().getNombreUsuario() + "(positiva): " + r.getComentario();
            }
            else 
            {
                comentarioI = r.getCliente().getNombreUsuario() + "(negativa): " + r.getComentario();
            }
            comentarios += comentarioI;
            comentarios += "\n";
        }
        jTextAreaComentarios.setText(comentarios);
    }//GEN-LAST:event_jButtonEnviarComentarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccion;
    private javax.swing.JButton jButtonEnviarComentario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCaratula;
    private javax.swing.JLabel jLabelDescripcionProducto;
    private javax.swing.JLabel jLabelFechaCreacion;
    private javax.swing.JLabel jLabelNombreCreador;
    private javax.swing.JLabel jLabelNombreProducto;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelValoracionGeneral;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemLibreria;
    private javax.swing.JMenuItem jMenuItemLlavero;
    private javax.swing.JMenuItem jMenuItemNotificacion;
    private javax.swing.JMenuItem jMenuItemSaldo;
    private javax.swing.JMenuItem jMenuItemTienda;
    private javax.swing.JRadioButton jRadioButtonPositivo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextAreaComentario;
    private javax.swing.JTextArea jTextAreaComentarios;
    private javax.swing.JTextArea jTextAreaInfoConcreta;
    private javax.swing.JTextArea jTextAreaLimitaciones;
    // End of variables declaration//GEN-END:variables
}
