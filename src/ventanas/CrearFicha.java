package ventanas;

import dao.implementaciones.CategoriaDaoImp;
import dao.implementaciones.FuenteDaoImp;
import dao.implementaciones.SubCategoria1DaoImp;
import dao.implementaciones.SubCategoria2DaoImp;
import dao.implementaciones.SubCategoria3DaoImp;
import dao.implementaciones.FichaDaoImp;
import java.sql.Connection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tablas.Categorias;
import tablas.Fuentes;
import tablas.SubCategorias1;
import tablas.SubCategorias2;
import tablas.SubCategorias3;

public class CrearFicha extends javax.swing.JFrame {
    
    Connection conexion = null;

    public CrearFicha() throws ClassNotFoundException, Exception {
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
        
        txtTexto.setLineWrap(true);
        txtTexto.setWrapStyleWord(true);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();
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
        cbCategoria = new javax.swing.JComboBox();
        cbSub2 = new javax.swing.JComboBox();
        btnCategorias = new javax.swing.JButton();
        btnFuentes = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alcántar");

        txtTexto.setColumns(20);
        txtTexto.setRows(5);
        jScrollPane1.setViewportView(txtTexto);

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

        lblCategoria.setText("Categoría");

        lblSub1.setText("Sub Categoría 1");

        cbSub1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSub1ItemStateChanged(evt);
            }
        });

        lblSub3.setText("Sub Categoría 3");

        lblSub2.setText("Sub Categoría 2");

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

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
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
                                                .addGap(100, 100, 100)
                                                .addComponent(btnActualizar)
                                                .addGap(0, 0, Short.MAX_VALUE)))))))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1)))
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
                    .addComponent(btnFuentes)
                    .addComponent(btnActualizar))
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
        
        if( cbCategoria.getSelectedIndex()== 0 || cbFuente.getSelectedIndex()== 0 || txtTexto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe seleccionar mínimo una categoría y una fuente y llenar el campo de texto de la ficha");
        }else{
            
            Integer catrgoriaId, sub1Id, Sub2Id, Sub3Id, fuenteId;
            String texto, categoriaNombre, sub1Nombre = null, sub2Nombre = null, sub3Nombre = null, fuenteNombre;
            
            //1.- Obtener el id de la categoria
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            categoriaNombre = cbCategoria.getSelectedItem().toString();
            
            catrgoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
            
            //2.- Obtener el id de la sub categoria 1
            if( cbSub1.getSelectedIndex() > 0 ){
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                sub1Nombre = cbSub1.getSelectedItem().toString();
                
                sub1Id = subCategoria1DaoImp.obtenetIdAvanzado(sub1Nombre, catrgoriaId);
                
            }else{
                sub1Id = 0;
            }
            
            //3.- Obtener el id de la sub categoria 2
            if( cbSub2.getSelectedIndex() > 0 ){
                SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
                sub2Nombre = cbSub2.getSelectedItem().toString();
                
                Sub2Id = subCategoria2DaoImp.obtenetIdAvanzado(sub2Nombre, sub1Id);
                
            }else{
                Sub2Id = 0;
            }
            
            //4.- Obtener el id de la sub categoria 3
            if( cbSub3.getSelectedIndex() > 0 ){
                SubCategoria3DaoImp subCategoria3DaoImp = new SubCategoria3DaoImp();
                sub3Nombre = cbSub3.getSelectedItem().toString();
                
                Sub3Id = subCategoria3DaoImp.obtenetIdAvanzado(sub3Nombre, Sub2Id);
                
            }else{
                Sub3Id = 0;
            }
            
            //5.- Obtener el id de la fuente
            FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
            fuenteNombre = cbFuente.getSelectedItem().toString();
            
            fuenteId = fuenteDaoImp.obtenerId(fuenteNombre);
            
            //6.- Obtener el contenido de la ficha
            texto = txtTexto.getText();
            
            //7.- Mostrar los parametros (en consola)
            System.out.println("\n--- Parametros de la nueva ficha ---");
            System.out.println("    Categoria = "+categoriaNombre+" Id = "+catrgoriaId);
            System.out.println("    Sub categoria 1 = "+sub1Nombre+" Id = "+sub1Id);
            System.out.println("    Sub categoria 2 = "+sub2Nombre+" Id = "+Sub2Id);
            System.out.println("    Sub categoria 3 = "+sub3Nombre+" Id = "+Sub3Id);
            System.out.println("    Fuente = "+fuenteNombre+" Id = "+fuenteId);
            System.out.println("    Texto = "+texto+"\n");
            
            //8.- Guardar la ficha
            FichaDaoImp fichaDaoImp = new FichaDaoImp();
            Boolean guardado = fichaDaoImp.guardar(catrgoriaId, sub1Id, Sub2Id, Sub3Id, fuenteId, texto);
            
            if( guardado == true ){
                JOptionPane.showMessageDialog(null, "Ficha guardada con éxito");
                actualizar();
            }else{
                JOptionPane.showMessageDialog(null, "Hubo un error al guardar la ficha");
            }
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        this.setVisible(false);
        System.out.println("\n----- Cerrando ventana crear -----");
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoriaItemStateChanged
        // Esto es para cuando se seleccione una categoria se activen las subcategorias1 correspondientes
        
        if( cbCategoria.getSelectedIndex() == 0 ){
        }else{
            
            try {
                
                cbSub1.enable();
                cbSub1.removeAllItems();
                
                String categoriaNombre = cbCategoria.getSelectedItem().toString();
                
                //1.- Obtener el id de la categoria seleccionada
                CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                
                System.out.println("\nObteniendo el id de la categoria "+categoriaNombre);
                Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
                System.out.println("la categoria "+categoriaNombre+" tiene el id = "+categoriaId);
                
                //2.- Obtener las sub categorias 1 correspondientes a la categoria
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                
                System.out.println("\nObteniendo las sub categoria 1 de la categoria "+categoriaNombre);
                List<SubCategorias1> listaSub1 = subCategoria1DaoImp.listar(categoriaId);
                
                cbSub1.addItem("--Seleccione--");
                
                for( SubCategorias1 subCategorias1 : listaSub1 ){
                    
                    SubCategorias1 temp = new SubCategorias1();
                    temp.setId(subCategorias1.getId());
                    temp.setIdCategoria(subCategorias1.getIdCategoria());
                    temp.setNombre(subCategorias1.getNombre());
                    temp.setActivo(subCategorias1.isActivo());
                    
                    if( temp.isActivo() == true ){
                        cbSub1.addItem(temp);
                    }
                }
                
            } catch (Exception ex) {
                Logger.getLogger(CrearFicha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_cbCategoriaItemStateChanged

    private void cbSub1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSub1ItemStateChanged
        // Esto es para cuando se seleccione una subcategoria1 se activen las subcategorias2 correspondientes
        
        if( cbSub1.isEnabled() == true && cbSub1.getSelectedIndex() > 0 ){
            
            try {
                
                cbSub2.enable();
                cbSub2.removeAllItems();
                
                String sub1Nombre = cbSub1.getSelectedItem().toString();
                
                //1.- Obtener el id de la sub categoria 1 seleccionada
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                
                System.out.println("\nObteniendo el id de la sub categoria 1 "+sub1Nombre);
                Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre);
                System.out.println("la sub categoria 1 "+sub1Nombre+" tiene el id "+sub1Id);
                
                //2.- Obtener las sub categorias 2 correspondientes a la sub categoria 1
                SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
                
                System.out.println("\nObteniendo las sub categoria 2 de la sub categoria 1 "+sub1Nombre);
                List<SubCategorias2>  listaSub2 = subCategoria2DaoImp.listar(sub1Id);
                
                cbSub2.addItem("--Seleccione--");
                
                for( SubCategorias2 subCategorias2 : listaSub2 ){
                    
                    SubCategorias2 temp = new SubCategorias2();
                    temp.setId(subCategorias2.getId());
                    temp.setIdSubCategoria1(subCategorias2.getIdSubCategoria1());
                    temp.setNombre(subCategorias2.getNombre());
                    temp.setActivo(subCategorias2.isActivo());
                    
                    if( temp.isActivo() == true ){
                        cbSub2.addItem(temp);
                    }
                }
                
            } catch (Exception ex) {
                Logger.getLogger(CrearFicha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_cbSub1ItemStateChanged

    private void cbSub2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSub2ItemStateChanged
        // Esto es para cuando se seleccione una subcategoria2 se activen las subcategorias3 correspondientes
        
        if( cbSub2.isEnabled() == true && cbSub2.getSelectedIndex() > 0 ){
                
            try {
                
                cbSub3.enable();
                cbSub3.removeAllItems();
                
                String sub2Nombre = cbSub2.getSelectedItem().toString();
                
                //1.- Obtener el id de la sub categoria 2 seleccionada
                SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
                
                System.out.println("\nObteniendo el id de la sub categoria 2 "+sub2Nombre);
                Integer sub2Id = subCategoria2DaoImp.obtenerId(sub2Nombre);
                System.out.println("la sub categoria 2 "+sub2Nombre+" tiene el id "+sub2Id);
                
                //2.- Obtener las sub categorias 3 correspondientes a la sub categoria 2
                SubCategoria3DaoImp subCategoria3DaoImp = new SubCategoria3DaoImp();
                
                System.out.println("\nObteniendo las sub categoria 3 de la sub categoria 2 "+sub2Nombre);
                List<SubCategorias3>  listaSub3 = subCategoria3DaoImp.listar(sub2Id);
                
                cbSub3.addItem("--Seleccione--");
                
                for( SubCategorias3 subCategorias3 : listaSub3 ){
                    
                    SubCategorias3 temp = new SubCategorias3();
                    temp.setId(subCategorias3.getId());
                    temp.setIdSubCategoria2(subCategorias3.getIdSubCategoria2());
                    temp.setNombre(subCategorias3.getNombre());
                    temp.setActivo(subCategorias3.isActivo());
                    
                    if( temp.isActivo() == true ){
                        cbSub3.addItem(temp);
                    }
                }
                
            } catch (Exception ex) {
                Logger.getLogger(CrearFicha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_cbSub2ItemStateChanged

    private void btnFuentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuentesActionPerformed
        
        ListarFuente listarFuente = null;
        try {
            
            listarFuente = new ListarFuente();
            
            System.out.println("Abriendo ventana: modificacion de fuentes");
            listarFuente.setVisible(true);
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnFuentesActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        cbCategoria.setSelectedIndex(0);
        
        cbSub1.setSelectedIndex(-1);
        cbSub1.disable();
        
        cbSub2.setSelectedIndex(-1);
        cbSub2.disable();
        
        cbSub3.setSelectedIndex(-1);
        cbSub3.disable();
        
        cbFuente.setSelectedIndex(0);
        
        txtTexto.setText("");
        
        System.out.println("Limpiando ventana crear");
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        
        try {
            
            ListarCategorias listarCategorias = new ListarCategorias();
            System.out.println("Abriendo ventana: modificacion de categorias");
            listarCategorias.setVisible(true);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
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
    private javax.swing.JLabel lblSub1;
    private javax.swing.JLabel lblSub2;
    private javax.swing.JLabel lblSub3;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables

    private void enlistarCategorias() throws ClassNotFoundException, Exception {
        
        CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
        
        for( Categorias categorias : categoriaDaoImp.listar() ){
            Categorias temp = new Categorias();
            temp.setId(categorias.getId());
            temp.setNombre(categorias.getNombre());
            temp.setActivo(categorias.isActivo());
            
            if( temp.isActivo() == true ){
                cbCategoria.addItem(temp);
            }
        }
    }
    
    private void enlistarFuentes() throws ClassNotFoundException, Exception {
        
        FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
        
        for( Fuentes fuentes : fuenteDaoImp.listar() ){
            Fuentes temp = new Fuentes();
            temp.setId(fuentes.getId());
            temp.setNombre(fuentes.getNombre());
            cbFuente.addItem(temp);
        }
    }

    private void actualizar() {
        try {
            
            this.dispose();
            
            CrearFicha jframe = new CrearFicha();
            System.out.println("Actualizando crear fichas");
            jframe.setVisible(true);
            
        } catch (Exception ex) {
            Logger.getLogger(CrearFicha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
