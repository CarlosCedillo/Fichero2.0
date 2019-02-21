package ventanas;

import dao.implementaciones.CategoriaDaoImp;
import dao.implementaciones.DetalleFuentesDaoImp;
import dao.implementaciones.SubCategoria1DaoImp;
import dao.implementaciones.SubCategoria2DaoImp;
import dao.implementaciones.SubCategoria3DaoImp;
import dao.implementaciones.FichaDaoImp;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;
import tablas.Categorias;
import tablas.DetalleFuentes;
import tablas.Fichas;
import tablas.SubCategorias1;
import tablas.SubCategorias2;
import tablas.SubCategorias3;

public class ModificarFicha extends javax.swing.JFrame {
    
    Integer oldCategoriaId, oldSub1Id, oldSub2Id, oldSub3Id, oldFuenteId;
    String oldTexto;
    
    public ModificarFicha() throws ClassNotFoundException, Exception {
        
        initComponents();
        setTitle("Fichero 2.0 / Modificar ");
        this.setLocationRelativeTo(null);
        
        txtFicha.setLineWrap(true);
        txtFicha.setWrapStyleWord(true);
        
        cbSub1.disable();
        cbSub2.disable();
        cbSub3.disable();
        
        listarCategorias();
        listarFuentes();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtSub1 = new javax.swing.JTextField();
        txtSub2 = new javax.swing.JTextField();
        txtSub3 = new javax.swing.JTextField();
        txtFuente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFicha = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        cbCategoria = new javax.swing.JComboBox();
        cbFuente = new javax.swing.JComboBox();
        cbSub1 = new javax.swing.JComboBox();
        cbSub2 = new javax.swing.JComboBox();
        cbSub3 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alcántar");

        jLabel1.setText("Ficha Id");

        jLabel2.setText("Categoría");

        jLabel4.setText("Sub categoría 1");

        jLabel5.setText("Sub categoría 2");

        jLabel6.setText("Sub categoría 3");

        jLabel7.setText("Fuente");

        txtId.setEditable(false);

        txtCategoria.setEditable(false);

        txtSub1.setEditable(false);

        txtSub2.setEditable(false);

        txtSub3.setEditable(false);

        txtFuente.setEditable(false);

        txtFicha.setColumns(20);
        txtFicha.setRows(5);
        txtFicha.setText("\n");
        jScrollPane1.setViewportView(txtFicha);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        cbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoriaItemStateChanged(evt);
            }
        });

        cbFuente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFuenteItemStateChanged(evt);
            }
        });

        cbSub1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSub1ItemStateChanged(evt);
            }
        });

        cbSub2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSub2ItemStateChanged(evt);
            }
        });

        cbSub3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSub3ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(txtCategoria)
                                .addComponent(txtSub1)
                                .addComponent(txtSub2)
                                .addComponent(txtSub3)
                                .addComponent(txtFuente))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbFuente, 0, 228, Short.MAX_VALUE)
                                .addComponent(cbSub1, 0, 228, Short.MAX_VALUE)
                                .addComponent(cbSub2, 0, 228, Short.MAX_VALUE)
                                .addComponent(cbSub3, 0, 228, Short.MAX_VALUE)))))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnRegresar))
                .addGap(21, 21, 21)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoriaItemStateChanged

        if( cbCategoria.getSelectedIndex() > 0 ){
            
            try {
                
                txtCategoria.setText(cbCategoria.getSelectedItem().toString());
                
                txtSub1.setText("");
                txtSub2.setText("");
                txtSub3.setText("");
                
                cbSub1.enable();
                cbSub1.removeAllItems();
                cbSub1.addItem("--Seleccione--");
                
                //1.- Obtener el id de la categoria
                String categoriaNombre = txtCategoria.getText();
                CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
                
                //2.- obtener el listado de las sub 1 correspondientea a la categoria
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                List<SubCategorias1> listaSub1 = subCategoria1DaoImp.listar(categoriaId);
                
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
                System.out.println(ex.getMessage());
            }
            
        }
        
    }//GEN-LAST:event_cbCategoriaItemStateChanged

    private void cbSub1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSub1ItemStateChanged
        
        if( cbSub1.getSelectedIndex() > 0 ){
            
            try {
                
                txtSub1.setText(cbSub1.getSelectedItem().toString());
                
                cbSub2.enable();
                cbSub2.removeAllItems();
                cbSub2.addItem("--Seleccione--");
                
                //1.- Obtener el id de la categoria
                String categoriaNombre = txtCategoria.getText();
                CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
                
                //2.- obteter el id de la sub 1
                String sub1Nombre = txtSub1.getText();
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, categoriaId);
                
                //3.- Obtener el listdo de la sub 2
                SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
                List<SubCategorias2> listaSub2 = subCategoria2DaoImp.listar(sub1Id);
                
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
                System.out.println(ex.getMessage());
            }
            
        }
        
    }//GEN-LAST:event_cbSub1ItemStateChanged

    private void cbSub2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSub2ItemStateChanged
        
        if( cbSub2.getSelectedIndex() > 0 ){
        
            try {
                
                txtSub2.setText(cbSub2.getSelectedItem().toString());
                
                cbSub3.enable();
                cbSub3.removeAllItems();
                cbSub3.addItem("--Seleccione--");
                
                //1.- Obtener id de la categori
                String categoriaNombre = txtCategoria.getText();
                CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
                
                //2.- obteter el id de la sub 1
                String sub1Nombre = txtSub1.getText();
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, categoriaId);
                
                //2.- obteter el id de la sub 2
                String sub2Nombre = txtSub2.getText();
                SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
                Integer sub2Id = subCategoria2DaoImp.obtenerId(sub2Nombre, sub1Id);
                
                //3.- obteenr la lista de sub 3
                SubCategoria3DaoImp subCategoria3DaoImp = new SubCategoria3DaoImp();
                List<SubCategorias3> listaSub3 = subCategoria3DaoImp.listar(sub2Id);
                
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
                System.out.println(ex.getMessage());
            }
        
        }
        
    }//GEN-LAST:event_cbSub2ItemStateChanged

    private void cbSub3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSub3ItemStateChanged
        
        if( cbSub3.getSelectedIndex() > 0 ){
            txtSub3.setText(cbSub3.getSelectedItem().toString());
        }
        
    }//GEN-LAST:event_cbSub3ItemStateChanged

    private void cbFuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFuenteItemStateChanged
        
        if( cbFuente.getSelectedIndex() > 0 ){
            txtFuente.setText(cbFuente.getSelectedItem().toString());
        }
        
    }//GEN-LAST:event_cbFuenteItemStateChanged

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        this.dispose();
        System.out.println("----- Cerrando ventana: modificar ficha -----\n");
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        try {
            
            Integer fichaId = Integer.valueOf(txtId.getText());
            
            //Obteenr el nombre y el id de la categoria
            CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
            String categoriaNombre = txtCategoria.getText();
            System.out.println("\nObteniendo el id de la categoria "+categoriaNombre);
            Integer newCategoriId = categoriaDaoImp.obtenerId(categoriaNombre);
            
            //Obtener el nombre y el id de la sub 1
            Integer newSub1Id = 0;
            String sub1Nombre = null;
            
            if( txtSub1.getText() != "" ){
                
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                sub1Nombre = txtSub1.getText();
                System.out.println("\nObteniendo el id de la sub categoria 1 "+sub1Nombre);
                newSub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, newCategoriId);
                
            }
            
            //Obtener el nombre y el id de la sub 2
            Integer newSub2Id = 0;
            String sub2Nombre = null;
            
            if( txtSub2.getText() != "" ){
            
                SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
                sub2Nombre = txtSub2.getText();
                System.out.println("\nObteniendo el id de la sub categoria 2 "+sub2Nombre);
                newSub2Id = subCategoria2DaoImp.obtenerId(sub2Nombre, newSub1Id);
            
            }
            
            //Obtener el nombre y el id de la sub 3
            Integer newSub3Id = 0;
            String sub3Nombre = null;
            
            if( txtSub3.getText() != "" ){
                
                SubCategoria3DaoImp subCategoria3DaoImp = new SubCategoria3DaoImp();
                sub3Nombre = txtSub3.getText();
                System.out.println("\nObteniendo el id de la sub categoria 3 "+sub3Nombre);
                newSub3Id = subCategoria3DaoImp.obtenerId(sub3Nombre, newSub2Id);
            
            }
            
            //Obtener el nombre y el id de la fuente
                DetalleFuentesDaoImp detalleFuentesDaoImp = new DetalleFuentesDaoImp();
                String fuenteTitulo = txtFuente.getText();
                System.out.println("\nObteniendo el id de la fuente "+fuenteTitulo);
                Integer newFuenteId = detalleFuentesDaoImp.obtenerId(fuenteTitulo);
            
            //Obtener el texto
            String newTexto = txtFicha.getText();
            
            //Imprimiendo los datos nuevos y los viejos
            
            System.out.println("\nDatos nuevos de la ficha");
            System.out.println("Categoria nombre = "+categoriaNombre+", id = "+newCategoriId);
            System.out.println("Sub categoria 1 nombre = "+sub1Nombre+", id = "+newSub1Id);
            System.out.println("Sub categoria 2 nombre = "+sub2Nombre+", id = "+newSub2Id);
            System.out.println("Sub categoria 3 nombre = "+sub3Nombre+", id = "+newSub3Id);
            System.out.println("Fuente titulo = "+fuenteTitulo+", id = "+newFuenteId);
            System.out.println("Texto = "+newTexto);
            
            buscarFicha(fichaId);
            
            System.out.println("\nDatos viejos de la ficha");
            System.out.println("Categoria id = "+oldCategoriaId);
            System.out.println("Sub categoria 1 id = "+oldSub1Id);
            System.out.println("Sub categoria 2 id = "+oldSub2Id);
            System.out.println("Sub categoria 3 id = "+oldSub3Id);
            System.out.println("Fuente id = "+oldFuenteId);
            System.out.println("Texto = "+oldTexto+"\n");
            
            if( ( !Objects.equals(newCategoriId, oldCategoriaId) ) || ( !Objects.equals(newSub1Id, oldSub1Id) ) || ( !Objects.equals(newSub2Id, oldSub2Id) ) ||
                   ( !Objects.equals(newSub3Id, oldSub3Id) ) || ( !Objects.equals(newFuenteId, oldFuenteId) ) || ( !Objects.equals(newTexto, oldTexto) ) ){
                
                //Modificar la ficha
                FichaDaoImp fichaDaoImp = new FichaDaoImp();
                boolean modificado = fichaDaoImp.modificar(fichaId, newCategoriId, newSub1Id, newSub2Id, newSub3Id, newFuenteId, newTexto);
                
                if( modificado == true ){
                    
                    System.out.println("Ficha modificada con éxito");
                    JOptionPane.showMessageDialog(null, "Ficha No. "+fichaId+" modificada con éxito");
                    this.dispose();
                    
                    BuscarFicha buscarFicha = new BuscarFicha();
                    buscarFicha.setVisible(true);
                    
                }else{
                    System.out.println("La ficha no se pudo modificar");
                    JOptionPane.showMessageDialog(null, "La ficha no se pudo modificar");
                }
                
                
            }else{
                System.out.println("No se modifico la ficha");
                JOptionPane.showMessageDialog(null, "No se modifico la ficha "+fichaId);
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JComboBox cbFuente;
    private javax.swing.JComboBox cbSub1;
    private javax.swing.JComboBox cbSub2;
    private javax.swing.JComboBox cbSub3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txtCategoria;
    public static javax.swing.JTextArea txtFicha;
    public static javax.swing.JTextField txtFuente;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtSub1;
    public static javax.swing.JTextField txtSub2;
    public static javax.swing.JTextField txtSub3;
    // End of variables declaration//GEN-END:variables

    private void listarCategorias() throws Exception {
        
        CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
        cbCategoria.addItem("--Seleccione--");
        
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

    private void listarFuentes() {
        
        DetalleFuentesDaoImp detalleFuentesDaoImp = new DetalleFuentesDaoImp();
        cbFuente.addItem("--Seleccione--");
        
        for( DetalleFuentes detalleFuentes : detalleFuentesDaoImp.listaDetalles() ){
            
            DetalleFuentes temp = new DetalleFuentes();
            temp.setId(detalleFuentes.getId());
            temp.setFuenteId(detalleFuentes.getFuenteId());
            temp.setTitulo(detalleFuentes.getTitulo());
            temp.setDetalle(detalleFuentes.getDetalle());
            cbFuente.addItem(temp);
            
        }
        
    }

    private void buscarFicha(Integer fichaId) throws Exception {
        
        FichaDaoImp fichaDaoImp = new FichaDaoImp();
        System.out.println("\nObteneido los datos viejos de la ficha");
        List<Fichas> contenido = fichaDaoImp.buscarNoFicha(fichaId);
        
        for( Fichas fichas : contenido ){
        
            Fichas temp = new Fichas();
            temp.setCategoria(fichas.getCategoria());
            temp.setSubCategoia1(fichas.getSubCategoia1());
            temp.setSubCategoia2(fichas.getSubCategoia2());
            temp.setSubCategoia3(fichas.getSubCategoia3());
            temp.setFuente(fichas.getFuente());
            temp.setTexto(fichas.getTexto());
            
            oldCategoriaId = temp.getCategoria();
            oldSub1Id = temp.getSubCategoia1();
            oldSub2Id = temp.getSubCategoia2();
            oldSub3Id = temp.getSubCategoia3();
            oldFuenteId = temp.getFuente();
            oldTexto = temp.getTexto();
            
        }
        
    }
    
}
