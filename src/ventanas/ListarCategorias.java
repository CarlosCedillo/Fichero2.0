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
import dao.implementaciones.SubCategoria1DaoImp;
import dao.implementaciones.SubCategoria2DaoImp;
import dao.implementaciones.SubCategoria3DaoImp;

public class ListarCategorias extends javax.swing.JFrame {
    
    Connection conexion = null;
    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Categorias");     //Raiz
    DefaultMutableTreeNode nodo;                                                //Categorias
    DefaultMutableTreeNode subNodo1;                                            //Sub Categorias1
    DefaultMutableTreeNode subNodo2;                                            //Sub Categorias2
    DefaultMutableTreeNode subNodo3;                                            //Sub Categorias3
    
    Categorias categorias = new Categorias();
    CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
    
    SubCategorias1 subCategorias1 = new SubCategorias1();
    SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
    
    SubCategorias2 subCategorias2 = new SubCategorias2();
    SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
    
    SubCategorias3 subCategorias3 = new SubCategorias3();
    SubCategoria3DaoImp subCategoria3DaoImp = new SubCategoria3DaoImp();
    

    public ListarCategorias() {
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
        this.dispose();
        System.out.println("Cerrar ventana categorias");
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
                new ListarCategorias().setVisible(true);
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
        
        System.out.println("\nVa a agregar una cateroria");
        
        //Primero: Hay que obtener el nombre de la categoria = categoria
        String categoria = JOptionPane.showInputDialog("Nombre de la Categoriaa");
        
        //Segundo: Hay que comprobar que categoria != vacio
        if( categoria.isEmpty()){
            JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
        }else{
            
            //Tercero: Hay qur comprobar que categoria no exista ya
            System.out.println("Comprobando si la categoria "+categoria+" existe");
            boolean resultado = categoriaDaoImp.existe(categoria);
            
            if( resultado == false ){
                
                //Cuarto: Agregar categoria a la DB
                System.out.println("Guardando la categoria "+categoria);
                boolean guardado = categoriaDaoImp.guardar(categoria);

                if( guardado == true ){

                    JOptionPane.showMessageDialog(null, "Categoria guardada");
                    actualizar();

                }else{
                    JOptionPane.showMessageDialog(null, "Categoria no guardada");
                }
            }else{
                JOptionPane.showMessageDialog(null, "La categoria "+categoria+" ya existe");
            }
        }
    } //Ya

