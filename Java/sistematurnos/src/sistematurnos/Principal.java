package sistematurnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static sistematurnos.ClienteConsulta.eliminarRegistros;

public class Principal extends javax.swing.JFrame {

    ClienteRegistro clienteregistro;
    ProfesionalRegistro profesionalregistro;
    ClienteConsulta clienteconsulta;
    ProfesionalConsulta profesionalconsulta;
    TurnoRegistro turnoregistro;
    private Connection con;

    public Principal() {
        initComponents();
        clienteregistro = new ClienteRegistro();
        profesionalregistro = new ProfesionalRegistro();
        clienteconsulta = new ClienteConsulta();
        profesionalconsulta = new ProfesionalConsulta();

        this.cargarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTurnoRegistro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Recargar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        ArchivoSalir = new javax.swing.JMenuItem();
        MenuCliente = new javax.swing.JMenu();
        ClientesRegistrar = new javax.swing.JMenuItem();
        ClientesConsultar = new javax.swing.JMenuItem();
        MenuProfesional = new javax.swing.JMenu();
        ProfesionalesRegistrar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTurnoRegistro.setText("Nuevo Turno");
        btnTurnoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurnoRegistroActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Turno", "Cliente", "Profesional", "Hora"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        Recargar.setText("Recargar");
        Recargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecargarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar Turno");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        MenuArchivo.setText("Archivo");

        ArchivoSalir.setText("Salir");
        MenuArchivo.add(ArchivoSalir);

        jMenuBar1.add(MenuArchivo);

        MenuCliente.setText("Clientes");

        ClientesRegistrar.setText("Registrar");
        ClientesRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesRegistrarActionPerformed(evt);
            }
        });
        MenuCliente.add(ClientesRegistrar);

        ClientesConsultar.setText("Consultar/Eliminar");
        ClientesConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesConsultarActionPerformed(evt);
            }
        });
        MenuCliente.add(ClientesConsultar);

        jMenuBar1.add(MenuCliente);

        MenuProfesional.setText("Profesionales");

        ProfesionalesRegistrar.setText("Registrar");
        ProfesionalesRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfesionalesRegistrarActionPerformed(evt);
            }
        });
        MenuProfesional.add(ProfesionalesRegistrar);

        jMenuItem1.setText("Consultar/Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuProfesional.add(jMenuItem1);

        jMenuBar1.add(MenuProfesional);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(482, 482, 482)
                                .addComponent(btnTurnoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnEliminar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Recargar))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 263, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnTurnoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Recargar)
                    .addComponent(btnEliminar))
                .addGap(45, 45, 45)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientesRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesRegistrarActionPerformed
        // TODO add your handling code here:
        clienteregistro.setVisible(true);
    }//GEN-LAST:event_ClientesRegistrarActionPerformed

    private void ClientesConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesConsultarActionPerformed
        // TODO add your handling code here:
        clienteconsulta.setVisible(true);
    }//GEN-LAST:event_ClientesConsultarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        profesionalconsulta.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ProfesionalesRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfesionalesRegistrarActionPerformed
        // TODO add your handling code here:
        profesionalregistro.setVisible(true);
    }//GEN-LAST:event_ProfesionalesRegistrarActionPerformed

    private void btnTurnoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnoRegistroActionPerformed
        turnoregistro = new TurnoRegistro();
        turnoregistro.setVisible(true);
    }//GEN-LAST:event_btnTurnoRegistroActionPerformed

    private void RecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecargarActionPerformed
        // TODO add your handling code here:
        this.cargarTabla();
    }//GEN-LAST:event_RecargarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            String id;
            id = tabla.getModel().getValueAt(fila, 0).toString();
            int Confirmacion = -1;
            Confirmacion = JOptionPane.showConfirmDialog(tabla, "Esta seguro que desea eliminar este turno?");// 0 = SI, 1 = NO , 2 = CANCELAR  

            if (Confirmacion == 0) {
                try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost/gestionturnos", "root", "");
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate("DELETE FROM turnos WHERE IdCliente=" + id);
                    JOptionPane.showMessageDialog(this, "Turno eliminado con exito");
                    modelo.removeRow(fila);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error al eliminar un Turno");
                    Logger.getLogger(ProfesionalConsulta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public void cargarTabla() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestionturnos", "root", "");
            Statement stmt = con.createStatement();
            Auxiliares auxiliar = new Auxiliares();
            ResultSet rs = stmt.executeQuery("SELECT * FROM turnos"); //IdTurno, IdCliente, IdProfesional, Fecha
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            eliminarRegistros(modelo);

            if (rs.next()) {

                do {
                    System.out.println(rs.getString(2));
                    String[] fila = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)
                    };
                    fila[1] = auxiliar.nombreClientePorId(Integer.parseInt(rs.getString(2)));
                    fila[2] = auxiliar.nombreProfesionalPorId(Integer.parseInt(rs.getString(3)));

                    modelo.addRow(fila);
                } while (rs.next());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    public static void eliminarRegistros(final DefaultTableModel modelo) {
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ArchivoSalir;
    private javax.swing.JMenuItem ClientesConsultar;
    private javax.swing.JMenuItem ClientesRegistrar;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu MenuCliente;
    private javax.swing.JMenu MenuProfesional;
    private javax.swing.JMenuItem ProfesionalesRegistrar;
    private javax.swing.JButton Recargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTurnoRegistro;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
