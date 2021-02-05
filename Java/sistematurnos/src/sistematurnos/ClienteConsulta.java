package sistematurnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClienteConsulta extends javax.swing.JFrame {

    private Connection con;
    ClienteModificacion clientemodificacion;
    
    public ClienteConsulta() {
        initComponents();
        
        clientemodificacion = new ClienteModificacion();
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfDNI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        jLabel1.setText("Consulta de Clientes");

        jLabel2.setText("DNI:");

        jLabel3.setText("Apellido:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombres", "Apellidos", "DNI", "Mail", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(btnBuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(btnCerrar)))
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addGap(32, 32, 32)
                .addComponent(btnCerrar)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost/gestionturnos", "root", "");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM clientes");
            
            Auxiliares Comparador = new Auxiliares(tfDNI.getText());
            boolean esNumerico = Auxiliares.isNumeric(tfDNI.getText());
            if(!tfDNI.getText().equals("")){
                if(!esNumerico){
                    JOptionPane.showMessageDialog(tfDNI, "El DNI ingresado posee caracteres no permitidos");
                    return;
                }
            }
            if (!tfApellido.getText().equals("") && tfDNI.getText().equals("")) {
                rs = stmt.executeQuery("SELECT * FROM clientes WHERE Apellidos='" + tfApellido.getText() + "'");
            } else {
                if (tfApellido.getText().equals("") && !tfDNI.getText().equals("")) {
                    rs = stmt.executeQuery("SELECT * FROM clientes WHERE DNI=" + tfDNI.getText() + "");
                } else {
                    if (!tfApellido.getText().equals("") && !tfDNI.getText().equals("")) {
                        rs = stmt.executeQuery("SELECT * FROM clientes WHERE DNI=" + tfDNI.getText() + "&& Apellidos='" + tfApellido.getText() + "'");
                    } else {
                        rs = stmt.executeQuery("SELECT * FROM clientes");
                    }
                }
            }

            if (rs.next()) {
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                eliminarRegistros(modelo);
                do {
                    String[] fila = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)
                    };
                    modelo.addRow(fila);
                } while (rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteConsulta.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(tfDNI, "Error al conectar con la base de datos");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            String id;
            id = tabla.getModel().getValueAt(fila, 0).toString();
            int Confirmacion = -1;
            Confirmacion = JOptionPane.showConfirmDialog(tfDNI, "Esta seguro que desea eliminar este cliente? Se eliminaran los turnos registrados a su nombre");// 0 = SI, 1 = NO , 2 = CANCELAR  
            
            
            if (Confirmacion == 0) {
                try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost/gestionturnos", "root", "");
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate("DELETE FROM turnos WHERE IdCliente=" + id + "");
                    stmt.executeUpdate("DELETE FROM Clientes WHERE IdCliente=" + id + "");
                    JOptionPane.showMessageDialog(this, "Cliente eliminado con exito");
                    modelo.removeRow(fila);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error al eliminar un cliente");
                    Logger.getLogger(ProfesionalConsulta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int NroFilaSeleccionada = tabla.getSelectedRow();  
        String fila;
        if (NroFilaSeleccionada >= 0) {
            fila = modelo.getDataVector().elementAt(tabla.getSelectedRow()).toString();
 
            clientemodificacion.setDatos(fila);
            clientemodificacion.setVisible(true);
            
            //id = tabla.getModel().getValueAt(fila, 0).toString();

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    public static void eliminarRegistros(final DefaultTableModel modelo) {
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfDNI;
    // End of variables declaration//GEN-END:variables
}
