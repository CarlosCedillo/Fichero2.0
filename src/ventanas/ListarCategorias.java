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
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.tree.TreeNode;

public class ListarCategorias extends javax.swing.JFrame {
    
    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Árbol de categorías");    //Raiz
    DefaultMutableTreeNode nodo;                                                        //Categorias
    DefaultMutableTreeNode subNodo1;                                                    //Sub Categorias1
    DefaultMutableTreeNode subNodo2;                                                    //Sub Categorias2
    DefaultMutableTreeNode subNodo3;                                                    //Sub Categorias3

    public ListarCategorias() throws Exception {
        initComponents();
        setTitle("Fichero 2.0 / Categorias");
        this.setLocationRelativeTo(null);
        
        obtenerCategorias();
        
        for( int i = 0 ; i < treeCategorias.getRowCount() ; i++ ){
            treeCategorias.expandRow(i);
        }
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

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("No hay categorías encontradas");
        treeCategorias.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
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

        this.dispose();
        System.out.println("\n----- Cerrar ventana categorias -----");
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        DefaultMutableTreeNode agregar = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
        
        if( agregar != null ){
            
            try {
                
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
                
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se selecciono algo");
        }
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        DefaultMutableTreeNode modificar = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
        String nombre = modificar.toString();
        
        if( modificar != null ){
            
             try {
                
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
                
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se selecciono algo");
        }
       
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed

        DefaultMutableTreeNode modificar = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
        String nombre = modificar.toString();
        
        if( modificar != null ){
            
            try {
                
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
                
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se selecciono algo");
        }
        
    }//GEN-LAST:event_btnDesactivarActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed

        DefaultMutableTreeNode modificar = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
        String nombre = modificar.toString();
        
        if( modificar != null ){
            
            try {
                
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
            
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No se selecciono algo");
        }
    }//GEN-LAST:event_btnActivarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    
                    new ListarCategorias().setVisible(true);
                    
                } catch (Exception ex) {
                    Logger.getLogger(ListarCategorias.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    
    private void obtenerCategorias() throws Exception {
        
        CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
        List<Categorias> listaCategorias = categoriaDaoImp.listar();
        
        for( Categorias categorias : listaCategorias ){
            
            Categorias temp = new Categorias();
            temp.setId(categorias.getId());
            temp.setNombre(categorias.getNombre());
            temp.setActivo(categorias.isActivo());
            
            Boolean activo = temp.isActivo();
            
            if( activo == true ){
                nodo = new DefaultMutableTreeNode(temp.getNombre() + " - Activado");
                raiz.add(nodo);
            }else{
                nodo = new DefaultMutableTreeNode(temp.getNombre() + " - Desactivado");
                raiz.add(nodo);
            }
            
            obtenerSub1(temp.getId());
            
            DefaultTreeModel modeloArbrol = new DefaultTreeModel(raiz);
            this.treeCategorias.setModel(modeloArbrol);
            
        }
    } //Ya
    
    private void obtenerSub1(Integer categoriaId) throws Exception {
        
        SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
        List<SubCategorias1> listaSub1 = subCategoria1DaoImp.listar(categoriaId);
        
        for( SubCategorias1 subCategorias1 : listaSub1 ){
                
            SubCategorias1 temp = new SubCategorias1();
            temp.setId(subCategorias1.getId());
            temp.setIdCategoria(subCategorias1.getIdCategoria());
            temp.setNombre(subCategorias1.getNombre());
            temp.setActivo(subCategorias1.isActivo());
                
            Boolean activo = subCategorias1.isActivo();
                
            if( activo == true ){
                subNodo1 = new DefaultMutableTreeNode(temp.getNombre() + " - Activado");
                nodo.add(subNodo1); 
            }else{
                subNodo1 = new DefaultMutableTreeNode(temp.getNombre() + " - Desactivado");
                nodo.add(subNodo1);
            }
                
            obtenerSub2(temp.getId());
                
        }
    } //Ya

    private void obtenerSub2(Integer sub1Id) throws Exception {
        
        SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
        List<SubCategorias2> listaSub2 = subCategoria2DaoImp.listar(sub1Id);
        
        for( SubCategorias2 subCategoria2 : listaSub2 ){
            
            SubCategorias2 temp = new SubCategorias2();
            temp.setId(subCategoria2.getId());
            temp.setIdSubCategoria1(subCategoria2.getIdSubCategoria1());
            temp.setNombre(subCategoria2.getNombre());
            temp.setActivo(subCategoria2.isActivo());
              
            Boolean activo = temp.isActivo();
               
            if( activo == true ){
                subNodo2 = new DefaultMutableTreeNode(temp.getNombre() + " - Activado");
                subNodo1.add(subNodo2);
            }else{
                subNodo2 = new DefaultMutableTreeNode(temp.getNombre() + " - Desactivado");
                subNodo1.add(subNodo2);
            }
                
            obtenerSub3(temp.getId());
                
        }
    } //Ya

    private void obtenerSub3(Integer sub2Id ) throws Exception {
        
        SubCategoria3DaoImp subCategoria3DaoImp = new SubCategoria3DaoImp();
        List<SubCategorias3> listaSub3 = subCategoria3DaoImp.listar(sub2Id);

        for( SubCategorias3 subCategorias3 : listaSub3 ){
            
            SubCategorias3 temp = new SubCategorias3();
            temp.setId(subCategorias3.getId());
            temp.setIdSubCategoria2(subCategorias3.getIdSubCategoria2());
            temp.setNombre(subCategorias3.getNombre());
            temp.setActivo(subCategorias3.isActivo());
            
            Boolean activo = temp.isActivo();
            
            if( activo == true ){
                subNodo3 = new DefaultMutableTreeNode(temp.getNombre() + " - Activado");
                subNodo2.add(subNodo3);
            }else{
                subNodo3 = new DefaultMutableTreeNode(temp.getNombre() + " - Desactivado");
                subNodo2.add(subNodo3);
            }

        }
    } //Ya
    
    //Agregar

    private void agregarCateroria() throws Exception {
        
        System.out.println("\nVa a agregar una cateroria");
        
        //Primero: Hay que obtener el nombre de la categoria = categoria
        String categoria = JOptionPane.showInputDialog("Nombre de la categoría");
        
        //Segundo: Hay que comprobar que categoria != vacio
        if( categoria.isEmpty()){
            JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
        }else{
            
            //Tercero: Hay qur comprobar que categoria no exista ya
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            System.out.println("Comprobando si la categoria "+categoria+" existe");
            boolean resultado = categoriaDaoImp.existe(categoria);
            
            if( resultado == false ){
                
                System.out.println("La categoria "+categoria+" no existe");
                
                //Cuarto: Agregar categoria a la DB
                System.out.println("Guardando la categoria "+categoria);
                boolean guardado = categoriaDaoImp.guardar(categoria);

                if( guardado == true ){
                    
                    System.out.println("Categoría " + categoria + " guardada");
                    JOptionPane.showMessageDialog(null, "Categoria "+categoria+" guardada");
                    actualizar();

                }else{
                    JOptionPane.showMessageDialog(null, "Hubo un error al guardar la categoría");
                }
            }else{
                System.out.println("La categoria "+categoria+" ya existe");
                JOptionPane.showMessageDialog(null, "La categoria "+categoria+" ya existe");
            }
        }
    } //Ya

    private void agregarSubCateroria1(String nombreCompleto) throws Exception {
        
        //1.- Obtener el nombre de la caregoria
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            
            String categoriaNombre = nombreCompleto.substring(0,localizado);
            System.out.println("\nVa a agregar una sub categoria 1 a la cateroria: " + categoriaNombre);
            
            //2.- Obtener el id de la categoria
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            System.out.println("Obteniendo el id de la categoria "+categoriaNombre);
            Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
            System.out.println("Categoria nombre = "+categoriaNombre+", categoria id = "+categoriaId);
            
            //3.- Obtener el nombre de la sub categoria 1 a agregar
            String sub1Nombre = JOptionPane.showInputDialog("Nombre de la sub categoría 1");
            
            if( sub1Nombre.isEmpty() == false ){
                
                //4.- Comprobar que no existe ya
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                System.out.println("Comprobando si la sub categoria 1 "+sub1Nombre+" existe en la categoria "+categoriaNombre);
                Boolean existe = subCategoria1DaoImp.existe(sub1Nombre, categoriaId);
                
                if( existe == false ){
                    
                    System.out.println("La sub categoria 1 " + sub1Nombre + " no existe ne la categoria "+categoriaNombre);
                    
                    //5.- guarda la sub categoria
                    System.out.println("Guardando la sub categoria 1 "+sub1Nombre+" en la categoria "+categoriaNombre);
                    Boolean guardado = subCategoria1DaoImp.guardar(sub1Nombre,categoriaId);
                    
                    if( guardado == true ){
                        
                        System.out.println("Sub categoria 1 "+sub1Nombre+" guardada en la categoria "+categoriaNombre);
                        JOptionPane.showMessageDialog(null, "Sub categoria 1 "+sub1Nombre+" guardada en la categoria "+categoriaNombre);
                        actualizar();
                        
                    }else{
                        System.out.println("Hubo un error al guardar la sub categoría 1 "+sub1Nombre);
                        JOptionPane.showMessageDialog(null, "Hubo un error al guardar la sub categoría 1 "+sub1Nombre);
                    }
                    
                }else{
                    System.out.println("La sub categoria 1 " + sub1Nombre + " ya existe en la categoria " + categoriaNombre);
                    JOptionPane.showMessageDialog(null, "La sub categoria 1 " + sub1Nombre + " ya existe en la categoria " + categoriaNombre);
                }
                
            }else{
                System.out.println("No se ah ingersado un nombre");
                JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
            }
            
        }else{
            System.out.println("No se puede agregar a un elemento desactivado");
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        }
    } //Ya

    private void agregarSubCateroria2(String nombreCompleto) throws Exception {
        
        //1.- Obtener el nombre de la sub caregoria 1
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            
            String sub1Nombre = nombreCompleto.substring(0,localizado);
            System.out.println("\nVa a agregar una sub categoria 2 a la sub cateroria 1: " + sub1Nombre);
            
            //1.1.- Obtener la Categoria correspondiente a la sub categoria 1 que se le quiere agregar una sub categoria 2
            DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
            String categoriaNombreCompleto = arbol.getParent().toString();
            
            Integer localizarCategoria = categoriaNombreCompleto.indexOf(" - Activado");
            String categoriaNombre = categoriaNombreCompleto.substring(0,localizarCategoria);
            
            //1.2.- Obtener el id de la categoria
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            System.out.println("Obteniendo el id de la categoria "+categoriaNombre);
            Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
            System.out.println("Categoria nombre = "+categoriaNombre+", categoria id = "+categoriaId);
            
            //2.- Obtener el id (avanzado) de la sub categoria 1
            SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
            System.out.println("Obteniendo el id de la sub categoria 1 "+sub1Nombre);
            Integer sub1Id = subCategoria1DaoImp.obtenetIdAvanzado(sub1Nombre, categoriaId);
            System.out.println("Sub 1 nombre = "+sub1Nombre+", sub 1 id = "+sub1Id);
            
            //3.- Obtener el nombre de la sub categoria 2 a agregar
            String sub2Nombre = JOptionPane.showInputDialog("Nombre de la sub categoría 2");
            
            if( sub2Nombre.isEmpty() == false ){
                
                //4.- Comprobar que no existe ya
                SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
                System.out.println("Comprobando si la sub categoria 2 "+sub2Nombre+" existe en la sub categoria 1 "+sub1Nombre);
                Boolean existe = subCategoria2DaoImp.existe(sub2Nombre, sub1Id);
                
                if( existe == false ){
                    
                    System.out.println("La sub categoria 2 " + sub2Nombre + " no existe ne la sub categoria 1 "+sub1Nombre);
                    
                    //5.- guarda la sub categoria
                    System.out.println("Guardando la sub categoria 2 "+sub2Nombre+" en la sub categoria 1 "+sub1Nombre);
                    Boolean guardado = subCategoria2DaoImp.guardar(sub2Nombre,sub1Id);
                    
                    if( guardado == true ){
                        
                        System.out.println("Sub categoria 2 "+sub2Nombre+" guardada en la sub categoria 1 "+sub1Nombre);
                        JOptionPane.showMessageDialog(null, "Sub categoria 2 "+sub2Nombre+" guardada en la sub categoria 1 "+sub1Nombre);
                        actualizar();
                        
                    }else{
                        System.out.println("Hubo un error al guardar la sub categoría 2 "+sub2Nombre);
                        JOptionPane.showMessageDialog(null, "Hubo un error al guardar la sub categoría 2 "+sub2Nombre);
                    }
                    
                }else{
                    System.out.println("La sub categoria 2 " + sub2Nombre + " ya existe en la sub categoria 1 " + sub1Nombre);
                    JOptionPane.showMessageDialog(null, "La sub categoria 2 " + sub2Nombre + " ya existe en la sub categoria 1 " + sub1Nombre);
                }
                
            }else{
                System.out.println("No se ah ingersado un nombre");
                JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
            }
            
        }else{
            System.out.println("No se puede agregar a un elemento desactivado");
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        }
    } //Ya

    private void agregarSubCateroria3(String nombreCompleto) throws Exception {
        
        //1.- Obtener toda la ruta (Categoria, sub categoria 1 y sub categoria 2)
        Integer localizarActivado = nombreCompleto.indexOf(" - Activado");
        
        if( localizarActivado > 0 ){
            
            String sub2Nombre = nombreCompleto.substring(0,localizarActivado);
            
            DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
            String raizNombre = arbol.getRoot().toString();
            String sub1NombreCompleto = arbol.getParent().toString();
            TreeNode[] ruta = arbol.getPath();
                
            String sub1Nombre = sub1NombreCompleto.substring(0,localizarActivado);
            
            Integer localizarCategoriaPt1 = Arrays.toString(ruta).indexOf(" - Activado, "+sub1Nombre+" - Activado, "+sub2Nombre+" - Activado]");
            String categoriaNombrePt1 = Arrays.toString(ruta).substring(0, localizarCategoriaPt1);
            String categoriaNombre = categoriaNombrePt1.substring(raizNombre.length()+3 , categoriaNombrePt1.length());
            
            System.out.println("\nVa a agregar una sub categoria 3 a la sub cateroria 2: " + sub2Nombre);
            
            //2.- Obtener el id de la categoria
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            System.out.println("Obteniendo el id de la categoria "+categoriaNombre);
            Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
            System.out.println("Categoria nombre = "+categoriaNombre+", categoria id = "+categoriaId);
            
            //3.- Obtener el id (avanzado) de la Sub categoria 1
            SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
            System.out.println("Obteniendo el id de la sub categoria 1 "+sub1Nombre);
            Integer sub1Id = subCategoria1DaoImp.obtenetIdAvanzado(sub1Nombre, categoriaId);
            System.out.println("Sub 1 nombre = "+sub1Nombre+", sub 1 id = "+sub1Id);
            
            //3.- Obtener el id (avanzado) de la Sub categoria 2
            SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
            System.out.println("Obteniendo el id de la sub categoria 2 "+sub2Nombre);
            Integer sub2Id = subCategoria2DaoImp.obtenetIdAvanzado(sub2Nombre, sub1Id);
            System.out.println("Sub 2 nombre = "+sub2Nombre+", sub 2 id = "+sub2Id);
            
            //5.- Obtener el nombre de la sub categoria 3
            String sub3Nombre = JOptionPane.showInputDialog("Nombre de la sub categoría 3");
            
            if( sub3Nombre.isEmpty() == false ){
                
                //6.- Comprobar que dicha sub categoria 3 no exista en la sub categoria 2
                SubCategoria3DaoImp subCategoria3DaoImp = new SubCategoria3DaoImp();
                System.out.println("Comprobando que la sub categoria 3 "+sub3Nombre+" no exista en la sub categoria 2 "+sub2Nombre);
                Boolean existe = subCategoria3DaoImp.existe(sub3Nombre, sub2Id);
                
                if( existe == false ){
                    
                    System.out.println("La sub categoria 3 " + sub3Nombre + " no existe en la sub categoria 2 " + sub2Nombre);
                    
                    //7.- Guardar la sub categoria 3 en la sub categoria 2
                    Boolean guardado = subCategoria3DaoImp.guardar(sub3Nombre, sub2Id);
                    
                    if( guardado == true ){
                        
                        System.out.println("Sub categoria 3 "+sub3Nombre+" guardada en la sub categoria 2 "+sub2Nombre);
                        JOptionPane.showMessageDialog(null, "Sub categoria 3 "+sub3Nombre+" guardada en la sub categoria 2 "+sub2Nombre);
                        actualizar();
                        
                    }else{
                        System.out.println("Hubo un error al guardar la sub categoría 3 "+sub3Nombre);
                        JOptionPane.showMessageDialog(null, "Hubo un error al guardar la sub categoría 3 "+sub3Nombre);
                    }
                
                }else{
                    System.out.println("La sub categoria 3 " + sub3Nombre + " ya existe en la sub categoria 2 " + sub2Nombre);
                    JOptionPane.showMessageDialog(null, "La sub categoria 3 " + sub3Nombre + " ya existe en la sub categoria 2 " + sub2Nombre);
                }
                
            }else{
                System.out.println("No se ah ingersado un nombre");
                JOptionPane.showMessageDialog(null, "No se ah ingersado un nombre");
            }
            
        }else{
            System.out.println("No se puede agregar a un elemento desactivado");
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        }
    } //Ya
    
    //Modificar
    
    private void modificarCategoria(String nombreCompleto) throws Exception {
        
        //1.- Hay que obtener el nombre seleccionado (Sin estado activado) = nombre
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            String categoriaOldNave = nombreCompleto.substring(0,localizado);
            System.out.println("\nVa a modificar la categoria " + categoriaOldNave);
            
            //2.- Obtener el nuevo nombe
            String categoriaNewName = JOptionPane.showInputDialog("Nuevo nombre de la categoría "+categoriaOldNave);
            
            if( categoriaNewName.isEmpty() == false ){
                
                //3.- Comprbar que no exista
                CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                System.out.println("Comprobando si la categoria "+categoriaNewName+" existe");
                Boolean existe = categoriaDaoImp.existe(categoriaNewName);
                
                if( existe == false ){
                    
                    System.out.println("La categoria "+categoriaNewName+" no existe");
                    
                    //4.- Obtener elid de la categoria a modificar
                    System.out.println("Obteniendo el id de ña categoria "+categoriaOldNave);
                    Integer categoriaId = categoriaDaoImp.obtenerId(categoriaOldNave);
                    System.out.println("Categoria nombre = "+categoriaOldNave+", categoria id = "+categoriaId);
                    
                    //X.- modificar la categoria
                    System.out.println("Modificando la cattegoria de "+categoriaOldNave+" a "+categoriaNewName);
                    Boolean modificado = categoriaDaoImp.modificar(categoriaId, categoriaNewName);
                    
                    if( modificado == true ){
                        System.out.println("Categoria "+categoriaOldNave+" modificada con éxito");
                        JOptionPane.showMessageDialog(this, "Categoria "+categoriaOldNave+" modificada con éxito");
                        actualizar();
                    }else{
                        System.out.println("Hubo un error al modificar la categoria "+categoriaOldNave);
                        JOptionPane.showMessageDialog(this, "Hubo un error al modificar la categoría "+categoriaOldNave);
                    }
                    
                }else{
                    System.out.println("La categoria "+categoriaNewName+" ya existe");
                    JOptionPane.showMessageDialog(null, "La categoria "+categoriaNewName+" ya existe");
                }
            
            }else{
                System.out.println("No se ingreso un nombre");
                JOptionPane.showMessageDialog(null, "No se ingreso un nombre");
            }
            
        }else{
            System.out.println("No se puede modificar un elemento desactivado");
            JOptionPane.showMessageDialog(null, "No se puede modificar un elemento desactivado");
        }    
    } //Ya

    private void modificarSubCategoria1(String nombreCompleto) throws Exception {
        
        //1.- comprobar si la categoria esta activa
        DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
        String categoriaNombreCompleto = arbol.getParent().toString();
        
        Integer locCategoria = categoriaNombreCompleto.indexOf(" - Activado");
        
        if( locCategoria > 0 ){
            
            String categoriaNombre = categoriaNombreCompleto.substring(0, locCategoria);
            
            //2.- Comprobar que la sub categoria 1 este activa
            Integer locSub1 = nombreCompleto.indexOf(" - Activado");
            
            if( locSub1 > 0 ){
                
                String sub1OldName = nombreCompleto.substring(0, locSub1);
                
                //3.- Obtener el nuevo nombre de la sub categoria 1
                String sub1NewName = JOptionPane.showInputDialog("Nuevo nombre de la sub categoría 1 "+sub1OldName);
                
                if( sub1NewName.isEmpty() == false ){
                
                    //4.- Obtener el id de la categoria
                    CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                    System.out.println("Obteniendo el id de la categoria = "+categoriaNombre);
                    Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
                    System.out.println("Categoria id = "+categoriaId);

                    //5.- Obtener el id de la sub categoria 1 de forma avanzada
                    SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                    System.out.println("Obteniendo el id de sub categoria = "+sub1OldName);
                    Integer sub1Id = subCategoria1DaoImp.obtenetIdAvanzado(sub1OldName, categoriaId);
                    System.out.println("Sub categoria 1 id = "+sub1Id);

                    //6.- Comprobar que el nuevo nombre no exista en la categoria
                    System.out.println("Comprobando si la sub categoría 1 "+sub1NewName+" existe");
                    Boolean existe = subCategoria1DaoImp.existe(sub1NewName, categoriaId);
                    
                    if( existe == false ){
                        
                        System.out.println("La sub categoria 1 "+sub1NewName+" no existe");
                        
                        //7.- modificar la sub categoria 1
                        System.out.println("Modificando la sub categoria 1 de "+sub1OldName+" a "+sub1NewName);
                        Boolean modificado = subCategoria1DaoImp.modificar(sub1Id, sub1NewName);
                        
                        if( modificado == true ){
                            
                            System.out.println("La sub categoía 1 "+sub1OldName+" modificada a "+sub1NewName);
                            JOptionPane.showMessageDialog(null, "La sub categoía 1 "+sub1OldName+" modificada a "+sub1NewName);
                            
                        }else{
                            System.out.println("La sub categoía 1 "+sub1OldName+" no se pudo modificada");
                            JOptionPane.showMessageDialog(null, "La sub categoía 1 "+sub1OldName+" no se pudo modificada");
                        }
                    
                    }else{
                        System.out.println("La sub categoía 1 "+sub1NewName+" ya existe en la categoría "+categoriaNombre);
                        JOptionPane.showMessageDialog(null, "La sub categoía 1 "+sub1NewName+" ya existe en la categoría "+categoriaNombre);
                    }
                    
                }else{
                    System.out.println("No se ingreso un nombre");
                    JOptionPane.showMessageDialog(null, "No se ingreso un nombre");
                }
            
            }else{
                System.out.println("No se puede modificar un elemento desactivada");
                JOptionPane.showMessageDialog(null, "No se puede modificar un elemento desactivada");
            }
        
        }else{
            System.out.println("No se puede modificar por que la categoria de esta sub categoria 1 esta desactivada");
            JOptionPane.showMessageDialog(null, "No se puede modificar por que la categoria de esta sub categoria 1 esta desactivada");
        }
    } //Ya

    private void modificarSubCategoria2(String nombreCompleto) throws Exception {
        
        //1.- Obtener la ruta completa y separar los elementos
        
        DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
        TreeNode[] rutaComplet = arbol.getPath();
        String ruta = Arrays.toString(rutaComplet);
        String raiz = arbol.getRoot().toString();
        String sub1NombreCompelto = arbol.getParent().toString();
        String sub2NombreCompleto = nombreCompleto;
        
        String reduccion1 = ruta.substring(raiz.length()+3, ruta.length());
        Integer localizarCategoriaNombreCompleto = reduccion1.indexOf(", "+sub1NombreCompelto+", "+sub2NombreCompleto);
        String categoriaNombreCompleto = reduccion1.substring(0, localizarCategoriaNombreCompleto);
        
        //2.- Comprobar si los elementos estan activados
        
        Integer localizarCategoria = categoriaNombreCompleto.indexOf(" - Activado");
        Integer localizarSub1 = sub1NombreCompelto.indexOf(" - Activado");
        Integer localizarSub2 = sub2NombreCompleto.indexOf(" - Activado");
        
        if( ( localizarCategoria > 0 ) && ( localizarSub1 > 0 ) && ( localizarSub2 > 0 ) ){
            
            String categoriaId = categoriaNombreCompleto.substring(0,localizarCategoria);
            String sub1Nombre = sub1NombreCompelto.substring(0, localizarSub1);
            String sub2OldName = sub2NombreCompleto.substring(0, localizarSub2);
            
            //3.- Obtener el nuevo nombre de la sub categoría 2
            String sub2NewName = JOptionPane.showInputDialog("Nuevo nombre de la sub categoría 2 "+sub2OldName);
            
            if( sub2NewName.isEmpty() == false ){
                
                
            
            }else{
                System.out.println("No se ingreso un nombre");
                JOptionPane.showMessageDialog(null, "No se ingreso un nombre");
            }
            
        }else{
            System.out.println("No se puede modificar si la categoría, sub categoría 1 o sub categoría 2 estan desactivadas");
            JOptionPane.showMessageDialog(null, "No se puede modificar si: "
                    + "\n    1.- La categoría esta descativada "
                    + "\n    2.- La sub categoría 1 esta desactivada "
                    + "\n    3.- La sub categoría 2 esta desactivada "
                    + "\nCompruebe que esten activadas");
        }
    }

    private void modificarSubCategoria3(String nombreCompleto) throws Exception {
        
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            String nombre = nombreCompleto.substring(0,localizado);
        
            //Primero hay que obtener el id

            Connection conexion = null;
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
                    SubCategorias2 subCategorias2 = new SubCategorias2();
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

    private void desactivarCategoria(String nombreCompleto) throws Exception {
        
        //Primero hay que obtener el nombre real = nombre (Esta parte tambien comprueba que el elemento este activado)
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("\nVa a desactivar la cateroria " + nombre);
            
            //Segundo hay que obtener el id de nombre
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
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
    } 

    private void desactivarSubCategoria1(String nombreCompleto) throws Exception {
        
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("Va a desactivar la sub cateroria 1 " + nombre);
            
            //Primero hay que obtener el id

            Connection conexion = null;
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
                    SubCategorias1 subCategorias1 = new SubCategorias1();
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

    private void desactivarSubCategoria2(String nombreCompleto) throws Exception {
        
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("Va a desactivar la sub  cateroria 2 " + nombre);
            
            //Primero hay que obtener el id

            Connection conexion = null;
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
                    SubCategorias2 subCategorias2 = new SubCategorias2();
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

    private void desactivarSubCategoria3(String nombreCompleto) throws Exception {
        
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("Va a desactivar la sub cateroria 3 " + nombre);
            
            //Primero hay que obtener el id

            Connection conexion = null;
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
                    SubCategorias3 subCategorias3 = new SubCategorias3();
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

    private void activarCategoria(String nombreCompleto) throws Exception {
        
        //1.- hay que obtener el nombre de la categoria 
        Integer localizado = nombreCompleto.indexOf(" - Desactivado");
        
        if( localizado > 0 ){
            
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            
            String categoriaNombre = nombreCompleto.substring(0,localizado);
            System.out.println("\nVa a activar la cateroria " + categoriaNombre);
            
            //2.- hay que obtener el id de la categoria
            System.out.println("Obteniendo la id de la categoria "+categoriaNombre);
            Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
            System.out.println("El id de la categoria "+categoriaNombre+" es = "+categoriaId);
            
            //3.- activar la categoria
            System.out.println("Activando la categoria "+categoriaNombre);
            boolean activado = categoriaDaoImp.activar(categoriaId);
            
            if( activado == true ){
                JOptionPane.showMessageDialog(null, "Categoria "+categoriaNombre+" activada");
                actualizar();
            }else{
                JOptionPane.showMessageDialog(null, "La categoria "+categoriaNombre+" no se activo");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Este elemento ya esta activado");
        }
    } 

    private void activarSubCategoria1(String nombreCompleto) throws Exception {
        
        Integer localizado = nombreCompleto.indexOf(" - Desactivado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("Va a activar la sub cateroria 1 " + nombre);
            //Primero hay que obtener el id

            Connection conexion = null;
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
                    SubCategorias1 subCategorias1 = new SubCategorias1();
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

    private void activarSubCategoria2(String nombreCompleto) throws Exception {
        
        Integer localizado = nombreCompleto.indexOf(" - Desactivado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("Va a activar la sub cateroria 2 " + nombre);
            //Primero hay que obtener el id

            Connection conexion = null;
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
                    SubCategorias2 subCategorias2 = new SubCategorias2();
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

    private void activarSubCategoria3(String nombreCompleto) throws Exception {
        
        Integer localizado = nombreCompleto.indexOf(" - Desactivado");
        
        if( localizado > 0 ){
            
            String nombre = nombreCompleto.substring(0,localizado);
            System.out.println("Va a desactivar la sub cateroria 3 " + nombre);
            //Primero hay que obtener el id

            Connection conexion = null;
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
                    SubCategorias3 subCategorias3 = new SubCategorias3();
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
    
    private void actualizar() throws Exception {
        this.dispose();
        new ListarCategorias().setVisible(true);
    }
}
