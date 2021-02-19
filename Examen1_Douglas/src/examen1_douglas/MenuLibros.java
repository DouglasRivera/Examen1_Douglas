/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_douglas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author famii
 */
public class MenuLibros extends javax.swing.JFrame {

    /**
     * Creates new form MenuLibros
     */
    String EstadoLibro = "";
    ArrayList<Libros> libros = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    int IdLibroActual = -1;
    int IdUsuarioActual = -1;
    public MenuLibros() {
        initComponents();
        this.libros = MENU.libros;
        this.usuarios = MENU.usuarios;
         JtableLibros.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Autores", "Genero", "IBSN", "Estado Libro", "Año Ingresa"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class , java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false,false,false,false
                    };
                    
                    

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
        
                JtableLibros.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        // jTable1.getSelectedRow()
                        IdLibroActual = JtableLibros.getSelectedRow();
                        if(IdLibroActual!=-1){
                            Libros libro = libros.get(IdLibroActual);
                            txtAutor.setText(libro.getAutores());
                            txtAñoEscribio.setText(libro.getYear()+"");
                            txtTitulo.setText(libro.getTitulo());
                            txtIdioma.setText(libro.getIdioma());
                            txtAñoIngreso.setText(libro.getYearIngresa()+"");
                            txtIBSN.setText(libro.getISBN());
                            txtEditoriales.setText(libro.getEditoriales());
                            txtGeneroLibro.setText(libro.getGenero());
                            libro.setEstadoLibro(EstadoLibro);
                        }
                    }

                });
                
                 
                 // tabla usuarios
        
                jtableUsuarios.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        // jTable1.getSelectedRow()
                        IdUsuarioActual = jtableUsuarios.getSelectedRow();
                    }

                });
                 jtableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Nombre", "Apellido", "Edad", "Codigo"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class , java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false,false,false
                    };
                    
                    

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
        
                jtableUsuarios.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        // jTable1.getSelectedRow()
                        IdUsuarioActual = jtableUsuarios.getSelectedRow();
                         if(IdLibroActual!=-1){
                             
                         }
                    }

                });
                
                recargarTablaLibros(JtableLibros);
                recargarTablaUsuarios(jtableUsuarios);
    }
   
    public void vaciarTablaUsuarios(JTable tabla){
        DefaultTableModel Modelo = (DefaultTableModel) tabla.getModel();
        String titulos[] =  new String[]{
                            "Nombre", "Apellido", "Edad", "Codigo"
                        };
        Modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(Modelo);

    }          
    
   
    
    public void vaciarTablaLibros(JTable tabla){
        DefaultTableModel Modelo = (DefaultTableModel) tabla.getModel();
        String titulos[] =  new String[]{
                            "Autores", "Genero", "IBSN", "Estado Libro", "Año Ingresa"
                        };
        Modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(Modelo);

    }
    
    private void recargarTablaLibros(JTable tabla){
        vaciarTablaLibros(tabla);
                for (Libros libros : libros) {
                    Object row[] = {libros.getAutores(), libros.getGenero(), libros.getISBN(),libros.getEstadoLibro(), libros.getYearIngresa()};
                    DefaultTableModel m =
                            (DefaultTableModel) tabla.getModel();
                    m.addRow(row);
                    tabla.setModel(m);
                }//fin for
        
    }
    
    private void recargarTablaUsuarios(JTable tabla){
        vaciarTablaUsuarios(tabla);
                for (Usuario Usuarios : usuarios) {
                    Object row[] = {Usuarios.getNombre(), Usuarios.getApellido(), Usuarios.getEdad(),Usuarios.getCodigo()};
                    DefaultTableModel m =
                            (DefaultTableModel) tabla.getModel();
                    m.addRow(row);
                    tabla.setModel(m);
                }//fin for
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtableLibros = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtGeneroLibro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEditoriales = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtIdioma = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNumeroCuenta = new javax.swing.JTextField();
        txtPersonaLibro = new javax.swing.JTextField();
        jbFueraInventario = new javax.swing.JRadioButton();
        jbPrestado = new javax.swing.JRadioButton();
        jbDisponible = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtAñoIngreso = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtIBSN = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtAñoEscribio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableUsuarios = new javax.swing.JTable();
        btnEliminar1 = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        btnModificar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JtableLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JtableLibros);

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel12.setText("Autor:");

        jLabel13.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel13.setText("Titulo:");

        txtTitulo.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        txtAutor.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel14.setText("Genero del Libro:");

        txtGeneroLibro.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel15.setText("Editoriales:");

        txtEditoriales.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel16.setText("Idioma:");

        txtIdioma.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel17.setText("Persona que tiene el libro:");

        jLabel18.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel18.setText("Numero de cuenta de esa persona:");

        txtNumeroCuenta.setEditable(false);
        txtNumeroCuenta.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        txtPersonaLibro.setEditable(false);
        txtPersonaLibro.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        buttonGroup1.add(jbFueraInventario);
        jbFueraInventario.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jbFueraInventario.setText("Fuera de inventario");

        buttonGroup1.add(jbPrestado);
        jbPrestado.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jbPrestado.setText("Prestado");
        jbPrestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPrestadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jbDisponible);
        jbDisponible.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jbDisponible.setText("Disponible");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Estado del Libro:");

        jLabel20.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel20.setText("Año Ingreso del libro:");

        txtAñoIngreso.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel21.setText("IBSN:");

        txtIBSN.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel22.setText("Año que se escribio:");

        txtAñoEscribio.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        btnAgregar.setFont(new java.awt.Font("SimSun", 3, 24)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("SimSun", 3, 24)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("SimSun", 3, 24)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPersonaLibro)
                                    .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEditoriales)
                                    .addComponent(txtAutor)
                                    .addComponent(txtTitulo)
                                    .addComponent(txtGeneroLibro)
                                    .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAñoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel21)
                                                    .addComponent(jLabel22))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtAñoEscribio)
                                                    .addComponent(txtIBSN, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(155, 155, 155)
                                        .addComponent(jLabel19))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jbFueraInventario))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jbPrestado)
                                                .addGap(18, 18, 18)
                                                .addComponent(jbDisponible))))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtGeneroLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtEditoriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtAñoEscribio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(txtIBSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtAñoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbPrestado)
                            .addComponent(jbDisponible))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbFueraInventario)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPersonaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Libreria(Admin)", jPanel2);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel2.setText("Apellido:");

        txtApellido.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel3.setText("Edad:");

        txtEdad.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel4.setText("Codigo:");

        txtCodigo.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jtableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtableUsuarios);

        btnEliminar1.setFont(new java.awt.Font("SimSun", 3, 24)); // NOI18N
        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        btnAgregar1.setFont(new java.awt.Font("SimSun", 3, 24)); // NOI18N
        btnAgregar1.setText("Agregar");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        btnModificar1.setFont(new java.awt.Font("SimSun", 3, 24)); // NOI18N
        btnModificar1.setText("Modificar");
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(txtNombre)
                                .addComponent(txtApellido)
                                .addComponent(txtEdad))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnAgregar1)
                                    .addGap(79, 79, 79)
                                    .addComponent(btnModificar1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar1))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jButton1)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar1)
                    .addComponent(btnModificar1)
                    .addComponent(btnEliminar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );

        jTabbedPane1.addTab("Agregar", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPrestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPrestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPrestadoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
      String EstadoLibro = "";
      if(this.jbDisponible.isSelected()){
          EstadoLibro = "Disponible";
      } else if (this.jbPrestado.isSelected()){
          EstadoLibro = "Prestado";
      } 
      else if(this.jbFueraInventario.isSelected()){
          EstadoLibro = "Fuera inventario";
      }
      String errores="";
        boolean valido = true;
        if (this.txtAutor.getText() == null || "".equals(this.txtAutor.getText())) {
            errores+= "Ingrese el nombre de los Autores separado por (,)\n";
            valido = false; 
        }
        if (this.txtTitulo.getText() == null || "".equals(this.txtTitulo.getText())) {
            errores+="Ingrese el titulo del libro\n";
            valido = false;       
        }
        if (this.txtGeneroLibro.getText() == null || "".equals(this.txtGeneroLibro.getText())) {
            errores+="Ingrese el genero del libro\n";
            valido = false;
        }
        if (this.txtEditoriales.getText() == null || "".equals(this.txtEditoriales.getText())) {
            errores+= "Ingrese el editorial\n";
            valido = false;       
        }
        if (this.txtIdioma.getText() == null || "".equals(this.txtIdioma.getText())) {
            errores+= "Ingrese el idioma\n";
            valido = false;       
        }
        if (this.txtAñoEscribio.getText() == null || "".equals(this.txtAñoEscribio.getText())) {
            errores+= "Ingrese el año en que se escribio\n";
            valido = false; 
        }
        if (this.txtIBSN.getText() == null || "".equals(this.txtIBSN.getText())) {
           errores+= "Ingrese el IBSN del libro\n";
            valido = false;       
        }
        if (this.txtAñoIngreso.getText() == null || "".equals(this.txtAñoIngreso.getText())) {
            errores+= "Ingrese año que se ingreso\n";
            valido = false;
        }
        if (EstadoLibro == null || "".equals(EstadoLibro)) {
           errores+= "Ingrese el estado del libro\n";
            valido = false; 
        }
        if(valido){
            // guardar
            libros.add(new Libros(txtAutor.getText(), txtTitulo.getText(), txtGeneroLibro.getText(), txtEditoriales.getText(), txtIdioma.getText(), Integer.parseInt(txtAñoEscribio.getText()), txtIBSN.getText(), Integer.parseInt(txtAñoIngreso.getText()), EstadoLibro, "", 0));
            JOptionPane.showMessageDialog(this, "Se ha guardado exitosamente el libro");
            vaciarTablaLibros(JtableLibros);
            recargarTablaLibros(JtableLibros);
            MENU.libros = this.libros;
            
        } else {
             JOptionPane.showMessageDialog(this, errores);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
         String EstadoLibro = "";
      if(this.jbDisponible.isSelected()){
          EstadoLibro = "Disponible";
      } else if (this.jbPrestado.isSelected()){
          EstadoLibro = "Prestado";
      } 
      else if(this.jbFueraInventario.isSelected()){
          EstadoLibro = "Fuera inventario";
      }
      String errores="";
        boolean valido = true;
        if (this.txtAutor.getText() == null || "".equals(this.txtAutor.getText())) {
            errores+= "Ingrese el nombre de los Autores separado por (,)\n";
            valido = false; 
        }
        if (this.txtTitulo.getText() == null || "".equals(this.txtTitulo.getText())) {
            errores+="Ingrese el titulo del libro\n";
            valido = false;       
        }
        if (this.txtGeneroLibro.getText() == null || "".equals(this.txtGeneroLibro.getText())) {
            errores+="Ingrese el genero del libro\n";
            valido = false;
        }
        if (this.txtEditoriales.getText() == null || "".equals(this.txtEditoriales.getText())) {
            errores+= "Ingrese el editorial\n";
            valido = false;       
        }
        if (this.txtIdioma.getText() == null || "".equals(this.txtIdioma.getText())) {
            errores+= "Ingrese el idioma\n";
            valido = false;       
        }
        if (this.txtAñoEscribio.getText() == null || "".equals(this.txtAñoEscribio.getText())) {
            errores+= "Ingrese el año en que se escribio\n";
            valido = false; 
        }
        if (this.txtIBSN.getText() == null || "".equals(this.txtIBSN.getText())) {
           errores+= "Ingrese el IBSN del libro\n";
            valido = false;       
        }
        if (this.txtAñoIngreso.getText() == null || "".equals(this.txtAñoIngreso.getText())) {
            errores+= "Ingrese año que se ingreso\n";
            valido = false;
        }
        if (EstadoLibro == null || "".equals(EstadoLibro)) {
           errores+= "Ingrese el estado del libro\n";
            valido = false; 
        }
        if(valido && IdLibroActual!=-1){
            // editar
            Libros libro = libros.get(IdLibroActual);
            libro.setAutores(txtAutor.getText());
            libro.setTitulo(txtTitulo.getText());
            libro.setGenero(txtGeneroLibro.getText());
            libro.setEditoriales(txtEditoriales.getText());
            libro.setIdioma(txtIdioma.getText());
            libro.setYear(Integer.parseInt(txtAñoEscribio.getText()));
            libro.setISBN(txtIBSN.getText());
            libro.setYearIngresa(Integer.parseInt(txtAñoIngreso.getText()));
            libro.setEstadoLibro(EstadoLibro);
            JOptionPane.showMessageDialog(this, "Se ha guardado exitosamente el libro");
            // vaciarTablaLibros(JtableLibros);
            recargarTablaLibros(JtableLibros);
             MENU.libros = this.libros;
        } else {
             JOptionPane.showMessageDialog(this, errores);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(JtableLibros.getSelectedRow()>=0){
            // eliminar           
            int eliminar = JOptionPane.showConfirmDialog(this, "Estas seguro de eliminar este registro");
            if(eliminar == 0){
                libros.remove(IdLibroActual);
                this.IdLibroActual = -1;
                recargarTablaLibros(JtableLibros);
                MENU.libros = this.libros;
                JOptionPane.showMessageDialog(this, "Se elimino correctamente");
            }
        }
         else {
             JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar el registro");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
         if(jtableUsuarios.getSelectedRow()>=0){
            // eliminar           
            int eliminar = JOptionPane.showConfirmDialog(this, "Estas seguro de eliminar este registro");
            if(eliminar == 0){
                usuarios.remove(IdUsuarioActual);
                this.IdUsuarioActual = -1;
                recargarTablaLibros(jtableUsuarios);
                MENU.usuarios = this.usuarios;
                JOptionPane.showMessageDialog(this, "Se elimino correctamente");
            }
        }
         else {
             JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar el registro");
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        String errores="";
        boolean valido = true;
        if (this.txtNombre.getText() == null || "".equals(this.txtNombre.getText())) {
            errores+= "Ingrese el nombre del usuario\n";
            valido = false; 
        }
        if (this.txtApellido.getText() == null || "".equals(this.txtApellido.getText())) {
            errores+="Ingrese el apellido del usuario\n";
            valido = false;       
        }
        if (this.txtEdad.getText() == null || "".equals(this.txtEdad.getText())) {
            errores+= "Ingrese la edad del usuario\n";
            valido = false; 
        }
        if (this.txtCodigo.getText() == null || "".equals(this.txtCodigo.getText())) {
            errores+= "Ingrese el editorial\n";
            valido = false;
        }
        if(valido){
            // guardar
            usuarios.add(new Usuario(txtNombre.getText(),txtApellido.getText(), txtEdad.getText(), Integer.parseInt(txtCodigo.getText()),"",0));
            JOptionPane.showMessageDialog(this, "Se ha guardado exitosamente el usuario");
            vaciarTablaUsuarios(jtableUsuarios);
            recargarTablaUsuarios(jtableUsuarios);
            MENU.usuarios = this.usuarios;
            
        } else {
             JOptionPane.showMessageDialog(this, errores);
        }
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        String errores="";
        boolean valido = true;
        if (this.txtNombre.getText() == null || "".equals(this.txtNombre.getText())) {
            errores+= "Ingrese el nombre del usuario\n";
            valido = false; 
        }
        if (this.txtApellido.getText() == null || "".equals(this.txtApellido.getText())) {
            errores+="Ingrese el apellido del usuario\n";
            valido = false;       
        }
        if (this.txtEdad.getText() == null || "".equals(this.txtEdad.getText())) {
            errores+= "Ingrese la edad del usuario\n";
            valido = false; 
        }
        if (this.txtCodigo.getText() == null || "".equals(this.txtCodigo.getText())) {
            errores+= "Ingrese el editorial\n";
            valido = false;
        }
        if(valido && IdUsuarioActual!=-1){
            // editar
            Usuario usuario = usuarios.get(IdUsuarioActual);
            usuario.setNombre(txtNombre.getText());
            usuario.setApellido(txtApellido.getText());
            usuario.setEdad(txtEdad.getText());
            usuario.setCodigo(Integer.parseInt(txtCodigo.getText()));
            JOptionPane.showMessageDialog(this, "Se ha guardado exitosamente el usuario");
            vaciarTablaUsuarios(jtableUsuarios);
            recargarTablaUsuarios(jtableUsuarios);
            MENU.usuarios = this.usuarios;
            
        } else {
             JOptionPane.showMessageDialog(this, errores);
        }
    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        MENU menu = new MENU();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtableLibros;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton jbDisponible;
    private javax.swing.JRadioButton jbFueraInventario;
    private javax.swing.JRadioButton jbPrestado;
    private javax.swing.JTable jtableUsuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtAñoEscribio;
    private javax.swing.JTextField txtAñoIngreso;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEditoriales;
    private javax.swing.JTextField txtGeneroLibro;
    private javax.swing.JTextField txtIBSN;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroCuenta;
    private javax.swing.JTextField txtPersonaLibro;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
