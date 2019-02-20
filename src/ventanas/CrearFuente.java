package ventanas;

import dao.implementaciones.DetalleFuentesDaoImp;
import tablas.Fuentes;
import dao.implementaciones.FuenteDaoImp;
import java.util.List;
import javax.swing.JOptionPane;
import tablas.DetalleFuentes;

public class CrearFuente extends javax.swing.JFrame {

    public CrearFuente() throws Exception {
        
        initComponents();
        setTitle("Fichero 2.0 / Crear fuente");
        this.setLocationRelativeTo(null);
        
        listarFuentes();
        
        txtDetalle.setLineWrap(true);
        txtDetalle.setWrapStyleWord(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFooter = new javax.swing.JLabel();
        lblFuente = new javax.swing.JLabel();
        cbFuente = new javax.swing.JComboBox();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblDetalles = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalle = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblFooter.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alcántar");

        lblFuente.setText("Tipo de fuente:");

        lblTitulo.setText("Título");

        lblDetalles.setText("Detalles");

        txtDetalle.setColumns(20);
        txtDetalle.setRows(5);
        jScrollPane1.setViewportView(txtDetalle);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDetalles)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFuente)
                                    .addComponent(lblTitulo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbFuente, 0, 340, Short.MAX_VALUE)
                                    .addComponent(txtTitulo)))
                            .addComponent(jScrollPane1))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFuente)
                    .addComponent(cbFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblDetalles)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnGuardar))
                .addGap(15, 15, 15)
                .addComponent(lblFooter))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        try {
            
            System.out.println("----- Cerrando ventana: crear fuente -----\n");
            this.dispose();
            ListarFuente listarFuente = new ListarFuente();
            listarFuente.setVisible(true);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Antes que todo... compriobar que haya algo qur guardar
        if( txtTitulo.getText().isEmpty() == false && cbFuente.getSelectedIndex() > 0 ){
            
            DetalleFuentes detalleFuentes = new DetalleFuentes();
            detalleFuentes.setId(0);
            
            //1.- Obtenerl el nombre de la fuente y tambien el id
            String fuenteNombre = cbFuente.getSelectedItem().toString();
            FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
            detalleFuentes.setFuenteId(fuenteDaoImp.obtenerId(fuenteNombre));
            System.out.println("Fuente nombre = "+fuenteNombre+", fuente id = "+detalleFuentes.getFuenteId());

            //2.- obtener el titulo de ña fuente
            detalleFuentes.setTitulo(txtTitulo.getText());

            //3.- Obtener los detalles de la funete
            detalleFuentes.setDetalle(txtDetalle.getText());
            
            //4.- Ahora hay qur comprobar qye no exista
            DetalleFuentesDaoImp detalleFuentesDaoImp = new DetalleFuentesDaoImp();
            System.out.println("Comprobando la existencia de la fuente "+detalleFuentes.getTitulo());
            boolean existe = detalleFuentesDaoImp.existe(detalleFuentes.getFuenteId(), detalleFuentes.getTitulo(), detalleFuentes.getDetalle());
            
            if( existe == false ){
                
                System.out.println("La fuente "+detalleFuentes.getTitulo()+" no éxiste");
                boolean guardado = detalleFuentesDaoImp.guardar(detalleFuentes);
                
                if( guardado == true ){
                    
                    try {
                        
                        System.out.println("Fuente "+detalleFuentes.getTitulo()+" guardada con éxito\n");
                        JOptionPane.showMessageDialog(null, "Fuente "+detalleFuentes.getTitulo()+" guardada con éxito");
                        this.dispose();
                        
                        ListarFuente listarFuente = new ListarFuente();
                        listarFuente.setVisible(true);
                        
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    
                }else{
                    System.out.println("La fuente "+detalleFuentes.getTitulo()+" no se guardo\n");
                    JOptionPane.showMessageDialog(null, "La fuente "+detalleFuentes.getTitulo()+" no se guardo");
                }
                
            }else{
                System.out.println("La fuente "+detalleFuentes.getTitulo()+" ya existe\n");
                JOptionPane.showMessageDialog(null, "La fuente "+detalleFuentes.getTitulo()+" ya existe");
            }
            
        }else{
            System.out.println("\nDebe mínimo de seleccionar un tipo de fuente e ingresar un título\n");
            JOptionPane.showMessageDialog(null, "Debe mínimo de seleccionar un tipo de fuente e ingresar un título");
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

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
                    
                    new CrearFuente().setVisible(true);
                    
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox cbFuente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDetalles;
    private javax.swing.JLabel lblFooter;
    private javax.swing.JLabel lblFuente;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtDetalle;
    private javax.swing.JTextField txtTitulo;
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
