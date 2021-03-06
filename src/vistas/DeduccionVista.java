/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author LuiferV
 */
public class DeduccionVista extends javax.swing.JDialog {

    /**
     * Creates new form DeduccionVista
     */
    public DeduccionVista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbcategoria = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblcategoria = new javax.swing.JLabel();
        lbliddeduccion = new javax.swing.JLabel();
        txtiddeduccion = new javax.swing.JTextField();
        lblnombrededuccion = new javax.swing.JLabel();
        txtnombrededuccion = new javax.swing.JTextField();
        lbldescripciondeduccion = new javax.swing.JLabel();
        txtdescripciondeduccion = new javax.swing.JTextField();
        btnguardardeduccion = new javax.swing.JButton();
        btnlimpiardeduccion = new javax.swing.JButton();
        btnactualizardeduccion = new javax.swing.JButton();
        btneliminardeduccion = new javax.swing.JButton();
        jpnconsultar = new javax.swing.JPanel();
        btnconsultardeduccion = new javax.swing.JButton();
        lblconsultacomplemento = new javax.swing.JTextField();
        lblcomplemento1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbcategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombres", "Descripcion", "Estado", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbcategoria);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Agregar"));

        lblcategoria.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lblcategoria.setText("Deducción");

        lbliddeduccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbliddeduccion.setText("Id Deduccion");

        lblnombrededuccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnombrededuccion.setText("Nombre");

        lbldescripciondeduccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbldescripciondeduccion.setText("Descripcion");

        txtdescripciondeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripciondeduccionActionPerformed(evt);
            }
        });

        btnguardardeduccion.setText("Guardar");
        btnguardardeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardardeduccionActionPerformed(evt);
            }
        });

        btnlimpiardeduccion.setText("Limpiar");

        btnactualizardeduccion.setText("Actualizar");

        btneliminardeduccion.setText("Eliminar");
        btneliminardeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminardeduccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblcategoria))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbliddeduccion)
                            .addComponent(lblnombrededuccion)
                            .addComponent(lbldescripciondeduccion))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtdescripciondeduccion)
                            .addComponent(txtiddeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombrededuccion, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnguardardeduccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimpiardeduccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnactualizardeduccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminardeduccion)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblcategoria)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtiddeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbliddeduccion))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombrededuccion)
                    .addComponent(txtnombrededuccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldescripciondeduccion)
                    .addComponent(txtdescripciondeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardardeduccion)
                    .addComponent(btnlimpiardeduccion)
                    .addComponent(btnactualizardeduccion)
                    .addComponent(btneliminardeduccion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnconsultar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Consultar Deduccion"));

        btnconsultardeduccion.setText("Consultar");
        btnconsultardeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultardeduccionActionPerformed(evt);
            }
        });

        lblconsultacomplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblconsultacomplementoActionPerformed(evt);
            }
        });

        lblcomplemento1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcomplemento1.setText("Id Deduccion");

        javax.swing.GroupLayout jpnconsultarLayout = new javax.swing.GroupLayout(jpnconsultar);
        jpnconsultar.setLayout(jpnconsultarLayout);
        jpnconsultarLayout.setHorizontalGroup(
            jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnconsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcomplemento1)
                .addGap(18, 18, 18)
                .addComponent(lblconsultacomplemento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnconsultardeduccion)
                .addContainerGap())
        );
        jpnconsultarLayout.setVerticalGroup(
            jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnconsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconsultardeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblconsultacomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcomplemento1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(jpnconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdescripciondeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripciondeduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripciondeduccionActionPerformed

    private void btnguardardeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardardeduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardardeduccionActionPerformed

    private void btnconsultardeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultardeduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnconsultardeduccionActionPerformed

    private void lblconsultacomplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblconsultacomplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblconsultacomplementoActionPerformed

    private void btneliminardeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminardeduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminardeduccionActionPerformed

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
            java.util.logging.Logger.getLogger(DeduccionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeduccionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeduccionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeduccionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeduccionVista dialog = new DeduccionVista(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizardeduccion;
    private javax.swing.JButton btnconsultardeduccion;
    private javax.swing.JButton btneliminardeduccion;
    private javax.swing.JButton btnguardardeduccion;
    private javax.swing.JButton btnlimpiardeduccion;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnconsultar;
    private javax.swing.JLabel lblcategoria;
    private javax.swing.JLabel lblcomplemento1;
    private javax.swing.JTextField lblconsultacomplemento;
    private javax.swing.JLabel lbldescripciondeduccion;
    private javax.swing.JLabel lbliddeduccion;
    private javax.swing.JLabel lblnombrededuccion;
    private javax.swing.JTable tbcategoria;
    private javax.swing.JTextField txtdescripciondeduccion;
    private javax.swing.JTextField txtiddeduccion;
    private javax.swing.JTextField txtnombrededuccion;
    // End of variables declaration//GEN-END:variables
}
