package sistematurnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteRegistro extends javax.swing.JFrame {

    private Connection con;

    public ClienteRegistro() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfDNI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        tfNumeroTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfCorreoElectronicoCuenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfCorreoElectronicoDominio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        jLabel1.setText("Registro de Cliente");

        jLabel2.setText("Ingrese el DNI");

        tfDNI.setText("DNI...");
        tfDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDNIFocusGained(evt);
            }
        });
        tfDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDNIActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese el Nombre");

        tfNombre.setText("Nombre...");
        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreFocusGained(evt);
            }
        });

        jLabel4.setText("Ingrese el Apellido");

        tfApellido.setText("Apellido...");
        tfApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfApellidoFocusGained(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        tfNumeroTelefono.setText("Telefono...");
        tfNumeroTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNumeroTelefonoFocusGained(evt);
            }
        });
        tfNumeroTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeroTelefonoActionPerformed(evt);
            }
        });

        jLabel5.setText("Ingrese el Numero de Telefono");

        jLabel6.setText("Ingrese el Correo Electronico");

        jLabel7.setText("@");

        jLabel8.setText("Ejemplo: Juan.Perez                                  @   gmail.com");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tfCorreoElectronicoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCorreoElectronicoDominio, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(tfDNI)
                            .addComponent(tfNombre)
                            .addComponent(tfApellido)
                            .addComponent(tfNumeroTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNumeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorreoElectronicoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCorreoElectronicoDominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNumeroTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroTelefonoActionPerformed

    }//GEN-LAST:event_tfNumeroTelefonoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        //incicializo Clase Auxiliar que ingresando un string devuelve verdadero si todos los caracteres son numeros
        Auxiliares Comparador = new Auxiliares(tfDNI.getText());
        boolean esNumerico = Auxiliares.isNumeric(tfDNI.getText());

        //Comparo si DNI esta vasio o si tiene letras
        if (tfDNI.getText().equals("") || !esNumerico) {

            JOptionPane.showMessageDialog(tfDNI, "El campo DNI esta incompleto o posee letras");
            return;
        }

        //Evaluo si el Nummero de telefono posee Letras (Contemplo la posibilidad de que alguien no tenga momentaneamente numero de telefono
        if (tfNumeroTelefono.getText().equals("")) {
            tfNumeroTelefono.setText("0");
        }

        if (!esNumerico) {
            JOptionPane.showMessageDialog(tfDNI, "El campo Numero telefonico posee letras caracteres no numericos");
            return;
        }

        if (tfNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(tfDNI, "El campo Nombre esta incompleto");
            return;
        }
        if (tfApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(tfDNI, "El campo Apellido esta incompleto");
            return;
        }

        String CorreoElectronicoConcatenado = new String();

        // Si no se ingresa ningun mail en el formulario completo la variable igualmente
        if (tfCorreoElectronicoCuenta.getText().isEmpty() && tfCorreoElectronicoDominio.getText().isEmpty()) {
            CorreoElectronicoConcatenado = "";
        } else {
            // Si se ingreso algo en uno de los dos campos, solicito que se rellene el otro
            if (tfCorreoElectronicoCuenta.getText().isEmpty() || tfCorreoElectronicoDominio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(tfDNI, "Alguno de los campos del mail no se encuentra completo");
                return;
            } else {
                //Concateno ambos campos con una arroba en el medio
                CorreoElectronicoConcatenado = tfCorreoElectronicoCuenta.getText() + "@" + tfCorreoElectronicoDominio.getText();
            }

            //Ingreso los valores a la base de datos
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestionturnos", "root", "");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO clientes (Nombres,Apellidos,DNI,Mail,Nro_Telefono) VALUES('" + tfNombre.getText() + "','" + tfApellido.getText() + "','" + tfDNI.getText() + "','" + CorreoElectronicoConcatenado + "','" + tfNumeroTelefono.getText() + "')");
            JOptionPane.showMessageDialog(this, "Cliente registrado con exito");
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteRegistro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "No se puede conectar a la base de datos");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tfDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDNIActionPerformed

    private void tfDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDNIFocusGained
        tfDNI.setText("");
    }//GEN-LAST:event_tfDNIFocusGained

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        tfNombre.setText("");
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfApellidoFocusGained
        tfApellido.setText("");
    }//GEN-LAST:event_tfApellidoFocusGained

    private void tfNumeroTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNumeroTelefonoFocusGained
        tfNumeroTelefono.setText("");
    }//GEN-LAST:event_tfNumeroTelefonoFocusGained

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(!true);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCorreoElectronicoCuenta;
    private javax.swing.JTextField tfCorreoElectronicoDominio;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNumeroTelefono;
    // End of variables declaration//GEN-END:variables
}
