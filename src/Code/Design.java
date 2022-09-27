package Code;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Design extends javax.swing.JFrame {

    public ArrayList<Person> ListaPersonas = new ArrayList<Person>();
    public String[][] MatrizP;

    public String Nombres, Apellidos, Direccion, Email, Genero, Departamento;
    public long Cedula, Celular, Telefono, SalarioBase, HED, HEN, HoraHED, HoraHEN, AuxTrans, Salario, Aportes;
    public boolean AuxCedula, AuxCelular, AuxTelefono, AuxSalarioBase, CedulaValidar;
    public Design() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        Txt = new javax.swing.JLabel();
        TxtCedula = new javax.swing.JLabel();
        BoxNombres = new javax.swing.JTextField();
        TxtNombres = new javax.swing.JLabel();
        BoxCedula = new javax.swing.JTextField();
        TxtApellidos = new javax.swing.JLabel();
        BoxApellidos = new javax.swing.JTextField();
        TxtCelular = new javax.swing.JLabel();
        BoxCelular = new javax.swing.JTextField();
        TxtGenero = new javax.swing.JLabel();
        BoxGenero = new javax.swing.JComboBox<>();
        TxtDireccion = new javax.swing.JLabel();
        BoxDireccion = new javax.swing.JTextField();
        TxtDireccion1 = new javax.swing.JLabel();
        BoxTelefono = new javax.swing.JTextField();
        TxtDireccion2 = new javax.swing.JLabel();
        BoxEmail = new javax.swing.JTextField();
        TxtSalarioBase = new javax.swing.JLabel();
        BoxSalarioBase = new javax.swing.JTextField();
        TxtDepartamento = new javax.swing.JLabel();
        BoxDepartamento = new javax.swing.JTextField();
        TxtDepartamento1 = new javax.swing.JLabel();
        TxtDepartamento2 = new javax.swing.JLabel();
        BoxHED = new javax.swing.JTextField();
        BoxHEN = new javax.swing.JTextField();
        BotCalcular = new javax.swing.JButton();
        TxtValorHED = new javax.swing.JLabel();
        TxtValorHEN = new javax.swing.JLabel();
        TxtAuxTrans = new javax.swing.JLabel();
        TxtSalario = new javax.swing.JLabel();
        BoxValorHED = new javax.swing.JTextField();
        BoxValorHEN = new javax.swing.JTextField();
        BoxAuxTrans = new javax.swing.JTextField();
        BoxSalario = new javax.swing.JTextField();
        TxtSalud = new javax.swing.JLabel();
        TxtPension = new javax.swing.JLabel();
        TxtAportes = new javax.swing.JLabel();
        BoxSalud = new javax.swing.JTextField();
        BoxPension = new javax.swing.JTextField();
        BoxAportes = new javax.swing.JTextField();
        Txt1 = new javax.swing.JLabel();
        Txt2 = new javax.swing.JLabel();
        BotModificar = new javax.swing.JButton();
        BotGuardar = new javax.swing.JButton();
        BotSalir = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable);

        Txt.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Txt.setText("EMPLEADO");

        TxtCedula.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtCedula.setText("CEDULA");

        BoxNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BoxNombresFocusLost(evt);
            }
        });

        TxtNombres.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtNombres.setText("NOMBRES");

        BoxCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BoxCedulaFocusLost(evt);
            }
        });

        TxtApellidos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtApellidos.setText("APELLIDOS");

        TxtCelular.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtCelular.setText("CELULAR");

        TxtGenero.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtGenero.setText("GENERO");

        BoxGenero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        TxtDireccion.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtDireccion.setText("DIRECCIÓN");

        TxtDireccion1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtDireccion1.setText("TELEFONO");

        TxtDireccion2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtDireccion2.setText("E-MAIL");

        TxtSalarioBase.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtSalarioBase.setText("SALARIO BASE");

        TxtDepartamento.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtDepartamento.setText("DEPARTAMENTO");

        BoxDepartamento.setEditable(false);

        TxtDepartamento1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtDepartamento1.setText("H.E. DIURNA");

        TxtDepartamento2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtDepartamento2.setText("H.E. NOCTURNA");

        BotCalcular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotCalcular.setText("CALCULAR");
        BotCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotCalcularActionPerformed(evt);
            }
        });

        TxtValorHED.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtValorHED.setText("VALOR H.E.D");

        TxtValorHEN.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtValorHEN.setText("VALOR H.E.N");

        TxtAuxTrans.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtAuxTrans.setText("AUX. TRANSP");

        TxtSalario.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtSalario.setText("SALARIO");

        BoxValorHED.setEditable(false);

        BoxValorHEN.setEditable(false);

        BoxAuxTrans.setEditable(false);

        BoxSalario.setEditable(false);

        TxtSalud.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtSalud.setText("SALUD");

        TxtPension.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtPension.setText("PENSIÓN");

        TxtAportes.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtAportes.setText("APORTES");

        BoxSalud.setEditable(false);

        BoxPension.setEditable(false);

        BoxAportes.setEditable(false);

        Txt1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Txt1.setText("DATOS");

        Txt2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Txt2.setText("NOMINA");

        BotModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotModificar.setText("MODIFICAR");
        BotModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotModificarActionPerformed(evt);
            }
        });

        BotGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotGuardar.setText("GUARDAR");
        BotGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotGuardarActionPerformed(evt);
            }
        });

        BotSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotSalir.setText("SALIR");
        BotSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotSalirActionPerformed(evt);
            }
        });

        Eliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Eliminar.setText("ELIMINAR");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Txt1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNombres)
                                    .addComponent(TxtCedula)
                                    .addComponent(TxtApellidos)
                                    .addComponent(TxtCelular)
                                    .addComponent(TxtGenero)
                                    .addComponent(TxtDireccion)
                                    .addComponent(TxtDireccion1)
                                    .addComponent(TxtDireccion2))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BoxTelefono)
                                    .addComponent(BoxCelular, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BoxApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BoxNombres, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BoxGenero, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BoxDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BoxCedula, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BoxEmail))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(BotCalcular)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotGuardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotModificar)
                                        .addGap(18, 18, 18)
                                        .addComponent(Eliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotSalir))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(TxtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TxtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Txt2))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(BoxDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                                    .addComponent(BoxSalarioBase)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(TxtDepartamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(BoxHED))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(TxtDepartamento2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(BoxHEN)))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtAuxTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtValorHEN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtValorHED, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BoxSalario)
                                            .addComponent(BoxAuxTrans)
                                            .addComponent(BoxValorHEN)
                                            .addComponent(BoxValorHED, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(TxtPension, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TxtAportes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TxtSalud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BoxSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(BoxAportes)
                                                .addComponent(BoxPension, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 86, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(466, 466, 466)
                .addComponent(Txt)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(Txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Txt1)
                    .addComponent(Txt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TxtCedula)
                                            .addComponent(BoxCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtSalarioBase)
                                            .addComponent(BoxSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TxtNombres)
                                            .addComponent(BoxNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtDepartamento)
                                            .addComponent(BoxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TxtApellidos)
                                            .addComponent(BoxApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtDepartamento1)
                                            .addComponent(BoxHED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TxtCelular)
                                            .addComponent(BoxCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtDepartamento2)
                                            .addComponent(BoxHEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtGenero))
                                    .addComponent(BoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtDireccion)
                                    .addComponent(BoxDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BoxSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtSalud))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BoxPension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BoxAportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtAportes))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtDireccion1)
                            .addComponent(BoxTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtDireccion2)
                            .addComponent(BoxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BoxValorHED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtValorHED))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BoxValorHEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPension)
                            .addComponent(TxtValorHEN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BoxAuxTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtAuxTrans))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BoxSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtSalario))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotCalcular)
                    .addComponent(BotModificar)
                    .addComponent(BotGuardar)
                    .addComponent(BotSalir)
                    .addComponent(Eliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotSalirActionPerformed
    private void Datos() {
        SalarioBase = Long.parseLong(BoxSalarioBase.getText());
        HED = Long.parseLong(BoxHED.getText());
        HEN = Long.parseLong(BoxHEN.getText());
    }
    private void BotGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotGuardarActionPerformed
 
        try {
            Cedula = Long.parseLong(BoxCedula.getText());
            Nombres = BoxNombres.getText();
            Apellidos = BoxApellidos.getText();
            Celular = Long.parseLong(BoxCelular.getText());
            Genero = BoxGenero.getSelectedItem().toString();
            Direccion = BoxDireccion.getText();
            Telefono = Long.parseLong(BoxTelefono.getText());
            Email = BoxEmail.getText();
            SalarioBase = Long.parseLong(BoxSalarioBase.getText());
            HoraHED = Long.parseLong(BoxHED.getText());
            HoraHEN = Long.parseLong(BoxHEN.getText());
            HED = Long.parseLong(BoxHED.getText());
            HEN = Long.parseLong(BoxHEN.getText());
            
            VerificarDatos();

            if (AuxCedula == false){
                if (AuxCelular == false){
                    if (AuxTelefono == false){
                        if (AuxSalarioBase == false){
                            
                            if(CedulaValidar == false){
                                CalcularHoras();
                                ListaPersonas.add(new Person(Nombres, Apellidos, Direccion, Email, Genero, Departamento, Direccion, Cedula, Celular, Telefono, SalarioBase, HoraHED, HoraHEN, HED, HEN, AuxTrans, Salario));
                                Tabla(ListaPersonas);
                                DatosLimpiar(); 
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "LA CEDULA YA EXISTE", "ERROR", 1);
                            }
                                                          
                        }
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "DIGITE BIEN TODOS LOS CAMPOS", "ERROR", 1);               
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DIGITE BIEN TODOS LOS CAMPOS", "ERROR", 1);
        }
    }//GEN-LAST:event_BotGuardarActionPerformed
      
    private void ValidarCedula(JTextField component) { 
        
        try{
            long AuxCedulaVal = Long.parseLong(BoxCedula.getText());
            CedulaValidar = false;
        
            if (jTable.getRowCount() > 0) {
                for (int i = 0; i < ListaPersonas.size(); i++) {
                    if (ListaPersonas.get(i).getCedula() == AuxCedulaVal) {                    
                        CedulaValidar = true;
                        break;
                    }                                              
                }
            }    
        }
        catch(Exception e){
            
        }
            
    }
    
    private void Tabla(ArrayList<Person> ListaPersonas) {

        MatrizP = new String[ListaPersonas.size()][16];
        for (int i = 0; i < ListaPersonas.size(); i++) {
            MatrizP[i][0] = String.valueOf(ListaPersonas.get(i).getCedula());
            MatrizP[i][1] = ListaPersonas.get(i).getNombres();
            MatrizP[i][2] = ListaPersonas.get(i).getApellidos();
            MatrizP[i][3] = String.valueOf(ListaPersonas.get(i).getCelular());
            MatrizP[i][4] = ListaPersonas.get(i).getGenero();
            MatrizP[i][5] = ListaPersonas.get(i).getDireccion();
            MatrizP[i][6] = String.valueOf(ListaPersonas.get(i).getTelefono());
            MatrizP[i][7] = ListaPersonas.get(i).getEmail();
            MatrizP[i][8] = ListaPersonas.get(i).getDepartamento();
            MatrizP[i][9] = String.valueOf(ListaPersonas.get(i).getSalarioBase());
            MatrizP[i][10] = String.valueOf(ListaPersonas.get(i).getHoraHED());
            MatrizP[i][11] = String.valueOf(ListaPersonas.get(i).getHoraHEN());
            MatrizP[i][12] = String.valueOf(ListaPersonas.get(i).getHED());
            MatrizP[i][13] = String.valueOf(ListaPersonas.get(i).getHEN());
            MatrizP[i][14] = String.valueOf(ListaPersonas.get(i).getAuxTrans());
            MatrizP[i][15] = String.valueOf(ListaPersonas.get(i).getSalario());
        }

        jTable.setModel(new javax.swing.table.DefaultTableModel(
                MatrizP, new String[]{
                    "CEDULA", "NOMBRES", "APELLIDOS", "CELULAR", "GENERO", "DIRECCIÓN", "TELEFONO", "E-MAIL", "DEPARTAMENTO", "SALARIO BASE", "HORA ED", "HORA EN" , "HED", "HEN", "AUX. TRANS", "SALARIO"
                }
        ));
    }
    
    private void VerificarDatos(){
        if (Cedula < 0){
            AuxCedula = true;
        }
        else{
            AuxCedula = false;
        }
        if (Celular < 0){
            AuxCelular = true;
        }
        else{
            AuxCelular = false;
        }
        if (Telefono < 0){
            AuxTelefono = true;
        }
        else{
            AuxTelefono = false;
        }
        if (SalarioBase < 0){
            AuxSalarioBase = true;
        }
        else{
            AuxSalarioBase = false;
        }
    }
    
    private void BotCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotCalcularActionPerformed
        try {
            Datos();

            if (HED >= 0 && HED <= 60) {
                if (HEN >= 0 && HEN <= 60) {
                    if (SalarioBase > 0){                        
                        CalcularHoras();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "DIGITE BIEN EL SALARIO BASE", "ERROR", 1);
                    }
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "RANGO DE HORAS EXTRAS (0 - 60) HORAS", "ERROR", 1);
                BoxHED.setText("");
                BoxHEN.setText("");
                BoxValorHED.setText("");
                BoxValorHEN.setText("");
                BoxAuxTrans.setText("");
                BoxSalario.setText("");
                BoxSalud.setText("");
                BoxPension.setText("");
                BoxAportes.setText("");
            }

            if (SalarioBase > 0 && SalarioBase < 1000000) {
                Departamento = "Planta";
                BoxDepartamento.setText("Planta");
            }
            if (SalarioBase >= 1000000 && SalarioBase < 3000000) {
                Departamento = "Administrativo";
                BoxDepartamento.setText("Administrativo");
            }
            if (SalarioBase >= 3000000) {
                Departamento = "Gerencia";
                BoxDepartamento.setText("Gerencia");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DIGITE BIEN TODOS LOS CAMPOS", "ERROR", 1);
        }


    }//GEN-LAST:event_BotCalcularActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int Fila;

        try {
            Fila = jTable.getSelectedRow();
            ListaPersonas.remove(Fila);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SELECCIONE LA FILA QUE DESEA ELIMINAR", "ERROR", 1);
        }
        Tabla(ListaPersonas);
    }//GEN-LAST:event_EliminarActionPerformed

    private void BotModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotModificarActionPerformed
        int Fila;
        Person Aux;
        
        if (jTable.getSelectedRowCount() > 0) {
            Fila = jTable.getSelectedRow();
            Aux = ListaPersonas.get(Fila);
            
            BoxCedula.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            BoxNombres.setText(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());
            BoxApellidos.setText(jTable.getValueAt(jTable.getSelectedRow(), 2).toString());
            BoxCelular.setText(jTable.getValueAt(jTable.getSelectedRow(), 3).toString());
            BoxGenero.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 4));
            BoxDireccion.setText(jTable.getValueAt(jTable.getSelectedRow(), 5).toString());
            BoxTelefono.setText(jTable.getValueAt(jTable.getSelectedRow(), 6).toString());
            BoxEmail.setText(jTable.getValueAt(jTable.getSelectedRow(), 7).toString());
            BoxDepartamento.setText(jTable.getValueAt(jTable.getSelectedRow(), 8).toString());
            BoxSalarioBase.setText(jTable.getValueAt(jTable.getSelectedRow(), 9).toString());
            BoxHED.setText(jTable.getValueAt(jTable.getSelectedRow(), 10).toString());
            BoxHEN.setText(jTable.getValueAt(jTable.getSelectedRow(), 11).toString());
            
            Cedula = Long.parseLong(BoxCedula.getText());
            Nombres = BoxNombres.getText();
            Apellidos = BoxApellidos.getText();
            Celular = Long.parseLong(BoxCelular.getText());
            Genero = BoxGenero.getSelectedItem().toString();
            Direccion = BoxDireccion.getText();
            Telefono = Long.parseLong(BoxTelefono.getText());
            Email = BoxEmail.getText();
            SalarioBase = Long.parseLong(BoxSalarioBase.getText());
            HoraHED = Long.parseLong(BoxHED.getText());
            HoraHEN = Long.parseLong(BoxHEN.getText());
            
           
            Aux.setCedula(Cedula);
            Aux.setNombres(Nombres);
            Aux.setApellidos(Apellidos);
            Aux.setCelular(Celular);
            Aux.setGenero(Genero);
            Aux.setDireccion(Direccion);
            Aux.setTelefono(Telefono);
            Aux.setEmail(Email);
            Aux.setSalarioBase(SalarioBase);
            Aux.setHoraHED(HoraHED);
            Aux.setHoraHEN(HoraHEN);
            Tabla(ListaPersonas);
            
            ListaPersonas.remove(Fila);
                       
            
        }
        else{
            JOptionPane.showMessageDialog(null, "SELECCIONE LA FILA QUE DESEA ELIMINAR", "ERROR", 1);
        }

    }//GEN-LAST:event_BotModificarActionPerformed

    private void BoxCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BoxCedulaFocusLost
        ValidarCedula(BoxCedula);
     
    }//GEN-LAST:event_BoxCedulaFocusLost

    private void BoxNombresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BoxNombresFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxNombresFocusLost

    private void DatosLimpiar() {

        BoxCedula.setText("");
        BoxNombres.setText("");
        BoxApellidos.setText("");
        BoxCelular.setText("");
        BoxDireccion.setText("");
        BoxTelefono.setText("");
        BoxEmail.setText("");
        BoxSalarioBase.setText("");
        BoxDepartamento.setText("");
        BoxHED.setText("");
        BoxHEN.setText("");
        BoxValorHED.setText("");
        BoxValorHEN.setText("");
        BoxAuxTrans.setText("");
        BoxSalario.setText("");
        BoxSalud.setText("");
        BoxPension.setText("");
        BoxAportes.setText("");

    }

    private void CalcularHoras() {
        Datos();
        HED = HED * (SalarioBase / 240);
        HEN = ((HEN * (SalarioBase / 240)) * 135) / 100;
        BoxValorHED.setText(String.valueOf(HED));
        BoxValorHEN.setText(String.valueOf(HEN));

        if (SalarioBase > 2000000) {
            AuxTrans = 0;
            BoxAuxTrans.setText("0");
        } else {
            AuxTrans = 117172;
            BoxAuxTrans.setText("117172");
        }

        Salario = SalarioBase + HED + HEN + AuxTrans;
        BoxSalario.setText(String.valueOf(Salario));

        Aportes = (Salario * 4) / 100;

        BoxSalud.setText(String.valueOf(Aportes));
        BoxPension.setText(String.valueOf(Aportes));
        BoxAportes.setText(String.valueOf(Aportes + Aportes));
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Design().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotCalcular;
    private javax.swing.JButton BotGuardar;
    private javax.swing.JButton BotModificar;
    private javax.swing.JButton BotSalir;
    private javax.swing.JTextField BoxApellidos;
    private javax.swing.JTextField BoxAportes;
    private javax.swing.JTextField BoxAuxTrans;
    private javax.swing.JTextField BoxCedula;
    private javax.swing.JTextField BoxCelular;
    private javax.swing.JTextField BoxDepartamento;
    private javax.swing.JTextField BoxDireccion;
    private javax.swing.JTextField BoxEmail;
    private javax.swing.JComboBox<String> BoxGenero;
    private javax.swing.JTextField BoxHED;
    private javax.swing.JTextField BoxHEN;
    private javax.swing.JTextField BoxNombres;
    private javax.swing.JTextField BoxPension;
    private javax.swing.JTextField BoxSalario;
    private javax.swing.JTextField BoxSalarioBase;
    private javax.swing.JTextField BoxSalud;
    private javax.swing.JTextField BoxTelefono;
    private javax.swing.JTextField BoxValorHED;
    private javax.swing.JTextField BoxValorHEN;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel Txt;
    private javax.swing.JLabel Txt1;
    private javax.swing.JLabel Txt2;
    private javax.swing.JLabel TxtApellidos;
    private javax.swing.JLabel TxtAportes;
    private javax.swing.JLabel TxtAuxTrans;
    private javax.swing.JLabel TxtCedula;
    private javax.swing.JLabel TxtCelular;
    private javax.swing.JLabel TxtDepartamento;
    private javax.swing.JLabel TxtDepartamento1;
    private javax.swing.JLabel TxtDepartamento2;
    private javax.swing.JLabel TxtDireccion;
    private javax.swing.JLabel TxtDireccion1;
    private javax.swing.JLabel TxtDireccion2;
    private javax.swing.JLabel TxtGenero;
    private javax.swing.JLabel TxtNombres;
    private javax.swing.JLabel TxtPension;
    private javax.swing.JLabel TxtSalario;
    private javax.swing.JLabel TxtSalarioBase;
    private javax.swing.JLabel TxtSalud;
    private javax.swing.JLabel TxtValorHED;
    private javax.swing.JLabel TxtValorHEN;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables

}
