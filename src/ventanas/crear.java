package ventanas;

import conexion.ConexionBD;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tablas.Categorias;
import tablas.Fuentes;
import tablas.SubCategorias1;
import tablas.SubCategorias2;
import tablas.SubCategorias3;

public class crear extends javax.swing.JFrame {
    
    Connection conexion = null;

    public crear() throws ClassNotFoundException {
        initComponents();
        setTitle("Fichero 2.0 / Crear ");
        this.setLocationRelativeTo(null);
        
        cbCategoria.addItem("--Seleccione--");
        enlistarCategorias();
        
        cbSub1.disable();
        cbSub2.disable();
        cbSub3.disable();
        
        cbFuente.addItem("--Seleccione--");
        enlistarFuentes();
        
        txtFicha.setLineWrap(true);
        
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
        lblFuente = new javax.swing.JLabel();
        cbFuente = new javax.swing.JComboBox();
        lblMensaje = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();
        cbSub2 = new javax.swing.JComboBox();
        btnCategorias = new javax.swing.JButton();
        btnFuentes = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

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

        lblSub3.setText("Sub Categoria 3");

        lblSub2.setText("Sub Categoria 2");

        lblFuente.setText("Fuente");

        cbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoriaItemStateChanged(evt);
            }
        });

        cbSub2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSub2ItemStateChanged(evt);
            }
        });

        btnCategorias.setText("Categorias");
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });

        btnFuentes.setText("Fuentes");
        btnFuentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuentesActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(lblCategoria)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblFuente)
                                            .addComponent(lblSub2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbFuente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(lblSub3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSub3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnFuentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblSub1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(lblSub1)
                    .addComponent(cbSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategorias))
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
                    .addComponent(lblMensaje)
                    .addComponent(btnFuentes))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        
        if( cbCategoria.getSelectedIndex()== 0 || cbFuente.getSelectedIndex()== 0 || txtFicha.getText().isEmpty()){
            
            lblMensaje.setForeground(Color.RED);
            lblMensaje.setText("Debe llenar todos los campos");
            
        }else{
            
            Categorias categoria = (Categorias) cbCategoria.getSelectedItem();
            Fuentes fuente = (Fuentes) cbFuente.getSelectedItem();
            Integer sub1, sub2, sub3;
            
           if( cbSub1.getSelectedIndex() > 0 ){
               SubCategorias1 subCategorias1 = (SubCategorias1) cbSub1.getSelectedItem();
               sub1 = subCategorias1.getId();
           }else{
               sub1 = 0;
           }
           
           if( cbSub2.getSelectedIndex() > 0 ){
               SubCategorias2 subCategorias2 = (SubCategorias2) cbSub2.getSelectedItem();
               sub2 = subCategorias2.getId();
           }else{
               sub2 = 0;
           }
           
           if( cbSub3.getSelectedIndex() > 0 ){
               SubCategorias3 subCategorias3 = (SubCategorias3) cbSub3.getSelectedItem();
               sub3 = subCategorias3.getId();
           }else{
               sub3 = 0;
           }
            
            System.out.println("Ejecutando: INSERT INTO fichas "
                    + "(texto, categoria, subCategoia1, subCategoia2, subCategoia3, fuente) "
                    + "VALUES ('"+ txtFicha.getText() +"', '"+ categoria.getId() +"', '"+ sub1 +"', "
                            + "'"+ sub2 +"', '"+ sub3 +"', '"+fuente.getId()+"')");
            
            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            boolean guardado = false;
            
            try {
                
                ConexionBD.obtenerConexion();
                preparedStatement = conexion.prepareStatement("INSERT INTO "
                        + "fichas (texto, categoria, subCategoria1, subCategoria2, subCategoria3, fuente) "
                        + "VALUES (?, ?, ?, ?, ?, ?)");
                preparedStatement.setString(1, txtFicha.getText());
                preparedStatement.setInt(2, categoria.getId());
                preparedStatement.setInt(3, sub1);
                preparedStatement.setInt(4, sub2);
                preparedStatement.setInt(5, sub3);
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
                
                JOptionPane.showMessageDialog(null, "Ficha correctamente guardada");
                
                txtFicha.setText("");
                cbCategoria.setSelectedIndex(0);
                
                cbSub1.disable();
                
                cbSub2.disable();
                
                cbSub3.disable();
                
                cbFuente.setSelectedIndex(0);
                
                lblMensaje.setText("");
                
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

    private void cbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoriaItemStateChanged
        // Esto es para cuando se seleccione una categoria se activen las subcategorias1 correspondientes
        
        if( cbCategoria.getSelectedIndex() == 0 ){
            
        }else{
            Categorias categorias  = (Categorias) cbCategoria.getSelectedItem();
            
            try {
                cbSub1.removeAllItems();
                conexion = ConexionBD.obtenerConexion();
                ResultSet resultSet;
                String sql = "SELECT * FROM subCategorias1 WHERE idCategoria = "+ categorias.getId() +"  AND activo = true ORDER BY nombre ASC;";
                PreparedStatement preparedStatement = conexion.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();
                
                cbSub1.enable();
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
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_cbCategoriaItemStateChanged

    private void cbSub1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSub1ItemStateChanged
        // Esto es para cuando se seleccione una subcategoria1 se activen las subcategorias2 correspondientes
        
        if( cbSub1.isEnabled() == true && cbSub1.getSelectedIndex() > 0 ){
            
            SubCategorias1 subCategorias1  = (SubCategorias1) cbSub1.getSelectedItem();
            
            try {
                cbSub2.removeAllItems();
                conexion = ConexionBD.obtenerConexion();
                ResultSet resultSet;
                String sql = "SELECT * FROM subCategorias2 WHERE idSubCategoria1 = "+ subCategorias1.getId() +" AND activo = true ORDER BY nombre ASC;";
                PreparedStatement preparedStatement = conexion.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();
                
                cbSub2.enable();
                cbSub2.addItem("--Seleccione--");
                    
                while ( resultSet.next()) {
                    SubCategorias2 subCategorias2 = new SubCategorias2();
                    subCategorias2.setId(resultSet.getInt("id"));
                    subCategorias2.setIdSubCategoria1(resultSet.getInt("idSubCategoria1"));
                    subCategorias2.setNombre(resultSet.getString("nombre"));
                    subCategorias2.setActivo(resultSet.getBoolean("activo"));
                    cbSub2.addItem(subCategorias2);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_cbSub1ItemStateChanged

    private void cbSub2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSub2ItemStateChanged
        // Esto es para cuando se seleccione una subcategoria2 se activen las subcategorias3 correspondientes
        
        if( cbSub2.isEnabled() == true && cbSub2.getSelectedIndex() > 0 ){
            
            SubCategorias2 subCategorias2  = (SubCategorias2) cbSub2.getSelectedItem();
            
            try {
                cbSub3.removeAllItems();
                conexion = ConexionBD.obtenerConexion();
                ResultSet resultSet;
                String sql = "SELECT * FROM subCategorias3 WHERE idSubCategoria2 = "+ subCategorias2.getId() +" AND activo = true ORDER BY nombre ASC;";
                PreparedStatement preparedStatement = conexion.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();
                
                cbSub3.enable();
                cbSub3.addItem("--Seleccione--");
                    
                while ( resultSet.next()) {
                    SubCategorias3 subCategorias3 = new SubCategorias3();
                    subCategorias3.setId(resultSet.getInt("id"));
                    subCategorias3.setIdSubCategoria2(resultSet.getInt("idSubCategoria2"));
                    subCategorias3.setNombre(resultSet.getString("nombre"));
                    subCategorias3.setActivo(resultSet.getBoolean("activo"));
                    cbSub3.addItem(subCategorias3);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_cbSub2ItemStateChanged

    private void btnFuentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuentesActionPerformed
        // Para desactivar esa ventana y activa la de fuentes
        
        listarFuente jframe = null;
        try {
            jframe = new listarFuente();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(crear.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        System.out.println("Abriendo ventana de modificacion de fuentes");
        jframe.setVisible(true);
        
    }//GEN-LAST:event_btnFuentesActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // Deja todo como al princiopio
        
        cbCategoria.setSelectedIndex(0);
        
        cbSub1.setSelectedIndex(-1);
        cbSub1.disable();
        
        cbSub2.setSelectedIndex(-1);
        cbSub2.disable();
        
        cbSub3.setSelectedIndex(-1);
        cbSub3.disable();
        
        cbFuente.setSelectedIndex(0);
        
        txtFicha.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        // Para desactivar esa ventana y activa la de fuentes
        
        listarCategorias jframe = new listarCategorias();
        this.setVisible(false);
        System.out.println("Abriendo ventana de modificacion de categorias");
        jframe.setVisible(true);
        
    }//GEN-LAST:event_btnCategoriasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnFuentes;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JComboBox cbFuente;
    private javax.swing.JComboBox cbSub1;
    private javax.swing.JComboBox cbSub2;
    private javax.swing.JComboBox cbSub3;
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

    private void enlistarCategorias() throws ClassNotFoundException {
        
        //Consulta la bd y enlista categorias
        
        try {
            conexion = ConexionBD.obtenerConexion();
            ResultSet resultSet;
            String sql = "SELECT * FROM categorias WHERE activo = true ORDER BY nombre ASC;";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            conexion = ConexionBD.cerrarConexion();
            
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
    
    private void enlistarFuentes() throws ClassNotFoundException {
        
        //Consulta la bd y enlista fuentes
        
        try {
            conexion = ConexionBD.obtenerConexion();
            ResultSet resultSet;
            String sql = "SELECT * FROM fuentes;";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            conexion = ConexionBD.cerrarConexion();
            
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
