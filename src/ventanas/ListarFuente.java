package ventanas;

import dao.implementaciones.FuenteDaoImp;
import java.awt.Point;
import java.sql.Connection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tablas.Fuentes;

public class ListarFuente extends javax.swing.JFrame {
    
    Connection conexion = null;
    
    public ListarFuente() throws ClassNotFoundException, Exception {
        
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
        btnModificar = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        jLabel2.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alántar");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alcántar");

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
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(264, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
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
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar)
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        this.dispose();
        System.out.println("Cerrando: fuentes");
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        try {
        
            System.out.println("\nVa a agregar una fuente");

            //1.- Obteenr el nombre de la fuente
            String fuenteNombre = JOptionPane.showInputDialog("Nombre de la fuente");

            if( fuenteNombre.isEmpty() == false ){

                //2.- comprobar que la fuente no exista
                FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
                System.out.println("Comprobando la existencia de la fuente "+fuenteNombre);
                Boolean existe = fuenteDaoImp.existe(fuenteNombre);

                if( existe == false ){

                    System.out.println("La fuente no existe");

                    //3.- guardar la fuente
                    boolean guardado = fuenteDaoImp.guardar(fuenteNombre);

                    if( guardado == true ){

                        System.out.println("Fuente guardada con éxito");
                        JOptionPane.showMessageDialog(null, "Fuente "+fuenteNombre+" guardada con éxito");
                        actualizar();
                            
                    }else{
                        System.out.println("No se pudo guardar la fuente");
                        JOptionPane.showMessageDialog(null, "No se pudo guardar la fuente "+fuenteNombre);
                    }

                }else{
                    System.out.println("La fuente ya existe");
                    JOptionPane.showMessageDialog(null, "La fuente "+fuenteNombre+" ya existe");
                }

            }else{
                System.out.println("\nNo se ingreso un nombre");
                JOptionPane.showMessageDialog(null, "No se ingreso un nombre");
            }
        
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tblFuentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuentesMouseClicked
        
        if( evt.getClickCount() == 2 ){
            
            DefaultTableModel modeloFuente  = (DefaultTableModel) tblFuentes.getModel();
        
            String fuenteOldName = String.valueOf(modeloFuente.getValueAt(tblFuentes.getSelectedRow(),1));
            
            FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
            System.out.println("\nObteneindo el id de la fuente "+fuenteOldName);
            Integer fuenteId = fuenteDaoImp.obtenerId(fuenteOldName);
            
            modificarFuente(fuenteOldName, fuenteId);
            
        }
        
    }//GEN-LAST:event_tblFuentesMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        DefaultTableModel modeloFuente  = (DefaultTableModel) tblFuentes.getModel();
        
        String fuenteOldName = String.valueOf(modeloFuente.getValueAt(tblFuentes.getSelectedRow(),1));
        
        FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
        System.out.println("\nObteneindo el id de la fuente "+fuenteOldName);
        Integer fuenteId = fuenteDaoImp.obtenerId(fuenteOldName);
        
        modificarFuente(fuenteOldName, fuenteId);
        
    }//GEN-LAST:event_btnModificarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListarFuente().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ListarFuente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ListarFuente.class.getName()).log(Level.SEVERE, null, ex);
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
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tblFuentes.getModel();
        FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
        
        List<Fuentes> listaFuentes = fuenteDaoImp.listar();
        
        for( Fuentes fuentes : listaFuentes ){
            
            Fuentes temp = new Fuentes();
            temp.setId(fuentes.getId());
            temp.setNombre(fuentes.getNombre());
            
            String[] fuenteDatos = new String[2];
            fuenteDatos[0] = temp.getId().toString();
            fuenteDatos[1] = temp.getNombre();
            
            modeloTabla.addRow(fuenteDatos);
            
        }
    }
    
    private void actualizar() throws Exception{
        
        Point localizacion = this.getLocationOnScreen();
        Integer ancho = this.getWidth();
        Integer alto = this.getHeight();
        this.dispose();
        
        ListarFuente listarFuente = new ListarFuente();
        listarFuente.setLocation(localizacion);
        listarFuente.setSize(ancho, alto);
        listarFuente.setVisible(true);
        
    }

    private void modificarFuente(String fuenteOldName, Integer fuenteId) {
        
        System.out.println("\nVa a modificar la fuente "+fuenteOldName);
        
        //1.- Obtener el nuevo nombre
        String fuenteNewName = JOptionPane.showInputDialog("Nuevo nombre de la fuente "+fuenteOldName);
        
        if( fuenteNewName.isEmpty() == false ){
            
            //2.- Comprobando la existencia de el nuevo nombre
            FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
            System.out.println("Comprobando la existencia del nuevo nombre = "+fuenteNewName);
            boolean existe = fuenteDaoImp.existe(fuenteNewName);
            
            if( existe == false ){
                
                System.out.println("La fuente no existe");
                
                //3.- modificar la fuente
                System.out.println("Modificando la fuente");
                boolean modificada = fuenteDaoImp.modificar(fuenteId, fuenteNewName);
                
                if( modificada == true ){
                
                    try {
                        
                        System.out.println("Fuente modificada con éxito");
                        JOptionPane.showMessageDialog(null, "Fuente "+fuenteOldName+" modificada con éxito");
                        actualizar();
                        
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    
                }else{
                    System.out.println("No se pudo modificar la fuente");
                    JOptionPane.showMessageDialog(null, "No se pudo modificar la fuente");
                }
                
            }else{
                System.out.println("La fuente ya existe");
                JOptionPane.showMessageDialog(null, "La fuente "+fuenteNewName+" ya existe");
            }
        
        }else{
            System.out.println("\nNo se ingreso un nombre");
            JOptionPane.showMessageDialog(null, "No se ingreso un nombre");
        }
        
    }
}
