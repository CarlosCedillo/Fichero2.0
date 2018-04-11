package ventanas;

import conexion.ConexionBD;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tablas.Categorias;
import tablas.Fichas;
import tablas.Fuentes;
import tablas.SubCategorias1;
import tablas.SubCategorias2;
import tablas.SubCategorias3;

public class crear extends javax.swing.JFrame {
    
    Connection conexion = null;
    Integer nvoId = 0;

    public crear() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Connection conexion = null;
        
        cbCategoria.addItem("--Seleccione--");
        enlistarCategorias();
        
        cbSub1.disable();
        cbSub2.disable();
        cbSub3.disable();
        
        cbFuente.addItem("--Seleccione--");
        enlistarFuentes();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFicha = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblCategoria = new javax.swing.JLabel();
        lblSub1 = new javax.swing.JLabel();
        cbSub1 = new javax.swing.JComboBox();
        lblSub3 = new javax.swing.JLabel();
        cbSub3 = new javax.swing.JComboBox();
        lblSub2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblFuente = new javax.swing.JLabel();
        cbFuente = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();
        cbSub2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alántar");

        txtFicha.setColumns(20);
        txtFicha.setRows(5);
        jScrollPane1.setViewportView(txtFicha);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblCategoria.setText("Categoria");

        lblSub1.setText("Sub Categoria 1");

