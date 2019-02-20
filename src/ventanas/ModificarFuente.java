package ventanas;

import dao.implementaciones.DetalleFuentesDaoImp;
import tablas.Fuentes;
import dao.implementaciones.FuenteDaoImp;
import java.util.List;
import javax.swing.JOptionPane;
import tablas.DetalleFuentes;

public class ModificarFuente extends javax.swing.JFrame {
    
    public ModificarFuente() throws Exception {
        
        initComponents();
        setTitle("Fichero 2.0 / Modificar fuente");
        this.setLocationRelativeTo(null);
        
        listarFuentes();
        
        txtDetalles.setLineWrap(true);
        txtDetalles.setWrapStyleWord(true);
        txtDetalleId.setHorizontalAlignment(txtDetalleId.CENTER);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblFuente = new javax.swing.JLabel();
        cbFuente = new javax.swing.JComboBox();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblDetalles = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalles = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtFuenteNombre = new javax.swing.JTextField();
        lblDetalleId = new javax.swing.JLabel();
        txtDetalleId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alcántar");

        lblFuente.setText("Tipo de fuente:");

        cbFuente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFuenteItemStateChanged(evt);
            }
        });

        lblTitulo.setText("Título");

        lblDetalles.setText("Detalles");

        txtDetalles.setColumns(20);
        txtDetalles.setRows(5);
        jScrollPane1.setViewportView(txtDetalles);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        txtFuenteNombre.setEditable(false);

        lblDetalleId.setText("Fuente Id");

        txtDetalleId.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFuente)
                                    .addComponent(lblTitulo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTitulo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFuenteNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbFuente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDetalles)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(lblDetalleId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDetalleId, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDetalleId)
                    .addComponent(txtDetalleId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFuenteNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFuente)
                        .addComponent(cbFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblDetalles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnModificar))
                .addGap(15, 15, 15)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        try {
            
            System.out.println("\n----- Cerrando ventana: modificar fuente -----\n");
            this.dispose();
            ListarFuente listarFuente = new ListarFuente();
            listarFuente.setVisible(true);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        //1.- Comprobar haya algo que guardar
        if( txtTitulo.getText().isEmpty() == false ){
            
            //2.- Obtener el id del detalle
            Integer detalleId = Integer.parseInt(txtDetalleId.getText());
            
            //3.- Obtener el nombre y el id de la fuente
            String fuenteNombre = txtFuenteNombre.getText();
            FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
            Integer fuenteId = fuenteDaoImp.obtenerId(fuenteNombre);
            System.out.println("Fuente nombre = "+fuenteNombre+", fuente id = "+fuenteId);
            
            //4.- Obtener  el titulo
            String titulo = txtTitulo.getText();
            
            //5.- Obtener  el detalle
            String detalle = txtDetalles.getText();
            
            //6.- Comprobar que el nuevo detalle de fuente no exista
            DetalleFuentesDaoImp detalleFuentesDaoImp = new DetalleFuentesDaoImp();
            System.out.println("Comprobando la existencia de la fuente "+titulo);
            boolean existe = detalleFuentesDaoImp.existe(fuenteId, titulo, detalle);
            
            if( existe == false ){
                
                System.out.println("La fuente "+titulo+" no éxiste");
                
                DetalleFuentes detalleFuentes = new DetalleFuentes();
                detalleFuentes.setId(detalleId);
                detalleFuentes.setFuenteId(fuenteId);
                detalleFuentes.setTitulo(titulo);
                detalleFuentes.setDetalle(detalle);
                
                //7.- Modificar el detalle
                boolean modificado = detalleFuentesDaoImp.modificar(detalleFuentes);
                
                if( modificado == true ){
                    
                    try {
                        
                        System.out.println("Fuente "+detalleFuentes.getTitulo()+" modificada con éxito\n");
                        JOptionPane.showMessageDialog(null, "Fuente "+detalleFuentes.getTitulo()+" modificada con éxito");
                        this.dispose();
                        
                        ListarFuente listarFuente = new ListarFuente();
                        listarFuente.setVisible(true);
                        
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    
                }else{
                    System.out.println("La fuente "+detalleFuentes.getTitulo()+" no se modifico\n");
                    JOptionPane.showMessageDialog(null, "La fuente "+detalleFuentes.getTitulo()+" no se modifico");
                }
                
            }else{
                System.out.println("La fuente "+titulo+" ya existe\n");
                JOptionPane.showMessageDialog(null, "La fuente "+titulo+" ya existe");
            }
            
        }else{
            System.out.println("\nDebes mínimo de llenar el campo de título\n");
            JOptionPane.showMessageDialog(null, "Debes mínimo de llenar el campo de título");
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void cbFuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFuenteItemStateChanged
        
        if( cbFuente.getSelectedIndex() > 0 ){
            txtFuenteNombre.setText(cbFuente.getSelectedItem().toString());
        }
        
    }//GEN-LAST:event_cbFuenteItemStateChanged

    public static void main(String args[]) {
        
        try {
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    
                    new ModificarFuente().setVisible(true);
                    
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    public static javax.swing.JComboBox cbFuente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDetalleId;
    private javax.swing.JLabel lblDetalles;
    private javax.swing.JLabel lblFuente;
    private javax.swing.JLabel lblTitulo;
    public static javax.swing.JTextField txtDetalleId;
    public static javax.swing.JTextArea txtDetalles;
    public static javax.swing.JTextField txtFuenteNombre;
    public static javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    private void listarFuentes() throws Exception {
        
        cbFuente.addItem("--Seleccione--");
        
        FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
        List<Fuentes> listaFuentes;

        listaFuentes = fuenteDaoImp.listar();
        
        for( Fuentes fuentes : listaFuentes ){
            
            Fuentes temp = new Fuentes();
            temp.setId(fuentes.getId());
            temp.setNombre(fuentes.getNombre());
            
            cbFuente.addItem(temp);
            
        }
    }
}
