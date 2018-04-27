package ventanas;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class listarFuente extends javax.swing.JFrame {
    
    Connection conexion = null;
    
    public listarFuente() throws ClassNotFoundException {
        initComponents();
        setTitle("Fichero 2.0 / Fuentes");
        this.setLocationRelativeTo(null);
        
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
        btnActualizar = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        jLabel2.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alántar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alántar");

        tblFuentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFuentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuentesMouseClicked(evt);
            }
        });
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

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(247, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar)
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3))
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

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        
        String nombre = JOptionPane.showInputDialog(null, "Nombre de la nueva Fuente");
        
        if( nombre.isEmpty() ){
            JOptionPane.showMessageDialog(null, "No se ingeso una fuente");
        }else{
            
            System.out.println("Guardando fuente: " + nombre );
            
            conexion = ConexionBD.obtenerConexion();
            Statement statement = null;
            PreparedStatement preparedStatement;
            boolean guardado = false;
            
            try {
                
                ConexionBD.obtenerConexion();
                preparedStatement = conexion.prepareStatement("INSERT INTO fuentes (nombre) VALUES (?)");
                preparedStatement.setString(1, nombre);
                preparedStatement.executeUpdate();
                
                guardado = true;
                System.out.println("Fuente " + nombre + " giardada" );
                
                conexion = ConexionBD.cerrarConexion();
                
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            
            if( guardado == true ){
                JOptionPane.showMessageDialog(null, "Fuente guardada");
                
                actualizar();
                
            }else{
                JOptionPane.showMessageDialog(null, "Fuente no guardada");
            }
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tblFuentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuentesMouseClicked
        // TODO add your handling code here:
        
        if( evt.getClickCount() == 2 ){
            
            DefaultTableModel modeloFuente  = (DefaultTableModel) tblFuentes.getModel();
        
            String nombre = String.valueOf(modeloFuente.getValueAt(tblFuentes.getSelectedRow(),1));
            String id = String.valueOf(modeloFuente.getValueAt(tblFuentes.getSelectedRow(), 0));
        
            System.out.println("Fuente a modificar: "+nombre);
            
            String nvoNombre = JOptionPane.showInputDialog(null, "Mofificar fuente: "+nombre);
            
            if( nvoNombre.isEmpty() == true || nvoNombre.equals(nombre) ){
                JOptionPane.showMessageDialog(null, "No se modifico Fuente "+nombre);
            }else{
                
                conexion = ConexionBD.obtenerConexion();
                Statement statement = null;
                PreparedStatement preparedStatement;
                boolean mofificado = false;
                
                System.out.println("Modificando fuente de "+ nombre + " a "+ nvoNombre );
            
                try {

                    Integer columnaId = Integer.parseInt(id);

                    ConexionBD.obtenerConexion();
                    preparedStatement = conexion.prepareStatement("UPDATE fuentes SET nombre = ? WHERE id = ?");
                    preparedStatement.setString(1, nvoNombre);
                    preparedStatement.setInt(2, columnaId);
                    preparedStatement.executeUpdate();

                    mofificado = true;

                    conexion = ConexionBD.cerrarConexion();

                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());

                } catch (ClassNotFoundException ex) {
                    System.out.println(ex.getMessage());
                }

                if( mofificado == true ){

                    JOptionPane.showMessageDialog(null, "Fuente modificada");
                    actualizar();

                }else{
                    JOptionPane.showMessageDialog(null, "Fuente no modificada");
                }
            }
        }
    }//GEN-LAST:event_tblFuentesMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new listarFuente().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(listarFuente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFuentes;
    // End of variables declaration//GEN-END:variables

    private void listarFuentes() throws ClassNotFoundException {
        
        Connection conexion = null;
        
        try {
            conexion = ConexionBD.obtenerConexion();
            ResultSet resultSet;
            String dts[] = new String[2];
            DefaultTableModel modelo = (DefaultTableModel) tblFuentes.getModel();
            
            String sql = "SELECT * FROM fuentes;";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            conexion = ConexionBD.cerrarConexion();
            
            while (resultSet.next()) {
                dts[0] = resultSet.getString(1);
                dts[1] = resultSet.getString(2);
                modelo.addRow(dts);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
        }
    
    }

    private void actualizar() {
        this.setVisible(false);
        
        try {
            new listarFuente().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(listarFuente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
