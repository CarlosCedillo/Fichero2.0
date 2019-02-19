package ventanas;

import conexion.ConexionBD;
import dao.implementaciones.CategoriaDaoImp;
import dao.implementaciones.FichaDaoImp;
import dao.implementaciones.SubCategoria1DaoImp;
import dao.implementaciones.SubCategoria2DaoImp;
import dao.implementaciones.SubCategoria3DaoImp;
import dao.implementaciones.FuenteDaoImp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import tablas.Categorias;
import tablas.Fichas;
import tablas.SubCategorias1;
import tablas.SubCategorias2;
import tablas.SubCategorias3;

public class ModificarFicha extends javax.swing.JFrame {
    
    Connection conexion = null;
    Fichas fichas = new Fichas();
    String tabla, nombre;

    public ModificarFicha() throws ClassNotFoundException {
        initComponents();
        setTitle("Fichero 2.0 / Modificar ");
        this.setLocationRelativeTo(null);
        
        txtFicha.setLineWrap(true);
        txtFicha.setWrapStyleWord(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFicha = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        lblNoFicha = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        lblNoFicha1 = new javax.swing.JLabel();
        txtSub1 = new javax.swing.JTextField();
        lblNoFicha2 = new javax.swing.JLabel();
        txtSub2 = new javax.swing.JTextField();
        lblNoFicha3 = new javax.swing.JLabel();
        txtSub3 = new javax.swing.JTextField();
        lblNoFicha4 = new javax.swing.JLabel();
        txtFuente = new javax.swing.JTextField();
        lblNoFicha5 = new javax.swing.JLabel();
        btnModCat = new javax.swing.JButton();
        btnModSub1 = new javax.swing.JButton();
        btnModSub2 = new javax.swing.JButton();
        btnModSub3 = new javax.swing.JButton();
        btnModFue = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        lblNoFicha.setText("No. de Ficha");

        txtId.setEditable(false);

        txtCategoria.setEditable(false);

        lblNoFicha1.setText("Categoría");

        txtSub1.setEditable(false);

        lblNoFicha2.setText("Sub Categoría 1");

        txtSub2.setEditable(false);

        lblNoFicha3.setText("Sub Categoría 2");

        txtSub3.setEditable(false);

        lblNoFicha4.setText("Sub Categoría 3");

        txtFuente.setEditable(false);

        lblNoFicha5.setText("Fuente");

        btnModCat.setText("Modificar");
        btnModCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModCatActionPerformed(evt);
            }
        });

        btnModSub1.setText("Modificar");
        btnModSub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModSub1ActionPerformed(evt);
            }
        });

        btnModSub2.setText("Modificar");
        btnModSub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModSub2ActionPerformed(evt);
            }
        });

        btnModSub3.setText("Modificar");
        btnModSub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModSub3ActionPerformed(evt);
            }
        });

        btnModFue.setText("Modificar");
        btnModFue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModFueActionPerformed(evt);
            }
        });

        jLabel2.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alcántar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNoFicha5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNoFicha4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblNoFicha2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblNoFicha3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblNoFicha)
                                        .addComponent(lblNoFicha1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCategoria)
                                        .addComponent(txtId)))))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnModFue)
                                .addComponent(btnModSub3))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnModCat)
                                .addComponent(btnModSub2)
                                .addComponent(btnModSub1)))
                        .addGap(121, 121, 121)
                        .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNoFicha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNoFicha1)
                            .addComponent(btnModCat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNoFicha2)
                            .addComponent(btnModSub1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNoFicha3)
                            .addComponent(btnModSub2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNoFicha4)
                            .addComponent(btnModSub3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNoFicha5)
                            .addComponent(btnModFue))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegresar)
                            .addComponent(btnGuardar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(lblMensaje)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            
        try {
            
            Integer fichaCategoriaId, fichaSub1Id, fichaSub2Id, fichaSub3Id, fichaFuenteId;
            String fichaTexto, fichaIdT;
            
            fichaIdT = txtId.getText();
            Integer fichaId = Integer.parseInt(fichaIdT);
            fichaCategoriaId = obtenerCategoriaId(txtCategoria.getText());
            fichaSub1Id = obtenerSub1Id(txtSub1.getText(), fichaCategoriaId);
            fichaSub2Id = obtenerSub2Id(txtSub2.getText(), fichaSub1Id);
            fichaSub3Id = obtenerSub3Id(txtSub3.getText(), fichaSub2Id);
            fichaFuenteId = obtenerFuenteId(txtFuente.getText());
            fichaTexto = txtFicha.getText();
            
            System.out.println("Informacion de la ficha "+fichaId+":");
            System.out.println("Categoria: "+txtCategoria.getText()+" con id: "+fichaCategoriaId);
            System.out.println("Sub categoria 1: "+txtSub1.getText()+" con id: "+fichaSub1Id);
            System.out.println("Sub categoria 2: "+txtSub2.getText()+" con id: "+fichaSub2Id);
            System.out.println("Sub categoria 3: "+txtSub3.getText()+" con id: "+fichaSub3Id);
            System.out.println("Contenido / texto: "+fichaTexto);
            System.out.println("Fuente: "+txtFuente.getText()+" con id: "+fichaFuenteId);
            
            FichaDaoImp fichaDaoImp = new FichaDaoImp();
            boolean modificada = fichaDaoImp.modificar(fichaId, fichaCategoriaId, fichaSub1Id, fichaSub2Id, fichaSub3Id, fichaFuenteId, fichaTexto);
            
            if( modificada == true ){
                
                System.out.println("Ficha modificada con éxito");
                JOptionPane.showMessageDialog(null, "Ficha No. "+fichaId+" modificada con éxito");
                this.dispose();
                
                BuscarFicha buscarFicha = new BuscarFicha();
                buscarFicha.setVisible(true);
                
            }else{
                System.out.println("No se pudo modificar la ficha");
                JOptionPane.showMessageDialog(null, "No se pudo modificar la ficha No. "+fichaId);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        this.dispose();
        System.out.println("Regresando a buscar");
        BuscarFicha buscar = new BuscarFicha();
        buscar.setVisible(true);
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnModCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModCatActionPerformed
        // TODO add your handling code here:
        tabla = "categorias"; 
        nombre = "";
        Integer x;
        
        try {
            
            x = contarRegistros(tabla, nombre);
            Object[] listaCategorias = new Object[x];
            
            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT * FROM categorias WHERE activo = true ORDER BY nombre ASC;";
                preparedStatement = conexion.prepareCall(sql);
                resultSet = preparedStatement.executeQuery();
                
                for( int i = 1; resultSet.next(); i++ ){
                    Categorias categorias = new Categorias();
                    categorias.setNombre(resultSet.getString("nombre"));
                    String categoriaNombre = categorias.getNombre();
                    listaCategorias[i] = categoriaNombre;
                }
                
                listaCategorias[0] = "--Seleccione--";
                Object selecCategorias = JOptionPane.showInputDialog(null,"Selecciona una categoria", "Modificar categoria",JOptionPane.QUESTION_MESSAGE,null,listaCategorias, listaCategorias[0]);
                
                if( selecCategorias.equals("--Seleccione--") ){
                    JOptionPane.showMessageDialog(null, "Seleccione una opcion correcta");
                }else{
                    
                    if ( selecCategorias.equals( txtCategoria.getText() ) ){
                        System.out.println("No cambio la categoria... se conserva todo lo relacionado");
                    }else{
                        System.out.println("Cambio la categoria... Borrando sub categorias 1, 2 y 3");
                        txtCategoria.setText(selecCategorias.toString());
                        txtSub1.setText("");
                        txtSub2.setText("");
                        txtSub3.setText("");
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnModCatActionPerformed

    private void btnModSub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModSub1ActionPerformed
        // TODO add your handling code here:
        tabla = "subCategorias1"; 
        nombre = txtCategoria.getText();
        Integer x;
        
        if( nombre.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una categoria primero");
        }else{
            
            try {
                
                x = contarRegistros(tabla, nombre);
                Object[] listaSub1 = new Object[x];

                conexion = ConexionBD.obtenerConexion();
                PreparedStatement preparedStatement;
                ResultSet resultSet;

                try {

                    ConexionBD.obtenerConexion();
                    String sql = "SELECT nombre FROM subCategorias1 WHERE idCategoria IN (SELECT id FROM categorias WHERE nombre = '"+nombre+"') ORDER BY nombre ASC;";
                    preparedStatement = conexion.prepareCall(sql);
                    resultSet = preparedStatement.executeQuery();

                    for( int i = 1; resultSet.next(); i++ ){
                        SubCategorias1 subCategorias1 = new SubCategorias1();
                        subCategorias1.setNombre(resultSet.getString("nombre"));
                        String sub1Nombre = subCategorias1.getNombre();
                        listaSub1[i] = sub1Nombre;
                    }

                    listaSub1[0] = "--Seleccione--";
                    Object selecSub1 = JOptionPane.showInputDialog(null,"Selecciona una sub categoria 1", "Modificar sub ategoria 1",JOptionPane.QUESTION_MESSAGE,null,listaSub1, listaSub1[0]);

                    if( selecSub1.equals("--Seleccione--") ){
                        JOptionPane.showMessageDialog(null, "Seleccione una opcion correcta");
                    }else{

                        if ( selecSub1.equals( txtCategoria.getText() ) ){
                            System.out.println("No cambio la  sub categoria... se conserva todo lo relacionado");
                        }else{
                            System.out.println("Cambio la sub categoria 1... Borrando sub categorias 2 y 3");
                            txtSub1.setText(selecSub1.toString());
                            txtSub2.setText("");
                            txtSub3.setText("");
                        }
                    }

                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnModSub1ActionPerformed

    private void btnModSub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModSub2ActionPerformed
        // TODO add your handling code here:
        tabla = "subCategorias2";
        nombre = txtSub1.getText();
        Integer x;
        
        if( nombre.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una sub categoria 1 primero");
        }else{
        
            try {
                
                x = contarRegistros(tabla, nombre);
                Object[] listaSub2 = new Object[x];

                conexion = ConexionBD.obtenerConexion();
                PreparedStatement preparedStatement;
                ResultSet resultSet;

                try {

                    ConexionBD.obtenerConexion();
                    String sql = "SELECT nombre FROM subCategorias2 WHERE idSubCategoria1 IN (SELECT id FROM subCategorias1 WHERE nombre = '"+nombre+"') ORDER BY nombre ASC;";
                    preparedStatement = conexion.prepareCall(sql);
                    resultSet = preparedStatement.executeQuery();

                    for( int i = 1; resultSet.next(); i++ ){
                        SubCategorias2 subCategorias2 = new SubCategorias2();
                        subCategorias2.setNombre(resultSet.getString("nombre"));
                        String sub2Nombre = subCategorias2.getNombre();
                        listaSub2[i] = sub2Nombre;
                    }

                    listaSub2[0] = "--Seleccione--";
                    Object selecSub2 = JOptionPane.showInputDialog(null,"Selecciona una sub categoria 2", "Modificar sub categoria 2",JOptionPane.QUESTION_MESSAGE,null,listaSub2, listaSub2[0]);

                    if( selecSub2.equals("--Seleccione--") ){
                        JOptionPane.showMessageDialog(null, "Seleccione una opcion correcta");
                    }else{

                        if ( selecSub2.equals( txtCategoria.getText() ) ){
                            System.out.println("No cambio la  sub categoria 2... se conserva todo lo relacionado");
                        }else{
                            System.out.println("Cambio la sub categoria 2... Borrando sub categorias 3");
                            txtSub2.setText(selecSub2.toString());
                            txtSub3.setText("");
                        }
                    }

                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnModSub2ActionPerformed

    private void btnModSub3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModSub3ActionPerformed
        try {
            // TODO add your handling code here:
            tabla = "subCategorias3";
            nombre = txtSub2.getText();
            Integer x;
            
            if( nombre.isEmpty() ){
                JOptionPane.showMessageDialog(null, "Debe seleccionar una sub categoria 2 primero");
            }else{
                
                x = contarRegistros(tabla, nombre);
                Object[] listaSub3 = new Object[x];

                conexion = ConexionBD.obtenerConexion();
                PreparedStatement preparedStatement;
                ResultSet resultSet;

                try {

                    ConexionBD.obtenerConexion();
                    String sql = "SELECT nombre FROM subCategorias3 WHERE idSubCategoria2 IN (SELECT id FROM subCategorias2 WHERE nombre = '"+nombre+"') ORDER BY nombre ASC;";
                    preparedStatement = conexion.prepareCall(sql);
                    resultSet = preparedStatement.executeQuery();

                    for( int i = 1; resultSet.next(); i++ ){
                        SubCategorias3 subCategorias3 = new SubCategorias3();
                        subCategorias3.setNombre(resultSet.getString("nombre"));
                        String sub3Nombre = subCategorias3.getNombre();
                        listaSub3[i] = sub3Nombre;
                    }

                    listaSub3[0] = "--Seleccione--";
                    Object selecSub3 = JOptionPane.showInputDialog(null,"Selecciona una sub categoria 3", "Modificar sub categoria 3",JOptionPane.QUESTION_MESSAGE,null,listaSub3, listaSub3[0]);

                    if( selecSub3.equals("--Seleccione--") ){
                        JOptionPane.showMessageDialog(null, "Seleccione una opcion correcta");
                    }else{

                        if ( selecSub3.equals( txtCategoria.getText() ) ){
                            System.out.println("No cambio la  sub categoria 3");
                        }else{
                            System.out.println("Cambio la sub categoria 3");
                            txtSub3.setText(selecSub3.toString());
                        }
                    }

                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnModSub3ActionPerformed

    private void btnModFueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModFueActionPerformed
        // TODO add your handling code here:
        tabla = "fuentes"; 
        nombre = "";
        Integer x;
        
        try {
            
            x = contarRegistros(tabla, nombre);
            Object[] listarFuentes = new Object[x];
            
            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT * FROM fuentes ORDER BY nombre ASC;";
                preparedStatement = conexion.prepareCall(sql);
                resultSet = preparedStatement.executeQuery();
                
                for( int i = 1; resultSet.next(); i++ ){
                    Categorias categorias = new Categorias();
                    categorias.setNombre(resultSet.getString("nombre"));
                    String categoriaNombre = categorias.getNombre();
                    listarFuentes[i] = categoriaNombre;
                }
                
                listarFuentes[0] = "--Seleccione--";
                
                Object selectFuente = JOptionPane.showInputDialog(null,"Selecciona una fuente", "Fuentes",JOptionPane.QUESTION_MESSAGE,null,listarFuentes, listarFuentes[0]);
                
                if( selectFuente.equals("--Seleccione--") ){
                    JOptionPane.showMessageDialog(null, "Noupe");
                }else{
                    txtFuente.setText(selectFuente.toString());
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnModFueActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModCat;
    private javax.swing.JButton btnModFue;
    private javax.swing.JButton btnModSub1;
    private javax.swing.JButton btnModSub2;
    private javax.swing.JButton btnModSub3;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNoFicha;
    private javax.swing.JLabel lblNoFicha1;
    private javax.swing.JLabel lblNoFicha2;
    private javax.swing.JLabel lblNoFicha3;
    private javax.swing.JLabel lblNoFicha4;
    private javax.swing.JLabel lblNoFicha5;
    public static javax.swing.JTextField txtCategoria;
    public static javax.swing.JTextArea txtFicha;
    public static javax.swing.JTextField txtFuente;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtSub1;
    public static javax.swing.JTextField txtSub2;
    public static javax.swing.JTextField txtSub3;
    // End of variables declaration//GEN-END:variables

    private Integer contarRegistros(String tabla, String nombre) throws SQLException {
        
        conexion = ConexionBD.obtenerConexion();
        PreparedStatement preparedStatement;
        Statement statement = conexion.createStatement();
        Integer noRegistros = 0;
        
        if( tabla == "fuentes" ){
            
            String sql1 = "SELECT COUNT(*) FROM "+tabla;
            ResultSet resultSet1 = statement.executeQuery(sql1);
        
            if( resultSet1.next() ){
                noRegistros = resultSet1.getInt(1);
            }
            
            statement.close();
                
        }else{
            
            switch( tabla ){
                
                case "subCategorias1":
                    
                    String sql2 = "SELECT COUNT(nombre) FROM "+tabla+" WHERE idCategoria IN (SELECT id FROM categorias WHERE nombre = '"+nombre+"')";
                    ResultSet resultSet2 = statement.executeQuery(sql2);

                    if( resultSet2.next() ){
                        noRegistros = resultSet2.getInt(1);
                    }

                    statement.close();
                    
                break;
                
                case "subCategorias2":
                    
                    String sql3 = "SELECT COUNT(nombre) FROM "+tabla+" WHERE idSubCategoria1 IN (SELECT id FROM subCategorias1 WHERE nombre = '"+nombre+"')";
                    ResultSet resultSet3 = statement.executeQuery(sql3);

                    if( resultSet3.next() ){
                        noRegistros = resultSet3.getInt(1);
                    }

                    statement.close();
                    
                break;
                
                case "subCategorias3":
                    
                    String sql4 = "SELECT COUNT(nombre) FROM "+tabla+" WHERE idSubCategoria2 IN (SELECT id FROM subCategorias2 WHERE nombre = '"+nombre+"')";
                    ResultSet resultSet4 = statement.executeQuery(sql4);

                    if( resultSet4.next() ){
                        noRegistros = resultSet4.getInt(1);
                    }

                    statement.close();
                    
                break;
                
                case "categorias":
                    
                    String sql1 = "SELECT COUNT(*) FROM "+tabla+" WHERE activo = true";
                    ResultSet resultSet1 = statement.executeQuery(sql1);

                    if( resultSet1.next() ){
                        
                        noRegistros = resultSet1.getInt(1);
                        
                    }
                    
                    statement.close();
                    
                break;
                
            }
        }
        return noRegistros + 1;
    }

    private Integer obtenerCategoriaId(String categoriaNombre) throws SQLException {
        
        CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
        Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
        return categoriaId;
        
    }

    private Integer obtenerSub1Id(String sub1Nombre, Integer fichaCategoriaId) throws SQLException {
        
        SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
        Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, fichaCategoriaId);
        return sub1Id;
        
    }

    private Integer obtenerSub2Id(String sub2Nombre, Integer fichaSub1Id) throws SQLException {
        
        SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
        Integer sub2Id = subCategoria2DaoImp.obtenerId(sub2Nombre, fichaSub1Id);
        return sub2Id;
        
    }

    private Integer obtenerSub3Id(String sub3Nombre, Integer fichaSub2Id) throws SQLException {
        
        SubCategoria3DaoImp subCategoria3DaoImp = new SubCategoria3DaoImp();
        Integer sub3Id = subCategoria3DaoImp.obtenetId(sub3Nombre, fichaSub2Id);
        return sub3Id;
        
    }

    private Integer obtenerFuenteId(String fuenteNombre) throws SQLException {
        
        FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
        Integer fuenteId = fuenteDaoImp.obtenerId(fuenteNombre);
        return fuenteId;
        
    }
}
