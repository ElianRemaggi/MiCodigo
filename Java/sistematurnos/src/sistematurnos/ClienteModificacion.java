package sistematurnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ClienteModificacion extends javax.swing.JFrame {

    private Connection con;
    private String Datos;
    private int IdBase;

    public void setDatos(String Datos) {
        this.Datos = Datos;
        Datos = Datos.replaceAll("[\\[\\]\\ ]", "");
        String[] vect = Datos.split(",");
        IdBase = Integer.parseInt(vect[0]);
        IdCliente.setText(vect[0]);
        Nombres.setText(vect[1]);
        Apellidos.setText(vect[2]);
        DNI.setText(vect[3]);
        Mail.setText(vect[4]);
        Nro_Telefono.setText(vect[5]);
    }

    public ClienteModificacion() {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IdCliente = new javax.swing.JTextField();
        Nombres = new javax.swing.JTextField();
        Apellidos = new javax.swing.JTextField();
        DNI = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        Nro_Telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Ingrese el Nombre");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("Ingrese el Correo Electronico");

        jLabel7.setText("Id Cliente");

        jLabel8.setText("Ejemplo: Juan.Perez@gmail.com");

        jLabel4.setText("Ingrese el Apellido");

        jLabel2.setText("Ingrese el DNI");

        IdCliente.setText("IdCliente");
        IdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdClienteActionPerformed(evt);
            }
        });

        Nombres.setText("Nombre...");
        Nombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NombresFocusGained(evt);
            }
        });

        Apellidos.setText("Apellido...");
        Apellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ApellidosFocusGained(evt);
            }
        });

        DNI.setText("DNI...");
        DNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DNIFocusGained(evt);
            }
        });
        DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNIActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        Nro_Telefono.setText("Telefono...");
        Nro_Telefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Nro_TelefonoFocusGained(evt);
            }
        });
        Nro_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nro_TelefonoActionPerformed(evt);
            }
        });

        jLabel5.setText("Ingrese el Numero de Telefono");

        jLabel1.setText("Modificacion de Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Mail)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(DNI)
                                .addComponent(Nombres)
                                .addComponent(Apellidos)
                                .addComponent(Nro_Telefono)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnCancelar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nro_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(412, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnModificar)
                        .addComponent(btnCancelar))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(!true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void IdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdClienteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_IdClienteActionPerformed

    private void NombresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombresFocusGained
        Nombres.setText("");
    }//GEN-LAST:event_NombresFocusGained

    private void ApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ApellidosFocusGained
        Apellidos.setText("");
    }//GEN-LAST:event_ApellidosFocusGained

    private void DNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DNIFocusGained
        DNI.setText("");
    }//GEN-LAST:event_DNIFocusGained

    private void DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNIActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        //incicializo Clase Auxiliar que ingresando un string devuelve verdadero si todos los caracteres son numeros
        Auxiliares Comparador = new Auxiliares(DNI.getText());
        boolean esNumerico = Auxiliares.isNumeric(DNI.getText());

        //Comparo si DNI esta vasio o si tiene letras
        if (DNI.getText().equals("") || !esNumerico) {
            JOptionPane.showMessageDialog(DNI, "El campo DNI esta incompleto o posee letras");
            return;
        }

        //Evaluo si el Nummero de telefono posee Letras (Contemplo la posibilidad de que alguien no tenga momentaneamente numero de telefono
        if (Nro_Telefono.getText().equals("")) {
            Nro_Telefono.setText("0");
        }

        if (!esNumerico) {
            JOptionPane.showMessageDialog(DNI, "El campo Numero telefonico posee letras caracteres no numericos");
            return;
        }

        if (Nombres.getText().equals("")) {
            JOptionPane.showMessageDialog(DNI, "El campo Nombre esta incompleto");
            return;
        }
        if (Apellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(DNI, "El campo Apellido esta incompleto");
            return;
        }

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestionturnos", "root", "");
            Statement stmt = con.createStatement();
            //Error en la @ del mail
            //Error en alguna parte de "  "
            stmt.executeUpdate("UPDATE clientes SET IdCliente = " + IdCliente.getText() + ", Nombres=" + this.getNombres().getText() +", Apellidos = " + this.getApellidos().getText() + ", DNI=" + DNI.getText() + ", Mail=" +  Mail.getText() + ", Nro_Telefono=" + Nro_Telefono.getText() + ", WHERE IdCliente=" + IdBase
            );

            
            JOptionPane.showMessageDialog(this, "Cliente modificado con exito");
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteRegistro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "No se puede modificar el cliente ahora");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    public JTextField getApellidos() {
        return Apellidos;
    }

    public JTextField getNombres() {
        return Nombres;
    }


    private void Nro_TelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Nro_TelefonoFocusGained
        Nro_Telefono.setText("");
    }//GEN-LAST:event_Nro_TelefonoFocusGained

    private void Nro_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nro_TelefonoActionPerformed

    }//GEN-LAST:event_Nro_TelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteModificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteModificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteModificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteModificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteModificacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellidos;
    private javax.swing.JTextField DNI;
    private javax.swing.JTextField IdCliente;
    private javax.swing.JTextField Mail;
    private javax.swing.JTextField Nombres;
    private javax.swing.JTextField Nro_Telefono;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
