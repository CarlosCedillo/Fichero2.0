package ventanas;

import conexion.ConexionBD;
import dao.implementaciones.CategoriaDaoImp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import tablas.Categorias;
import tablas.SubCategorias1;
import tablas.SubCategorias2;
import tablas.SubCategorias3;

public class listarCategorias extends javax.swing.JFrame {
    
    Connection conexion = null;
    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Categorias");     //Raiz
    DefaultMutableTreeNode nodo;                                                //Categorias
    DefaultMutableTreeNode subNodo1;                                            //Sub Categorias1
    DefaultMutableTreeNode subNodo2;                                            //Sub Categorias2
    DefaultMutableTreeNode subNodo3;                                            //Sub Categorias3
    
    CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
    Categorias categorias = new Categorias();
    SubCategorias1 subCategorias1 = new SubCategorias1();
    SubCategorias2 subCategorias2 = new SubCategorias2();
    SubCategorias3 subCategorias3 = new SubCategorias3();

    public listarCategorias() {
        initComponents();
        setTitle("Fichero 2.0 / Categorias");
        this.setLocationRelativeTo(null);
        
        obtenerCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        treeCategorias = new javax.swing.JTree();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Árbol de categoría");

        jLabel2.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alcántar");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(treeCategorias);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnDesactivar.setText("Desactivar");
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarActionPerformed(evt);
            }
        });

        btnActivar.setText("Activar");
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnDesactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActivar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDesactivar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        crear jFrame = null;
        try {
            jFrame = new crear();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        this.setVisible(false);
        System.out.println("Regresando a crear");
        jFrame.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here
        DefaultMutableTreeNode agregar = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
        
        if( agregar != null ){
            
            String nombre = agregar.toString();
            
            switch( agregar.getLevel() ){
                
                case 0:
                    agregarCateroria();
                break;
                
                case 1:
                    agregarSubCateroria1(nombre);
                break;
                
                case 2:
                    agregarSubCateroria2(nombre);
                break;
                
                case 3:
                    agregarSubCateroria3(nombre);
                break;
                
                case 4:
                    JOptionPane.showMessageDialog(null, "No se puede agregar");
                break;
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se selecciono algo");
        }
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode modificar = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
        String nombre = modificar.toString();
        
        if( modificar != null ){
                
            switch( modificar.getLevel() ){
                    
                case 0:
                    JOptionPane.showMessageDialog(null, "No se puede modificar la raiz");
                break;
                    
                case 1:
                    modificarCategoria(nombre);
                break;
                    
                case 2:
                    modificarSubCategoria1(nombre);
                break;
                    
                case 3:
                    modificarSubCategoria2(nombre);
                break;
                    
                case 4:
                    modificarSubCategoria3(nombre);
                break;
                    
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se selecciono algo");
        }
       
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode modificar = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
        String nombre = modificar.toString();
        
        if( modificar != null ){
                
            switch( modificar.getLevel() ){
                    
                case 0:
                    JOptionPane.showMessageDialog(null, "No se puede modificar la raiz");
                break;
                    
                case 1:
                    desactivarCategoria(nombre);
                break;
                    
                case 2:
                    desactivarSubCategoria1(nombre);
                break;
                    
                case 3:
                    desactivarSubCategoria2(nombre);
                break;
                    
                case 4:
                    desactivarSubCategoria3(nombre);
                break;
                    
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se selecciono algo");
        }
        
    }//GEN-LAST:event_btnDesactivarActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode modificar = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
        String nombre = modificar.toString();
        
        if( modificar != null ){
                
            switch( modificar.getLevel() ){
                    
                case 0:
                    JOptionPane.showMessageDialog(null, "No se puede modificar la raiz");
                break;
                    
                case 1:
                    activarCategoria(nombre);
                break;
                    
                case 2:
                    activarSubCategoria1(nombre);
                break;
                    
                case 3:
                    activarSubCategoria2(nombre);
                break;
                    
                case 4:
                    activarSubCategoria3(nombre);
                break;
                    
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se selecciono algo");
        }
    }//GEN-LAST:event_btnActivarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listarCategorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree treeCategorias;
    // End of variables declaration//GEN-END:variables

    //Obtener - Listar
    
    private void obtenerCategorias() {
        
        conexion = ConexionBD.obtenerConexion();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        try {
            
            ConexionBD.obtenerConexion();
            String sql = "SELECT * FROM categorias ORDER BY nombre ASC;";
            preparedStatement = conexion.prepareCall(sql);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                
                categorias.setId(resultSet.getInt("id"));
                categorias.setNombre(resultSet.getString("nombre"));
                categorias.setActivo(resultSet.getBoolean("activo"));
                
                Boolean activo = categorias.isActivo();
                
                if( activo == true ){
                    nodo = new DefaultMutableTreeNode(categorias.getNombre() + " - Activado");
                    raiz.add(nodo);
                }else{
                    nodo = new DefaultMutableTreeNode(categorias.getNombre() + " - Desactivado");
                    raiz.add(nodo);
                }
                
                obtenerSub1(categorias.getId());
                
            }
            
            DefaultTreeModel modeloArbrol = new DefaultTreeModel(raiz);
            this.treeCategorias.setModel(modeloArbrol);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void obtenerSub1(Integer idCat) {
        
        conexion = ConexionBD.obtenerConexion();
        ResultSet resultSet;
        
        try {
            String sql = "SELECT * FROM subCategorias1 WHERE idCategoria = "+ idCat +"  ORDER BY nombre ASC;";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
                
                
            while (resultSet.next()) {
                
                subCategorias1.setId(resultSet.getInt("id"));
                subCategorias1.setIdCategoria(resultSet.getInt("idCategoria"));
                subCategorias1.setNombre(resultSet.getString("nombre"));
                subCategorias1.setActivo(resultSet.getBoolean("activo"));
                
                Boolean activo = subCategorias1.isActivo();
                
                if( activo == true ){
                    subNodo1 = new DefaultMutableTreeNode(subCategorias1.getNombre() + " - Activado");
                    nodo.add(subNodo1); 
                }else{
                    subNodo1 = new DefaultMutableTreeNode(subCategorias1.getNombre() + " - Desactivado");
                    nodo.add(subNodo1);
                }
                
                obtenerSub2(subCategorias1.getId());
                
            }
                
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void obtenerSub2(Integer idSubCat1) {
        
        conexion = ConexionBD.obtenerConexion();
        ResultSet resultSet;
        
        try {
            String sql = "SELECT * FROM subCategorias2 WHERE idSubCategoria1 = "+ idSubCat1 +"  ORDER BY nombre ASC;";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
                    
            while ( resultSet.next()) {
                
                subCategorias2.setId(resultSet.getInt("id"));
                subCategorias2.setIdSubCategoria1(resultSet.getInt("idSubCategoria1"));
                subCategorias2.setNombre(resultSet.getString("nombre"));
                subCategorias2.setActivo(resultSet.getBoolean("activo"));
                
                Boolean activo = subCategorias2.isActivo();
                
                if( activo == true ){
                    subNodo2 = new DefaultMutableTreeNode(subCategorias2.getNombre() + " - Activado");
                    subNodo1.add(subNodo2);
                }else{
                    subNodo2 = new DefaultMutableTreeNode(subCategorias2.getNombre() + " - Desactivado");
                    subNodo1.add(subNodo2);
                }
                
                obtenerSub3(subCategorias2.getId());
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void obtenerSub3(Integer idSubCat2) {

        conexion = ConexionBD.obtenerConexion();
        ResultSet resultSet;
        
        try {
            
            String sql = "SELECT * FROM subCategorias3 WHERE idSubCategoria2 = "+ idSubCat2 +"  ORDER BY nombre ASC;";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
                
            while ( resultSet.next()) {
                
                subCategorias3.setId(resultSet.getInt("id"));
                subCategorias3.setIdSubCategoria2(resultSet.getInt("idSubCategoria2"));
                subCategorias3.setNombre(resultSet.getString("nombre"));
                subCategorias3.setActivo(resultSet.getBoolean("activo"));
                
                Boolean activo = subCategorias3.isActivo();
                
                if( activo == true ){
                    subNodo3 = new DefaultMutableTreeNode(subCategorias3.getNombre() + " - Activado");
                    subNodo2.add(subNodo3);
                }else{
                    subNodo3 = new DefaultMutableTreeNode(subCategorias3.getNombre() + " - Desactivado");
                    subNodo2.add(subNodo3);
                }
                
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }
    
    //Agregar

    private void agregarCateroria() {
        
        System.out.println("Va a agregar una cateroria");
        String categoria = JOptionPane.showInputDialog("Nombre de la Categoriaa");
        
        if( categoria.isEmpty()){
            JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
        }else{
            
            //Hay que comprobar que el nombre no existe ya!!!
            
            boolean guardado = categoriaDaoImp.guardar(categoria);
            
            
            if( guardado == true ){
                
                JOptionPane.showMessageDialog(null, "Categoria guardada");
                actualizar();
                
            }else{
                JOptionPane.showMessageDialog(null, "Categoria no guardada");
            }
        }
    }

    private void agregarSubCateroria1(String nombreCompleto) {
        
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("Va a agregar una subcategoria1 a la Cateroria: " + nombre);
            
            //Primero hay que obtener el id de la categoria seleccionada

            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT id FROM categorias WHERE nombre = ?";
                preparedStatement = conexion.prepareCall(sql);
                preparedStatement.setString(1, nombre);
                resultSet = preparedStatement.executeQuery();

                while( resultSet.next() ){
                    categorias.setId(resultSet.getInt(("id")));
                    Integer categoriaId = categorias.getId();

                    //Ahora hay que obtener el nombre de la subcategoria1

                    String subSategoria1 = JOptionPane.showInputDialog("Nombre de la Sub Categoriaa 1");
                    Boolean guardado = true;

                    if( subSategoria1.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
                    }else{

                        //Hay que comprobar que el nombre no existe ya!!!

                        try {

                            ConexionBD.obtenerConexion();
                            preparedStatement = conexion.prepareStatement("INSERT INTO subCategorias1 (idCategoria, nombre, activo) VALUES (?,?,?)");
                            preparedStatement.setInt(1, categoriaId);
                            preparedStatement.setString(2, subSategoria1);
                            preparedStatement.setBoolean(3, true);
                            preparedStatement.executeUpdate();

                            guardado = true;
                            System.out.println("Sub categoria 1 giardada" );

                            conexion = ConexionBD.cerrarConexion();

                        } catch (SQLException ex) {
                            System.out.println(ex.getMessage());

                        } catch (ClassNotFoundException ex) {
                            System.out.println(ex.getMessage());
                        }

                        if( guardado == true ){
                            JOptionPane.showMessageDialog(null, "Sub categoria 1 guardada");

                            actualizar();

                        }else{
                            JOptionPane.showMessageDialog(null, "Sub categoria 1 no guardada");
                        }
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        }
    }

    private void agregarSubCateroria2(String nombreCompleto) {
        
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            String nombre2 = nombreCompleto.substring(0,localizado);
            System.out.println("Va a agregar una subcategoria2 a la Subcateroria1 " + nombre2);

            //Primero hay que obtener el id de la Subcategoria1 seleccionada

            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT id FROM subCategorias1 WHERE nombre = ?";
                preparedStatement = conexion.prepareCall(sql);
                preparedStatement.setString(1, nombre2);
                resultSet = preparedStatement.executeQuery();

                while( resultSet.next() ){
                    subCategorias1.setId(resultSet.getInt(("id")));
                    Integer subCategoria1Id = subCategorias1.getId();

                    //Ahora hay que obtener el nombre de la subcategoria2

                    String subSategoria2 = JOptionPane.showInputDialog("Nombre de la Sub Categoriaa 2");
                    Boolean guardado = true;

                    if( subSategoria2.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
                    }else{

                        //Hay que comprobar que el nombre no existe ya!!!

                        try {

                            ConexionBD.obtenerConexion();
                            preparedStatement = conexion.prepareStatement("INSERT INTO subcategorias2 (idSubCategoria1, nombre, activo) VALUES (?,?,?)");
                            preparedStatement.setInt(1, subCategoria1Id);
                            preparedStatement.setString(2, subSategoria2);
                            preparedStatement.setBoolean(3, true);
                            preparedStatement.executeUpdate();

                            guardado = true;
                            System.out.println("Sub categoria 2 giardada" );

                            conexion = ConexionBD.cerrarConexion();

                        } catch (SQLException ex) {
                            System.out.println(ex.getMessage());

                        } catch (ClassNotFoundException ex) {
                            System.out.println(ex.getMessage());
                        }

                        if( guardado == true ){
                            JOptionPane.showMessageDialog(null, "Sub categoria 2 guardada");

                            actualizar();

                        }else{
                            JOptionPane.showMessageDialog(null, "Sub categoria 2 no guardada");
                        }
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        }
    }

    private void agregarSubCateroria3(String nombreCompleto) {
        
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            String nombre3 = nombreCompleto.substring(0,localizado);
        
            System.out.println("Va a agregar una subcategoria3 a la Subcateroria2 " + nombre3);

            //Primero hay que obtener el id de la Subcategoria2 seleccionada

            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT id FROM subcategorias2 WHERE nombre = ?";
                preparedStatement = conexion.prepareCall(sql);
                preparedStatement.setString(1, nombre3);
                resultSet = preparedStatement.executeQuery();

                while( resultSet.next() ){
                    subCategorias2.setId(resultSet.getInt(("id")));
                    Integer subCategoria2Id = subCategorias2.getId();

                    //Ahora hay que obtener el nombre de la subcategoria2

                    String subSategoria2 = JOptionPane.showInputDialog("Nombre de la Sub Categoriaa 3");
                    Boolean guardado = true;

                    if( subSategoria2.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
                    }else{

                        //Hay que comprobar que el nombre no existe ya!!!

                        try {

                            ConexionBD.obtenerConexion();
                            preparedStatement = conexion.prepareStatement("INSERT INTO subcategorias3 (idSubCategoria2, nombre, activo) VALUES (?,?,?)");
                            preparedStatement.setInt(1, subCategoria2Id);
                            preparedStatement.setString(2, subSategoria2);
                            preparedStatement.setBoolean(3, true);
                            preparedStatement.executeUpdate();

                            guardado = true;
                            System.out.println("Sub categoria 3 giardada" );

                            conexion = ConexionBD.cerrarConexion();

                        } catch (SQLException ex) {
                            System.out.println(ex.getMessage());

                        } catch (ClassNotFoundException ex) {
                            System.out.println(ex.getMessage());
                        }

                        if( guardado == true ){
                            JOptionPane.showMessageDialog(null, "Sub categoria 3 guardada");

                            actualizar();

                        }else{
                            JOptionPane.showMessageDialog(null, "Sub categoria 3 no guardada");
                        }
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        }
    }
    
    //Modificar
    
    private void modificarCategoria(String nombreCompleto) {
        
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            String nombre = nombreCompleto.substring(0,localizado);
        
            System.out.println("Va a agregar una subcategoria1 a la Cateroria " + nombre);

            //Primero hay que obtener el id

            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT id, nombre FROM categorias WHERE nombre = ?";
                preparedStatement = conexion.prepareCall(sql);
                preparedStatement.setString(1, nombre);
                resultSet = preparedStatement.executeQuery();

                while( resultSet.next() ){
                    categorias.setId(resultSet.getInt(("id")));
                    categorias.setNombre(resultSet.getString(("nombre")));

                    Integer categoriaId = categorias.getId();
                    String categoriaNombte = categorias.getNombre();

                    //Ahora hay que obtener el nuevo nombre de la categoria

                    String nvoNombre = JOptionPane.showInputDialog("Cambiear nombre de "+categoriaNombte);
                    Boolean modificado = true;

                    if( nvoNombre.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
                    }else{

                        if( nvoNombre.equals(categoriaNombte) ){
                            JOptionPane.showMessageDialog(null, "Ya tiene ese nombre");
                        }else{

                            try {

                                ConexionBD.obtenerConexion();
                                preparedStatement = conexion.prepareStatement("UPDATE categorias SET nombre = ? WHERE id = ?");
                                preparedStatement.setString(1, nvoNombre);
                                preparedStatement.setInt(2, categoriaId);
                                preparedStatement.executeUpdate();

                                modificado = true;
                                System.out.println("Categoria " + categoriaNombte + " modificada a " + nvoNombre);

                                conexion = ConexionBD.cerrarConexion();

                            } catch (SQLException ex) {
                                System.out.println(ex.getMessage());

                            } catch (ClassNotFoundException ex) {
                                System.out.println(ex.getMessage());
                            }

                            if( modificado == true ){
                                JOptionPane.showMessageDialog(null, "Categoria modificada" );

                                actualizar();

                            }else{
                                JOptionPane.showMessageDialog(null, "Categoria no modificada");
                            }
                        }
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        }    
    }

    private void modificarSubCategoria1(String nombreCompleto) {
        
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            String nombre = nombreCompleto.substring(0,localizado);
        
            //Primero hay que obtener el id

            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT id, nombre FROM subCategorias1 WHERE nombre = ?";
                preparedStatement = conexion.prepareCall(sql);
                preparedStatement.setString(1, nombre);
                resultSet = preparedStatement.executeQuery();

                while( resultSet.next() ){
                    subCategorias1.setId(resultSet.getInt(("id")));
                    subCategorias1.setNombre(resultSet.getString(("nombre")));

                    Integer categoriaId = subCategorias1.getId();
                    String categoriaNombte = subCategorias1.getNombre();

                    //Ahora hay que obtener el nuevo nombre de la subcategoria1

                    String nvoNombre = JOptionPane.showInputDialog("Cambiear nombre de "+categoriaNombte);
                    Boolean modificado = true;

                    if( nvoNombre.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
                    }else{

                        if( nvoNombre.equals(categoriaNombte) ){
                            JOptionPane.showMessageDialog(null, "Ya tiene ese nombre");
                        }else{

                            try {

                                ConexionBD.obtenerConexion();
                                preparedStatement = conexion.prepareStatement("UPDATE subCategorias1 SET nombre = ? WHERE id = ?");
                                preparedStatement.setString(1, nvoNombre);
                                preparedStatement.setInt(2, categoriaId);
                                preparedStatement.executeUpdate();

                                modificado = true;
                                System.out.println("Sub categoria 1 " + categoriaNombte + " modificada a " + nvoNombre);

                                conexion = ConexionBD.cerrarConexion();

                            } catch (SQLException ex) {
                                System.out.println(ex.getMessage());

                            } catch (ClassNotFoundException ex) {
                                System.out.println(ex.getMessage());
                            }

                            if( modificado == true ){
                                JOptionPane.showMessageDialog(null, "Sub categoria 1 modificada" );

                                actualizar();

                            }else{
                                JOptionPane.showMessageDialog(null, "Sub categoria 1 no modificada");
                            }
                        }
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        } 
    }

    private void modificarSubCategoria2(String nombreCompleto) {
        
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            String nombre = nombreCompleto.substring(0,localizado);
        
            //Primero hay que obtener el id

            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT id, nombre FROM subcategorias2 WHERE nombre = ?";
                preparedStatement = conexion.prepareCall(sql);
                preparedStatement.setString(1, nombre);
                resultSet = preparedStatement.executeQuery();

                while( resultSet.next() ){
                    subCategorias2.setId(resultSet.getInt(("id")));
                    subCategorias2.setNombre(resultSet.getString(("nombre")));

                    Integer categoriaId = subCategorias2.getId();
                    String categoriaNombte = subCategorias2.getNombre();

                    //Ahora hay que obtener el nuevo nombre de la subcategoria2

                    String nvoNombre = JOptionPane.showInputDialog("Cambiear nombre de "+categoriaNombte);
                    Boolean modificado = true;

                    if( nvoNombre.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
                    }else{

                        if( nvoNombre.equals(categoriaNombte) ){
                            JOptionPane.showMessageDialog(null, "Ya tiene ese nombre");
                        }else{

                            try {

                                ConexionBD.obtenerConexion();
                                preparedStatement = conexion.prepareStatement("UPDATE subcategorias2 SET nombre = ? WHERE id = ?");
                                preparedStatement.setString(1, nvoNombre);
                                preparedStatement.setInt(2, categoriaId);
                                preparedStatement.executeUpdate();

                                modificado = true;
                                System.out.println("Sub categoria 2 " + categoriaNombte + " modificada a " + nvoNombre);

                                conexion = ConexionBD.cerrarConexion();

                            } catch (SQLException ex) {
                                System.out.println(ex.getMessage());

                            } catch (ClassNotFoundException ex) {
                                System.out.println(ex.getMessage());
                            }

                            if( modificado == true ){
                                JOptionPane.showMessageDialog(null, "Sub categoria 2 modificada" );

                                actualizar();

                            }else{
                                JOptionPane.showMessageDialog(null, "Sub categoria 2 no modificada");
                            }
                        }
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        } 
    }

    private void modificarSubCategoria3(String nombreCompleto) {
        
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            String nombre = nombreCompleto.substring(0,localizado);
        
            //Primero hay que obtener el id

            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT id, nombre FROM subcategorias3 WHERE nombre = ?";
                preparedStatement = conexion.prepareCall(sql);
                preparedStatement.setString(1, nombre);
                resultSet = preparedStatement.executeQuery();

                while( resultSet.next() ){
                    subCategorias2.setId(resultSet.getInt(("id")));
                    subCategorias2.setNombre(resultSet.getString(("nombre")));

                    Integer categoriaId = subCategorias2.getId();
                    String categoriaNombte = subCategorias2.getNombre();

                    //Ahora hay que obtener el nuevo nombre de la subcategoria3

                    String nvoNombre = JOptionPane.showInputDialog("Cambiear nombre de "+categoriaNombte);
                    Boolean modificado = true;

                    if( nvoNombre.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
                    }else{

                        if( nvoNombre.equals(categoriaNombte) ){
                            JOptionPane.showMessageDialog(null, "Ya tiene ese nombre");
                        }else{

                            try {

                                ConexionBD.obtenerConexion();
                                preparedStatement = conexion.prepareStatement("UPDATE subcategorias3 SET nombre = ? WHERE id = ?");
                                preparedStatement.setString(1, nvoNombre);
                                preparedStatement.setInt(2, categoriaId);
                                preparedStatement.executeUpdate();

                                modificado = true;
                                System.out.println("Sub categoria 3 " + categoriaNombte + " modificada a " + nvoNombre);

                                conexion = ConexionBD.cerrarConexion();

                            } catch (SQLException ex) {
                                System.out.println(ex.getMessage());

                            } catch (ClassNotFoundException ex) {
                                System.out.println(ex.getMessage());
                            }

                            if( modificado == true ){
                                JOptionPane.showMessageDialog(null, "Sub categoria 3 modificada" );

                                actualizar();

                            }else{
                                JOptionPane.showMessageDialog(null, "Sub categoria 3 no modificada");
                            }
                        }
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        }
    }
    
    //Desactivaciones

    private void desactivarCategoria(String nombreCompleto) {
        
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("Va a desactivar la cateroria " + nombre);
            //Primero hay que obtener el id

            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT * FROM categorias WHERE nombre = ?";
                preparedStatement = conexion.prepareCall(sql);
                preparedStatement.setString(1, nombre);
                resultSet = preparedStatement.executeQuery();

                while( resultSet.next() ){
                    categorias.setId(resultSet.getInt(("id")));
                    categorias.setNombre(resultSet.getString(("nombre")));
                    categorias.setActivo(resultSet.getBoolean("activo"));

                    Integer categoriaId = categorias.getId();
                    String categoriaNombte = categorias.getNombre();
                    Boolean status = categorias.isActivo();

                    //Ahora hay cambiar el atrubuto de activo a false (Primero hay que comprobas que esta activo...)

                    if( status == true ){
                        Boolean modificado = true;

                        try {

                            ConexionBD.obtenerConexion();
                            preparedStatement = conexion.prepareStatement("UPDATE categorias SET activo = ? WHERE id = ?");
                            preparedStatement.setBoolean(1, false);
                            preparedStatement.setInt(2, categoriaId);
                            preparedStatement.executeUpdate();

                            modificado = true;
                            System.out.println("Categoria " + categoriaNombte + " desactivada");

                            conexion = ConexionBD.cerrarConexion();

                        } catch (SQLException ex) {
                            System.out.println(ex.getMessage());
                        } catch (ClassNotFoundException ex) {
                            System.out.println(ex.getMessage());
                        }

                        if( modificado == true ){
                            JOptionPane.showMessageDialog(null, "Categoria desactivada" );

                            actualizar();

                        }else{
                            JOptionPane.showMessageDialog(null, "Categoria no desactivada");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Categoria ya desactivada");
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Este elemento ya esta desactivado");
        }
    }

    private void desactivarSubCategoria1(String nombreCompleto) {
        
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("Va a desactivar la sub cateroria 1 " + nombre);
            
            //Primero hay que obtener el id

            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT * FROM subCategorias1 WHERE nombre = ?";
                preparedStatement = conexion.prepareCall(sql);
                preparedStatement.setString(1, nombre);
                resultSet = preparedStatement.executeQuery();

                while( resultSet.next() ){
                    subCategorias1.setId(resultSet.getInt(("id")));
                    subCategorias1.setNombre(resultSet.getString(("nombre")));
                    subCategorias1.setActivo(resultSet.getBoolean("activo"));

                    Integer categoriaId = subCategorias1.getId();
                    String categoriaNombte = subCategorias1.getNombre();
                    Boolean status = subCategorias1.isActivo();

                    //Ahora hay que obtener el nuevo nombre de la subcategoria1

                    if( status == true ){

                        Boolean modificado = true;

                        try {

                            ConexionBD.obtenerConexion();
                            preparedStatement = conexion.prepareStatement("UPDATE subCategorias1 SET activo = ? WHERE id = ?");
                            preparedStatement.setBoolean(1, false);
                            preparedStatement.setInt(2, categoriaId);
                            preparedStatement.executeUpdate();

                            modificado = true;
                            System.out.println("Sub categoria 1 " + categoriaNombte + " desactivada");

                            conexion = ConexionBD.cerrarConexion();

                        } catch (SQLException ex) {
                            System.out.println(ex.getMessage());

                        } catch (ClassNotFoundException ex) {
                            System.out.println(ex.getMessage());
                        }

                        if( modificado == true ){
                            JOptionPane.showMessageDialog(null, "Sub categoria 1 desactivada" );

                            actualizar();

                        }else{
                            JOptionPane.showMessageDialog(null, "Sub categoria 1 no desactivada");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Sub categoria 1 ya desactivada");
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Este elemento ya esta desactivado");
        }
    }

    private void desactivarSubCategoria2(String nombreCompleto) {
        
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("Va a desactivar la sub  cateroria 2 " + nombre);
            
            //Primero hay que obtener el id

            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT * FROM subCategorias2 WHERE nombre = ?";
                preparedStatement = conexion.prepareCall(sql);
                preparedStatement.setString(1, nombre);
                resultSet = preparedStatement.executeQuery();

                while( resultSet.next() ){
                    subCategorias2.setId(resultSet.getInt(("id")));
                    subCategorias2.setNombre(resultSet.getString(("nombre")));
                    subCategorias2.setActivo(resultSet.getBoolean("activo"));

                    Integer categoriaId = subCategorias2.getId();
                    String categoriaNombte = subCategorias2.getNombre();
                    Boolean status = subCategorias2.isActivo();

                    //Ahora hay que obtener el nuevo nombre de la subcategoria1

                    if( status == true ){
                        Boolean modificado = true;

                        try {

                            ConexionBD.obtenerConexion();
                            preparedStatement = conexion.prepareStatement("UPDATE subCategorias2 SET activo = ? WHERE id = ?");
                            preparedStatement.setBoolean(1, false);
                            preparedStatement.setInt(2, categoriaId);
                            preparedStatement.executeUpdate();

                            modificado = true;
                            System.out.println("Sub categoria 2 " + categoriaNombte + " desactivada");

                            conexion = ConexionBD.cerrarConexion();

                        } catch (SQLException ex) {
                            System.out.println(ex.getMessage());

                        } catch (ClassNotFoundException ex) {
                            System.out.println(ex.getMessage());
                        }

                        if( modificado == true ){
                            JOptionPane.showMessageDialog(null, "Sub categoria 2 desactivada" );

                            actualizar();

                        }else{
                            JOptionPane.showMessageDialog(null, "Sub categoria 2 no desactivada");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Sub categoria 2 ya desactivada");
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Este elemento ya esta desactivado");
        }
    }

    private void desactivarSubCategoria3(String nombreCompleto) {
        
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("Va a desactivar la sub cateroria 3 " + nombre);
            
            //Primero hay que obtener el id

            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT * FROM subCategorias3 WHERE nombre = ?";
                preparedStatement = conexion.prepareCall(sql);
                preparedStatement.setString(1, nombre);
                resultSet = preparedStatement.executeQuery();

                while( resultSet.next() ){
                    subCategorias3.setId(resultSet.getInt(("id")));
                    subCategorias3.setNombre(resultSet.getString(("nombre")));
                    subCategorias3.setActivo(resultSet.getBoolean("activo"));

                    Integer categoriaId = subCategorias3.getId();
                    String categoriaNombte = subCategorias3.getNombre();
                    Boolean status = subCategorias3.isActivo();

                    //Ahora hay que obtener el nuevo nombre de la subcategoria1

                    if( status == true ){

                        Boolean modificado = true;

                        try {

                            ConexionBD.obtenerConexion();
                            preparedStatement = conexion.prepareStatement("UPDATE subCategorias3 SET activo = ? WHERE id = ?");
                            preparedStatement.setBoolean(1, false);
                            preparedStatement.setInt(2, categoriaId);
                            preparedStatement.executeUpdate();

                            modificado = true;
                            System.out.println("Sub categoria 3 " + categoriaNombte + " desactivada");

                            conexion = ConexionBD.cerrarConexion();

                        } catch (SQLException ex) {
                            System.out.println(ex.getMessage());

                        } catch (ClassNotFoundException ex) {
                            System.out.println(ex.getMessage());
                        }

                        if( modificado == true ){
                            JOptionPane.showMessageDialog(null, "Sub categoria 3 desactivada" );

                            actualizar();

                        }else{
                            JOptionPane.showMessageDialog(null, "Sub categoria 3 no desactivada");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Sub categoria 3 ya desactivada");
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Este elemento ya esta desactivado");
        }
    }
    
    //Activaciones

    private void activarCategoria(String nombreCompleto) {
        
        Integer localizado = nombreCompleto.indexOf(" - Desactivado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("Va a activar la cateroria " + nombre);
            //Primero hay que obtener el id

            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT * FROM categorias WHERE nombre = ?";
                preparedStatement = conexion.prepareCall(sql);
                preparedStatement.setString(1, nombre);
                resultSet = preparedStatement.executeQuery();

                while( resultSet.next() ){
                    categorias.setId(resultSet.getInt(("id")));
                    categorias.setNombre(resultSet.getString(("nombre")));
                    categorias.setActivo(resultSet.getBoolean("activo"));

                    Integer categoriaId = categorias.getId();
                    String categoriaNombte = categorias.getNombre();
                    Boolean status = categorias.isActivo();

                    //Ahora hay cambiar el atrubuto de activo a false (Primero hay que comprobas que esta activo...)

                    if( status == false ){
                        Boolean modificado = true;

                        try {

                            ConexionBD.obtenerConexion();
                            preparedStatement = conexion.prepareStatement("UPDATE categorias SET activo = ? WHERE id = ?");
                            preparedStatement.setBoolean(1, true);
                            preparedStatement.setInt(2, categoriaId);
                            preparedStatement.executeUpdate();

                            modificado = true;
                            System.out.println("Categoria " + categoriaNombte + " desactivada");

                            conexion = ConexionBD.cerrarConexion();

                        } catch (SQLException ex) {
                            System.out.println(ex.getMessage());
                        } catch (ClassNotFoundException ex) {
                            System.out.println(ex.getMessage());
                        }

                        if( modificado == true ){
                            JOptionPane.showMessageDialog(null, "Categoria activada" );

                            actualizar();

                        }else{
                            JOptionPane.showMessageDialog(null, "Categoria no activada");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Categoria ya activada");
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Este elemento ya esta activado");
        }
    }

    private void activarSubCategoria1(String nombreCompleto) {
        
        Integer localizado = nombreCompleto.indexOf(" - Desactivado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("Va a activar la sub cateroria 1 " + nombre);
            //Primero hay que obtener el id

            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT * FROM subCategorias1 WHERE nombre = ?";
                preparedStatement = conexion.prepareCall(sql);
                preparedStatement.setString(1, nombre);
                resultSet = preparedStatement.executeQuery();

                while( resultSet.next() ){
                    subCategorias1.setId(resultSet.getInt(("id")));
                    subCategorias1.setNombre(resultSet.getString(("nombre")));
                    subCategorias1.setActivo(resultSet.getBoolean("activo"));

                    Integer categoriaId = subCategorias1.getId();
                    String categoriaNombte = subCategorias1.getNombre();
                    Boolean status = subCategorias1.isActivo();

                    //Ahora hay que obtener el nuevo nombre de la subcategoria1

                    if( status == false ){

                        Boolean modificado = true;

                        try {

                            ConexionBD.obtenerConexion();
                            preparedStatement = conexion.prepareStatement("UPDATE subCategorias1 SET activo = ? WHERE id = ?");
                            preparedStatement.setBoolean(1, true);
                            preparedStatement.setInt(2, categoriaId);
                            preparedStatement.executeUpdate();

                            modificado = true;
                            System.out.println("Sub categoria 1 " + categoriaNombte + " desactivada");

                            conexion = ConexionBD.cerrarConexion();

                        } catch (SQLException ex) {
                            System.out.println(ex.getMessage());

                        } catch (ClassNotFoundException ex) {
                            System.out.println(ex.getMessage());
                        }

                        if( modificado == true ){
                            JOptionPane.showMessageDialog(null, "Sub categoria 1 activada" );

                            actualizar();

                        }else{
                            JOptionPane.showMessageDialog(null, "Sub categoria 1 no activada");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Sub categoria 1 ya activada");
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Este elemento ya esta activado");
        }
        
            
    }

    private void activarSubCategoria2(String nombreCompleto) {
        
        Integer localizado = nombreCompleto.indexOf(" - Desactivado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("Va a activar la sub cateroria 2 " + nombre);
            //Primero hay que obtener el id

            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT * FROM subCategorias2 WHERE nombre = ?";
                preparedStatement = conexion.prepareCall(sql);
                preparedStatement.setString(1, nombre);
                resultSet = preparedStatement.executeQuery();

                while( resultSet.next() ){
                    subCategorias2.setId(resultSet.getInt(("id")));
                    subCategorias2.setNombre(resultSet.getString(("nombre")));
                    subCategorias2.setActivo(resultSet.getBoolean("activo"));

                    Integer categoriaId = subCategorias2.getId();
                    String categoriaNombte = subCategorias2.getNombre();
                    Boolean status = subCategorias2.isActivo();

                    //Ahora hay que obtener el nuevo nombre de la subcategoria1

                    if( status == false ){
                        Boolean modificado = true;

                        try {

                            ConexionBD.obtenerConexion();
                            preparedStatement = conexion.prepareStatement("UPDATE subCategorias2 SET activo = ? WHERE id = ?");
                            preparedStatement.setBoolean(1, true);
                            preparedStatement.setInt(2, categoriaId);
                            preparedStatement.executeUpdate();

                            modificado = true;
                            System.out.println("Sub categoria 2 " + categoriaNombte + " desactivada");

                            conexion = ConexionBD.cerrarConexion();

                        } catch (SQLException ex) {
                            System.out.println(ex.getMessage());

                        } catch (ClassNotFoundException ex) {
                            System.out.println(ex.getMessage());
                        }

                        if( modificado == true ){
                            JOptionPane.showMessageDialog(null, "Sub categoria 2 activada" );

                            actualizar();

                        }else{
                            JOptionPane.showMessageDialog(null, "Sub categoria 2 no activada");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Sub categoria 2 ya activada");
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Este elemento ya esta activado");
        }
    }

    private void activarSubCategoria3(String nombreCompleto) {
        
        Integer localizado = nombreCompleto.indexOf(" - Desactivado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("Va a desactivar la sub cateroria 3 " + nombre);
            //Primero hay que obtener el id

            conexion = ConexionBD.obtenerConexion();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {

                ConexionBD.obtenerConexion();
                String sql = "SELECT * FROM subCategorias3 WHERE nombre = ?";
                preparedStatement = conexion.prepareCall(sql);
                preparedStatement.setString(1, nombre);
                resultSet = preparedStatement.executeQuery();

                while( resultSet.next() ){
                    subCategorias3.setId(resultSet.getInt(("id")));
                    subCategorias3.setNombre(resultSet.getString(("nombre")));
                    subCategorias3.setActivo(resultSet.getBoolean("activo"));

                    Integer categoriaId = subCategorias3.getId();
                    String categoriaNombte = subCategorias3.getNombre();
                    Boolean status = subCategorias3.isActivo();

                    //Ahora hay que obtener el nuevo nombre de la subcategoria1

                    if( status == false ){

                        Boolean modificado = true;

                        try {

                            ConexionBD.obtenerConexion();
                            preparedStatement = conexion.prepareStatement("UPDATE subCategorias3 SET activo = ? WHERE id = ?");
                            preparedStatement.setBoolean(1, true);
                            preparedStatement.setInt(2, categoriaId);
                            preparedStatement.executeUpdate();

                            modificado = true;
                            System.out.println("Sub categoria 3 " + categoriaNombte + " desactivada");

                            conexion = ConexionBD.cerrarConexion();

                        } catch (SQLException ex) {
                            System.out.println(ex.getMessage());

                        } catch (ClassNotFoundException ex) {
                            System.out.println(ex.getMessage());
                        }

                        if( modificado == true ){
                            JOptionPane.showMessageDialog(null, "Sub categoria 3 activada" );

                            actualizar();

                        }else{
                            JOptionPane.showMessageDialog(null, "Sub categoria 3 no activada");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Sub categoria 3 ya activada");
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Este elemento ya esta activado");
        }
    }
    
    //Actualizar
    
    private void actualizar() {
        this.dispose();
        new listarCategorias().setVisible(true);
    }
}
