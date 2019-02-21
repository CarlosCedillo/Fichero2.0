package ventanas;

import dao.implementaciones.DetalleFuentesDaoImp;
import dao.implementaciones.FuenteDaoImp;
import java.sql.Connection;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import tablas.DetalleFuentes;

public class ListarFuente extends javax.swing.JFrame {
    
    Connection conexion = null;
    
    public ListarFuente() throws ClassNotFoundException, Exception {
        
        initComponents();
        setTitle("Fichero 2.0 / Fuentes");
        this.setLocationRelativeTo(null);
        
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblFuentes.getModel();
        defaultTableModel.addColumn("Tipo"); //0  
        defaultTableModel.addColumn("Título"); //1
        defaultTableModel.addColumn("Detalle"); //2
        listarFuentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuentes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        jLabel2.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alántar");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alcántar");

        tblFuentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblFuentes);

        jLabel1.setText("Listado de Fuentes");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(800, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        this.dispose();
        System.out.println("\n----- Cerrando ventana: fuentes -----\n");
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        
        try {
            
            System.out.println("\n----- Abriendo ventana: crear fuente -----\n");
            CrearFuente creFuente = new CrearFuente();
            this.dispose();
            creFuente.setVisible(true);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        System.out.println("\n----- Abriendo ventana: modificar fuente -----\n");
        modificarFuente();
        
    }//GEN-LAST:event_btnModificarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListarFuente().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    System.out.println(ex.getMessage());
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFuentes;
    // End of variables declaration//GEN-END:variables

    private void listarFuentes() throws ClassNotFoundException, Exception {
        
        DetalleFuentesDaoImp detalleFuentesDaoImp = new DetalleFuentesDaoImp();
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblFuentes.getModel();
        List<DetalleFuentes> ListaDetalles;
        
        ListaDetalles = detalleFuentesDaoImp.listaDetalles();
        
        for( DetalleFuentes detalleFuentes : ListaDetalles ){
            
            DetalleFuentes temp = new DetalleFuentes();
            temp.setFuenteId(detalleFuentes.getFuenteId());
            temp.setTitulo(detalleFuentes.getTitulo());
            temp.setDetalle(detalleFuentes.getDetalle());
            
            String[] lista = new String[3];
            lista[0] = obtenerFuenteTipo( temp.getFuenteId() );
            lista[1] = temp.getTitulo();
            lista[2] = temp.getDetalle();
            defaultTableModel.addRow(lista);
            
        }
    }
    
    private String obtenerFuenteTipo(Integer fuenteId) {
        
        FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
        String fuenteNombre = fuenteDaoImp.obtenerNombre(fuenteId);
        System.out.println("Fuente di = "+fuenteId+", fuente nombre = "+fuenteNombre);
        
        return fuenteNombre;
        
    }

    private void modificarFuente() {
        
        try {
            
            DefaultTableModel defaultTableModel = (DefaultTableModel) tblFuentes.getModel();
            DetalleFuentesDaoImp detalleFuentesDaoImp = new DetalleFuentesDaoImp();
            
            String fuenteNombre = (String) defaultTableModel.getValueAt(tblFuentes.getSelectedRow(), 0);
            String titulo = (String) defaultTableModel.getValueAt(tblFuentes.getSelectedRow(), 1);
            String detalle = (String) defaultTableModel.getValueAt(tblFuentes.getSelectedRow(), 2);
            
            Integer detalleId = detalleFuentesDaoImp.obtenerId(titulo);
            
            ModificarFuente modificarFuente = new ModificarFuente();
            ModificarFuente.txtFuenteNombre.setText(fuenteNombre);
            ModificarFuente.txtTitulo.setText(titulo);
            ModificarFuente.txtDetalles.setText(detalle);
            ModificarFuente.txtDetalleId.setText(detalleId.toString());

            modificarFuente.setVisible(true);
            this.dispose();
                
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