        cbSub1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSub1ItemStateChanged(evt);
            }
        });
        cbSub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSub1ActionPerformed(evt);
            }
        });

        lblSub3.setText("Sub Categoria 3");

        cbSub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSub3ActionPerformed(evt);
            }
        });

        lblSub2.setText("Sub Categoria 2");

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("-");

        lblFuente.setText("Fuente");

        cbFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFuenteActionPerformed(evt);
            }
        });

        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("-");

        cbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoriaItemStateChanged(evt);
            }
        });
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });

        cbSub2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSub2ItemStateChanged(evt);
            }
        });
        cbSub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSub2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(480, 480, 480)
                            .addComponent(btnRegresar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnGuardar))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblCategoria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblFuente)
                                        .addComponent(lblSub2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSub1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(lblSub3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(lblSub1)
                    .addComponent(cbSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSub2)
                    .addComponent(lblSub3)
                    .addComponent(cbSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuente)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(lblMensaje))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
        if( cbCategoria.getSelectedItem() == "--Seleccione--" || cbFuente.getSelectedItem() == "--Seleccione--" || txtFicha.getText().isEmpty()){
            lblMensaje.setForeground(Color.RED);
            lblMensaje.setText("Debe llenar todos los campos");
        }else{
            
            Categorias categoria = (Categorias) cbCategoria.getSelectedItem();
            Fuentes fuente = (Fuentes) cbFuente.getSelectedItem();
            SubCategorias1 subCategorias1 = (SubCategorias1) cbSub1.getSelectedItem();
            SubCategorias2 subCategorias2 = (SubCategorias2) cbSub2.getSelectedItem();
            SubCategorias3 subCategorias3 = (SubCategorias3) cbSub3.getSelectedItem();
            Integer subCat1 = 0, subCat2 = 0, subCat3 = 0;
                    
            if (cbSub1.getSelectedItem()==null || cbSub1.getSelectedItem() == "--Seleccione--"){
                subCat1 = 0;
            }else{
                subCat1 = subCategorias1.getId();
            }
            
            if (cbSub2.getSelectedItem()==null || cbSub2.getSelectedItem() == "--Seleccione--"){
                subCat2 = 0;
            }else{
                subCat1 = subCategorias2.getId();
            }
            
            if (cbSub3.getSelectedItem()==null || cbSub3.getSelectedItem() == "--Seleccione--"){
                subCat3 = 0;
            }else{
                subCat3 = subCategorias3.getId();
            }
            
            System.out.println("Ejecutando: INSERT INTO fichas "
                    + "(texto, categoria, subCategoia1, subCategoia2, subCategoia3, fuente) "
                    + "VALUES ('"+txtFicha.getText()+"', '"+categoria.getId()+"', '"+subCat1+"', "
                            + "'"+subCat2+"', '"+subCat3+"', '"+fuente.getId()+"')");
            
            conexion = ConexionBD.obtenerConexion();
            Statement statement = null;
            PreparedStatement preparedStatement;
            boolean guardado = false;
            
            try {
                
                ConexionBD.obtenerConexion();
                preparedStatement = conexion.prepareStatement("INSERT INTO "
                        + "fichas (texto, categoria, subCategoria1, subCategoria2, subCategoria3, fuente) "
                        + "VALUES (?, ?, ?, ?, ?, ?)");
                preparedStatement.setString(1, txtFicha.getText());
                preparedStatement.setInt(2, categoria.getId());
                preparedStatement.setInt(3, subCat1);
                preparedStatement.setInt(4, subCat2);
                preparedStatement.setInt(5, subCat3);
                preparedStatement.setInt(6, fuente.getId());
                preparedStatement.executeUpdate();
                
                conexion = ConexionBD.cerrarConexion();
                guardado = true;
                
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(crear.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if( guardado == true ){
                lblMensaje.setForeground(Color.blue);
                lblMensaje.setText("Correcto");
            }else{
                lblMensaje.setForeground(Color.red);
                lblMensaje.setText("No se pudo guardar la ficha");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        inicio jFrame = new inicio();
        this.setVisible(false);
        jFrame.setVisible(true);
        System.out.println("Regresando a inicio");
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*agregarCategorias jFrame = new agregarCategorias();
        System.out.println("Click en agrrgar Categoria... Abriendo ventana");
        jFrame.setVisible(true);*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbSub3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSub3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSub3ActionPerformed

    private void cbSub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSub1ActionPerformed

    private void cbFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFuenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFuenteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void cbSub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSub2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSub2ActionPerformed

    private void cbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoriaItemStateChanged
     /*   // TODO add your handling code here:
        
        if( cbCategoria.getSelectedItem() == "--Seleccione--" ){
            
        }else{
            Categorias categorias  = (Categorias) cbCategoria.getSelectedItem();
            
            try {
                cbSub1.removeAllItems();
                conexion = ConexionBD.obtenerConexion();
                ResultSet resultSet;
                String sql = "SELECT * FROM subCategorias1 WHERE idCategoria = "+ categorias.getId() +";";
                PreparedStatement preparedStatement = conexion.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();
                
                //cbSub1.enable();
                cbSub1.addItem("--Seleccione--");
                
                while (resultSet.next()) {
                    SubCategorias1 subCategorias1 = new SubCategorias1();
                    subCategorias1.setId(resultSet.getInt("id"));
                    subCategorias1.setIdCategoria(resultSet.getInt("idCategoria"));
                    subCategorias1.setNombre(resultSet.getString("nombre"));
                    subCategorias1.setActivo(resultSet.getBoolean("activo"));
                    cbSub1.addItem(subCategorias1);
                }
                
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }*/
    }//GEN-LAST:event_cbCategoriaItemStateChanged

    private void cbSub1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSub1ItemStateChanged
        // TODO add your handling code here:
        
        if ( cbSub1.getSelectedItem() == "--Seleccione--" ){
        }else{
            
        }
        
    }//GEN-LAST:event_cbSub1ItemStateChanged

    private void cbSub2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSub2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSub2ItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JComboBox cbFuente;
    private javax.swing.JComboBox cbSub1;
    private javax.swing.JComboBox cbSub2;
    private javax.swing.JComboBox cbSub3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblFuente;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblSub1;
    private javax.swing.JLabel lblSub2;
    private javax.swing.JLabel lblSub3;
    private javax.swing.JTextArea txtFicha;
    // End of variables declaration//GEN-END:variables

    private void enlistarCategorias() {
        
        try {
            conexion = ConexionBD.obtenerConexion();
            ResultSet resultSet;
            String sql = "SELECT * FROM categorias;";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Categorias categorias = new Categorias();
                categorias.setId(resultSet.getInt("id"));
                categorias.setNombre(resultSet.getString("nombre"));
                categorias.setActivo(resultSet.getBoolean("activo"));
                cbCategoria.addItem(categorias);
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.getErrorCode());
        }
    }
    
    private void enlistarFuentes() {
        
        try {
            conexion = ConexionBD.obtenerConexion();
            ResultSet resultSet;
            String sql = "SELECT * FROM fuentes;";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Fuentes fuentes = new Fuentes();
                fuentes.setId(resultSet.getInt("id"));
                fuentes.setNombre(resultSet.getString("nombre"));
                cbFuente.addItem(fuentes);
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.getErrorCode());
        }
    }
}
