/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author jiliar
 */
public class DetalleContratoComplementoVista extends javax.swing.JDialog {

    /**
     * Creates new form DetalleContratoComplemento_View
     */
    public DetalleContratoComplementoVista(java.awt.Frame parent, boolean modal) {
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

        jpaDetallesContratoComplemento = new javax.swing.JPanel();
        lblNominaDelEmpleado = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos2 = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblcontrato = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFechaI = new javax.swing.JLabel();
        lblFechai = new javax.swing.JLabel();
        lblFechaF = new javax.swing.JLabel();
        lblFechaf = new javax.swing.JLabel();
        lblCortesdeMes = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCortedeMes = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNominaEmpleado = new javax.swing.JTable();
        lblResponsable = new javax.swing.JLabel();
        lblResponsable2 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpaDetallesContratoComplemento.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblNominaDelEmpleado.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lblNominaDelEmpleado.setText("NOMINA DEL EMPLEADO");

        lblNombre.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblNombre.setText("Nombres:");

        txtNombreEmpleado.setEnabled(false);

        lblApellidos.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblApellidos.setText("Apellidos:");

        lblDni.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblDni.setText("DNI:");

        lblcontrato.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblcontrato.setText("ID Contrato:");

        lblCategoria.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblCategoria.setText("Categoria:");

        jLabel2.setText("jLabel2");
        jLabel2.setEnabled(false);

        lblFechaI.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblFechaI.setText("Fecha de inicio:");

        lblFechai.setText("jLabel6");
        lblFechai.setEnabled(false);

        lblFechaF.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblFechaF.setText("Fecha fin:");

        lblFechaf.setText("jLabel8");
        lblFechaf.setEnabled(false);

        lblCortesdeMes.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblCortesdeMes.setText("Corte de Mes:");

        txtNombre.setText("jTextField1");

        txtApellidos.setText("jTextField2");

        txtCortedeMes.setText("jTextField3");

        txtCategoria.setText("jTextField4");

        jTextField6.setText("jTextField3");

        jTextField5.setText("jTextField4");

        tbNominaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "CONCEPTOS", "DEVENGOS", "DEDUCCIONES", " TOTAL A APAGAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbNominaEmpleado);

        lblResponsable.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblResponsable.setText("Responsable:");

        lblResponsable2.setText("jLabel3");
        lblResponsable2.setEnabled(false);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");

        btnListar.setText("Listar");

        btnEliminar.setText("Eliminar");

        javax.swing.GroupLayout jpaDetallesContratoComplementoLayout = new javax.swing.GroupLayout(jpaDetallesContratoComplemento);
        jpaDetallesContratoComplemento.setLayout(jpaDetallesContratoComplementoLayout);
        jpaDetallesContratoComplementoLayout.setHorizontalGroup(
            jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                        .addComponent(lblFechaI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblFechai, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(89, 89, 89)
                                .addComponent(lblFechaF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFechaf))
                            .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                        .addComponent(lblDni)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(105, 105, 105)
                                        .addComponent(txtApellidos2))
                                    .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                        .addComponent(lblcontrato)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                        .addComponent(lblNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59)
                                .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                        .addComponent(lblApellidos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                            .addComponent(lblCategoria)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                            .addGap(306, 306, 306)
                                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                            .addComponent(lblCortesdeMes)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCortedeMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(lblNominaDelEmpleado))
                    .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                .addComponent(btnActualizar)
                                .addGap(51, 51, 51)
                                .addComponent(btnConsultar)
                                .addGap(66, 66, 66)
                                .addComponent(btnListar)
                                .addGap(58, 58, 58)
                                .addComponent(btnEliminar))
                            .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                .addComponent(lblResponsable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblResponsable2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpaDetallesContratoComplementoLayout.setVerticalGroup(
            jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lblNominaDelEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreEmpleado)
                .addGap(1, 1, 1)
                .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                        .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtApellidos2))
                            .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDni)
                                .addComponent(lblCortesdeMes)
                                .addComponent(txtCortedeMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4))
                            .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2))
                                    .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jpaDetallesContratoComplementoLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblcontrato)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblFechaI)
                                        .addComponent(lblFechai))
                                    .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblFechaF)
                                        .addComponent(lblFechaf))))))
                    .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblApellidos)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResponsable)
                    .addComponent(lblResponsable2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpaDetallesContratoComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnConsultar)
                    .addComponent(btnListar)
                    .addComponent(btnEliminar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpaDetallesContratoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpaDetallesContratoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(DetalleContratoComplementoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleContratoComplementoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleContratoComplementoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleContratoComplementoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetalleContratoComplementoVista dialog = new DetalleContratoComplementoVista(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel jpaDetallesContratoComplemento;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCortesdeMes;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFechaF;
    private javax.swing.JLabel lblFechaI;
    private javax.swing.JLabel lblFechaf;
    private javax.swing.JLabel lblFechai;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNominaDelEmpleado;
    private javax.swing.JLabel lblResponsable;
    private javax.swing.JLabel lblResponsable2;
    private javax.swing.JLabel lblcontrato;
    private javax.swing.JTable tbNominaEmpleado;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JLabel txtApellidos2;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCortedeMes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtNombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
