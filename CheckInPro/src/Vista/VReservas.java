
package Vista;

import Datos.DatosReservas;
import Datos.Huespedes;
import Interfaces.DAO;
import Interfaces.DAOReservasImpl;
import java.util.List;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Valen
 */
public class VReservas extends javax.swing.JPanel {

    /**
     * Creates new form Reservas
     */
    public VReservas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        VCheckIn = new javax.swing.JTextField();
        VCheckout = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        VHabitacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        VHuesped = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        VAnticipo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Reservas");

        jLabel2.setText("CheckIn ");

        jLabel3.setText("Checkout");

        VCheckIn.setToolTipText("");
        VCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VCheckInActionPerformed(evt);
            }
        });

        jLabel4.setText("Nro Habitacion/es Reservada/s");

        VHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VHabitacionActionPerformed(evt);
            }
        });

        jLabel5.setText("Huesped que realiza la reserva");

        jLabel6.setText("Anticipo");

        VAnticipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VAnticipoActionPerformed(evt);
            }
        });

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
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "CheckIIn ", "Checkout", "Habitaci�n/es", "Huesped", "Anticipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("A g r e g a r");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("C a n c e l a r");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("G u a r d a r");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("E d i t a r");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("E l i m i n a r");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addGap(9, 9, 9)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(VCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(VHuesped))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(VAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(VCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(VHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(VCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(VHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void VAnticipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VAnticipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VAnticipoActionPerformed

    private void VHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VHabitacionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    int selectedRow = jTable1.getSelectedRow(); 
        
        
    if (selectedRow == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un hu�sped para editar", "!!AVISO!!", INFORMATION_MESSAGE);
        return;
    }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String checkIn = VCheckIn.getText();
        String checkout = VCheckout.getText();
        String habitacion = VHabitacion.getText();
        String huesped = VHuesped.getText();
        String anticipo = VAnticipo.getText();
        
        if(checkIn.isEmpty() || checkout.isEmpty() || habitacion.isEmpty() || huesped.isEmpty() || anticipo.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "debe completar todos los campos", "!!AVISO!!", INFORMATION_MESSAGE);
        }
        
        DatosReservas reserva = new DatosReservas();
        reserva.setCheckIn((String) (checkIn));
        reserva.setCheckout((String) (checkout));
        reserva.setNroHabitacion((int) Integer.parseInt(habitacion));
        reserva.setHuesped((int) Integer.parseInt(huesped));
        reserva.setAnticipo((int) Integer.parseInt(anticipo));
        try {
            DAO dao = new DAOReservasImpl() {
                 
            };
        dao.crear(reserva);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Huesped Registrado", "AVISO", INFORMATION_MESSAGE);
            
            
            
            VCheckIn.setText("");
            VCheckout.setText("");
            VHabitacion.setText("");
            VHuesped.setText("");
            VAnticipo.setText("");
            
        } catch(Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrio un error al intentar registrar al Huesped", "!!AVISO!!", HEIGHT);
            System.out.println(e.getMessage());
            
        }System.out.println("Huesped Registrado :D");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VCheckInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VCheckInActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int[] selectedRows = jTable1.getSelectedRows();
    
    if (selectedRows.length == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione al menos una reserva para eliminar", "!!AVISO!!", INFORMATION_MESSAGE);
        return;
    }
    
    try {
        DAO dao = new DAOReservasImpl();
        
        for (int row : selectedRows) {
            int userId = (int) jTable1.getValueAt(row, 0); 
            dao.borrar(userId); 
            
            
        }

        javax.swing.JOptionPane.showMessageDialog(this, "reserva(s) eliminada(s)", "AVISO", INFORMATION_MESSAGE);
        refreshTable(); 

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Ocurri� un error al intentar eliminar la reserva", "!!AVISO!!", INFORMATION_MESSAGE);
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    int[] selectedRows = jTable1.getSelectedRows();
    
    if (selectedRows.length == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione al menos un huesped para eliminar", "!!AVISO!!", INFORMATION_MESSAGE);
        return;
    }
    
    try {
        DAO dao = new DAOReservasImpl();
        
        for (int row : selectedRows) {
            int userId = (int) jTable1.getValueAt(row, 0); 
            dao.borrar(userId); 
            
            
        }

        javax.swing.JOptionPane.showMessageDialog(this, "Huesped(es) eliminado(s)", "AVISO", INFORMATION_MESSAGE);
        refreshTable(); 

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Ocurri� un error al intentar eliminar el huesped", "!!AVISO!!", INFORMATION_MESSAGE);
        System.out.println(e.getMessage());
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VCheckIn.setText("");
        VCheckout.setText("");
        VHabitacion.setText("");
        VHuesped.setText("");
        VAnticipo.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

     private void LoadReservas() {
    try {
        DAO dao = new DAOReservasImpl();
        List<DatosReservas> listaDatosReservas = dao.listar();

        
        String[] columnas = {"id", "CheckIn", "Checkout", "Habitaci�n/es", "Huesped", "Anticipo" };
        Object[][] data = new Object[listaDatosReservas.size()][columnas.length];

        for (int i = 0; i < listaDatosReservas.size(); i++) {
            DatosReservas reserva = listaDatosReservas.get(i);
            data[i][0] = reserva.getId(); 
            data[i][1] = reserva.getCheckIn();
            data[i][2] = reserva.getCheckout();
            data[i][3] = reserva.getNroHabitacion(); 
            data[i][4] = reserva.getHuesped(); 
            data[i][5] = reserva.getAnticipo();
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(data, columnas));

    } catch (Exception e) {
        System.out.println("Error al cargar los datos: " + e.getMessage());
    }
    }
    private void refreshTable(){
        LoadReservas();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField VAnticipo;
    private javax.swing.JTextField VCheckIn;
    private javax.swing.JTextField VCheckout;
    private javax.swing.JTextField VHabitacion;
    private javax.swing.JTextField VHuesped;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
}
