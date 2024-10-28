
package Vista;

import Datos.Huespedes;
import Interfaces.DAOHuespedesImpl;
import java.util.List;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import Interfaces.DAO;



public class VHuespedes extends javax.swing.JPanel {
    private int idSeleccionado = -1;

    public VHuespedes() {
        initComponents();
        LoadHuespedes();
            
    }

    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        HApellido = new javax.swing.JTextField();
        HNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        HCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        HDni = new javax.swing.JTextField();
        HTelefono = new javax.swing.JTextField();
        BtnAgregar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "DNI", "Telefono", "Mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Huesped");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        HNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Correo Electronico");

        jLabel5.setText("DNI");

        jLabel6.setText("Telefono");

        BtnAgregar.setText("A g r e g a r");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnGuardar.setText("G u a r d a r");
        BtnGuardar.setName(""); // NOI18N
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnEditar.setText("E d i t a r");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        jButton5.setText("E l i m i n a r");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setText("C a n c e l a r");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(BtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(HApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(HNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(HDni)
                                    .addComponent(HTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(HCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(HNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(HDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(HApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(HTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(HCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        String nombre = HNombre.getText();
        String apellido = HApellido.getText();
        String correo = HCorreo.getText();
        String telefono = HTelefono.getText();
        String documento = HDni.getText();
        
        if(nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || telefono.isEmpty() || documento.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "debe completar todos los campos", "!!AVISO!!", INFORMATION_MESSAGE);
            return;
        }
        
        Huespedes huesped = new Huespedes();
        huesped.setNombre(nombre);
        huesped.setApellido(apellido);
        huesped.setCorreo(correo);
        huesped.setTelefono(telefono);
        huesped.setDocumento(Long.parseLong(documento));
        
        try {
            DAO dao = new DAOHuespedesImpl();
            dao.crear(huesped);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Huesped Registrado", "AVISO", INFORMATION_MESSAGE);
            
            refreshTable();
            
            HNombre.setText("");
            HApellido.setText("");
            HCorreo.setText("");
            HTelefono.setText("");
            HDni.setText("");
            
        } catch(Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrio un error al intentar registrar al Huesped", "!!AVISO!!", HEIGHT);
            System.out.println(e.getMessage());
            
        }System.out.println("Huesped Registrado :D");
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void HNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HNombreActionPerformed
        
    }//GEN-LAST:event_HNombreActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int[] selectedRows = jTable1.getSelectedRows();
    
    if (selectedRows.length == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione al menos un huesped para eliminar", "!!AVISO!!", INFORMATION_MESSAGE);
        return;
    }
    
    try {
        DAO dao = new DAOHuespedesImpl();
        
        for (int row : selectedRows) {
            int userId = (int) jTable1.getValueAt(row, 0); 
            dao.borrar(userId); 
            
            
        }

        javax.swing.JOptionPane.showMessageDialog(this, "Huesped(es) eliminado(s)", "AVISO", INFORMATION_MESSAGE);
        refreshTable(); 

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al intentar eliminar el huesped", "!!AVISO!!", INFORMATION_MESSAGE);
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        int selectedRow = jTable1.getSelectedRow(); 
    if (selectedRow == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un huésped para editar", "!!AVISO!!", INFORMATION_MESSAGE);
        return;
    }

    try {
        DAO dao = new DAOHuespedesImpl();
        
        idSeleccionado = (int) jTable1.getValueAt(selectedRow, 0);
        
        
        String nombre = (String) jTable1.getValueAt(selectedRow, 1);
        String apellido = (String) jTable1.getValueAt(selectedRow, 2);
        String dni = jTable1.getValueAt(selectedRow, 3).toString();
        String telefono = jTable1.getValueAt(selectedRow, 4).toString();
        String correo = (String) jTable1.getValueAt(selectedRow, 5);

        
        HNombre.setText(nombre);
        HApellido.setText(apellido);
        HDni.setText(dni);
        HTelefono.setText(telefono);
        HCorreo.setText(correo);

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al cargar los datos del huésped", "!!AVISO!!", INFORMATION_MESSAGE);
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
    int selectedRow = jTable1.getSelectedRow(); 
        
        
    if (selectedRow == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un huésped para editar", "!!AVISO!!", INFORMATION_MESSAGE);
        return;
    }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HNombre.setText("");
        HApellido.setText("");
        HCorreo.setText("");
        HTelefono.setText("");
            HDni.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JTextField HApellido;
    private javax.swing.JTextField HCorreo;
    private javax.swing.JTextField HDni;
    private javax.swing.JTextField HNombre;
    private javax.swing.JTextField HTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void LoadHuespedes() {
    try {
        DAO dao = new DAOHuespedesImpl();
        List<Huespedes> listaHuespedes = dao.listar();

        
        String[] columnas = {"Id", "Nombre", "Apellido", "DNI", "Telefono", "Mail"};
        Object[][] data = new Object[listaHuespedes.size()][columnas.length];

        for (int i = 0; i < listaHuespedes.size(); i++) {
            Huespedes huesped = listaHuespedes.get(i);
            data[i][0] = huesped.getId(); 
            data[i][1] = huesped.getNombre();
            data[i][2] = huesped.getApellido();
            data[i][3] = huesped.getDocumento(); 
            data[i][4] = huesped.getTelefono(); 
            data[i][5] = huesped.getCorreo();
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(data, columnas));

    } catch (Exception e) {
        System.out.println("Error al cargar los datos: " + e.getMessage());
    }
    }
    private void refreshTable(){
        LoadHuespedes();
    }
}

    

