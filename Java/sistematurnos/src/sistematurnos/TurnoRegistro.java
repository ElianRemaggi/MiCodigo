package sistematurnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TurnoRegistro extends javax.swing.JFrame {

    private Connection con;
    private ResultSet rs;

    public TurnoRegistro() {

        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Completar combo box Cliente y Profesional
        ArrayList<String> lista = new ArrayList<>();
        lista = this.llenarComboCliente();
        cmbCliente.removeAllItems();
        cmbProfesionales.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            cmbCliente.addItem(lista.get(i));
        }
        lista = this.llenarComboProfesional();
        for (int i = 0; i < lista.size(); i++) {
            cmbProfesionales.addItem(lista.get(i));
        }
        cmbProfesionales.setSelectedIndex(-1);
        cmbCliente.setSelectedIndex(-1);
        //Completar el combobox de horas
        int i;
        cmbHora.removeAllItems();
        String HoraAuxiliar;
        for (i = 8; i < 20; i++) {
            HoraAuxiliar = i + ":00";
            cmbHora.addItem(HoraAuxiliar);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbCliente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbProfesionales = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        cmbHora = new javax.swing.JComboBox<>();
        dcFecha = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione Cliente =");

        jLabel2.setText("Seleccione Profesional =");

        cmbProfesionales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        cmbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHoraActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione Fecha =");

        jLabel4.setText("Seleccione Hora =");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 231, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbProfesionales, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbProfesionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClienteActionPerformed


    }//GEN-LAST:event_cmbClienteActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //Validacion campos completos

        //Tomar id del Profesional
        try {
            String IdSeleccionadoProfesional = cmbProfesionales.getSelectedItem().toString();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El campo Porfesionales posee un error");
            return;
        }
        String IdSeleccionadoProfesional = cmbProfesionales.getSelectedItem().toString();
        char[] IdSeleccionadoProfesionalChar;
        IdSeleccionadoProfesionalChar = IdSeleccionadoProfesional.toCharArray();
        IdSeleccionadoProfesional = "";
        
        //ciclo para tomar los id del string seleccionado
        int i = 0;
        do {
            IdSeleccionadoProfesional = IdSeleccionadoProfesional + IdSeleccionadoProfesionalChar[i];
            i++;
        } while (IdSeleccionadoProfesionalChar[i] != 32);

        // System.out.println("Id seleccionado Profesional = " + IdSeleccionadoProfesional);
        //Tomar Id del Cliente
        try {
            String IdSeleccionadoCliente = cmbCliente.getSelectedItem().toString();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El campo Cliente posee un error");
            return;
        }
        String IdSeleccionadoCliente = cmbCliente.getSelectedItem().toString();
        char[] IdSeleccionadoClienteChar;
        IdSeleccionadoClienteChar = IdSeleccionadoCliente.toCharArray();
        IdSeleccionadoCliente = "";
        i = 0;
        //ciclo para tomar los id del string seleccionado

        do {
            IdSeleccionadoCliente = IdSeleccionadoCliente + IdSeleccionadoClienteChar[i];
            i++;
        } while (IdSeleccionadoClienteChar[i] != 32);

        // System.out.println("Id seleccionado Cliente = " + IdSeleccionadoCliente);
        //tomar fecha y hora, formato sql = YYYY-MM-DD HH:MI:SS 2008-11-11 13:23:44
        int anio, mes, dia;

        anio = dcFecha.getCalendar().get(Calendar.YEAR);
        mes = dcFecha.getCalendar().get(Calendar.MONTH);
        dia = dcFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
        String FechaHoraSeleccionada;
        FechaHoraSeleccionada = anio + "-" + (mes + 1) + "-" + dia + " " + cmbHora.getSelectedItem().toString() + ":00";
        System.out.println(FechaHoraSeleccionada);
        
        //Insertamos el turno en la base de datos
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestionturnos", "root", "");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO turnos (IdCliente,IdProfesional,Fecha) VALUES('" + IdSeleccionadoCliente + "','" + IdSeleccionadoProfesional + "','" + FechaHoraSeleccionada + "')");
            JOptionPane.showMessageDialog(this, "Turno registrado con exito");
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteRegistro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "No se puede conectar a la base de datos");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cmbHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHoraActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbHoraActionPerformed

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
            java.util.logging.Logger.getLogger(TurnoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TurnoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TurnoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TurnoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TurnoRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbHora;
    private javax.swing.JComboBox<String> cmbProfesionales;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private ArrayList<String> llenarComboCliente() {
        ArrayList<String> lista = new ArrayList<>();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestionturnos", "root", "");
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM clientes ORDER BY DNI");

        } catch (SQLException ex) {
            Logger.getLogger(TurnoRegistro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "No se pudo conectar con la base de datos");
        }
        try {
            while (rs.next()) {
                lista.add(rs.getString("IdCliente") + " DNI " + rs.getString("DNI") + " " + rs.getString("Apellidos") + " " + rs.getString("Nombres"));
            }
        } catch (SQLException e) {
        }
        return lista;
    }

    private ArrayList<String> llenarComboProfesional() {
        ArrayList<String> lista = new ArrayList<>();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestionturnos", "root", "");
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM profesionales ORDER BY DNI");

        } catch (SQLException ex) {
            Logger.getLogger(TurnoRegistro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "No se pudo conectar con la base de datos");
        }
        try {
            while (rs.next()) {
                lista.add(rs.getString("IdProfesional") + " DNI " + rs.getString("DNI") + " " + rs.getString("Apellidos") + " " + rs.getString("Nombres"));
            }
        } catch (SQLException e) {
        }
        return lista;
    }

}
