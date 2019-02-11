package ventanas;

import dao.implementaciones.CategoriaDaoImp;
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
import java.awt.Point;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.tree.TreeNode;

public class ListarCategorias extends javax.swing.JFrame {
    
    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Seleccione para agregar una categoría");      //Raiz
    DefaultMutableTreeNode nodo;                                                                            //Categorias
    DefaultMutableTreeNode subNodo1;                                                                        //Sub Categorias1
    DefaultMutableTreeNode subNodo2;                                                                        //Sub Categorias2
    DefaultMutableTreeNode subNodo3;                                                                        //Sub Categorias3

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
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
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
                        System.out.println("\nNo se puede agregar a este elemento");
                        JOptionPane.showMessageDialog(null, "No se puede agregar a este elemento");
                        break;
                }
                
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            System.out.println("\nNo se selecciono un lugar para agregar");
            JOptionPane.showMessageDialog(null, "No se selecciono un lugar para agregar");
        }
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        DefaultMutableTreeNode modificar = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
        
        if( modificar != null ){
            
            String nombre = modificar.toString();
            
             try {
                
                switch( modificar.getLevel() ){

                    case 0:
                        System.out.println("Seleccion invalida");
                        JOptionPane.showMessageDialog(null, "Seleccion invalida");
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
            System.out.println("\nNo se selecciono un elemento para modificar");
            JOptionPane.showMessageDialog(null, "No se selecciono un elemento para modificar");
        }
       
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed

        DefaultMutableTreeNode modificar = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
        
        if( modificar != null ){
            
            String nombre = modificar.toString();
            
            try {
                
                switch( modificar.getLevel() ){

                    case 0:
                        System.out.println("\nSeleccion invalida");
                        JOptionPane.showMessageDialog(null, "Seleccion invalida");
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
            System.out.println("\nNo se selecciono un elemento para desactivar");
            JOptionPane.showMessageDialog(null, "No se selecciono un elemento para desactivar");
        }
        
    }//GEN-LAST:event_btnDesactivarActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed

        DefaultMutableTreeNode modificar = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
        
        if( modificar != null ){
            
            String nombre = modificar.toString();
            
            try {
                
                switch( modificar.getLevel() ){

                    case 0:
                        System.out.println("\nSeleccion invalida");
                        JOptionPane.showMessageDialog(null, "Seleccion invalida");
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
            System.out.println("\nNo se selecciono un elemento para activar");
            JOptionPane.showMessageDialog(null, "No se selecciono un elemento para activar");
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
        
        System.out.println("\nVa a agregar una categoría");
        
        //1.- Hay que obtener el nombre de la categoria = categoria
        String categoriaNombre = JOptionPane.showInputDialog("Nombre de la categoría");
        
        //2.- Hay que comprobar que categoria != vacio
        if( categoriaNombre.isEmpty() == false ){
            
            //3.- Hay qur comprobar que categoria no exista ya
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            System.out.println("Comprobando la existencia de la categoría "+categoriaNombre);
            boolean existe = categoriaDaoImp.existe(categoriaNombre);
            
            if( existe == false ){
                
                System.out.println("La categoría no existe");
                
                //4.- Agregar categoria a la DB
                System.out.println("Guardando la categoría");
                boolean guardado = categoriaDaoImp.guardar(categoriaNombre);

                if( guardado == true ){
                    
                    System.out.println("Categoría guardada con éxito");
                    JOptionPane.showMessageDialog(null, "Categoría "+categoriaNombre+" guardada con éxito");
                    actualizar();

                }else{
                    System.out.println("No se pudo guardar la categoría");
                    JOptionPane.showMessageDialog(null, "No se pudo guardar la categoría");
                }
                
            }else{
                System.out.println("La categoría ya existe");
                JOptionPane.showMessageDialog(null, "La categoría "+categoriaNombre+" ya existe");
            }
            
        }else{
            System.out.println("\nNo se ingreso un nombre");
            JOptionPane.showMessageDialog(null, "No se ingreso un nombre");
        }
    } //Ya

    private void agregarSubCateroria1(String nombreCompleto) throws Exception {
        
        //1.- Obtener el nombre de la caregoria
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            
            String categoriaNombre = nombreCompleto.substring(0,localizado);
            System.out.println("\nVa a agregar una sub categoría 1 a la categoría "+categoriaNombre);
            
            //2.- Obtener el nombre de la sub categoria 1 a agregar
            String sub1Nombre = JOptionPane.showInputDialog("Nombre de la sub categoría 1");
            
            if( sub1Nombre.isEmpty() == false ){
                
                //3.- Obtener el id de la categoria
                CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
                System.out.println("Categoría nombre = "+categoriaNombre+", categoría id = "+categoriaId);
                
                //4.- Comprobar que no existe ya
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                System.out.println("Comprobando la existencia de la sub categoría 1 "+sub1Nombre);
                Boolean existe = subCategoria1DaoImp.existe(sub1Nombre, categoriaId);
                
                if( existe == false ){
                    
                    System.out.println("La sub categoría 1 no existe");
                    
                    //5.- guarda la sub categoria
                    System.out.println("Guardando la sub categoría 1");
                    Boolean guardado = subCategoria1DaoImp.guardar(sub1Nombre,categoriaId);
                    
                    if( guardado == true ){
                        
                        System.out.println("Sub categoría 1 guardada con éxito");
                        JOptionPane.showMessageDialog(null, "Sub categoría 1 "+sub1Nombre+" guardada con éxito");
                        actualizar();
                        
                    }else{
                        System.out.println("No se pudo guardar la sub categoría 1");
                        JOptionPane.showMessageDialog(null, "No se pudo guardar la sub categoría 1");
                    }
                    
                }else{
                    System.out.println("La sub categoría 1 ya existe");
                    JOptionPane.showMessageDialog(null, "La sub categoría 1 "+sub1Nombre+" ya existe");
                }
                
            }else{
                System.out.println("\nNo se ingreso un nombre");
                JOptionPane.showMessageDialog(null, "No se ingreso un nombre");
            }
            
        }else{
            System.out.println("\nNo se puede agregar a un elemento desactivado");
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        }
    } //Ya

    private void agregarSubCateroria2(String nombreCompleto) throws Exception {
        
        //1.- Obtener el nombre de la sub caregoria 1
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            
            String sub1Nombre = nombreCompleto.substring(0,localizado);
            System.out.println("\nVa a agregar una sub categoría 2 a la sub categoría 1 "+sub1Nombre);
            
            //2.- Obtener el nombre de la sub categoria 2 a agregar
            String sub2Nombre = JOptionPane.showInputDialog("Nombre de la sub categoría 2");
            
            if( sub2Nombre.isEmpty() == false ){
            
                //3.- Obtener la Categoria correspondiente a la sub categoria 1 que se le quiere agregar una sub categoria 2
                DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
                String categoriaNombreCompleto = arbol.getParent().toString();

                Integer categoriaAct = categoriaNombreCompleto.indexOf(" - Activado");
                Integer categoriaDes = categoriaNombreCompleto.indexOf(" - Desactivado");
                Integer locCategoria;

                if( categoriaAct > categoriaDes ){
                    locCategoria = categoriaAct;
                }else{
                    locCategoria = categoriaDes;
                }

                String categoriaNombre = categoriaNombreCompleto.substring(0,locCategoria);

                //4.- Obtener el id de la categoria
                CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
                System.out.println("Categoría nombre = "+categoriaNombre+", categoría id = "+categoriaId);

                //5.- Obtener el id (avanzado) de la sub categoria 1
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, categoriaId);
                System.out.println("Sub categoría 1 nombre = "+sub1Nombre+", sub categoría 1 id = "+sub1Id);
                
                //6.- Comprobar que no existe ya
                SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
                System.out.println("Comprobando la existencia de la sub categoría 2 "+sub2Nombre);
                Boolean existe = subCategoria2DaoImp.existe(sub2Nombre, sub1Id);
                
                if( existe == false ){
                    
                    System.out.println("La sub categoría 2 no existe");
                    
                    //7.- guarda la sub categoria
                    System.out.println("Guardando la sub categoría 2");
                    Boolean guardado = subCategoria2DaoImp.guardar(sub2Nombre,sub1Id);
                    
                    if( guardado == true ){
                        
                        System.out.println("Sub categoría 2 guardada con éxito");
                        JOptionPane.showMessageDialog(null, "Sub categoría 2 "+sub2Nombre+" guardada con éxito");
                        actualizar();
                        
                    }else{
                        System.out.println("No se pudo guardar la sub categoría 2");
                        JOptionPane.showMessageDialog(null, "No se pudo guardar la sub categoría 2");
                    }
                    
                }else{
                    System.out.println("La sub categoría 2 ya existe");
                    JOptionPane.showMessageDialog(null, "La sub categoría 2 "+sub2Nombre+" ya existe");
                }
                
            }else{
                System.out.println("\nNo se ingreso un nombre");
                JOptionPane.showMessageDialog(null, "No se ingreso un nombre");
            }
            
        }else{
            System.out.println("\nNo se puede agregar a un elemento desactivado");
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        }
    } //Ya

    private void agregarSubCateroria3(String nombreCompleto) throws Exception {
        
        //1.- Obtener toda la ruta (Categoria, sub categoria 1 y sub categoria 2)
        Integer localizarActivado = nombreCompleto.indexOf(" - Activado");
        String sub2NombreCompleto = nombreCompleto;
        
        if( localizarActivado > 0 ){
            
            String sub2Nombre = sub2NombreCompleto.substring(0,localizarActivado);
            System.out.println("\nVa a agregar una sub categoría 3 a la sub categoría 2 "+sub2Nombre);
            
            //2.- Obtener la sub categoria 3
            String sub3Nombre = JOptionPane.showInputDialog("Nombre de la sub categoría 3");
            
            if( sub3Nombre.isEmpty() == false ){
            
                DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
                String raiz = arbol.getRoot().toString();
                String sub1NombreCompleto = arbol.getParent().toString();
                TreeNode[] tn = arbol.getPath();
                String ruta = Arrays.toString(tn);
                String categoriaNombreCompleto = ruta.substring( ( raiz.length()+3 ) , ruta.length() - ( sub1NombreCompleto.length()+2 + sub2NombreCompleto.length()+3 ) );

                //3.- Independientemente de si esta activada desactivada obtener el nombre y el id de la categoria
                Integer categoriaAct = categoriaNombreCompleto.indexOf(" - Activado");
                Integer categoriaDes = categoriaNombreCompleto.indexOf(" - Desactivado");
                Integer locCategoria;
                
                if( categoriaAct > categoriaDes ){
                    locCategoria = categoriaAct;
                }else{
                    locCategoria = categoriaDes;
                }
                
                String categoriaNombre = categoriaNombreCompleto.substring(0, locCategoria);
                CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
                System.out.println("Categoría nombre = "+categoriaNombre+", categoría id = "+categoriaId);

                //4.- Independientemente de si esta activada desactivada obtener el nombre y el id de la sub categoria 1
                Integer sub1Act = sub1NombreCompleto.indexOf(" - Activado");
                Integer sub1Des = sub1NombreCompleto.indexOf(" - Desactivado");
                Integer locsub1;
                
                if( sub1Act > sub1Des ){
                    locsub1 = sub1Act;
                }else{
                    locsub1 = sub1Des;
                }
                
                String sub1Nombre = sub1NombreCompleto.substring(0, locsub1);
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, categoriaId);
                System.out.println("Sub categoría 1 nombre = "+sub1Nombre+", sub categoría 1 id = "+sub1Id);

                //5.- Obtener el id de la sub categoría 2
                SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
                Integer sub2Id = subCategoria2DaoImp.obtenerId(sub2Nombre, sub1Id);
                System.out.println("Sub categoría 2 nombre = "+sub2Nombre+", sub categoría 2 id = "+sub2Id);
                
                //6.- Comprobar si la sub categoria 3 existe
                SubCategoria3DaoImp subCategoria3DaoImp = new SubCategoria3DaoImp();
                System.out.println("Comprobando la existencia de la sub categoría 3 "+sub3Nombre);
                Boolean existe = subCategoria3DaoImp.existe(sub3Nombre, sub2Id);
                
                if( existe == false ){
                    
                    System.out.println("La sub categoría 3 no existe");
                    
                    //7.- Guardar la sub categoria 3
                    System.out.println("Guardando la sub categoría 3");
                    Boolean guardado = subCategoria3DaoImp.guardar(sub3Nombre, sub2Id);
                    
                    if( guardado == true ){
                        
                        System.out.println("Sub categoría 3 guardada con éxito");
                        JOptionPane.showMessageDialog(null, "Sub categoría 3 "+sub3Nombre+" guardada con éxito");
                        actualizar();
                        
                    }else{
                        System.out.println("No se pudo guardar la sub categoría 3");
                        JOptionPane.showMessageDialog(null, "No se pudo guardar la sub categoría 3");
                    }
                    
                }else{
                    System.out.println("La sub categoría 3 ya existe");
                    JOptionPane.showMessageDialog(null, "La sub categoría 3 "+sub3Nombre+" ya existe");
                }
                
            }else{
                System.out.println("\nNo se ingreso un nombre");
                JOptionPane.showMessageDialog(null, "No se ingreso un nombre");
            }
                
        }else{
            System.out.println("\nNo se puede agregar a un elemento desactivado");
            JOptionPane.showMessageDialog(null, "No se puede agregar a un elemento desactivado");
        }
    } //Ya
    
    //Modificar
    
    private void modificarCategoria(String nombreCompleto) throws Exception {
        
        //1.- Hay que obtener el nombre seleccionado (Sin estado activado) = nombre
        Integer localizado = nombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            
            String categoriaOldNave = nombreCompleto.substring(0,localizado);
            System.out.println("\nVa a modificar la categoría "+categoriaOldNave);
            
            //2.- Obtener el nuevo nombe
            String categoriaNewName = JOptionPane.showInputDialog("Nuevo nombre de la categoría "+categoriaOldNave);
            
            if( categoriaNewName.isEmpty() == false ){
                
                //3.- Comprbar que no exista
                CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                System.out.println("Comprobando la existencia de la categoría "+categoriaNewName);
                Boolean existe = categoriaDaoImp.existe(categoriaNewName);
                
                if( existe == false ){
                    
                    System.out.println("La categoria no existe");
                    
                    //4.- Obtener el id de la categoria a modificar
                    Integer categoriaId = categoriaDaoImp.obtenerId(categoriaOldNave);
                    System.out.println("Categoria id = "+categoriaId);
                    
                    //X.- modificar la categoria
                    System.out.println("Modificando la categoría");
                    Boolean modificado = categoriaDaoImp.modificar(categoriaId, categoriaNewName);
                    
                    if( modificado == true ){
                        
                        System.out.println("Categoría modificada con éxito");
                        JOptionPane.showMessageDialog(null, "Categoría "+categoriaOldNave+" modificada con éxito");
                        actualizar();
                        
                    }else{
                        System.out.println("La categoría no se pudo guardar");
                        JOptionPane.showMessageDialog(null, "La categoría "+categoriaOldNave+" no se pudo modificar");
                    }
                    
                }else{
                    System.out.println("La categoría ya existe");
                    JOptionPane.showMessageDialog(null, "La categoría "+categoriaNewName+" ya existe");
                }
            
            }else{
                System.out.println("\nNo se ingreso un nombre");
                JOptionPane.showMessageDialog(null, "No se ingreso un nombre");
            }
            
        }else{
            System.out.println("\nNo se puede modificar un elemento desactivado");
            JOptionPane.showMessageDialog(null, "No se puede modificar un elemento desactivado");
        }    
    } //Ya

    private void modificarSubCategoria1(String nombreCompleto) throws Exception {
        
        //1.- Primero hay que ver si la sub categoria 1 esta activada
        String sub1NombreCompleto = nombreCompleto;
        Integer localizado = sub1NombreCompleto.indexOf(" - Activado");
        
        if( localizado > 0 ){
            
            String sub1OldName = sub1NombreCompleto.substring(0, localizado);
            System.out.println("\nVa a modificar la sub categoría 1 "+sub1OldName);
            
            //2.- Obtener el nuevo nombre de la sub categoria 1
            String sub1NewName = JOptionPane.showInputDialog("Nuevo nombre de la sub categoría 1 "+sub1OldName);
            
            if( sub1NewName.isEmpty() == false ){
            
                //3.- Obtener el nombre y el id de la categoria
                DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
                String categoriaNombreCompleto = arbol.getParent().toString();

                Integer categoriaAct = categoriaNombreCompleto.indexOf(" - Activado");
                Integer categoriaDes = categoriaNombreCompleto.indexOf(" - Desactivado");
                Integer locCategoria;

                if( categoriaAct > categoriaDes ){
                    locCategoria = categoriaAct;
                }else{
                    locCategoria = categoriaDes;
                }

                String categoriaNombre = categoriaNombreCompleto.substring(0, locCategoria);
                CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
                System.out.println("Categoría nombre =  "+categoriaNombre+", categoria id = "+categoriaId);
                
                //4.- Comprobar que la sub cayegoria 1 no exista
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                System.out.println("Comprobanso la existencia de la sub categoría 1 "+sub1NewName);
                Boolean existe = subCategoria1DaoImp.existe(sub1NewName, categoriaId);
                
                if( existe == false ){
                    
                    System.out.println("La sub categoria 1 no existe");
                    
                    //5.- Obtener el id de la sub actegoria 1
                    Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1OldName, categoriaId);
                    System.out.println("Sub categoría 1 id = "+sub1Id);
                    
                    //6.- Modificar la sub categoria 1
                    System.out.println("Modificando la sub categoría 1");
                    Boolean modificado = subCategoria1DaoImp.modificar(sub1Id, sub1NewName);
                    
                    if( modificado == true ){
                        
                        System.out.println("Sub categoría 1 modificada con éxito");
                        JOptionPane.showMessageDialog(null, "Sub categoría 1 "+sub1OldName+" modificada con éxito");
                        actualizar();
                        
                    }else{
                        System.out.println("La sub categoría 1 no se pudo guardar");
                        JOptionPane.showMessageDialog(null, "La sub categoría 1 "+sub1OldName+" no se pudo modificar");
                    }
                    
                }else{
                    System.out.println("La sub categoría 1 ya existe");
                    JOptionPane.showMessageDialog(null, "La sub categoría 1 "+sub1NewName+" ya existe");
                }
            
            }else{
                System.out.println("\nNo se ingreso un nombre");
                JOptionPane.showMessageDialog(null, "No se ingreso un nombre");
            }
            
        }else{
            System.out.println("\nNo se puede modificar un elemento desactivado");
            JOptionPane.showMessageDialog(null, "No se puede modificar un elemento desactivado");
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
        
        //2.- Comprobar si la sub categoria 2 esta activada
        
        Integer localizarSub2 = sub2NombreCompleto.indexOf(" - Activado");
        
        if( localizarSub2 > 0 ){
            
            String sub2OldName = sub2NombreCompleto.substring(0, localizarSub2);
            System.out.println("\nVa a modificar la sub categoría 2 "+sub2OldName);
            
            //3.- Obtener el nuevo nombre de la sub categoría 2
            String sub2NewName = JOptionPane.showInputDialog("Nuevo nombre de la sub categoría 2 "+sub2OldName);
            
            if( sub2NewName.isEmpty() == false ){
                
                //4.-Ahora ay que obtener el nombre y el id de la categoría
                Integer categoriaAct = categoriaNombreCompleto.indexOf(" - Activado");
                Integer categoriaDes = categoriaNombreCompleto.indexOf(" - Desactivado");
                Integer locCategoria;
                
                if( categoriaAct > categoriaDes ){
                    locCategoria = categoriaAct;
                }else{
                    locCategoria = categoriaDes;
                }
                
                String categoriaNombre = categoriaNombreCompleto.substring(0, locCategoria);
                CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
                System.out.println("Categoría nombre =  "+categoriaNombre+", categoria id = "+categoriaId);
                
                //5.- Obtener el nombre y el id de sub categoria 1
                Integer sub1Act = sub1NombreCompelto.indexOf(" - Activado");
                Integer sub1Des = sub1NombreCompelto.indexOf(" - Desactivado");
                Integer locSub1;
                
                if( sub1Act > sub1Des ){
                    locSub1 = sub1Act;
                }else{
                    locSub1 = sub1Des;
                }
                
                String sub1Nombre = sub1NombreCompelto.substring(0, locSub1);
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, categoriaId);
                System.out.println("Sub categoria 1 nombre = "+sub1Nombre+", sub categoría 1 id = "+sub1Id);
                
                //6.- Comprobar que el nuevo nombre exista
                SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
                System.out.println("Comprobanso la existencia de la sub categoría 2 "+sub2NewName);
                Boolean existe = subCategoria2DaoImp.existe(sub2NewName, sub1Id);
                
                if( existe == false ){
                    
                    System.out.println("La sub categoria 2 no existe");
                    
                    //7.- Obtener el id de la sub categoria 2
                    Integer sub2Id = subCategoria2DaoImp.obtenerId(sub2OldName, sub1Id);
                    System.out.println("Sub categoría 2 id = "+sub2Id);
                    
                    //8.- Modificar la sub categoria 2
                    System.out.println("Modificando la sub categoría 2");
                    Boolean modificado = subCategoria2DaoImp.modificar(sub2Id, sub2NewName);
                    
                    if( modificado == true ){
                        
                        System.out.println("Sub categoría 2 modificada con éxito");
                        JOptionPane.showMessageDialog(null, "Sub categoría 2 "+sub2OldName+" modificada con éxito");
                        actualizar();
                        
                    }else{
                        System.out.println("La sub categoría 2 no se pudo guardar");
                        JOptionPane.showMessageDialog(null, "La sub categoría 2 "+sub2OldName+" no se pudo modificar");
                    }
                    
                }else{
                    System.out.println("La sub categoría 2 ya existe");
                    JOptionPane.showMessageDialog(null, "La sub categoría 2 "+sub2NewName+" ya existe");
                }
            
            }else{
                System.out.println("\nNo se ingreso un nombre");
                JOptionPane.showMessageDialog(null, "No se ingreso un nombre");
            }
            
        }else{
            System.out.println("\nNo se puede modificar un elemento desactivado");
            JOptionPane.showMessageDialog(null, "No se puede modificar un elemento desactivado");
        }
    } //Ya

    private void modificarSubCategoria3(String nombreCompleto) throws Exception {
        
        //1.-obtener los nombres de la categoris, sub 1, 2 y 3
        DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
        TreeNode[] rutaComplet = arbol.getPath();
        String ruta = Arrays.toString(rutaComplet);
        String raiz = arbol.getRoot().toString();
        String sub2NombreCompelto = arbol.getParent().toString();
        String sub3NombreCompleto = nombreCompleto;
        
        String reduccion1 = ruta.substring(raiz.length()+3, ruta.length());
        Integer loc1 = reduccion1.indexOf(", "+sub2NombreCompelto+", "+sub3NombreCompleto+"]");
        String reduccion2 = reduccion1.substring(0, loc1);
        
        Integer locSeparacion = reduccion2.indexOf(", ");
        String categoriaNombreCompleto = reduccion2.substring(0, locSeparacion);
        String sub1NombreCompelto = reduccion2.substring(categoriaNombreCompleto.length()+2, reduccion2.length());
        
        //2.- Comprobar que la sub categoría 3 esta activada
        Integer localizarSub3 = sub3NombreCompleto.indexOf(" - Activado");
        
        if( localizarSub3 > 0 ){
            
            //3.- obtener el nombre viejo de la sub categoria 3
            String sub3OldName = sub3NombreCompleto.substring(0, localizarSub3);
            System.out.println("\nVa a modificar la sub categoría 3 "+sub3OldName);
            
            //4.- obtener el nuevo nombre de la sub categoria 3
            String sub3NewName = JOptionPane.showInputDialog("Nuevo nombre de la sub categoría 3 "+sub3OldName);
            
            if( sub3NewName.isEmpty() == false ){
                
                //5.- Obtener nombre y el id de la categoria
                Integer categoriaAct = categoriaNombreCompleto.indexOf(" - Activado");
                Integer categoriaDes = categoriaNombreCompleto.indexOf(" - Desactivado");
                Integer locCategoria;
                
                if( categoriaAct > categoriaDes ){
                    locCategoria = categoriaAct;
                }else{
                    locCategoria = categoriaDes;
                }
                
                String categoriaNombre = categoriaNombreCompleto.substring(0, locCategoria);
                CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
                System.out.println("Categoría nombre =  "+categoriaNombre+", categoria id = "+categoriaId);
                
                //6.- Obteenr el nombre y el id de la sub categoria 1
                Integer sub1Act = sub1NombreCompelto.indexOf(" - Activado");
                Integer sub1Des = sub1NombreCompelto.indexOf(" - Desactivado");
                Integer locSub1;
                
                if( sub1Act > sub1Des ){
                    locSub1 = sub1Act;
                }else{
                    locSub1 = sub1Des;
                }
                
                String sub1Nombre = sub1NombreCompelto.substring(0, locSub1);
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, categoriaId);
                System.out.println("Sub categoria 1 nombre = "+sub1Nombre+", sub categoría 1 id = "+sub1Id);
                
                //7.- Obteenr el nombre y el id de la sub categoria 2
                Integer sub2Act = sub2NombreCompelto.indexOf(" - Activado");
                Integer sub2Des = sub2NombreCompelto.indexOf(" - Desactivado");
                Integer locSub2;
                
                if( sub2Act > sub2Des ){
                    locSub2 = sub2Act;
                }else{
                    locSub2 = sub2Des;
                }
                
                String sub2Nombre = sub2NombreCompelto.substring(0, locSub2);
                SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
                Integer sub2Id = subCategoria2DaoImp.obtenerId(sub2Nombre, sub1Id);
                System.out.println("Sub categoria 2 nombre = "+sub2Nombre+", sub categoría 2 id = "+sub2Id);
                
                //9.- Comprobar que el nuevo nombre de la sub categoria 3 existe
                SubCategoria3DaoImp subCategoria3DaoImp = new SubCategoria3DaoImp();
                System.out.println("Comprobanso la existencia de la sub categoría 3 "+sub3NewName);
                boolean existe = subCategoria3DaoImp.existe(sub3NewName, sub2Id);
                
                if( existe == false ){
                    
                    System.out.println("La sub categoria 3 no existe");
                    
                    //8.- Obteenr el id de la sub categoria 3
                    Integer sub3Id = subCategoria3DaoImp.obtenetId(sub3OldName, sub2Id);
                    System.out.println("Sub categoría 3 id = "+sub3Id);
                    
                    //10.- Modificar la sub categoria 3
                    System.out.println("Modificando la sub categoría 3");
                    Boolean modificada = subCategoria3DaoImp.modificar(sub3Id, sub3NewName);
                    
                    if( modificada == true ){
                        
                        System.out.println("Sub categoría 3 modificada con éxito");
                        JOptionPane.showMessageDialog(null, "Sub categoría 3 "+sub3OldName+" modificada con éxito");
                        actualizar();
                        
                    }else{
                        System.out.println("La sub categoría 3 no se pudo guardar");
                        JOptionPane.showMessageDialog(null, "La sub categoría 3 "+sub3OldName+" no se pudo modificar");
                    }
                
                }else{
                    System.out.println("La sub categoría 3 ya existe");
                    JOptionPane.showMessageDialog(null, "La sub categoría 3 "+sub3NewName+" ya existe");
                }
            
            }else{
                System.out.println("\nNo se ingreso un nombre");
                JOptionPane.showMessageDialog(null, "No se ingreso un nombre");
            }
        
        }else{
            System.out.println("\nNo se puede modificar un elemento desactivado");
            JOptionPane.showMessageDialog(null, "No se puede modificar un elemento desactivado");
        }
    } //Ya
    
    //Desactivaciones

    private void desactivarCategoria(String nombreCompleto) throws Exception {
        
        //1.- comprobar si la categoria esta activo
        String categoriaNombreCompleto = nombreCompleto;
        Integer locActivado = categoriaNombreCompleto.indexOf(" - Activado");
        
        if( locActivado > 0 ){
            
            String categoriaNombre = categoriaNombreCompleto.substring(0, locActivado);
            System.out.println("\nVa a desactivar la categoría "+categoriaNombre);
            
            //2.- Obteenr el id de la categoria
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
            System.out.println("Categoria id = "+categoriaId);
            
            //3.- Desactivar la categoria
            System.out.println("Desactivando la categpria");
            Boolean desactivado = categoriaDaoImp.desactivar(categoriaId);
            
            if( desactivado == true ){
                
                System.out.println("Categoría desactivada con éxito");
                JOptionPane.showMessageDialog(null, "Categoría "+categoriaNombre+" desactivada con éxito");
                actualizar();
                
            }else{
                System.out.println("No se pudo desactivar la categoría");
                JOptionPane.showMessageDialog(null, "No se pudo desactivar la ategoría "+categoriaNombre);
            }
        
        }else{
            System.out.println("\nEste elemento ya esta desactivado");
            JOptionPane.showMessageDialog(null, "Este elemento ya esta desactivado");
        }
    } //Ya

    private void desactivarSubCategoria1(String nombreCompleto) throws Exception {
        
        //1.- Comprobar si la sub categoria 1 esta activada
        String sub1NombreCompleto = nombreCompleto;
        Integer locSub1 = sub1NombreCompleto.indexOf(" - Activado");
        
        if( locSub1 > 0 ){
            
            String sub1Nombre = sub1NombreCompleto.substring(0, locSub1);
            System.out.println("\nVa a desactivar la sub categoría 1 "+sub1Nombre);
            
            DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
            
            //2.- Obtener el nombre y el id de la categoria
            String categoriaNombreCompleto = arbol.getParent().toString();
            Integer categoriaAct = categoriaNombreCompleto.indexOf(" - Activado");
            Integer categoriaDes = categoriaNombreCompleto.indexOf(" - Desactivado");
            Integer locCategoria;
            
            if( categoriaAct > categoriaDes ){
                locCategoria = categoriaAct;
            }else{
                locCategoria = categoriaDes;
            }
            
            String categoriaNombre = categoriaNombreCompleto.substring(0, locCategoria);
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
            System.out.println("Categoría nombre = "+categoriaNombre+", categoría id = "+categoriaId);
            
            //3.- Obteenr el id de la sub categoria 1
            SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
            Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, categoriaId);
            System.out.println("Sub categoria 1 id = "+sub1Id);
            
            //4.- desactivar la sub categoria 1
            System.out.println("Desactivando la sub categpria 1");
            Boolean desactivado = subCategoria1DaoImp.desactivar(sub1Id);
            
            if( desactivado == true ){
                
                System.out.println("Sub ategoría 1 desactivada con éxito");
                JOptionPane.showMessageDialog(null, "Sub categoría 1 "+sub1Nombre+" desactivada con éxito");
                actualizar();
                
            }else{
                System.out.println("No se pudo desactivar la sub categoría 1");
                JOptionPane.showMessageDialog(null, "No se pudo desactivar la sub ategoría 1 "+sub1Nombre);
            }
            
        }else{
            System.out.println("\nEste elemento ya esta desactivado");
            JOptionPane.showMessageDialog(null, "Este elemento ya esta desactivado");
        }
    } //Ya

    private void desactivarSubCategoria2(String nombreCompleto) throws Exception {
        
        //1.- comprobar si la sub categoria 2 esta activada
        String sub2NombreCompleto = nombreCompleto;
        Integer locSub2 = sub2NombreCompleto.indexOf(" - Activado");
        
        if( locSub2 > 0 ){
            
            String sub2Nombre = sub2NombreCompleto.substring(0, locSub2);
            System.out.println("\nVa a desactivar la sub categoría 2 "+sub2Nombre);
            
            DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
            String ruta = Arrays.toString(arbol.getPath());
            String raiz = arbol.getRoot().toString();
            String sub1NombreCompleto = arbol.getParent().toString();
            String categoriaNombreCompleto = ruta.substring( raiz.length()+3 , ruta.length() - ( ( sub1NombreCompleto.length()+2 ) + ( sub2NombreCompleto.length()+3 ) ) );
            
            //2.- Obtener el nombre y el id de la categoria
            Integer categoriaAct = categoriaNombreCompleto.indexOf(" - Activado");
            Integer categoriaDes = categoriaNombreCompleto.indexOf(" - Desactivado");
            Integer locCategoria;
            
            if( categoriaAct > categoriaDes ){
                locCategoria = categoriaAct;
            }else{
                locCategoria = categoriaDes;
            }
            
            String categoriaNombre = categoriaNombreCompleto.substring(0, locCategoria);
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
            System.out.println("Categoría nombre = "+categoriaNombre+", categoría id = "+categoriaId);
            
            //2.- Obtener el nombre y el id de la sub categoria 1
            Integer sub1Act = sub1NombreCompleto.indexOf(" - Activado");
            Integer sub1Des = sub1NombreCompleto.indexOf(" - Desactivado");
            Integer locSub1;
            
            if( sub1Act > sub1Des ){
                locSub1 = sub1Act;
            }else{
                locSub1 = sub1Des;
            }
            
            String sub1Nombre = sub1NombreCompleto.substring(0, locSub1);
            SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
            Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, categoriaId);
            System.out.println("Sub categoría 1 nombre = "+sub1Nombre+", sub categoría 1 id = "+sub1Id);
            
            //3.- Obtener el id de la sub categoria 2
            SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
            Integer sub2Id = subCategoria2DaoImp.obtenerId(sub2Nombre, sub1Id);
            System.out.println("Sub categoria 2 id = "+sub2Id);
            
            //4.- Desactivar la sub categoria 2
            System.out.println("Desactivando la sub categpria 2");
            Boolean desactivado = subCategoria2DaoImp.desactivar(sub2Id);
            
            if( desactivado == true ){
                
                System.out.println("Sub ategoría 2 desactivada con éxito");
                JOptionPane.showMessageDialog(null, "Sub categoría 2 "+sub2Nombre+" desactivada con éxito");
                actualizar();
                
            }else{
                System.out.println("No se pudo desactivar la sub categoría 2");
                JOptionPane.showMessageDialog(null, "No se pudo desactivar la sub ategoría 2 "+sub2Nombre);
            }
            
        }else{
            System.out.println("\nEste elemento ya esta desactivado");
            JOptionPane.showMessageDialog(null, "Este elemento ya esta desactivado");
        }
    } //Ya

    private void desactivarSubCategoria3(String nombreCompleto) throws Exception {
        
        //1.- Comprobar si ña sub categoria 3 esta activada
        String sub3NombreCompleto = nombreCompleto;
        Integer locSub3 = sub3NombreCompleto.indexOf(" - Activado");
        
        if( locSub3 > 0 ){
            
            String sub3Nombre = sub3NombreCompleto.substring(0, locSub3);
            System.out.println("\nVa a desactivar la sub categoría 3 "+sub3Nombre);
            
            DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
            String ruta = Arrays.toString(arbol.getPath());
            String raiz = arbol.getRoot().toString();
            String sub2NombreCompleto = arbol.getParent().toString();
            String catSub1 = ruta.substring( raiz.length() + 3 , ruta.length() - ( ( sub2NombreCompleto.length() + 2 ) + ( sub3NombreCompleto.length() + 3 ) ) );
            
            Integer locPt1 = catSub1.indexOf(", ");
            String categoriaNombreCompleto = catSub1.substring(0, locPt1);
            String sub1NombreCompleto = catSub1.substring(locPt1+2, catSub1.length());
            
            //2.- Obtener el nombre y el id de la categoria
            Integer categoriaAct = categoriaNombreCompleto.indexOf(" - Activado");
            Integer categoriaDes = categoriaNombreCompleto.indexOf(" - Desactivado");
            Integer locCategoria;
            
            if( categoriaAct > categoriaDes ){
                locCategoria = categoriaAct;
            }else{
                locCategoria = categoriaDes;
            }
            
            String categoriaNombre = categoriaNombreCompleto.substring(0, locCategoria);
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
            System.out.println("Categoría nombre = "+categoriaNombre+", categoría id = "+categoriaId);
            
            //3.- Obtener el nombre y el id de la sub categoria 1 
            Integer sub1Act = sub1NombreCompleto.indexOf(" - Activado");
            Integer sub1Des = sub1NombreCompleto.indexOf(" - Desactivado");
            Integer locSub1;
            
            if( sub1Act > sub1Des ){
                locSub1 = sub1Act;
            }else{
                locSub1 = sub1Des;
            }
            
            String sub1Nombre = sub1NombreCompleto.substring(0, locSub1);
            SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
            Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, categoriaId);
            System.out.println("Sub categoría 1 nombre = "+sub1Nombre+", sub categoría 1 id = "+sub1Id);
            
            //4.- Obtener el nombre y el id de la sub categoria 2
            Integer sub2Act = sub2NombreCompleto.indexOf(" - Activado");
            Integer sub2Des = sub2NombreCompleto.indexOf(" - Desactivado");
            Integer locSub2;
            
            if( sub2Act > sub2Des ){
                locSub2 = sub2Act;
            }else{
                locSub2 = sub2Des;
            }
            
            String sub2Nombre = sub2NombreCompleto.substring(0, locSub2);
            SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
            Integer sub2Id = subCategoria2DaoImp.obtenerId(sub2Nombre, sub1Id);
            System.out.println("Sub categoría 2 nombre = "+sub2Nombre+", sub categoría 2 id = "+sub2Id);
            
            //5.- Obtener el nombre y el id de la sub categoria 3
            SubCategoria3DaoImp subCategoria3DaoImp = new SubCategoria3DaoImp();
            Integer sub3Id = subCategoria3DaoImp.obtenetId(sub3Nombre, sub2Id);
            System.out.println("Sub categoria 3 id = "+sub3Id);
            
            //6.- Desactivar sub categoria 3
            System.out.println("Desactivando la sub categpria 3");
            Boolean desactivado = subCategoria3DaoImp.desactivar(sub3Id);
            
            if( desactivado == true ){
                
                System.out.println("Sub ategoría 3 desactivada con éxito");
                JOptionPane.showMessageDialog(null, "Sub categoría 3 "+sub3Nombre+" desactivada con éxito");
                actualizar();
                
            }else{
                System.out.println("No se pudo desactivar la sub categoría 3");
                JOptionPane.showMessageDialog(null, "No se pudo desactivar la sub ategoría 3 "+sub3Nombre);
            }
            
        }else{
            System.out.println("\nEste elemento ya esta desactivado");
            JOptionPane.showMessageDialog(null, "Este elemento ya esta desactivado");
        }
    } //Ya
    
    //Activaciones

    private void activarCategoria(String nombreCompleto) throws Exception {
        
        //1.- comprobar si la categoria esta desactivada
        String categoriaNombreCompleto = nombreCompleto;
        Integer locDesctivado = categoriaNombreCompleto.indexOf(" - Desactivado");
        
        if( locDesctivado > 0 ){
            
            String categoriaNombre = categoriaNombreCompleto.substring(0, locDesctivado);
            System.out.println("\nVa a activar la categoría "+categoriaNombre);
            
            //2.- Obteenr el id de la categoria
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
            System.out.println("Categoria id = "+categoriaId);
            
            //3.- Desactivar la categoria
            System.out.println("Activando la categpria");
            Boolean activado = categoriaDaoImp.activar(categoriaId);
            
            if( activado == true ){
                
                System.out.println("Categoría activada con éxito");
                JOptionPane.showMessageDialog(null, "Categoría "+categoriaNombre+" activada con éxito");
                actualizar();
                
            }else{
                System.out.println("No se pudo activar la categoría");
                JOptionPane.showMessageDialog(null, "No se pudo activar la ategoría "+categoriaNombre);
            }
        
        }else{
            System.out.println("\nEste elemento ya esta activado");
            JOptionPane.showMessageDialog(null, "Este elemento ya esta activado");
        }
    } //Ya

    private void activarSubCategoria1(String nombreCompleto) throws Exception {
        
        //1.- Comprobar si la sub categoria 1 esta desactivada
        String sub1NombreCompleto = nombreCompleto;
        Integer locSub1 = sub1NombreCompleto.indexOf(" - Desactivado");
        
        if( locSub1 > 0 ){
            
            String sub1Nombre = sub1NombreCompleto.substring(0, locSub1);
            System.out.println("\nVa a activar la sub categoría 1 "+sub1Nombre);
            
            DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
            
            //2.- Obtener el nombre y el id de la categoria
            String categoriaNombreCompleto = arbol.getParent().toString();
            Integer categoriaAct = categoriaNombreCompleto.indexOf(" - Activado");
            Integer categoriaDes = categoriaNombreCompleto.indexOf(" - Desactivado");
            Integer locCategoria;
            
            if( categoriaAct > categoriaDes ){
                locCategoria = categoriaAct;
            }else{
                locCategoria = categoriaDes;
            }
            
            String categoriaNombre = categoriaNombreCompleto.substring(0, locCategoria);
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
            System.out.println("Categoría nombre = "+categoriaNombre+", categoría id = "+categoriaId);
            
            //3.- Obteenr el nombre y el id de la sub categoria 1
            SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
            Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, categoriaId);
            System.out.println("Sub categoria 1 id = "+sub1Id);
            
            //4.- activar la sub categoria 1
            System.out.println("Activando la sub categpria 1");
            Boolean activado = subCategoria1DaoImp.activar(sub1Id);
            
            if( activado == true ){
                
                System.out.println("Sub ategoría 1 activada con éxito");
                JOptionPane.showMessageDialog(null, "Sub categoría 1 "+sub1Nombre+" activada con éxito");
                actualizar();
                
            }else{
                System.out.println("No se pudo activar la sub categoría 1");
                JOptionPane.showMessageDialog(null, "No se pudo activar la sub ategoría 1 "+sub1Nombre);
            }
            
        }else{
            System.out.println("\nEste elemento ya esta activado");
            JOptionPane.showMessageDialog(null, "Este elemento ya esta activado");
        }
    } //Ya

    private void activarSubCategoria2(String nombreCompleto) throws Exception {
        
        //1.- comprobar si la sub categoria 2 esta desactivada
        String sub2NombreCompleto = nombreCompleto;
        Integer locSub2 = sub2NombreCompleto.indexOf(" - Desactivado");
        
        if( locSub2 > 0 ){
            
            String sub2Nombre = sub2NombreCompleto.substring(0, locSub2);
            System.out.println("\nVa a activar la sub categoría 2 "+sub2Nombre);
            
            DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
            String ruta = Arrays.toString(arbol.getPath());
            String raiz = arbol.getRoot().toString();
            String sub1NombreCompleto = arbol.getParent().toString();
            String categoriaNombreCompleto = ruta.substring( raiz.length()+3 , ruta.length() - ( ( sub1NombreCompleto.length()+2 ) + ( sub2NombreCompleto.length()+3 ) ) );
            
            //2.- Obtener el nombre y el id de la categoria
            Integer categoriaAct = categoriaNombreCompleto.indexOf(" - Activado");
            Integer categoriaDes = categoriaNombreCompleto.indexOf(" - Desactivado");
            Integer locCategoria;
            
            if( categoriaAct > categoriaDes ){
                locCategoria = categoriaAct;
            }else{
                locCategoria = categoriaDes;
            }
            
            String categoriaNombre = categoriaNombreCompleto.substring(0, locCategoria);
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
            System.out.println("Categoría nombre = "+categoriaNombre+", categoría id = "+categoriaId);
            
            //2.- Obtener el nombre y el id de la sub categoria 1
            Integer sub1Act = sub1NombreCompleto.indexOf(" - Activado");
            Integer sub1Des = sub1NombreCompleto.indexOf(" - Desactivado");
            Integer locSub1;
            
            if( sub1Act > sub1Des ){
                locSub1 = sub1Act;
            }else{
                locSub1 = sub1Des;
            }
            
            String sub1Nombre = sub1NombreCompleto.substring(0, locSub1);
            SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
            Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, categoriaId);
            System.out.println("Sub categoría 1 nombre = "+sub1Nombre+", sub categoría 1 id = "+sub1Id);
            
            //3.- Obtener el id de la sub categoria 2
            SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
            Integer sub2Id = subCategoria2DaoImp.obtenerId(sub2Nombre, sub1Id);
            System.out.println("Sub categoria 2 id = "+sub2Id);
            
            //4.- activar la sub categoria 2
            System.out.println("Activando la sub categpria 2");
            Boolean activado = subCategoria2DaoImp.activar(sub2Id);
            
            if( activado == true ){
                
                System.out.println("Sub ategoría 2 activada con éxito");
                JOptionPane.showMessageDialog(null, "Sub categoría 2 "+sub2Nombre+" activada con éxito");
                actualizar();
                
            }else{
                System.out.println("No se pudo activar la sub categoría 2");
                JOptionPane.showMessageDialog(null, "No se pudo activar la sub ategoría 2 "+sub2Nombre);
            }
            
        }else{
            System.out.println("\nEste elemento ya esta activado");
            JOptionPane.showMessageDialog(null, "Este elemento ya esta activado");
        }
    } //Ya

    private void activarSubCategoria3(String nombreCompleto) throws Exception {
        
        //1.- Comprobar si ña sub categoria 3 esta desactivada
        String sub3NombreCompleto = nombreCompleto;
        Integer locSub3 = sub3NombreCompleto.indexOf(" - Desactivado");
        
        if( locSub3 > 0 ){
            
            String sub3Nombre = sub3NombreCompleto.substring(0, locSub3);
            System.out.println("\nVa a activar la sub categoría 3 "+sub3Nombre);
            
            DefaultMutableTreeNode arbol = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
            String ruta = Arrays.toString(arbol.getPath());
            String raiz = arbol.getRoot().toString();
            String sub2NombreCompleto = arbol.getParent().toString();
            String catSub1 = ruta.substring( raiz.length() + 3 , ruta.length() - ( ( sub2NombreCompleto.length() + 2 ) + ( sub3NombreCompleto.length() + 3 ) ) );
            
            Integer locPt1 = catSub1.indexOf(", ");
            String categoriaNombreCompleto = catSub1.substring(0, locPt1);
            String sub1NombreCompleto = catSub1.substring(locPt1+2, catSub1.length());
            
            //2.- Obtener el nombre y el id de la categoria
            Integer categoriaAct = categoriaNombreCompleto.indexOf(" - Activado");
            Integer categoriaDes = categoriaNombreCompleto.indexOf(" - Desactivado");
            Integer locCategoria;
            
            if( categoriaAct > categoriaDes ){
                locCategoria = categoriaAct;
            }else{
                locCategoria = categoriaDes;
            }
            
            String categoriaNombre = categoriaNombreCompleto.substring(0, locCategoria);
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
            System.out.println("Categoría nombre = "+categoriaNombre+", categoría id = "+categoriaId);
            
            //3.- Obtener el nombre y el id de la sub categoria 1 
            Integer sub1Act = sub1NombreCompleto.indexOf(" - Activado");
            Integer sub1Des = sub1NombreCompleto.indexOf(" - Desactivado");
            Integer locSub1;
            
            if( sub1Act > sub1Des ){
                locSub1 = sub1Act;
            }else{
                locSub1 = sub1Des;
            }
            
            String sub1Nombre = sub1NombreCompleto.substring(0, locSub1);
            SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
            Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, categoriaId);
            System.out.println("Sub categoría 1 nombre = "+sub1Nombre+", sub categoría 1 id = "+sub1Id);
            
            //4.- Obtener el nombre y el id de la sub categoria 2
            Integer sub2Act = sub2NombreCompleto.indexOf(" - Activado");
            Integer sub2Des = sub2NombreCompleto.indexOf(" - Desactivado");
            Integer locSub2;
            
            if( sub2Act > sub2Des ){
                locSub2 = sub2Act;
            }else{
                locSub2 = sub2Des;
            }
            
            String sub2Nombre = sub2NombreCompleto.substring(0, locSub2);
            SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
            Integer sub2Id = subCategoria2DaoImp.obtenerId(sub2Nombre, sub1Id);
            System.out.println("Sub categoría 2 nombre = "+sub2Nombre+", sub categoría 2 id = "+sub2Id);
            
            //5.- Obtener el nombre y el id de la sub categoria 3
            SubCategoria3DaoImp subCategoria3DaoImp = new SubCategoria3DaoImp();
            Integer sub3Id = subCategoria3DaoImp.obtenetId(sub3Nombre, sub2Id);
            System.out.println("Sub categoria 3 id = "+sub3Id);
            
            //6.- Activar sub categoria 3
            System.out.println("Activando la sub categpria 3");
            Boolean activado = subCategoria3DaoImp.activar(sub3Id);
            
            if( activado == true ){
                
                System.out.println("Sub ategoría 3 activada con éxito");
                JOptionPane.showMessageDialog(null, "Sub categoría 3 "+sub3Nombre+" activada con éxito");
                actualizar();
                
            }else{
                System.out.println("No se pudo activar la sub categoría 3");
                JOptionPane.showMessageDialog(null, "No se pudo activar la sub ategoría 3 "+sub3Nombre);
            }
            
        }else{
            System.out.println("\nEste elemento ya esta activado");
            JOptionPane.showMessageDialog(null, "Este elemento ya esta activado");
        }
    } //Ya
    
    //Ayudas
    
    private void actualizar() throws Exception {
        
        Point localizacion = this.getLocationOnScreen();
        Integer ancho = this.getWidth();
        Integer alto = this.getHeight();
        this.dispose();
        
        ListarCategorias listarCategorias = new ListarCategorias();
        listarCategorias.setLocation(localizacion);
        listarCategorias.setSize(ancho, alto);
        listarCategorias.setVisible(true);
    }
}
