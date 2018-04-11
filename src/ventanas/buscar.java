package ventanas;

public class buscar extends javax.swing.JFrame {

    public buscar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtros = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        rbuTexto = new javax.swing.JRadioButton();
        rbuCategoria = new javax.swing.JRadioButton();
        rbuSub2 = new javax.swing.JRadioButton();
        tbuSub1 = new javax.swing.JRadioButton();
        rbuSub3 = new javax.swing.JRadioButton();
        rbuFuente = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        lblSub1 = new javax.swing.JLabel();
        lblSub2 = new javax.swing.JLabel();
        txtSub1 = new javax.swing.JTextField();
        txtSub2 = new javax.swing.JTextField();
        lblSub3 = new javax.swing.JLabel();
        txtSub3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFicha = new javax.swing.JTextArea();
        btnSig = new javax.swing.JButton();
        btnAnt = new javax.swing.JButton();
        lblFuente = new javax.swing.JLabel();
        txtFuente = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBuscar.setText("Buscar");

        btnBuscar.setText("Buscar");

        filtros.add(rbuTexto);
        rbuTexto.setText("Texto");

        filtros.add(rbuCategoria);
        rbuCategoria.setText("Categoria");

        filtros.add(rbuSub2);
        rbuSub2.setText("Sub Categoria 2");

        filtros.add(tbuSub1);
        tbuSub1.setText("Sub Categoria 1");

        filtros.add(rbuSub3);
        rbuSub3.setText("Sub Categoria 3");

        filtros.add(rbuFuente);
        rbuFuente.setText("Fuente");

        filtros.add(jRadioButton1);
        jRadioButton1.setText("Todo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addComponent(lblBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbuCategoria)
                            .addComponent(rbuTexto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbuSub2)
                                .addGap(18, 18, 18)
                                .addComponent(rbuFuente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tbuSub1)
                                .addGap(18, 18, 18)
                                .addComponent(rbuSub3)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1))))
                    .addComponent(txtBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbuTexto)
                    .addComponent(tbuSub1)
                    .addComponent(rbuSub3)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbuCategoria)
                    .addComponent(rbuSub2)
                    .addComponent(rbuFuente)))
        );

        lblNumero.setText("No. de Ficha");

        lblCategoria.setText("Categoria");

        txtNumero.setEditable(false);

        txtCategoria.setEditable(false);

        lblSub1.setText("Sub Categoria 1");

        lblSub2.setText("Sub Categoria 2");

        txtSub1.setEditable(false);

        txtSub2.setEditable(false);

        lblSub3.setText("Sub Categoria 3");

        txtSub3.setEditable(false);

        txtFicha.setEditable(false);
        txtFicha.setColumns(20);
        txtFicha.setRows(5);
        jScrollPane1.setViewportView(txtFicha);

        btnSig.setText(">");

        btnAnt.setText("<");

        lblFuente.setText("Fuente");

        txtFuente.setEditable(false);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCategoria)
                            .addComponent(lblNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblSub1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblFuente)
                                .addGap(30, 30, 30)
                                .addComponent(txtFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblSub3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblSub2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSub2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnAnt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSig))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(btnRegresar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSub2)
                    .addComponent(txtSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuente)
                    .addComponent(txtFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSub3)
                    .addComponent(txtSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSub1)
                    .addComponent(txtSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegresar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAnt)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSig)
                        .addGap(96, 96, 96))))
        );

        lblInfo.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alántar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInfo))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        
        inicio jFrame = new inicio();
        this.setVisible(false);
        jFrame.setVisible(true);
        System.out.println("Regresando a inicio");
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnt;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSig;
    private javax.swing.ButtonGroup filtros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblFuente;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSub1;
    private javax.swing.JLabel lblSub2;
    private javax.swing.JLabel lblSub3;
    private javax.swing.JRadioButton rbuCategoria;
    private javax.swing.JRadioButton rbuFuente;
    private javax.swing.JRadioButton rbuSub2;
    private javax.swing.JRadioButton rbuSub3;
    private javax.swing.JRadioButton rbuTexto;
    private javax.swing.JRadioButton tbuSub1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextArea txtFicha;
    private javax.swing.JTextField txtFuente;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtSub1;
    private javax.swing.JTextField txtSub2;
    private javax.swing.JTextField txtSub3;
    // End of variables declaration//GEN-END:variables
}
