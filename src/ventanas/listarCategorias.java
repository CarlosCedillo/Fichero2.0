package ventanas;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import tablas.Categorias;
import tablas.SubCategorias1;
import tablas.SubCategorias2;
import tablas.SubCategorias3;

public class listarCategorias extends javax.swing.JFrame {
    
    Connection conexion = null;
    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Categorias");     //Raiz
    DefaultMutableTreeNode nodo;                                                //Categorias
    DefaultMutableTreeNode subNodo1;                                            //Sub Categorias1
    DefaultMutableTreeNode subNodo2;                                            //Sub Categorias2
    Categorias categorias = new Categorias();
    SubCategorias1 subCategorias1 = new SubCategorias1();
    SubCategorias2 subCategorias2 = new SubCategorias2();
    SubCategorias3 subCategorias3 = new SubCategorias3();

    public listarCategorias() {
        initComponents();
        setTitle("Fichero 2.0 / Categorias");
        this.setLocationRelativeTo(null);
        
        conexion = ConexionBD.obtenerConexion();
        Statement statement = null;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        try {
            
            ConexionBD.obtenerConexion();
            String sql = "SELECT * FROM categorias";
            preparedStatement = conexion.prepareCall(sql);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                
                categorias.setId(resultSet.getInt("id"));
                categorias.setNombre(resultSet.getString("nombre"));
                categorias.setActivo(resultSet.getBoolean("activo"));
                
                nodo = new DefaultMutableTreeNode(categorias.getNombre());
                raiz.add(nodo);
                
                obtenerSub1(categorias.getId());
                
            }
            
            DefaultTreeModel modeloArbrol = new DefaultTreeModel(raiz);
            this.treeCategorias.setModel(modeloArbrol);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
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
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Árbol de categorias");

        jLabel2.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alántar");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(treeCategorias);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresar)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(19, 19, 19))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(192, 192, 192)
                        .addComponent(btnRegresar)
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listarCategorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree treeCategorias;
    // End of variables declaration//GEN-END:variables

    private void obtenerSub1(Integer idCat) {
        
        try {
            conexion = ConexionBD.obtenerConexion();
            ResultSet resultSet;
            String sql = "SELECT * FROM subCategorias1 WHERE idCategoria = "+ idCat +";";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
                
                
            while (resultSet.next()) {
                
                subCategorias1.setId(resultSet.getInt("id"));
                subCategorias1.setIdCategoria(resultSet.getInt("idCategoria"));
                subCategorias1.setNombre(resultSet.getString("nombre"));
                subCategorias1.setActivo(resultSet.getBoolean("activo"));
                
                subNodo1 = new DefaultMutableTreeNode(subCategorias1.getNombre());
                nodo.add(subNodo1);
                
                obtenerSub2(subCategorias1.getId());
                
            }
                
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void obtenerSub2(Integer idSubCat1) {
        
        try {
            conexion = ConexionBD.obtenerConexion();
            ResultSet resultSet;
            String sql = "SELECT * FROM subCategorias2 WHERE idSubCategoria1 = "+ idSubCat1 +";";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
                    
            while ( resultSet.next()) {
                
                subCategorias2.setId(resultSet.getInt("id"));
                subCategorias2.setIdSubCategoria1(resultSet.getInt("idSubCategoria1"));
                subCategorias2.setNombre(resultSet.getString("nombre"));
                subCategorias2.setActivo(resultSet.getBoolean("activo"));
                
                subNodo2 = new DefaultMutableTreeNode(subCategorias2.getNombre());
                subNodo1.add(subNodo2);
                
                obtenerSub3(subCategorias2.getId());
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void obtenerSub3(Integer idSubCat2) {

        try {
            conexion = ConexionBD.obtenerConexion();
            ResultSet resultSet;
            String sql = "SELECT * FROM subCategorias3 WHERE idSubCategoria2 = "+ idSubCat2 +";";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
                
            while ( resultSet.next()) {
                
                subCategorias3 = new SubCategorias3();
                subCategorias3.setId(resultSet.getInt("id"));
                subCategorias3.setIdSubCategoria2(resultSet.getInt("idSubCategoria2"));
                subCategorias3.setNombre(resultSet.getString("nombre"));
                subCategorias3.setActivo(resultSet.getBoolean("activo"));
                
                DefaultMutableTreeNode subNodo3 = new DefaultMutableTreeNode(subCategorias3.getNombre());
                subNodo2.add(subNodo3);
                
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }

}
