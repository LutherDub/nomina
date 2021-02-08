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
public class CategoriaVista extends javax.swing.JDialog {

    /**
     * Creates new form CategoriaVista
     */
    public CategoriaVista(java.awt.Frame parent, boolean modal) {
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

        jPanel2 = new javax.swing.JPanel();
        lblcategoria = new javax.swing.JLabel();
        lblidcategoria = new javax.swing.JLabel();
        txtidcategoria = new javax.swing.JTextField();
        lblnombrecategoria = new javax.swing.JLabel();
        txtnombrecomplemento = new javax.swing.JTextField();
        lblsueldobasico = new javax.swing.JLabel();
        txtsueldobasico = new javax.swing.JTextField();
        lblpuestodestino = new javax.swing.JLabel();
        txtpuestodestino = new javax.swing.JTextField();
        btnguardarcaregoria = new javax.swing.JButton();
        btnlimpiarcategoria = new javax.swing.JButton();
        btnactualizarcategoria = new javax.swing.JButton();
        btneliminarcategoria = new javax.swing.JButton();
        jpnconsultar = new javax.swing.JPanel();
        btnconsultarcategoria = new javax.swing.JButton();
        lblconsultacomplemento = new javax.swing.JTextField();
        lblcomplemento1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcategoria = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Agregar"));

        lblcategoria.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lblcategoria.setText("Categoria");

        lblidcategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblidcategoria.setText("Id Categoria");

        lblnombrecategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnombrecategoria.setText("Nombre");

        lblsueldobasico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblsueldobasico.setText("Sueldo Basico");

        txtsueldobasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsueldobasicoActionPerformed(evt);
            }
        });

        lblpuestodestino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblpuestodestino.setText("Puesto destino");

        btnguardarcaregoria.setText("Guardar");
        btnguardarcaregoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarcaregoriaActionPerformed(evt);
            }
        });

        btnlimpiarcategoria.setText("Limpiar");

        btnactualizarcategoria.setText("Actualizar");

        btneliminarcategoria.setText("Eliminar");

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
                            .addComponent(lblidcategoria)
                            .addComponent(lblnombrecategoria)
                            .addComponent(lblpuestodestino)
                            .addComponent(lblsueldobasico))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtsueldobasico)
                            .addComponent(txtidcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombrecomplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtpuestodestino)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnguardarcaregoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimpiarcategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnactualizarcategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminarcategoria)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblcategoria)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblidcategoria))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombrecategoria)
                    .addComponent(txtnombrecomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsueldobasico)
                    .addComponent(txtsueldobasico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpuestodestino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpuestodestino))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardarcaregoria)
                    .addComponent(btnlimpiarcategoria)
                    .addComponent(btnactualizarcategoria)
                    .addComponent(btneliminarcategoria))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jpnconsultar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Consultar Categoria"));

        btnconsultarcategoria.setText("Consultar");
        btnconsultarcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarcategoriaActionPerformed(evt);
            }
        });

        lblconsultacomplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblconsultacomplementoActionPerformed(evt);
            }
        });

        lblcomplemento1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcomplemento1.setText("Id Categoria");

        javax.swing.GroupLayout jpnconsultarLayout = new javax.swing.GroupLayout(jpnconsultar);
        jpnconsultar.setLayout(jpnconsultarLayout);
        jpnconsultarLayout.setHorizontalGroup(
            jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnconsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcomplemento1)
                .addGap(18, 18, 18)
                .addComponent(lblconsultacomplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnconsultarcategoria)
                .addContainerGap())
        );
        jpnconsultarLayout.setVerticalGroup(
            jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnconsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconsultarcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblconsultacomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcomplemento1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbcategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombres", "Descripcion", "Sueldo Basico", "Puesto Destino"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsueldobasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsueldobasicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsueldobasicoActionPerformed

    private void btnguardarcaregoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarcaregoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarcaregoriaActionPerformed

    private void btnconsultarcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnconsultarcategoriaActionPerformed

    private void lblconsultacomplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblconsultacomplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblconsultacomplementoActionPerformed

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
            java.util.logging.Logger.getLogger(CategoriaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoriaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoriaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoriaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CategoriaVista dialog = new CategoriaVista(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnactualizarcategoria;
    private javax.swing.JButton btnconsultarcategoria;
    private javax.swing.JButton btneliminarcategoria;
    private javax.swing.JButton btnguardarcaregoria;
    private javax.swing.JButton btnlimpiarcategoria;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnconsultar;
    private javax.swing.JLabel lblcategoria;
    private javax.swing.JLabel lblcomplemento1;
    private javax.swing.JTextField lblconsultacomplemento;
    private javax.swing.JLabel lblidcategoria;
    private javax.swing.JLabel lblnombrecategoria;
    private javax.swing.JLabel lblpuestodestino;
    private javax.swing.JLabel lblsueldobasico;
    private javax.swing.JTable tbcategoria;
    private javax.swing.JTextField txtidcategoria;
    private javax.swing.JTextField txtnombrecomplemento;
    private javax.swing.JTextField txtpuestodestino;
    private javax.swing.JTextField txtsueldobasico;
    // End of variables declaration//GEN-END:variables
}