    private void agregarSubCateroria1(String nombreCompleto) {
        
        //Primero: Obtener el nombre de la categoria a la que se va a agregar la sub categoria 1 = categoriaNombre
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            String categoriaNombre = nombreCompleto.substring(0,localizado);
            System.out.println("\nVa a agregar una sub categoria 1 a la cateroria: " + categoriaNombre);
            
            //Segundo: Obtener el id de la Categoria
            System.out.println("Obteniendo el id de la categoria "+categoriaNombre);
            Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
            System.out.println("El id de la categoria "+categoriaNombre+" es = "+categoriaId);
            
            //Tercero: Obtener el nombre de la Sub Categoria 1 = subSategoria1
            String sub1Nombre = JOptionPane.showInputDialog("Nombre de la Sub Categoriaa 1");

            if( sub1Nombre.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
            }else{
                
                System.out.println("Va a agregar la sub categoria 1 "+sub1Nombre);
                
                //Cuarto: Comprobar que esa sub categoria 1 no exista ya en esa categoria
                System.out.println("Comprobando que la sub categoria 1 "+sub1Nombre+" no exista en la categoria "+categoriaNombre);
                boolean existe = subCategoria1DaoImp.existe(sub1Nombre, categoriaId);
                
                if( existe == false ){
                    
                    //Quinto: Guardar la sub categoria 1
                    System.out.println("Guardado la sub categoria 1 "+sub1Nombre+" en la categoria "+categoriaNombre);
                    boolean guardado = subCategoria1DaoImp.guardar(sub1Nombre, categoriaId);
                    
                    //Sexto: Comprobar que si se guardo
                    if( guardado == true ){
                        JOptionPane.showMessageDialog(null, "Sub categoria 1 guardada");
                        actualizar();
                    }else{
                        JOptionPane.showMessageDialog(null, "Sub categoria 1 no guardada");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "La sub categoria 1 "+sub1Nombre+" ya existe en la categoria "+categoriaNombre);
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        }
    } //Ya

    private void agregarSubCateroria2(String nombreCompleto) {
        
        //Primero: Obtener el nombre de la sub categoria 1 a la que se va a agregar la sub categoria 2 = sub1Nombre
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            String sub1Nombre = nombreCompleto.substring(0,localizado);
            System.out.println("\nVa a agregar una sub categoria 2 a la sub cateroria 1: " + sub1Nombre);
            
            //Segundo: Obtener el id de la sub categoria 1
            System.out.println("Obteniendo el id de la sub categoria 1 "+sub1Nombre);
            Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre);
            System.out.println("El id de la sub categoria 1 "+sub1Nombre+" es = "+sub1Id);
            
            //Tercero: Obtener el nombre de la Sub Categoria 2 = subSategoria2
            String subSategoria2 = JOptionPane.showInputDialog("Nombre de la Sub Categoriaa 2");

            if( subSategoria2.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
            }else{
                
                System.out.println("Va a agregar la sub categoria 2 "+subSategoria2);
                
                //Cuarto: Comprobar que esa sub categoria 2 no exista ya en esa sub categoria 1
                System.out.println("Comprobando que la sub categoria 2 "+subSategoria2+" no exista en la sub categoria 1 "+sub1Nombre);
                boolean existe = subCategoria2DaoImp.existe(subSategoria2, sub1Id);
                
                if( existe == false ){
                    
                    //Quinto: Guardar la sub categoria 2
                    System.out.println("Guardado la sub categoria 2 "+subSategoria2+" en la sub categoria 1 "+sub1Nombre);
                    boolean guardado = subCategoria2DaoImp.guardar(subSategoria2, sub1Id);
                    
                    //Sexto: Comprobar que si se guardo
                    if( guardado == true ){
                        JOptionPane.showMessageDialog(null, "Sub categoria 2 guardada");
                        actualizar();
                    }else{
                        JOptionPane.showMessageDialog(null, "Sub categoria 2 no guardada");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "La sub categoria 2 "+subSategoria2+" ya existe en la sub categoria 1 "+sub1Nombre);
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        }        
    } //Ya

    private void agregarSubCateroria3(String nombreCompleto) {
        
        //Primero: Obtener el nombre de la sub categoria 2 a la que se va a agregar la sub categoria 3 = sub2Nombre
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            String sub2Nombre = nombreCompleto.substring(0,localizado);
            System.out.println("\nVa a agregar una sub categoria 3 a la sub cateroria 2: " + sub2Nombre);
            
            //1.1: Obtener el nombre del padre de la sub categoria 2 (nombre de la Sub categoria 1) = sub1Nombre
            DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
            String sub1NombreCompleto = arbol.getParent().toString();
            
            Integer localizandoSub1 = sub1NombreCompleto.indexOf(" - Activado");
            String sub1Nombre = sub1NombreCompleto.substring(0,localizandoSub1);
            
            //1.2: Obtener el id de la Sub categoria 1 = sub1Id
            System.out.println("Obteniendo el id de la sub categoria 1 "+sub1Nombre);
            Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre);
            System.out.println("El id de la sub categoria 1 "+sub1Nombre+" es = "+sub1Id);
            
            //Segundo: Obtener el id de la sub categoria 2
            System.out.println("Obteniendo el id de la sub categoria 2 "+sub2Nombre);
            Integer sub2Id = subCategoria2DaoImp.obtenerIdEspecial(sub2Nombre, sub1Id);
            System.out.println("El id de la sub categoria 2 "+sub2Nombre+" es = "+sub2Id);
            
            //Tercero: Obtener el nombre de ña sub categoria 3 = subSategoria3
            String subSategoria3 = JOptionPane.showInputDialog("Nombre de la Sub Categoriaa 3");

            if( subSategoria3.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
            }else{
                
                System.out.println("Va a agregar la sub categoria 3 "+subSategoria3);
                
                //Cuarto: Comprobar que esa sub categoria 3 no exista ya en esa sub categoria 2
                System.out.println("Comprobando que la sub categoria 3 "+subSategoria3+" no exista en la sub categoria 2 "+sub2Nombre);
                boolean existe = subCategoria3DaoImp.existe(subSategoria3, sub2Id);
                
                if( existe == false ){
                    
                    //Quinto: Guardar la sub categoria 3
                    System.out.println("Guardado la sub categoria 3 "+subSategoria3+" en la sub categoria 2 "+sub2Nombre);
                    boolean guardado = subCategoria3DaoImp.guardar(subSategoria3, sub2Id);
                    
                    //Sexto: Comprobar que si se guardo
                    if( guardado == true ){
                        JOptionPane.showMessageDialog(null, "Sub categoria 3 guardada");
                        actualizar();
                    }else{
                        JOptionPane.showMessageDialog(null, "Sub categoria 3 no guardada");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "La sub categoria 3 "+subSategoria3+" ya existe en la sub categoria 2 "+sub2Nombre);
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        }  
    } //Ya
    
    //Modificar
    
    private void modificarCategoria(String nombreCompleto) {
        
        //Primero: Hay que obtener el nombre seleccionado (Sin estado activado) = nombre
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("\nVa a modificar la categoria " + nombre);

            //Segundo: hay que obtener el id de nombre = categoriaId
            System.out.println("Obteniendo la id de la categoria "+nombre);
            Integer categoriaId = categoriaDaoImp.obtenerId(nombre);
            System.out.println("El id de la categoria "+nombre+" es = "+categoriaId);
            
            //Tercero: hay que obtener el nuevo nombre = nvoNombre
            String nvoNombre = JOptionPane.showInputDialog("Cambiear nombre de "+nombre);

            //Cuarto: Hay que comprobar que nvoNombre no este vacio
            if( nvoNombre.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
            }else{
                
                //Quinto: Hay que ver que el nvoNombre no exista 
                System.out.println("Comprobando si la categoria "+nombre+" existe");
                boolean existe = categoriaDaoImp.existe(nvoNombre);
                
                if( existe ==  false){
                    
                    //Sexto: modificar la categoria nombre a nvoNombre
                    System.out.println("Modificando la categoria "+nombre+" a "+nvoNombre);
                    boolean modificado = categoriaDaoImp.modificar(categoriaId, nvoNombre);
                    
                    //Septimo: comprobar que si se modifico
                    if( modificado == true ){
                        JOptionPane.showMessageDialog(null, "Categoria modificada");
                        actualizar();
                    }else{
                        JOptionPane.showMessageDialog(null, "Categoria no modificada");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "La categoria "+nvoNombre+" ya existe");
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se puede modificar un elemento desactivado");
        }    
    } //Ya

    private void modificarSubCategoria1(String nombreCompleto) {
        
        //1.- Obtener el nombre seleccionado sin "Activado" = sub1Nombre
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            String sub1Nombre = nombreCompleto.substring(0,localizado);
            System.out.println("\n Va a modificar la sub categoria 1 "+sub1Nombre);
            
            //2.- Obtener el id de la sub categoria 1 = sub1Id
            System.out.println("Obteniendo la id de la sub categoria 1 "+sub1Nombre);
            Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre);
            System.out.println("El id de la sub categoria 1 "+sub1Nombre+" es = "+sub1Id);
            
            //3.- Ahora hay que obtener el nuevo nombre de la subcategoria1 = nvoNombre
            String nvoNombre = JOptionPane.showInputDialog("Cambiear nombre de "+sub1Nombre);
            
            //3.1.- Comprobar que nvoNombre no este vacio
            if( nvoNombre.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
            }else{
                
                //4.- Obtener el nombre de la categoria a la que pertenece la sub categoria 1 = categoriaNombre
                System.out.println("Obteniendo la categoria a la que pertenece la sub categoria 1 "+nvoNombre);
                DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
                String categoriaNombreCompleto = arbol.getParent().toString();
            
                Integer localizandoCateg = categoriaNombreCompleto.indexOf(" - Activado");
                String categoriaNombre = categoriaNombreCompleto.substring(0,localizandoCateg);
                System.out.println("La categoria a la que pertnece la sub categoria 1 es "+categoriaNombre);
                
                //4.1.- Obtener el id de la categoria = categoriaId
                System.out.println("Obteniendo el id de la categoria "+categoriaNombre);
                Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
                System.out.println("El id de "+categoriaNombre+" es "+categoriaId);
                
                //5.- Comprobar que el nvoNombre no exista en la categoria
                System.out.println("Comprobando si "+nvoNombre+" existe en "+categoriaNombre);
                boolean existe = subCategoria1DaoImp.existe(nvoNombre, categoriaId);
                
                if( existe == false ){
                    
                    //6.- modificar la sub categoria 1
                    System.out.println("Modificando de "+sub1Nombre+" a "+nvoNombre);
                    Boolean modificado = subCategoria1DaoImp.modificar(sub1Id, nvoNombre);
                    
                    //7.- Comprobar que si se modifico
                    if( modificado == true ){
                        JOptionPane.showMessageDialog(null, "Sub categoria 1 modificada");
                        actualizar();
                    }else{
                        JOptionPane.showMessageDialog(null, "Categoria no modificada");
                    }
                
                }else{
                    JOptionPane.showMessageDialog(null, "La sub categoria 1 "+nvoNombre+" ya existe");
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se puede modificar un elemento desactivado");
        }
    } //Ya

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
        
        //Primero hay que obtener el nombre real = nombre (Esta parte tambien comprueba que el elemento este activado)
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("\nVa a desactivar la cateroria " + nombre);
            
            //Segundo hay que obtener el id de nombre
            System.out.println("Obteniendo la id de la categoria "+nombre);
            Integer categoriaId = categoriaDaoImp.obtenerId(nombre);
            System.out.println("El id de la categoria "+nombre+" es = "+categoriaId);
            
            //Tercero: desactivar la categoria
            System.out.println("Desactivando la categoria "+nombre);
            boolean desactivado = categoriaDaoImp.desactivar(categoriaId);
            
            //Cuarto: Comprobar que si se desactivo
            if( desactivado == true ){
                JOptionPane.showMessageDialog(null, "Categoria "+nombre+" desactivada");
                actualizar();
            }else{
                JOptionPane.showMessageDialog(null, "La categoria "+nombre+" no se desactivo");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Este elemento ya esta desactivado");
        }
    } //Ya

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
        
        //Primero hay que obtener el nombre real = nombre (Esta parte tambien comprueba que el elemento este desactivado)
        Integer localizado = nombreCompleto.indexOf(" - Desactivado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("\nVa a activar la cateroria " + nombre);
            
            //Segundo hay que obtener el id de nombre
            System.out.println("Obteniendo la id de la categoria "+nombre);
            Integer categoriaId = categoriaDaoImp.obtenerId(nombre);
            System.out.println("El id de la categoria "+nombre+" es = "+categoriaId);
            
            //Tercero: activar la categoria
            System.out.println("Activando la categoria "+nombre);
            boolean activado = categoriaDaoImp.activar(categoriaId);
            
            //Cuarto: Comprobar que si se desactivo
            if( activado == true ){
                JOptionPane.showMessageDialog(null, "Categoria "+nombre+" activada");
                actualizar();
            }else{
                JOptionPane.showMessageDialog(null, "La categoria "+nombre+" no se activo");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Este elemento ya esta activado");
        }
    } //Ya

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
    
    //Ayudas
    
    private void actualizar() {
        this.dispose();
        new ListarCategorias().setVisible(true);
    }
}
