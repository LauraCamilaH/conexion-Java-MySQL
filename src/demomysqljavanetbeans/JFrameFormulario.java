/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demomysqljavanetbeans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameFormulario extends javax.swing.JFrame {

    DefaultTableModel ptabla = new DefaultTableModel();
    Connection cn;
    PreparedStatement pst;
    ResultSet resultadoConsulta;
    private String Genero;
    String NombreActividad[] = new String[3];
    SimpleDateFormat formato = new SimpleDateFormat("yy-MM-dd");

    /**
     * Creates new form JFrameFormulario
     */
    public JFrameFormulario() {
        initComponents();
        String tit[] = {"Id", "Código", "Nombre", "Fecha"};
        ptabla.setColumnIdentifiers(tit);
        tablaVariable.setModel(ptabla);
        this.Identificador.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoGenero = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CheckBoxFutbol = new javax.swing.JCheckBox();
        CheckBoxBaloncesto = new javax.swing.JCheckBox();
        CheckBoxNatación = new javax.swing.JCheckBox();
        GeneMasculino = new javax.swing.JRadioButton();
        GeneFemenino = new javax.swing.JRadioButton();
        campoNombre = new javax.swing.JTextField();
        campoCodigo = new javax.swing.JTextField();
        campoFecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BotonInserta = new javax.swing.JButton();
        PanelListaEstudiantes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Identificador = new javax.swing.JTextField();
        CampoBuscarCodigo = new javax.swing.JTextField();
        BotonRefresca = new javax.swing.JButton();
        BLimpia = new javax.swing.JButton();
        Belimina = new javax.swing.JButton();
        BotonModifica = new javax.swing.JButton();
        BotonBusca = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Notas = new javax.swing.JComboBox<>();
        Asignatura = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVariable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Nombre");

        jLabel2.setText("Código");

        CheckBoxFutbol.setText("Futbol");
        CheckBoxFutbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxFutbolActionPerformed(evt);
            }
        });

        CheckBoxBaloncesto.setText("Baloncesto");
        CheckBoxBaloncesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxBaloncestoActionPerformed(evt);
            }
        });

        CheckBoxNatación.setText("Natación");
        CheckBoxNatación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxNataciónActionPerformed(evt);
            }
        });

        btnGrupoGenero.add(GeneMasculino);
        GeneMasculino.setText("Masculino ");
        GeneMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneMasculinoActionPerformed(evt);
            }
        });

        btnGrupoGenero.add(GeneFemenino);
        GeneFemenino.setText("Femenino ");
        GeneFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneFemeninoActionPerformed(evt);
            }
        });

        campoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodigoActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Incripcion asignatura AAAA-MM-DD");

        jLabel6.setText("Seleccione Genero del estudiante ");

        jLabel7.setText("Actividades del estudiante ");

        BotonInserta.setText("Insertar datos del estudiante ");
        BotonInserta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(116, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(CheckBoxNatación)
                                .addGap(18, 18, 18)
                                .addComponent(CheckBoxBaloncesto)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(GeneFemenino)
                                        .addGap(18, 18, 18)
                                        .addComponent(GeneMasculino))
                                    .addComponent(CheckBoxFutbol)))
                            .addComponent(BotonInserta))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(GeneMasculino)
                    .addComponent(GeneFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBoxFutbol)
                    .addComponent(CheckBoxNatación)
                    .addComponent(CheckBoxBaloncesto)
                    .addComponent(jLabel7))
                .addGap(49, 49, 49)
                .addComponent(BotonInserta)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        GeneMasculino.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Ingresar Estudiante", jPanel2);

        jLabel1.setText("******************** ESTUDIANTES CUN***********************");

        jLabel5.setText("Digite el codigo para buscar el estudiante ");

        CampoBuscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoBuscarCodigoActionPerformed(evt);
            }
        });

        BotonRefresca.setText("Refrescar Datos ");
        BotonRefresca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRefrescaActionPerformed(evt);
            }
        });

        BLimpia.setText("Limpia Tabla");
        BLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpiaActionPerformed(evt);
            }
        });

        Belimina.setText("Eliminar Estudiante ");
        Belimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminaActionPerformed(evt);
            }
        });

        BotonModifica.setText("Modificar Estudiante ");
        BotonModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificaActionPerformed(evt);
            }
        });

        BotonBusca.setText("Buscar");
        BotonBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscaActionPerformed(evt);
            }
        });

        jLabel8.setText("********************ASIGNATURAS Y NOTAS DEL ESTUDIANTE**************");

        Notas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Asignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tablaVariable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaVariable);

        jLabel9.setText("************************BUSCAR*******************************");

        javax.swing.GroupLayout PanelListaEstudiantesLayout = new javax.swing.GroupLayout(PanelListaEstudiantes);
        PanelListaEstudiantes.setLayout(PanelListaEstudiantesLayout);
        PanelListaEstudiantesLayout.setHorizontalGroup(
            PanelListaEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
            .addGroup(PanelListaEstudiantesLayout.createSequentialGroup()
                .addGroup(PanelListaEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelListaEstudiantesLayout.createSequentialGroup()
                        .addComponent(BotonRefresca)
                        .addGap(38, 38, 38)
                        .addComponent(BLimpia)
                        .addGap(41, 41, 41)
                        .addComponent(Belimina)
                        .addGap(18, 18, 18)
                        .addComponent(BotonModifica))
                    .addGroup(PanelListaEstudiantesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelListaEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addGroup(PanelListaEstudiantesLayout.createSequentialGroup()
                                .addComponent(BotonBusca)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CampoBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelListaEstudiantesLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(Asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Notas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelListaEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelListaEstudiantesLayout.createSequentialGroup()
                    .addContainerGap(522, Short.MAX_VALUE)
                    .addComponent(Identificador, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8))
                .addGroup(PanelListaEstudiantesLayout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanelListaEstudiantesLayout.setVerticalGroup(
            PanelListaEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListaEstudiantesLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(PanelListaEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelListaEstudiantesLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(PanelListaEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonRefresca)
                            .addComponent(BLimpia)
                            .addComponent(Belimina)
                            .addComponent(BotonModifica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(13, 13, 13)
                        .addComponent(BotonBusca))
                    .addGroup(PanelListaEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(CampoBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(PanelListaEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Notas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(PanelListaEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelListaEstudiantesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(Identificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(386, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Lista de Estudiantes ", PanelListaEstudiantes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 188, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodigoActionPerformed

    private void BotonRefrescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRefrescaActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:

        try {
            cn = Connecta.abrebase();
            Statement s = cn.createStatement();
//consuta a mostrar
            String query = "select * from estudiante";
            resultadoConsulta = s.executeQuery(query);
            cargarResultados(resultadoConsulta);
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);//
        }
    }//GEN-LAST:event_BotonRefrescaActionPerformed

    private void cargarResultados(ResultSet resultadoConsulta) throws SQLException {
        System.out.println(resultadoConsulta);
        ResultSetMetaData rsmd = resultadoConsulta.getMetaData();
        DefaultTableModel tablaResultados = new DefaultTableModel();
        tablaVariable.setModel(tablaResultados);
//obtenemos numero de columnas
        int CanColumns = rsmd.getColumnCount();
//comprobamos
//System.out.println(CanColumns);
        for (int i = 1; i <= CanColumns; i++) {
//cargamos columnas en modelo
//modelo.addColumn(rsmd.getColumnLabel(i));
            tablaResultados.addColumn(rsmd.getColumnLabel(i));
        }
        while (resultadoConsulta.next()) { //Iterar a través de los resultados
//creamos array
            Object[] fila = new Object[CanColumns];
//cargamos datos a modelo
            for (int i = 0; i < CanColumns; i++) {
                fila[i] = resultadoConsulta.getObject(i + 1);
//System.out.print ln(fila[i]);
            }
//adiciona fila
            tablaResultados.addRow(fila);
        }
    }

    private Integer getIdGenerado(ResultSet rs) throws SQLException { // retorna el numero de Id en el que va
        if (rs.next()) {
            return rs.getInt(1);
        }
        return null;
    }


    private void BotonInsertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertaActionPerformed

        try {
            Connection conexion = Connecta.abrebase(); //
            String sql = "INSERT INTO estudiante (codigo, nombre,fecha_inscripcion,genero) VALUES (?,?,?,?)";
            PreparedStatement estamento = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            estamento.setString(2, campoNombre.getText());
            estamento.setDate(3, new java.sql.Date(formato.parse(campoFecha.getText()).getTime()));
            estamento.setString(4, Genero);

            int filasInsertadas = estamento.executeUpdate();
            if (filasInsertadas > 0) {
                Integer idEstudiante = getIdGenerado(estamento.getGeneratedKeys());
                insertarActividad(idEstudiante);
            estamento.setString(1, campoCodigo.getText());
                mensaje("Estudiante ingresado");
                blancos();
            } else {
                mensaje("Error");
                blancos();
            }

            conexion.close();

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex);
        }
    }//GEN-LAST:event_BotonInsertaActionPerformed

    private void BotonBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscaActionPerformed

        try {
            cn = Connecta.abrebase();
            String sql = "SELECT * FROM estudiante WHERE codigo = ?";
            PreparedStatement statement = cn.prepareStatement(sql);
            statement.setInt(1, Integer.parseInt(CampoBuscarCodigo.getText()));
            ResultSet resultado = statement.executeQuery();
            cargarResultados(resultado);
            cn.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }
    }//GEN-LAST:event_BotonBuscaActionPerformed

    private void BeliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliminaActionPerformed
        try {
            cn = Connecta.abrebase();
            int filaSeleccionada = tablaVariable.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(null, "Error seleccione una fila de la tabla");
            } else {
                String codigo = String.valueOf(tablaVariable.getValueAt(filaSeleccionada, 1));
                String sql = "DELETE FROM estudiante Where codigo = ? ";
                PreparedStatement statement = cn.prepareStatement(sql);
                statement.setString(1, codigo);
                int cantidadFilasModificadas = statement.executeUpdate();
                if (cantidadFilasModificadas == 0) {
                    JOptionPane.showMessageDialog(null, "No se eliminó ningun registro");//
                }
            }
            cn.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);//
        }
        BotonRefrescaActionPerformed(evt);
    }//GEN-LAST:event_BeliminaActionPerformed

    private void BLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimpiaActionPerformed

        DefaultTableModel temp;
        try {
            temp = (DefaultTableModel) tablaVariable.getModel();
            int a = temp.getRowCount();
            for (int i = 0; i < a; i++) {
                temp.removeRow(0);
            }

        } catch (Exception e) {

            System.out.println(e);
        }

    }//GEN-LAST:event_BLimpiaActionPerformed

    private void GeneFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneFemeninoActionPerformed
        Genero = "F";
    }//GEN-LAST:event_GeneFemeninoActionPerformed


    private void GeneMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneMasculinoActionPerformed
        Genero = "M";
    }//GEN-LAST:event_GeneMasculinoActionPerformed

    private void CampoBuscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoBuscarCodigoActionPerformed

    }//GEN-LAST:event_CampoBuscarCodigoActionPerformed

    private void CheckBoxFutbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxFutbolActionPerformed
        if (CheckBoxFutbol.isSelected()) {
            NombreActividad[0] = "Futbol";
        } else {
            NombreActividad[0] = null;
        }
    }//GEN-LAST:event_CheckBoxFutbolActionPerformed

    private void CheckBoxNataciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxNataciónActionPerformed
        if (CheckBoxNatación.isSelected()) {
            NombreActividad[1] = "Natacion";
        } else {
            NombreActividad[1] = null;
        }
    }//GEN-LAST:event_CheckBoxNataciónActionPerformed

    private void CheckBoxBaloncestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxBaloncestoActionPerformed
        if (CheckBoxBaloncesto.isSelected()) {
            NombreActividad[2] = "baloncesto";
        } else {
            NombreActividad[2] = null;
        }
    }//GEN-LAST:event_CheckBoxBaloncestoActionPerformed

    private void BotonModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificaActionPerformed
        try {
            Connection connection = Connecta.abrebase();
            String sql = "UPDATE estudiante SET codigo = ?, nombre = ?, fecha_inscripcion=?,genero=? where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            int filaSelecionada = tablaVariable.getSelectedRow();

            String nombre = String.valueOf(tablaVariable.getValueAt(filaSelecionada, 2));
            String codigo = String.valueOf(tablaVariable.getValueAt(filaSelecionada, 1));
            String fecha = String.valueOf(tablaVariable.getValueAt(filaSelecionada, 3));
            String generoModificar = String.valueOf(tablaVariable.getValueAt(filaSelecionada, 4));
            String idModificar = String.valueOf(tablaVariable.getValueAt(filaSelecionada, 0));

            statement.setString(1, codigo);
            statement.setString(2, nombre);
            statement.setDate(3, new java.sql.Date(formato.parse(fecha).getTime()));
            statement.setString(4, generoModificar);
            statement.setString(5, idModificar);

            int res = statement.executeUpdate();
            if (res > 0) {
                mensaje("datos modificados");
                blancos();
            } else {
                mensaje("Error");
                blancos();
            }
            connection.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            ex.printStackTrace();
        }

        BotonRefrescaActionPerformed(null);
    }//GEN-LAST:event_BotonModificaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Asignatura;
    private javax.swing.JButton BLimpia;
    private javax.swing.JButton Belimina;
    private javax.swing.JButton BotonBusca;
    private javax.swing.JButton BotonInserta;
    private javax.swing.JButton BotonModifica;
    private javax.swing.JButton BotonRefresca;
    private javax.swing.JTextField CampoBuscarCodigo;
    private javax.swing.JCheckBox CheckBoxBaloncesto;
    private javax.swing.JCheckBox CheckBoxFutbol;
    private javax.swing.JCheckBox CheckBoxNatación;
    private javax.swing.JRadioButton GeneFemenino;
    private javax.swing.JRadioButton GeneMasculino;
    private javax.swing.JTextField Identificador;
    private javax.swing.JComboBox<String> Notas;
    private javax.swing.JPanel PanelListaEstudiantes;
    private javax.swing.ButtonGroup btnGrupoGenero;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaVariable;
    // End of variables declaration//GEN-END:variables

    public void blancos() {
        Identificador.setText(null);
        campoCodigo.setText(null);
        campoNombre.setText(null);
        campoFecha.setText(null);
        campoCodigo.setEditable(true);
        campoCodigo.requestFocus();

    }

    private void insertarActividad(Integer idEstudiante) {
        if (CheckBoxBaloncesto.isSelected()) {
            insertarInscripcionActividad(idEstudiante, 3);
        }
        if (CheckBoxFutbol.isSelected()) {
            insertarInscripcionActividad(idEstudiante, 1);
        }
        if (CheckBoxNatación.isSelected()) {
            insertarInscripcionActividad(idEstudiante, 2);
        }
    }

    private void insertarInscripcionActividad(Integer idEstudiante, Integer idActividad) {
        try {
            Connection connection = Connecta.abrebase();
            String sql = "INSERT INTO Inscripcion_actividad (estudiante_id, Actividad_id) VALUES (?,?)";
            PreparedStatement estamento = connection.prepareStatement(sql);
            estamento.setInt(1, idEstudiante);
            estamento.setInt(2, idActividad);
            estamento.executeUpdate();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex);
        }
    }

    public void mensaje(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }

}
