/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morrales.UI;

import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import morrales.BL.ResolverProblema;

/**
 *
 * @author roand_000
 */
public class SubirArchivoGUI extends javax.swing.JPanel {

    /**
     * Creates new form SubirArchivoGUI
     */
    public SubirArchivoGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fl_buscarRuta = new javax.swing.JFileChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bt_calcular = new javax.swing.JButton();
        lb_subirArchivo = new javax.swing.JLabel();
        sp_areaDeRespuesta = new javax.swing.JSplitPane();
        panel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lb_requerimiento = new javax.swing.JLabel();
        lb_cantdecajas = new javax.swing.JLabel();
        lb_volMorrales = new javax.swing.JLabel();
        lb_pesoDeMorrales = new javax.swing.JLabel();
        tb_cantDeCajas = new javax.swing.JTextField();
        tb_volMorrales = new javax.swing.JTextField();
        tb_pesoDeMorrales = new javax.swing.JTextField();
        sc_requerimiento = new javax.swing.JScrollPane();
        ta_requerimiento = new javax.swing.JTable();
        panel2 = new javax.swing.JPanel();
        lb_numDeMorrales = new javax.swing.JLabel();
        tb_numDeMorrales = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tb_numeroNodos = new javax.swing.JTextField();
        tb_cantidadIteraciones = new javax.swing.JTextField();
        tb_cantidadVariables = new javax.swing.JTextField();
        sc_solucion = new javax.swing.JScrollPane();
        ta_solucion = new javax.swing.JTable();
        tb_ruta = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/morrales/UI/imagenes/subirArchivoImagen.png"))); // NOI18N
        jButton1.setIconTextGap(3);
        jButton1.setInheritsPopupMenu(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bt_calcular.setText("Calcular");
        bt_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_calcularActionPerformed(evt);
            }
        });

        lb_subirArchivo.setText("Subir Archivo");

        sp_areaDeRespuesta.setResizeWeight(0.5);
        sp_areaDeRespuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sp_areaDeRespuesta.setOneTouchExpandable(true);
        sp_areaDeRespuesta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sp_areaDeRespuestaFocusGained(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb_requerimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_requerimiento.setText("Requerimiento");

        lb_cantdecajas.setText("Cantidad de cajas");

        lb_volMorrales.setText("Volumen que soportan los morrales");

        lb_pesoDeMorrales.setText("Peso que soportan los Morrales");

        tb_cantDeCajas.setEditable(false);

        tb_volMorrales.setEditable(false);

        tb_pesoDeMorrales.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_volMorrales)
                            .addComponent(lb_cantdecajas)
                            .addComponent(lb_pesoDeMorrales, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tb_pesoDeMorrales, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(tb_volMorrales)
                            .addComponent(tb_cantDeCajas)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_requerimiento)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb_requerimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cantdecajas)
                    .addComponent(tb_cantDeCajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_volMorrales)
                    .addComponent(tb_volMorrales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_pesoDeMorrales)
                    .addComponent(tb_pesoDeMorrales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ta_requerimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Caja", "Volumen", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ta_requerimiento.setEnabled(false);
        sc_requerimiento.setViewportView(ta_requerimiento);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sc_requerimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sc_requerimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
        );

        sp_areaDeRespuesta.setLeftComponent(panel1);

        lb_numDeMorrales.setText("El número óptimo de morrales es:");

        tb_numDeMorrales.setEditable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Solucion");

        jLabel1.setText("Numero de nodos");

        jLabel4.setText("Cantidad de iteraciones");

        jLabel5.setText("Cantidad de variables generadas");

        tb_numeroNodos.setEditable(false);

        tb_cantidadIteraciones.setEditable(false);
        tb_cantidadIteraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_cantidadIteracionesActionPerformed(evt);
            }
        });

        tb_cantidadVariables.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tb_numeroNodos, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(tb_cantidadIteraciones)
                            .addComponent(tb_cantidadVariables))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tb_numeroNodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tb_cantidadIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tb_cantidadVariables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ta_solucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ta_solucion.setToolTipText("");
        ta_solucion.setEnabled(false);
        sc_solucion.setViewportView(ta_solucion);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sc_solucion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lb_numDeMorrales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tb_numDeMorrales, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sc_solucion, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_numDeMorrales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_numDeMorrales))
                .addContainerGap())
        );

        sp_areaDeRespuesta.setRightComponent(panel2);

        tb_ruta.setEditable(false);
        tb_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_rutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_subirArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tb_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_calcular)
                .addContainerGap())
            .addComponent(sp_areaDeRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tb_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_subirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bt_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp_areaDeRespuesta))
        );
    }// </editor-fold>//GEN-END:initComponents
        ResolverProblema resolver;
        LlenarTablas llenarTab;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        tb_cantidadIteraciones.setText("");
            tb_cantidadVariables.setText("");
            tb_numeroNodos.setText("");
            tb_numDeMorrales.setText("");
         fl_buscarRuta.showOpenDialog(this);
         llenarTab=new LlenarTablas(fl_buscarRuta.getSelectedFile().getPath());
         resolver=new ResolverProblema(fl_buscarRuta.getSelectedFile().getPath());
        tb_ruta.setText(fl_buscarRuta.getSelectedFile().getPath());
        String pattern = "###.###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        tb_cantDeCajas.setText(""+Math.round(resolver.getPropiedades().get(0)));
        tb_volMorrales.setText(decimalFormat.format(resolver.getPropiedades().get(1)));
        tb_pesoDeMorrales.setText(decimalFormat.format(resolver.getPropiedades().get(2)));
        llenarTab.llenarTabla1(ta_requerimiento);
        ta_solucion.setModel(new DefaultTableModel());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_calcularActionPerformed
        
        llenarTab=new LlenarTablas(fl_buscarRuta.getSelectedFile().getPath());
        if (fl_buscarRuta.getSelectedFile()!=null)
        {
            
            llenarTab.llenarTabla2(ta_solucion);
            tb_cantidadIteraciones.setText(String.valueOf(llenarTab.getCantidadIteraciones()));
            tb_cantidadVariables.setText(""+llenarTab.getCantidadVariables());
            tb_numeroNodos.setText(String.valueOf(llenarTab.getCantidadNodos()));
            tb_numDeMorrales.setText(""+Math.round(llenarTab.getNumeroOptimoMorrales()));
        }
    }//GEN-LAST:event_bt_calcularActionPerformed

    private void sp_areaDeRespuestaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sp_areaDeRespuestaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_sp_areaDeRespuestaFocusGained

    private void tb_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_rutaActionPerformed

    private void tb_cantidadIteracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_cantidadIteracionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_cantidadIteracionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_calcular;
    private javax.swing.JFileChooser fl_buscarRuta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_cantdecajas;
    private javax.swing.JLabel lb_numDeMorrales;
    private javax.swing.JLabel lb_pesoDeMorrales;
    private javax.swing.JLabel lb_requerimiento;
    private javax.swing.JLabel lb_subirArchivo;
    private javax.swing.JLabel lb_volMorrales;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JScrollPane sc_requerimiento;
    private javax.swing.JScrollPane sc_solucion;
    private javax.swing.JSplitPane sp_areaDeRespuesta;
    private javax.swing.JTable ta_requerimiento;
    private javax.swing.JTable ta_solucion;
    private javax.swing.JTextField tb_cantDeCajas;
    private javax.swing.JTextField tb_cantidadIteraciones;
    private javax.swing.JTextField tb_cantidadVariables;
    private javax.swing.JTextField tb_numDeMorrales;
    private javax.swing.JTextField tb_numeroNodos;
    private javax.swing.JTextField tb_pesoDeMorrales;
    private javax.swing.JTextField tb_ruta;
    private javax.swing.JTextField tb_volMorrales;
    // End of variables declaration//GEN-END:variables
}
