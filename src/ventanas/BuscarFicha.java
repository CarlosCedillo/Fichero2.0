package ventanas;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import dao.implementaciones.CategoriaDaoImp;
import dao.implementaciones.FichaDaoImp;
import dao.implementaciones.FuenteDaoImp;
import dao.implementaciones.SubCategoria1DaoImp;
import dao.implementaciones.SubCategoria2DaoImp;
import dao.implementaciones.SubCategoria3DaoImp;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import tablas.Categorias;
import tablas.Fichas;
import tablas.Fuentes;
import tablas.SubCategorias1;
import tablas.SubCategorias2;
import tablas.SubCategorias3;

public class BuscarFicha extends javax.swing.JFrame {
    
    Integer indice, tottal;
    List<Fichas> fichasLista;
    
    public BuscarFicha() {
        
        initComponents();
        setTitle("Fichero 2.0 / buscar");
        this.setLocationRelativeTo(null);
        txtTexto.setLineWrap(true);
        txtTexto.setWrapStyleWord(true);
        
        cbBuscar.setVisible(false);
        
        lblCategoriaAvz.setVisible(false); cbCategoriaAvz.setVisible(false);
        lblSub1Avz.setVisible(false); cbSub1Avz.setVisible(false);
        lblSub2Avz.setVisible(false); cbSub2Avz.setVisible(false);
        lblSub3Avz.setVisible(false); cbSub3Avz.setVisible(false);
        lblFuenteAvz.setVisible(false); cbFuenteAvz.setVisible(false);
        btnBusquedaAbanzada.setVisible(false);
        
        cbSub1Avz.disable(); cbSub2Avz.disable(); cbSub3Avz.disable();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtros = new javax.swing.ButtonGroup();
        pnlBusqueda = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cbBuscar = new javax.swing.JComboBox();
        rbuFuente = new javax.swing.JRadioButton();
        rbuCategoria = new javax.swing.JRadioButton();
        rbuTexto = new javax.swing.JRadioButton();
        rbuNoficha = new javax.swing.JRadioButton();
        rbuAvanzado = new javax.swing.JRadioButton();
        pnlResultados = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        txtNoFicha = new javax.swing.JTextField();
        lblSub1 = new javax.swing.JLabel();
        lblSub2 = new javax.swing.JLabel();
        lblSub3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();
        btnSig = new javax.swing.JButton();
        btnAnt = new javax.swing.JButton();
        lblFuente = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtCategoria = new javax.swing.JTextField();
        txtSub1 = new javax.swing.JTextField();
        txtSub2 = new javax.swing.JTextField();
        txtSub3 = new javax.swing.JTextField();
        txtFuente = new javax.swing.JTextField();
        btnUltimo = new javax.swing.JButton();
        btnPrimero = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        pnlAvanzasdo = new javax.swing.JPanel();
        lblCategoriaAvz = new javax.swing.JLabel();
        cbCategoriaAvz = new javax.swing.JComboBox();
        lblSub1Avz = new javax.swing.JLabel();
        cbSub1Avz = new javax.swing.JComboBox();
        lblSub2Avz = new javax.swing.JLabel();
        cbSub2Avz = new javax.swing.JComboBox();
        lblSub3Avz = new javax.swing.JLabel();
        cbSub3Avz = new javax.swing.JComboBox();
        lblFuenteAvz = new javax.swing.JLabel();
        cbFuenteAvz = new javax.swing.JComboBox();
        btnBusquedaAbanzada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblBuscar.setText("Buscar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        filtros.add(rbuFuente);
        rbuFuente.setText("Fuente");
        rbuFuente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbuFuenteItemStateChanged(evt);
            }
        });

        filtros.add(rbuCategoria);
        rbuCategoria.setText("Categoría");
        rbuCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbuCategoriaItemStateChanged(evt);
            }
        });

        filtros.add(rbuTexto);
        rbuTexto.setText("Texto");
        rbuTexto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbuTextoItemStateChanged(evt);
            }
        });

        filtros.add(rbuNoficha);
        rbuNoficha.setText("No. de ficha");
        rbuNoficha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbuNofichaItemStateChanged(evt);
            }
        });

        filtros.add(rbuAvanzado);
        rbuAvanzado.setText("Avanzado");
        rbuAvanzado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbuAvanzadoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlBusquedaLayout = new javax.swing.GroupLayout(pnlBusqueda);
        pnlBusqueda.setLayout(pnlBusquedaLayout);
        pnlBusquedaLayout.setHorizontalGroup(
            pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbBuscar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBusquedaLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(rbuNoficha)
                .addGap(20, 20, 20)
                .addComponent(rbuTexto)
                .addGap(20, 20, 20)
                .addComponent(rbuCategoria)
                .addGap(20, 20, 20)
                .addComponent(rbuFuente)
                .addGap(20, 20, 20)
                .addComponent(rbuAvanzado)
                .addGap(193, 193, 193))
        );
        pnlBusquedaLayout.setVerticalGroup(
            pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBusquedaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBusquedaLayout.createSequentialGroup()
                        .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar)
                            .addComponent(cbBuscar))
                        .addGap(8, 8, 8))
                    .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBuscar)
                        .addComponent(btnBuscar)))
                .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbuFuente)
                    .addComponent(rbuNoficha)
                    .addComponent(rbuTexto)
                    .addComponent(rbuCategoria)
                    .addComponent(rbuAvanzado))
                .addGap(10, 10, 10))
        );

        lblNumero.setText("No. de Ficha");

        lblCategoria.setText("Categoría");

        txtNoFicha.setEditable(false);

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

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
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

        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumero)
                    .addComponent(lblSub2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoFicha)
                    .addComponent(txtSub2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSub3)
                    .addComponent(lblCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCategoria)
                    .addComponent(txtSub3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSub1)
                    .addComponent(lblFuente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSub1)
                    .addComponent(txtFuente))
                .addGap(30, 30, 30))
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlResultadosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExportar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlResultadosLayout.createSequentialGroup()
                        .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrimero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUltimo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtNoFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoria)
                    .addComponent(lblSub1)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSub3)
                    .addComponent(lblSub2)
                    .addComponent(lblFuente)
                    .addComponent(txtSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlResultadosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1))
                    .addGroup(pnlResultadosLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(74, 74, 74))
                    .addGroup(pnlResultadosLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnAnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(79, 79, 79)))
                .addGap(20, 20, 20)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnModificar)
                    .addComponent(btnExportar))
                .addGap(20, 20, 20))
        );

        lblInfo.setText("Fichero 2.0 creado por Carlos Gerado Cedillo Alcántar");

        lblCategoriaAvz.setText("Categoría");

        cbCategoriaAvz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoriaAvzItemStateChanged(evt);
            }
        });

        lblSub1Avz.setText("Sub categoría 1");

        cbSub1Avz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSub1AvzItemStateChanged(evt);
            }
        });

        lblSub2Avz.setText("Sub categoría 2");

        cbSub2Avz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSub2AvzItemStateChanged(evt);
            }
        });

        lblSub3Avz.setText("Sub categoría 3");

        lblFuenteAvz.setText("Fuente");

        btnBusquedaAbanzada.setText("Buscar");
        btnBusquedaAbanzada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaAbanzadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAvanzasdoLayout = new javax.swing.GroupLayout(pnlAvanzasdo);
        pnlAvanzasdo.setLayout(pnlAvanzasdoLayout);
        pnlAvanzasdoLayout.setHorizontalGroup(
            pnlAvanzasdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAvanzasdoLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(pnlAvanzasdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlAvanzasdoLayout.createSequentialGroup()
                        .addComponent(lblFuenteAvz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20)
                        .addComponent(cbFuenteAvz, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAvanzasdoLayout.createSequentialGroup()
                        .addComponent(lblSub2Avz)
                        .addGap(20, 20, 20)
                        .addComponent(cbSub2Avz, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAvanzasdoLayout.createSequentialGroup()
                        .addComponent(lblCategoriaAvz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCategoriaAvz, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(pnlAvanzasdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAvanzasdoLayout.createSequentialGroup()
                        .addComponent(lblSub1Avz)
                        .addGap(20, 20, 20)
                        .addComponent(cbSub1Avz, 0, 200, Short.MAX_VALUE))
                    .addGroup(pnlAvanzasdoLayout.createSequentialGroup()
                        .addComponent(lblSub3Avz)
                        .addGap(20, 20, 20)
                        .addComponent(cbSub3Avz, 0, 200, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAvanzasdoLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(btnBusquedaAbanzada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(100, 100, 100))
        );
        pnlAvanzasdoLayout.setVerticalGroup(
            pnlAvanzasdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAvanzasdoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlAvanzasdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoriaAvz)
                    .addComponent(cbCategoriaAvz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSub1Avz)
                    .addComponent(cbSub1Avz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAvanzasdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSub2Avz)
                    .addComponent(cbSub2Avz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSub3Avz)
                    .addComponent(cbSub3Avz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAvanzasdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFuenteAvz)
                    .addComponent(cbFuenteAvz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusquedaAbanzada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlAvanzasdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAvanzasdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        this.setVisible(false);
        System.out.println("\n----- Cerrando ventana buscar -----");
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        if( txtBuscar.getText().isEmpty() == true ){
            if( cbBuscar.getSelectedIndex() <= 0 ){
                JOptionPane.showMessageDialog(null, "Debe llenar el campo de busqueda");
            }else{
                if( rbuCategoria.isSelected() == true ){
                    
                    try {
                        
                        String parametro = cbBuscar.getSelectedItem().toString();
                        buscarCategoria(parametro);
                        
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    
                }else{
                    if( rbuFuente.isSelected() == true ){
                        
                        try {
                            
                            String parametro = cbBuscar.getSelectedItem().toString();
                            buscarFuente(parametro);
                            
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                        
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
                    
                    try {
                        
                        String parametro = txtBuscar.getText();
                        buscarNoficha(parametro);
                        
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    
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
            try {
                
                indice ++;
                mostrar(fichasLista.get(indice));
                
            } catch (BadLocationException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_btnSigActionPerformed

    private void btnAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntActionPerformed
        
        if( indice == 0 ){
            JOptionPane.showMessageDialog(null, "Ya es la primera ficha");
        }else{
            try {
                
                indice --;
                mostrar(fichasLista.get(indice));
                
            } catch (BadLocationException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_btnAntActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if( !txtNoFicha.getText().isEmpty() ){
            
            try {
                
            ModificarFicha jFrame = new ModificarFicha();
            this.setVisible(true);
            System.out.println("Va modificar la ficha");
            jFrame.setVisible(true);
            
            ModificarFicha.txtId.setText(txtNoFicha.getText());
            ModificarFicha.txtCategoria.setText(txtCategoria.getText());
            ModificarFicha.txtSub1.setText(txtSub1.getText());
            ModificarFicha.txtSub2.setText(txtSub2.getText());
            ModificarFicha.txtSub3.setText(txtSub3.getText());
            ModificarFicha.txtFuente.setText(txtFuente.getText());
            ModificarFicha.txtFicha.setText(txtTexto.getText());
            
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            
            this.dispose();
            
        }else{
            JOptionPane.showMessageDialog(null, "No hay ficha que modificar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
         
        if( indice == tottal ){
            JOptionPane.showMessageDialog(null, "Ya es la última ficha");
        } else {
            try {
                
                indice = tottal;
                mostrar(fichasLista.get(indice));
                
            } catch (BadLocationException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        
        if( indice == 0 ){
            JOptionPane.showMessageDialog(null, "Ya es la primera ficha");
        }else{
            try {
                
                indice = 0;
                mostrar(fichasLista.get(indice));
                
            } catch (BadLocationException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void rbuCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbuCategoriaItemStateChanged
        try {
            
            cbBuscar.enable();
            
            txtBuscar.setVisible(false);
            txtBuscar.setText("");
            
            cbBuscar.setVisible(true);
            
            cbBuscar.removeAllItems();
            
            cbBuscar.addItem("--Seleccione--");
            lisatrCategorias();
            
            txtNoFicha.setText(""); txtCategoria.setText(""); txtSub1.setText("");
            txtSub2.setText(""); txtSub3.setText(""); txtFuente.setText(""); txtTexto.setText("");
            
            lblCategoriaAvz.setVisible(false); cbCategoriaAvz.setVisible(false);
            lblSub1Avz.setVisible(false); cbSub1Avz.setVisible(false);
            lblSub2Avz.setVisible(false); cbSub2Avz.setVisible(false);
            lblSub3Avz.setVisible(false); cbSub3Avz.setVisible(false);
            lblFuenteAvz.setVisible(false); cbFuenteAvz.setVisible(false);
            btnBusquedaAbanzada.setVisible(false);
            
            btnBuscar.setEnabled(true);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_rbuCategoriaItemStateChanged

    private void rbuFuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbuFuenteItemStateChanged

        try {
            
            cbBuscar.enable();
            
            txtBuscar.setVisible(false);
            txtBuscar.setText("");
            
            cbBuscar.setVisible(true);
            
            cbBuscar.removeAllItems();
            
            cbBuscar.addItem("--Seleccione--");
            listarFuentes();
            
            txtNoFicha.setText(""); txtCategoria.setText(""); txtSub1.setText("");
            txtSub2.setText(""); txtSub3.setText(""); txtFuente.setText(""); txtTexto.setText("");
            
            lblCategoriaAvz.setVisible(false); cbCategoriaAvz.setVisible(false);
            lblSub1Avz.setVisible(false); cbSub1Avz.setVisible(false);
            lblSub2Avz.setVisible(false); cbSub2Avz.setVisible(false);
            lblSub3Avz.setVisible(false); cbSub3Avz.setVisible(false);
            lblFuenteAvz.setVisible(false); cbFuenteAvz.setVisible(false);
            btnBusquedaAbanzada.setVisible(false);
            
            btnBuscar.setEnabled(true);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }//GEN-LAST:event_rbuFuenteItemStateChanged

    private void rbuTextoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbuTextoItemStateChanged

        txtBuscar.enable();
        
        txtBuscar.setVisible(true);
        cbBuscar.setVisible(false);
        txtBuscar.setText("");
        
        txtNoFicha.setText(""); txtCategoria.setText(""); txtSub1.setText("");
        txtSub2.setText(""); txtSub3.setText(""); txtFuente.setText(""); txtTexto.setText("");
        
        lblCategoriaAvz.setVisible(false); cbCategoriaAvz.setVisible(false);
        lblSub1Avz.setVisible(false); cbSub1Avz.setVisible(false);
        lblSub2Avz.setVisible(false); cbSub2Avz.setVisible(false);
        lblSub3Avz.setVisible(false); cbSub3Avz.setVisible(false);
        lblFuenteAvz.setVisible(false); cbFuenteAvz.setVisible(false);
        btnBusquedaAbanzada.setVisible(false);
        
        btnBuscar.setEnabled(true);
        
    }//GEN-LAST:event_rbuTextoItemStateChanged

    private void rbuNofichaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbuNofichaItemStateChanged

        txtBuscar.enable();
        
        txtBuscar.setVisible(true);
        cbBuscar.setVisible(false);
        txtBuscar.setText("");
        
        txtNoFicha.setText(""); txtCategoria.setText(""); txtSub1.setText("");
        txtSub2.setText(""); txtSub3.setText(""); txtFuente.setText(""); txtTexto.setText("");
        
        lblCategoriaAvz.setVisible(false); cbCategoriaAvz.setVisible(false);
        lblSub1Avz.setVisible(false); cbSub1Avz.setVisible(false);
        lblSub2Avz.setVisible(false); cbSub2Avz.setVisible(false);
        lblSub3Avz.setVisible(false); cbSub3Avz.setVisible(false);
        lblFuenteAvz.setVisible(false); cbFuenteAvz.setVisible(false);
        btnBusquedaAbanzada.setVisible(false);
        
        btnBuscar.setEnabled(true);
        
    }//GEN-LAST:event_rbuNofichaItemStateChanged

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        
        JFileChooser exportar = new JFileChooser();
        int eleccion = exportar.showSaveDialog(this);
        String fichaId, fichaCategoria, fichaSub1, fichaSub2, fichaSub3, fichaTexto, fichaFuente;
        
        fichaId = txtNoFicha.getText();
        fichaCategoria = txtCategoria.getText();
        fichaSub1 = txtSub1.getText();
        fichaSub2 = txtSub2.getText();
        fichaSub3 = txtSub3.getText();
        fichaTexto = txtTexto.getText();
        fichaFuente = txtFuente.getText();
        
        if( eleccion == JFileChooser.APPROVE_OPTION ){
            
            File ruta = exportar.getSelectedFile();
            
            try {
                
                FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
                Document ficha = new Document();
                PdfWriter.getInstance(ficha, archivo);
                
                //INICIO parametros de los parrafos
                Paragraph espacio = new Paragraph("\n");
                
                Paragraph fuente = new Paragraph(fichaFuente);
                fuente.setAlignment(Element.ALIGN_RIGHT);
                
                PdfPTable table = new PdfPTable(2);
                PdfPCell cellOne = new PdfPCell(new Phrase("Categoría: "+fichaCategoria));
                PdfPCell cellTwo = new PdfPCell(new Phrase("Sub categoría 1: " + fichaSub1));
                PdfPCell cellThree = new PdfPCell(new Phrase("Sub categoría 2: " + fichaSub2));
                PdfPCell cellFour = new PdfPCell(new Phrase("Sub categoría 3: " + fichaSub3));

                cellOne.setBorder(Rectangle.NO_BORDER);
                cellTwo.setBorder(Rectangle.NO_BORDER);
                cellThree.setBorder(Rectangle.NO_BORDER);
                cellFour.setBorder(Rectangle.NO_BORDER);

                table.addCell(cellOne);
                table.addCell(cellTwo);
                table.addCell(cellThree);
                table.addCell(cellFour);

                ficha.open();
                
                ficha.add(new Paragraph("No. de ficha: " + fichaId));
                ficha.add(espacio);
                ficha.add(table);
                ficha.add(espacio);
                ficha.add(new Paragraph(fichaTexto));
                ficha.add(espacio);
                ficha.add(fuente);
                //FIN agragando parrafos
                
                ficha.close();
                
                JOptionPane.showMessageDialog(null, "Ficha guardada con éxito");
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        
        }
        
    }//GEN-LAST:event_btnExportarActionPerformed

    private void rbuAvanzadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbuAvanzadoItemStateChanged
        
        try {
            
            lblCategoriaAvz.setVisible(true); cbCategoriaAvz.setVisible(true);
            lblSub1Avz.setVisible(true); cbSub1Avz.setVisible(true);
            lblSub2Avz.setVisible(true); cbSub2Avz.setVisible(true);
            lblSub3Avz.setVisible(true); cbSub3Avz.setVisible(true);
            lblFuenteAvz.setVisible(true); cbFuenteAvz.setVisible(true);
            btnBusquedaAbanzada.setVisible(true);
            
            txtBuscar.disable(); cbBuscar.disable(); btnBuscar.setEnabled(false);
            
            cbCategoriaAvz.removeAllItems();
            
            cbCategoriaAvz.addItem("--Seleccione--");
            cbCategoriaAvz.setSelectedIndex(0);
            
            lisatrCategorias();
            
            cbFuenteAvz.removeAllItems();
            
            cbFuenteAvz.addItem("--Seleccione--");
            cbFuenteAvz.setSelectedIndex(0);
            
            listarFuentes();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_rbuAvanzadoItemStateChanged

    private void cbCategoriaAvzItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoriaAvzItemStateChanged
        try {
            
            // Esto es para cuando se seleccione una categoria se activen las subcategorias1 correspondientes
            
            if( cbCategoriaAvz.getSelectedIndex() == 0  ){
            }else{
                
                cbSub1Avz.enable();
                cbSub1Avz.removeAllItems();
                
                String categoriaNombre = cbCategoriaAvz.getSelectedItem().toString();

                //1.- Obtener el id de la categoria seleccionada
                CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                
                System.out.println("\nObteniendo el id de la categoria "+categoriaNombre);
                Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
                System.out.println("la categoria "+categoriaNombre+" tiene el id = "+categoriaId);

                //2.- Obtener las sub categorias 1 correspondientes a la categoria
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                
                System.out.println("\nObteniendo las sub categoria 1 de la categoria "+categoriaNombre);
                List<SubCategorias1> listaSub1 = subCategoria1DaoImp.listar(categoriaId);
                
                cbSub1Avz.addItem("--Seleccione--");

                for( SubCategorias1 subCategorias1 : listaSub1 ){
                    
                    SubCategorias1 temp = new SubCategorias1();
                    temp.setId(subCategorias1.getId());
                    temp.setIdCategoria(subCategorias1.getIdCategoria());
                    temp.setNombre(subCategorias1.getNombre());
                    temp.setActivo(subCategorias1.isActivo());
                    
                    if( temp.isActivo() == true ){
                        cbSub1Avz.addItem(temp);
                    }
                }
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_cbCategoriaAvzItemStateChanged

    private void cbSub1AvzItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSub1AvzItemStateChanged
        // Esto es para cuando se seleccione una subcategoria1 se activen las subcategorias2 correspondientes
        
        if( cbSub1Avz.isEnabled() == true && cbSub1Avz.getSelectedIndex() > 0 ){
            
            try {
                
                String categoriaNombre = cbCategoriaAvz.getSelectedItem().toString();
                CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
                
                cbSub2Avz.enable();
                cbSub2Avz.removeAllItems();
                
                String sub1Nombre = cbSub1Avz.getSelectedItem().toString();
                
                //1.- Obtener el id de la sub categoria 1 seleccionada
                SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
                
                System.out.println("\nObteniendo el id de la sub categoria 1 "+sub1Nombre);
                Integer sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, categoriaId);
                System.out.println("la sub categoria 1 "+sub1Nombre+" tiene el id "+sub1Id);
                
                //2.- Obtener las sub categorias 2 correspondientes a la sub categoria 1
                SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
                
                System.out.println("\nObteniendo las sub categoria 2 de la sub categoria 1 "+sub1Nombre);
                List<SubCategorias2>  listaSub2 = subCategoria2DaoImp.listar(sub1Id);
                
                cbSub2Avz.addItem("--Seleccione--");
                
                for( SubCategorias2 subCategorias2 : listaSub2 ){
                    
                    SubCategorias2 temp = new SubCategorias2();
                    temp.setId(subCategorias2.getId());
                    temp.setIdSubCategoria1(subCategorias2.getIdSubCategoria1());
                    temp.setNombre(subCategorias2.getNombre());
                    temp.setActivo(subCategorias2.isActivo());
                    
                    if( temp.isActivo() == true ){
                        cbSub2Avz.addItem(temp);
                    }
                }
                
            } catch (Exception ex) {
                Logger.getLogger(BuscarFicha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_cbSub1AvzItemStateChanged

    private void cbSub2AvzItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSub2AvzItemStateChanged
        // Esto es para cuando se seleccione una subcategoria2 se activen las subcategorias3 correspondientes
        
        if( cbSub2Avz.isEnabled() == true && cbSub2Avz.getSelectedIndex() > 0 ){
            
            try {
                
                String categoriaNombre = cbCategoriaAvz.getSelectedItem().toString();
                CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
                Integer categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
                
                cbSub3Avz.enable();
                cbSub3Avz.removeAllItems();
                
                String sub2Nombre = cbSub2Avz.getSelectedItem().toString();
                
                //1.- Obtener el id de la sub categoria 2 seleccionada
                String sub1Nombre = cbSub1Avz.getSelectedItem().toString();
                SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
                Integer sub1Id = subCategoria2DaoImp.obtenerId(sub1Nombre, categoriaId);
                
                System.out.println("\nObteniendo el id de la sub categoria 2 "+sub2Nombre);
                Integer sub2Id = subCategoria2DaoImp.obtenerId(sub2Nombre, sub1Id);
                System.out.println("la sub categoria 2 "+sub2Nombre+" tiene el id "+sub2Id);
                
                //2.- Obtener las sub categorias 3 correspondientes a la sub categoria 2
                SubCategoria3DaoImp subCategoria3DaoImp = new SubCategoria3DaoImp();
                
                System.out.println("\nObteniendo las sub categoria 3 de la sub categoria 2 "+sub2Nombre);
                List<SubCategorias3>  listaSub3 = subCategoria3DaoImp.listar(sub2Id);
                
                cbSub3Avz.addItem("--Seleccione--");
                
                for( SubCategorias3 subCategorias3 : listaSub3 ){
                    
                    SubCategorias3 temp = new SubCategorias3();
                    temp.setId(subCategorias3.getId());
                    temp.setIdSubCategoria2(subCategorias3.getIdSubCategoria2());
                    temp.setNombre(subCategorias3.getNombre());
                    temp.setActivo(subCategorias3.isActivo());
                    
                    if( temp.isActivo() == true ){
                        cbSub3Avz.addItem(temp);
                    }
                }
                
            } catch (Exception ex) {
                Logger.getLogger(BuscarFicha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_cbSub2AvzItemStateChanged

    private void btnBusquedaAbanzadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaAbanzadaActionPerformed

        if( cbCategoriaAvz.getSelectedIndex() <= 0  ){
            JOptionPane.showMessageDialog(null, "Debe seleccionar por lo menos una categoía");
        }else{

            String categoria, sub1, sub2, sub3, fuente;
            
            categoria = cbCategoriaAvz.getSelectedItem().toString();

            if( cbSub1Avz.getSelectedIndex() <= 0 ){
                sub1 = "0";
            }else{
                sub1 = cbSub1Avz.getSelectedItem().toString();
            }

            if( cbSub2Avz.getSelectedIndex() <= 0 ){
                sub2 = "0";
            }else{
                sub2 = cbSub2Avz.getSelectedItem().toString();
            }

            if( cbSub3Avz.getSelectedIndex() <= 0 ){
                sub3 = "0";
            }else{
                sub3 = cbSub3Avz.getSelectedItem().toString();
            }
            
            if( cbFuenteAvz.getSelectedIndex() <= 0 ){
                fuente = "0";
            }else{
                fuente = cbFuenteAvz.getSelectedItem().toString();
            }
            
            try {
                busquedaAvanzada(categoria, sub1, sub2, sub3, fuente);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }

    }//GEN-LAST:event_btnBusquedaAbanzadaActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarFicha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnt;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBusquedaAbanzada;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSig;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cbBuscar;
    private javax.swing.JComboBox cbCategoriaAvz;
    private javax.swing.JComboBox cbFuenteAvz;
    private javax.swing.JComboBox cbSub1Avz;
    private javax.swing.JComboBox cbSub2Avz;
    private javax.swing.JComboBox cbSub3Avz;
    private javax.swing.ButtonGroup filtros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCategoriaAvz;
    private javax.swing.JLabel lblFuente;
    private javax.swing.JLabel lblFuenteAvz;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSub1;
    private javax.swing.JLabel lblSub1Avz;
    private javax.swing.JLabel lblSub2;
    private javax.swing.JLabel lblSub2Avz;
    private javax.swing.JLabel lblSub3;
    private javax.swing.JLabel lblSub3Avz;
    private javax.swing.JPanel pnlAvanzasdo;
    private javax.swing.JPanel pnlBusqueda;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JRadioButton rbuAvanzado;
    private javax.swing.JRadioButton rbuCategoria;
    private javax.swing.JRadioButton rbuFuente;
    private javax.swing.JRadioButton rbuNoficha;
    private javax.swing.JRadioButton rbuTexto;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtFuente;
    private javax.swing.JTextField txtNoFicha;
    private javax.swing.JTextField txtSub1;
    private javax.swing.JTextField txtSub2;
    private javax.swing.JTextField txtSub3;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables

    // listar obtener
    
    private void lisatrCategorias() throws Exception {
        
        CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
        
        for( Categorias categorias : categoriaDaoImp.listar() ){
            Categorias temp = new Categorias();
            temp.setId(categorias.getId());
            temp.setNombre(categorias.getNombre());
            temp.setActivo(categorias.isActivo());
            
            if( temp.isActivo() == true ){
                if( rbuCategoria.isSelected() == true ){
                cbBuscar.addItem(temp);
                }

                if( rbuAvanzado.isSelected() == true ){
                    cbCategoriaAvz.addItem(temp);
                }
            }
        }
    }

    private void listarFuentes() throws Exception {
        
        FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
        
        for( Fuentes fuentes : fuenteDaoImp.listar() ){
            
            Fuentes temp = new Fuentes();
            temp.setId(fuentes.getId());
            temp.setNombre(fuentes.getNombre());
            
            if( rbuFuente.isSelected() == true ){
                cbBuscar.addItem(temp);
            }
        
            if( rbuAvanzado.isSelected() == true ){
                cbFuenteAvz.addItem(temp);
            }
        }
    }
    
    // BuscarFicha

    private void buscarNoficha(String parametro) throws Exception {
        
        System.out.println("\n--- Buscando por número de ficha: "+parametro+" ---");
        
        //Esto evita que se ingrese cualquier cletra
        Pattern texto = Pattern.compile(".+[a-zA-ZñÑáéíóúÁÉÍÓÚ]+.?");
        Matcher sip = texto.matcher(parametro);
        
        if( sip.matches() ){
            JOptionPane.showMessageDialog(null, "Este tipo de busqueda no acepta letras");
        }else{
            
            Integer fichaId = Integer.parseInt(parametro);

            FichaDaoImp fichaDaoImp = new FichaDaoImp();
            fichasLista = fichaDaoImp.buscarNoFicha(fichaId);
            
            if( fichasLista.isEmpty() ){
                System.out.println("No hay fichas con el número "+parametro);
                JOptionPane.showMessageDialog(null, "No hay fichas encontradas");
            }else{
                
                indice = 0;
                tottal = fichasLista.size() - 1;
                mostrar(fichasLista.get(indice));
                
            }
        }
        
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

    private void buscarCategoria(String parametro) throws Exception {
        
        System.out.println("\n--- Buscando por categoria: "+parametro+" ---");
        
        CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
        
        //1.- Obtener el id de la categoria
        System.out.println("\nObteniendo el id de la categoria "+parametro);
        Integer categoriaId = categoriaDaoImp.obtenerId(parametro);
        System.out.println("la categoria "+parametro+" tiene de id = "+categoriaId);
        
        //2.- obtener las fichas con dicha categoriaId
        FichaDaoImp fichaDaoImp = new FichaDaoImp();
        fichasLista = fichaDaoImp.buscarCategoria(categoriaId);
        
        if( fichasLista.isEmpty() ){
            System.out.println("No hay fichas con categoria "+parametro);
            JOptionPane.showMessageDialog(null, "No hay fichas encontradas");
        }else{
            
            indice = 0;
            tottal = fichasLista.size() - 1;
            mostrar(fichasLista.get(indice));
            
        }
        
    }

    private void buscarFuente(String parametro) throws Exception {
        
        System.out.println("\n--- Buscando por fuente: "+parametro+" ---");
        
        FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
        
        //1.- Obtener el id de la fuente
        System.out.println("\nObteniendo el id de la fuente "+parametro);
        Integer fuenteId = fuenteDaoImp.obtenerId(parametro);
        System.out.println("la fuente "+parametro+" tiene de id = "+fuenteId);
        
        //2.- obtener las fichas con dicha fuenteId
        FichaDaoImp fichaDaoImp = new FichaDaoImp();
        fichasLista = fichaDaoImp.buscarFuente(fuenteId);
        
        if( fichasLista.isEmpty() ){
            System.out.println("No hay fichas con fuente "+parametro);
            JOptionPane.showMessageDialog(null, "No hay fichas encontradas");
        }else{
            
            indice = 0;
            tottal = fichasLista.size() - 1;
            mostrar(fichasLista.get(indice));
            
        }
        
    }

    private void busquedaAvanzada(String categoriaNombre, String sub1Nombre, String sub2Nombre, String sub3Nombre, String fuenteNombre) throws Exception {
        
        System.out.println("\n--- Busqueda avanzada ---");
        
        Integer categoriaId, sub1Id = 0, sub2Id = 0, sub3Id = 0, fuenteId = 0;
        
        //1.- obtener id de la Categoria
        CategoriaDaoImp categoriaDaoImp = new CategoriaDaoImp();
        categoriaId = categoriaDaoImp.obtenerId(categoriaNombre);
        
        //2.- obtener id de la sub categoria 1
        if( sub1Nombre.equals("0") == false ){
            SubCategoria1DaoImp subCategoria1DaoImp = new SubCategoria1DaoImp();
            sub1Id = subCategoria1DaoImp.obtenerId(sub1Nombre, categoriaId);
        }
        
        //3.- obtener id de la sub categoria 2
        if( sub2Nombre.equals("0") == false ){
            SubCategoria2DaoImp subCategoria2DaoImp = new SubCategoria2DaoImp();
            sub2Id = subCategoria2DaoImp.obtenerId(sub2Nombre, sub1Id);
        }
        
        //4.- obtener id de la sub categoria 3
        if( sub3Nombre.equals("0") == false ){
            SubCategoria3DaoImp subCategoria3DaoImp = new SubCategoria3DaoImp();
            sub3Id = subCategoria3DaoImp.obtenetId(sub3Nombre, sub2Id);
        }
        
        //5.- obtener id de la fuente
        if( fuenteNombre.equals("0") == false ){
            FuenteDaoImp fuenteDaoImp = new FuenteDaoImp();
            fuenteId = fuenteDaoImp.obtenerId(fuenteNombre);
        }
        
        System.out.println("\nParametros de busqueda avanzada");
        System.out.println("Categoria: "+categoriaNombre+" con id = "+categoriaId);
        System.out.println("Sub categoria 1: "+sub1Nombre+" con id = "+sub1Id);
        System.out.println("Sub categoria 2: "+sub2Nombre+" con id = "+sub2Id);
        System.out.println("Sub categoria 3: "+sub3Nombre+" con id = "+sub3Id);
        System.out.println("Fuente: "+fuenteNombre+" id = "+fuenteId+"\n");
        
        //6.- obtener la Lista de fichas
        
        FichaDaoImp fichaDaoImp = new FichaDaoImp();
        fichasLista = fichaDaoImp.busquedaAvanzada(categoriaId, sub1Id, sub2Id, sub3Id, fuenteId);
        
        if( fichasLista.isEmpty() == true ){
            System.out.println("No hay fichas encontradas");
            JOptionPane.showMessageDialog(null, "No hay fichas encontradas");
        }else{
            
            indice = 0;
            tottal = fichasLista.size() - 1;
            mostrar(fichasLista.get(indice));
            
        }
    }
    
    // Mostrar

    private void mostrar(Fichas ficha) throws BadLocationException {
        
        System.out.println("\n  --- Mostarndo la ficha número "+ficha.getId()+" ---");
        
        txtNoFicha.setText(ficha.getId().toString());
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
        
        if(rbuTexto.isSelected() == true){
            marcarBusqueda(txtBuscar.getText(), txtTexto.getText());
        }
        
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
    
    // Resaltar busqueda

    private void marcarBusqueda(String palabra, String texto) throws BadLocationException {
        
        Highlighter highlighter = txtTexto.getHighlighter();
        Highlighter.HighlightPainter paiter = new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW);
        int p0 = texto.indexOf(palabra);
        int p1 = p0 + palabra.length();
        highlighter.addHighlight(p0, p1, paiter);
        
    }
    
}