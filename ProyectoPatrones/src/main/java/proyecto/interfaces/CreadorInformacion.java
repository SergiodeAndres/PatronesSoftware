/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.interfaces;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import proyecto.clases.Creador;
import proyecto.clases.Factura;
import proyecto.clases.Proxy;
import proyecto.clases.Servidor;
import proyecto.clases.ServidorBBDD;

/**
 *
 * @author paser
 */
public class CreadorInformacion extends javax.swing.JFrame {

    /**
     * Creates new form CreadorInformacion
     */
    private JFrame principal;
    private Creador creador;
    private Servidor proxy = new Proxy(new ServidorBBDD());
    private ArrayList<Integer> years = new ArrayList<>();
    private String[] nombreMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Diciembre"};
    private ArrayList<HashMap<String, Double>> resumen = new ArrayList<>();
    private DefaultTableModel mt = new DefaultTableModel();
    private int pos_year = 0;

    public CreadorInformacion(JFrame v, Creador c) {
        initComponents();

        principal = v;
        principal.setVisible(false);
        this.setVisible(true);
        creador = c;

        String[] ids = {"Mes", "Dinero"};

        mt.setColumnIdentifiers(ids);

        jTable1.setModel(mt);

        cargarInformacionFacturas();

        mostrarInformacion();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("CREADOR");

        jLabel2.setText("FECHA");

        jButton1.setText("->");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pos_year++;

        if (pos_year >= years.size()) {
            pos_year = 0;
        }

        vaciarTabla();
        mostrarInformacion();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pos_year--;

        if (pos_year < 0) {
            pos_year = years.size() - 1;
        }

        vaciarTabla();
        mostrarInformacion();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mostrarInformacion() {
        jLabel2.setText(String.valueOf(years.get(pos_year)));
        HashMap<String, Double> dineroMeses = resumen.get(pos_year);
        for (String mes : nombreMeses) {
            if (dineroMeses.containsKey(mes)) {
                mt.addRow(new Object[]{mes, dineroMeses.get(mes)});
            }
        }
    }

    private void vaciarTabla() {
        int rows = mt.getRowCount();

        for (int i = 0; i < rows; i++) {
            mt.removeRow(0);
        }
    }

    private void cargarInformacionFacturas() {
        ArrayList<Factura> facturas = proxy.getFacturasPorCreador(creador);
        HashMap<String, Double> dineroMeses = new HashMap<>();
        int mes_anterior = 0;
        double total = 0.0;
        BigDecimal bd;
        for (Factura f : facturas) {
            if (years.contains(f.getFechaCompra().getYear())) {
                if (f.getFechaCompra().getMonthValue() == mes_anterior) {
                    total += f.getPrecioFinal().getCantidad();
                } else {
                    bd = new BigDecimal(total);
                    bd = bd.setScale(2, RoundingMode.HALF_UP);
                    dineroMeses.put(nombreMeses[mes_anterior - 1], bd.doubleValue());
                    total = f.getPrecioFinal().getCantidad();
                    mes_anterior = f.getFechaCompra().getMonthValue();
                }
            } else {
                years.add(f.getFechaCompra().getYear());
                if (mes_anterior != 0) {
                    bd = new BigDecimal(total);
                    bd = bd.setScale(2, RoundingMode.HALF_UP);
                    dineroMeses.put(nombreMeses[mes_anterior - 1], bd.doubleValue());
                    total = f.getPrecioFinal().getCantidad();
                    resumen.add(dineroMeses);
                    dineroMeses = new HashMap<>();
                } else {
                    total += f.getPrecioFinal().getCantidad();
                }
                mes_anterior = f.getFechaCompra().getMonthValue();
            }
        }

        bd = new BigDecimal(total);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        dineroMeses.put(nombreMeses[mes_anterior - 1], bd.doubleValue());
        resumen.add(dineroMeses);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
