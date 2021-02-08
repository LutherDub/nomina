
package vistas;
import controllers.EmpleadoController;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Empleado;
import models.Conexion;
import controllers.EmpleadoController;


public class EmpleadoVista extends javax.swing.JDialog {

    /**
     * Creates new form EmpleadoVista
     */
    public EmpleadoVista(java.awt.Frame parent, boolean modal) {
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

        jDialog1 = new javax.swing.JDialog();
        jlempleado1 = new javax.swing.JLabel();
        jlbdni2 = new javax.swing.JLabel();
        jlbnombre1 = new javax.swing.JLabel();
        jlbdireccion1 = new javax.swing.JLabel();
        jlbapellido1 = new javax.swing.JLabel();
        jlbtelefono1 = new javax.swing.JLabel();
        jlbdni3 = new javax.swing.JLabel();
        jtfnombre1 = new javax.swing.JTextField();
        jtfcodempleado1 = new javax.swing.JTextField();
        jtfdireccion1 = new javax.swing.JTextField();
        jtftelefono1 = new javax.swing.JTextField();
        jtfapellido1 = new javax.swing.JTextField();
        jtfdni1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jlempleado2 = new javax.swing.JLabel();
        jlbdni4 = new javax.swing.JLabel();
        jlbnombre2 = new javax.swing.JLabel();
        jlbdireccion2 = new javax.swing.JLabel();
        jlbapellido2 = new javax.swing.JLabel();
        jlbtelefono2 = new javax.swing.JLabel();
        jlbdni5 = new javax.swing.JLabel();
        jtfnombre2 = new javax.swing.JTextField();
        jtfcodempleado2 = new javax.swing.JTextField();
        jtfdireccion2 = new javax.swing.JTextField();
        jtftelefono2 = new javax.swing.JTextField();
        jtfapellido2 = new javax.swing.JTextField();
        jtfdni2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlempleado = new javax.swing.JLabel();
        lblcodempleado = new javax.swing.JLabel();
        txtcodempleado = new javax.swing.JTextField();
        lbldni = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        lblnombre = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        lblapellido = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        lbltelefono = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        lbldireccion = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbempleado = new javax.swing.JTable();
        jpnconsultar = new javax.swing.JPanel();
        btnconsultar = new javax.swing.JButton();
        jtfconsultar = new javax.swing.JTextField();
        lblcodempleado1 = new javax.swing.JLabel();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setTitle("Empleados");
        jDialog1.setBackground(new java.awt.Color(214, 217, 223));
        jDialog1.setName("jdempleado"); // NOI18N

        jlempleado1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jlempleado1.setText("Registro Empleados");

        jlbdni2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbdni2.setText("Dni");

        jlbnombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbnombre1.setText("Nombres");

        jlbdireccion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbdireccion1.setText("Dirección");

        jlbapellido1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbapellido1.setText("Apellidos");

        jlbtelefono1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbtelefono1.setText("Telefono");

        jlbdni3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbdni3.setText("Cod empleado");

        jtfnombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfnombre1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jlempleado1))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlbdni2)
                                .addComponent(jlbdni3)
                                .addComponent(jlbdireccion1)
                                .addComponent(jlbnombre1)
                                .addComponent(jlbapellido1))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(jlbtelefono1)
                                .addGap(37, 37, 37)))
                        .addGap(22, 22, 22)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfcodempleado1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jtfdni1)
                            .addComponent(jtfnombre1)
                            .addComponent(jtfdireccion1)
                            .addComponent(jtftelefono1)
                            .addComponent(jtfapellido1))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlempleado1)
                .addGap(31, 31, 31)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbdni3)
                    .addComponent(jtfcodempleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbdni2)
                    .addComponent(jtfdni1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbnombre1)
                    .addComponent(jtfnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfdireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbapellido1))
                .addGap(23, 23, 23)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtftelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbtelefono1))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbdireccion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jDialog2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog2.setTitle("Empleados");
        jDialog2.setBackground(new java.awt.Color(214, 217, 223));
        jDialog2.setName("jdempleado"); // NOI18N

        jlempleado2.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jlempleado2.setText("Registro Empleados");

        jlbdni4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbdni4.setText("Dni");

        jlbnombre2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbnombre2.setText("Nombres");

        jlbdireccion2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbdireccion2.setText("Dirección");

        jlbapellido2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbapellido2.setText("Apellidos");

        jlbtelefono2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbtelefono2.setText("Telefono");

        jlbdni5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbdni5.setText("Cod empleado");

        jtfnombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfnombre2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jlempleado2))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlbdni4)
                                .addComponent(jlbdni5)
                                .addComponent(jlbdireccion2)
                                .addComponent(jlbnombre2)
                                .addComponent(jlbapellido2))
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addComponent(jlbtelefono2)
                                .addGap(37, 37, 37)))
                        .addGap(22, 22, 22)
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfcodempleado2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jtfdni2)
                            .addComponent(jtfnombre2)
                            .addComponent(jtfdireccion2)
                            .addComponent(jtftelefono2)
                            .addComponent(jtfapellido2))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlempleado2)
                .addGap(31, 31, 31)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbdni5)
                    .addComponent(jtfcodempleado2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbdni4)
                    .addComponent(jtfdni2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbnombre2)
                    .addComponent(jtfnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfdireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbapellido2))
                .addGap(23, 23, 23)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtftelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbtelefono2))
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfapellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbdireccion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empleados");
        setBackground(new java.awt.Color(214, 217, 223));
        setName("jdempleado"); // NOI18N
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Registro"));

        jlempleado.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jlempleado.setText("Registro Empleados");

        lblcodempleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcodempleado.setText("Id empleado");

        txtcodempleado.setEnabled(false);

        lbldni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbldni.setText("Dni");

        lblnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnombre.setText("Nombres");

        txtnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombresActionPerformed(evt);
            }
        });

        lblapellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblapellido.setText("Apellidos");

        lbltelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbltelefono.setText("Telefono");

        lbldireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbldireccion.setText("Dirección");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcodempleado)
                            .addComponent(lbldni)
                            .addComponent(lblnombre)
                            .addComponent(lblapellido)
                            .addComponent(lbltelefono)
                            .addComponent(lbldireccion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcodempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnombres)
                                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jlempleado))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnactualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminar)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jlempleado)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcodempleado))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldni)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblapellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefono))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnlimpiar)
                    .addComponent(btnactualizar)
                    .addComponent(btneliminar))
                .addGap(34, 34, 34))
        );

        tbempleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id empleado", "Dni", "Nombres", "Apellidos", "Telefono", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbempleado);
        if (tbempleado.getColumnModel().getColumnCount() > 0) {
            tbempleado.getColumnModel().getColumn(0).setResizable(false);
            tbempleado.getColumnModel().getColumn(1).setResizable(false);
            tbempleado.getColumnModel().getColumn(2).setResizable(false);
            tbempleado.getColumnModel().getColumn(3).setResizable(false);
            tbempleado.getColumnModel().getColumn(4).setResizable(false);
            tbempleado.getColumnModel().getColumn(5).setResizable(false);
        }

        jpnconsultar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Consultar registro"));

        btnconsultar.setText("Consultar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        jtfconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfconsultarActionPerformed(evt);
            }
        });

        lblcodempleado1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcodempleado1.setText("Dni Empleado");

        javax.swing.GroupLayout jpnconsultarLayout = new javax.swing.GroupLayout(jpnconsultar);
        jpnconsultar.setLayout(jpnconsultarLayout);
        jpnconsultarLayout.setHorizontalGroup(
            jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnconsultarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblcodempleado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnconsultar)
                .addContainerGap())
        );
        jpnconsultarLayout.setVerticalGroup(
            jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnconsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcodempleado1))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfnombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnombre1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtfnombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnombre2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombresActionPerformed

    private void jtfconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfconsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfconsultarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
    
        try {
        EmpleadoController empleado_crtl =new  EmpleadoController(); 
        
        Empleado empleado=new Empleado();
                
        empleado.setDni(txtdni.getText());
        empleado.setNombres(txtnombres.getText());
        empleado.setApellidos(txtapellidos.getText()); 
        empleado.setTelefono(txttelefono.getText());
        empleado.setDireccion(txtdireccion.getText());
        empleado.setEstado(1);
        empleado.setFecha_registro("2021-02-05");
        
      
              empleado_crtl.actualizar(empleado);
        JOptionPane.showMessageDialog(null, "Conectado");
      
        } catch (Exception e) {
           
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
            System.out.println(e);
        }
    
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed

        txtdni.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        txttelefono.setText("");
        txtdireccion.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

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
            java.util.logging.Logger.getLogger(EmpleadoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EmpleadoVista dialog = new EmpleadoVista(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbapellido1;
    private javax.swing.JLabel jlbapellido2;
    private javax.swing.JLabel jlbdireccion1;
    private javax.swing.JLabel jlbdireccion2;
    private javax.swing.JLabel jlbdni2;
    private javax.swing.JLabel jlbdni3;
    private javax.swing.JLabel jlbdni4;
    private javax.swing.JLabel jlbdni5;
    private javax.swing.JLabel jlbnombre1;
    private javax.swing.JLabel jlbnombre2;
    private javax.swing.JLabel jlbtelefono1;
    private javax.swing.JLabel jlbtelefono2;
    private javax.swing.JLabel jlempleado;
    private javax.swing.JLabel jlempleado1;
    private javax.swing.JLabel jlempleado2;
    private javax.swing.JPanel jpnconsultar;
    private javax.swing.JTextField jtfapellido1;
    private javax.swing.JTextField jtfapellido2;
    private javax.swing.JTextField jtfcodempleado1;
    private javax.swing.JTextField jtfcodempleado2;
    private javax.swing.JTextField jtfconsultar;
    private javax.swing.JTextField jtfdireccion1;
    private javax.swing.JTextField jtfdireccion2;
    private javax.swing.JTextField jtfdni1;
    private javax.swing.JTextField jtfdni2;
    private javax.swing.JTextField jtfnombre1;
    private javax.swing.JTextField jtfnombre2;
    private javax.swing.JTextField jtftelefono1;
    private javax.swing.JTextField jtftelefono2;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblcodempleado;
    private javax.swing.JLabel lblcodempleado1;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lbldni;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTable tbempleado;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcodempleado;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
