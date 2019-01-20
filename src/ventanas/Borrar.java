package ventanas;

import dao.implementaciones.CategoriaDaoImp;
import dao.implementaciones.FuenteDaoImp;
import dao.implementaciones.FichaDaoImp;
import dao.implementaciones.SubCategoria1DaoImp;
import dao.implementaciones.SubCategoria2DaoImp;
import dao.implementaciones.SubCategoria3DaoImp;
import java.util.List;
import javax.swing.JOptionPane;
import tablas.Categorias;
import tablas.Fichas;
import tablas.Fuentes;

public class Borrar extends javax.swing.JFrame {
    
    Integer indice, tottal;
    List<Fichas> fichasLista;
    
    public Borrar() {
        initComponents();
        setTitle("Fichero 2.0 / buscar");
        this.setLocationRelativeTo(null);
        txtTexto.setLineWrap(true);
        txtTexto.setWrapStyleWord(true);
        
        cbBuscar.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtros = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        rbuTexto = new javax.swing.JRadioButton();
        rbuCategoria = new javax.swing.JRadioButton();
        rbuFuente = new javax.swing.JRadioButton();
        cbBuscar = new javax.swing.JComboBox();
        rbuNoficha = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        txtNoFichas = new javax.swing.JTextField();
        lblSub1 = new javax.swing.JLabel();
        lblSub2 = new javax.swing.JLabel();
        lblSub3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();
        btnSig = new javax.swing.JButton();
        btnAnt = new javax.swing.JButton();
        lblFuente = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtCategoria = new javax.swing.JTextField();
        txtSub1 = new javax.swing.JTextField();
        txtSub2 = new javax.swing.JTextField();
        txtSub3 = new javax.swing.JTextField();
        txtFuente = new javax.swing.JTextField();
        btnUltimo = new javax.swing.JButton();
        btnPrimero = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblBuscar.setText("Buscar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        filtros.add(rbuTexto);
        rbuTexto.setText("Texto");
        rbuTexto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbuTextoItemStateChanged(evt);
            }
        });

        filtros.add(rbuCategoria);
        rbuCategoria.setText("Categoría");
        rbuCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbuCategoriaItemStateChanged(evt);
            }
        });

        filtros.add(rbuFuente);
        rbuFuente.setText("Fuente");
        rbuFuente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbuFuenteItemStateChanged(evt);
            }
        });

        filtros.add(rbuNoficha);
        rbuNoficha.setText("No. de ficha");
        rbuNoficha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbuNofichaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(lblBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbuNoficha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(rbuTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(rbuCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(rbuFuente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(230, 230, 230))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbBuscar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar)
                            .addComponent(cbBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbuTexto)
                            .addComponent(rbuFuente)
                            .addComponent(rbuCategoria)
                            .addComponent(rbuNoficha))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBuscar)
                            .addComponent(btnBuscar))
                        .addGap(41, 41, 41))))
        );

        lblNumero.setText("No. de Ficha");

        lblCategoria.setText("Categoría");

        txtNoFichas.setEditable(false);

        lblSub1.setText("Sub Categoría 1");

        lblSub2.setText("Sub Categoría 2");

        lblSub3.setText("Sub Categoría 3");

        txtTexto.setEditable(false);
        txtTexto.setColumns(20);
        txtTexto.setRows(5);
        jScrollPane1.setViewportView(txtTexto);

        btnSig.setText(">");
        btnSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigActionPerformed(evt);
            }
        });

        btnAnt.setText("<");
        btnAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntActionPerformed(evt);
            }
        });

        lblFuente.setText("Fuente");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(153, 0, 0));
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        txtCategoria.setEditable(false);

        txtSub1.setEditable(false);

        txtSub2.setEditable(false);

        txtSub3.setEditable(false);

        txtFuente.setEditable(false);

        btnUltimo.setText(">>");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnPrimero.setText("<<");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumero)
                    .addComponent(lblSub2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoFichas)
                    .addComponent(txtSub2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSub3)
                    .addComponent(lblCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCategoria)
                    .addComponent(txtSub3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSub1)
                    .addComponent(lblFuente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSub1)
                    .addComponent(txtFuente))
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrimero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUltimo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtNoFichas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoria)
                    .addComponent(lblSub1)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSub3)
                    .addComponent(lblSub2)
                    .addComponent(lblFuente)
                    .addComponent(txtSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnAnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(79, 79, 79)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnBorrar))
                .addGap(30, 30, 30))
        );

        lblInfo.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alcántar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        this.setVisible(false);
        System.out.println("Regresando a inicio");
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        if( txtBuscar.getText().isEmpty() == true ){
            if( cbBuscar.getSelectedIndex() <= 0 ){
                JOptionPane.showMessageDialog(null, "Debe llenar el campo de busqueda");
            }else{
                if( rbuCategoria.isSelected() == true ){
                    
                    String parametro = cbBuscar.getSelectedItem().toString();
                    buscarCategoria(parametro);
                    
                }else{
                    if( rbuFuente.isSelected() == true ){
                        
                        String parametro = cbBuscar.getSelectedItem().toString();
                        buscarFuente(parametro);
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un filtro");
                    }
                }
            }
        }else{
            if( rbuTexto.isSelected() == true ){
                try {
                    
                    String parametro = txtBuscar.getText();
                    buscarTexto(parametro);
                    
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }else{
                if( rbuNoficha.isSelected() == true ){
                    
                    String parametro = txtBuscar.getText();
                    buscarNoficha(parametro);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un filtro");
                }
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigActionPerformed
        
        if( indice == tottal ){
            JOptionPane.showMessageDialog(null, "Ya es la última ficha");
        } else {
            indice ++;
            mostrar(fichasLista.get(indice));
        }
        
    }//GEN-LAST:event_btnSigActionPerformed

    private void btnAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntActionPerformed
         
        if( indice == 0 ){
            JOptionPane.showMessageDialog(null, "Ya es la primera ficha");
        }else{
            indice --;
            mostrar(fichasLista.get(indice));
        }
        
    }//GEN-LAST:event_btnAntActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        
        String parametro;
        
        if( txtNoFichas.getText().isEmpty() == true ){
            JOptionPane.showMessageDialog(null, "No hay ficha para eliminar");
        }else{
            parametro = txtNoFichas.getText();
            Integer confirmacion = JOptionPane.showConfirmDialog(null, "Esta apunto de borrar la ficha "+ parametro + " ¿Desea continuar?");
            
            if( confirmacion == 0 ){
                borrarFicha(parametro);
                actualizar();
            }
            
        }
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
         
        if( indice == tottal ){
            JOptionPane.showMessageDialog(null, "Ya es la última ficha");
        } else {
            indice = tottal;
            mostrar(fichasLista.get(indice));
        }
        
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        
        if( indice == 0 ){
            JOptionPane.showMessageDialog(null, "Ya es la primera ficha");
        }else{
            indice = 0;
            mostrar(fichasLista.get(indice));
        }
        
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void rbuCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbuCategoriaItemStateChanged
        try {
            
            txtBuscar.setVisible(false);
            txtBuscar.setText("");
            cbBuscar.setVisible(true);
            
            cbBuscar.removeAllItems();
            cbBuscar.addItem("--Seleccione--");
            lisatrCategorias();
            
            txtNoFichas.setText(""); txtCategoria.setText(""); txtSub1.setText("");
            txtSub2.setText(""); txtSub3.setText(""); txtFuente.setText(""); txtTexto.setText("");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_rbuCategoriaItemStateChanged

    private void rbuFuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbuFuenteItemStateChanged
        try {
            
            txtBuscar.setVisible(false);
            txtBuscar.setText("");
            cbBuscar.setVisible(true);
            
            cbBuscar.removeAllItems();
            cbBuscar.addItem("--Seleccione--");
            listarFuentes();
            
            txtNoFichas.setText(""); txtCategoria.setText(""); txtSub1.setText("");
            txtSub2.setText(""); txtSub3.setText(""); txtFuente.setText(""); txtTexto.setText("");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_rbuFuenteItemStateChanged

    private void rbuTextoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbuTextoItemStateChanged

        txtBuscar.setVisible(true);
        cbBuscar.setVisible(false);
        txtBuscar.setText("");
        
        txtNoFichas.setText(""); txtCategoria.setText(""); txtSub1.setText("");
        txtSub2.setText(""); txtSub3.setText(""); txtFuente.setText(""); txtTexto.setText("");
        
    }//GEN-LAST:event_rbuTextoItemStateChanged

    private void rbuNofichaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbuNofichaItemStateChanged
        
        txtBuscar.setVisible(true);
        cbBuscar.setVisible(false);
        txtBuscar.setText("");
        
        txtNoFichas.setText(""); txtCategoria.setText(""); txtSub1.setText("");
        txtSub2.setText(""); txtSub3.setText(""); txtFuente.setText(""); txtTexto.setText("");
        
    }//GEN-LAST:event_rbuNofichaItemStateChanged
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnt;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSig;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cbBuscar;
    private javax.swing.ButtonGroup filtros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblFuente;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSub1;
    private javax.swing.JLabel lblSub2;
    private javax.swing.JLabel lblSub3;
    private javax.swing.JRadioButton rbuCategoria;
    private javax.swing.JRadioButton rbuFuente;
    private javax.swing.JRadioButton rbuNoficha;
    private javax.swing.JRadioButton rbuTexto;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtFuente;
    private javax.swing.JTextField txtNoFichas;
    private javax.swing.JTextField txtSub1;
    private javax.swing.JTextField txtSub2;
    private javax.swing.JTextField txtSub3;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables

    //Obtener - listar
    
    private void lisatrCategorias() throws Exception {
        
        CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
        
        for( Categorias categorias : categoriaDaoImp.listar() ){
            Categorias temp = new Categorias();
            temp.setId(categorias.getId());
            temp.setNombre(categorias.getNombre());
            temp.setActivo(categorias.isActivo());
            cbBuscar.addItem(temp);
        }
    }

    private void listarFuentes() throws Exception {
        
        FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
        
        for( Fuentes fuentes : fuenteDaoImp.listar() ){
            
            Fuentes temp = new Fuentes();
            temp.setId(fuentes.getId());
            temp.setNombre(fuentes.getNombre());
            cbBuscar.addItem(temp);
        
        }
    }
    
    //Buscar

    private void buscarCategoria(String parametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void buscarFuente(String parametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void buscarTexto(String parametro) throws Exception {
        
        System.out.println("\n--- Buscando por texto: "+parametro+" ---");
        
        FichaDaoImp fichaDaoImp = new FichaDaoImp();
        fichasLista = fichaDaoImp.buscarTexto(parametro);
        
        if( fichasLista.isEmpty() ){
            System.out.println("No hay fichas con texto "+parametro);
            JOptionPane.showMessageDialog(null, "No hay fichas encontradas");
        }else{
            
            indice = 0;
            tottal = fichasLista.size() - 1;
            mostrar(fichasLista.get(indice));
            
        }
    }

    private void buscarNoficha(String parametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Borrar

    private void borrarFicha(String parametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Actualizar

    private void actualizar() {
        
        Borrar borrar = new Borrar();
        this.dispose();
        borrar.setVisible(true);
        
    }
    
    //Mostrar

    private void mostrar(Fichas ficha) {
        
        System.out.println("\n  --- Mostarndo la ficha número "+ficha.getId()+" ---");
        
        txtNoFichas.setText(ficha.getId().toString());
        obtenerCategoriaNombre(ficha.getCategoria());
        
        if( ficha.getSubCategoia1() == 0 ){
            txtSub1.setText("");
        }else{
            obtenerSub1Nombre(ficha.getSubCategoia1());
        }
        
        if( ficha.getSubCategoia2() == 0 ){
            txtSub2.setText("");
        }else{
            obtenerSub2Nombre(ficha.getSubCategoia2());
        }
        
        if( ficha.getSubCategoia3() == 0 ){
            txtSub3.setText("");
        }else{
            obtenerSub3Nombre(ficha.getSubCategoia3());
        }
        
        obtenerFuenteNombre(ficha.getFuente());
        txtTexto.setText(ficha.getTexto());
        
    }
    
    //Obtener los nombres de Categoria, SubCategoria1, 2 y 3 y Fuente

    private void obtenerCategoriaNombre(Integer categoriaId) {
        
        CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
        
        System.out.println("\nObteniendo el nombra de la categoria con id = "+categoriaId);
        String categoriaNombre = categoriaDaoImp.obtenerNombre(categoriaId);
        System.out.println("la categoria "+categoriaId+" tiene de nombre "+categoriaNombre);
        
        txtCategoria.setText(categoriaNombre);
        
    }

    private void obtenerSub1Nombre(Integer subCategoia1Id) {
        
        SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
        
        System.out.println("\nObteniendo el nombre de la sub categoria 1 con id = "+subCategoia1Id);
        String sub1Nombre = subCategoria1DaoImp.obtenerNombre(subCategoia1Id);
        System.out.println("la sub categoria 1 "+subCategoia1Id+" tiene de nombre "+sub1Nombre);
        
        txtSub1.setText(sub1Nombre);
        
    }

    private void obtenerSub2Nombre(Integer subCategoia2Id) {
        
        SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
        
        System.out.println("\nObteniendo el nombre de la sub categoria 2 con id = "+subCategoia2Id);
        String sub2Nombre = subCategoria2DaoImp.obtenerNombre(subCategoia2Id);
        System.out.println("la sub categoria 2 "+subCategoia2Id+" tiene de nombre "+sub2Nombre);
        
        txtSub2.setText(sub2Nombre);
        
    }

    private void obtenerSub3Nombre(Integer subCategoia3Id) {
        
        SubCategoria3DaoImp subCategoria3DaoImp = new SubCategoria3DaoImp();
        
        System.out.println("\nObteniendo el nombre de la sub categoria 3 con id = "+subCategoia3Id);
        String sub3Nombre = subCategoria3DaoImp.obtenerNombre(subCategoia3Id);
        System.out.println("la sub categoria 3 "+subCategoia3Id+" tiene de nombre "+sub3Nombre);
        
        txtSub3.setText(sub3Nombre);
        
    }

    private void obtenerFuenteNombre(Integer fuenteId) {
        
        FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
        
        System.out.println("\nObteniendo el nombre de la fuente con id = "+fuenteId);
        String fuenteNombre = fuenteDaoImp.obtenerNombre(fuenteId);
        System.out.println("la fuente "+fuenteId+" tiene de nombre "+fuenteNombre);
        
        txtFuente.setText(fuenteNombre);
        
    }
    
}
