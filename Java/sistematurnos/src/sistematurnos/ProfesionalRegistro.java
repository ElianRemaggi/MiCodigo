package sistematurnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProfesionalRegistro extends javax.swing.JFrame {

    private Connection con;

    public ProfesionalRegistro() {
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
        jLabel5 = new javax.swing.JLabel();
        tfEspecialidad = new javax.swing.JTextField();
        tfNumeroTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfCorreoElectronicoDominio = new javax.swing.JTextField();
        tfCorreoElectronicoCuenta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        jLabel1.setText("Registro de Profesional");

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

        jLabel5.setText("Ingrese la especialidad");

        tfEspecialidad.setText("Especialidad...");
        tfEspecialidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEspecialidadFocusGained(evt);
            }
        });

        tfNumeroTelefono.setText("EJ: 2235569899");
        tfNumeroTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNumeroTelefonoFocusGained(evt);
            }
        });

        jLabel7.setText("Ingrese el Numero de Telefono");

        jLabel6.setText("Ingrese el Correo Electronico");

        tfCorreoElectronicoDominio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCorreoElectronicoDominioFocusGained(evt);
            }
        });

        tfCorreoElectronicoCuenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCorreoElectronicoCuentaFocusGained(evt);
            }
        });
        tfCorreoElectronicoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCorreoElectronicoCuentaActionPerformed(evt);
            }
        });

        jLabel8.setText("@");

        jLabel9.setText("Ejemplo: Juan.Perez                    @   gmail.com");

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
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(tfNumeroTelefono)
                        .addComponent(tfDNI)
                        .addComponent(tfApellido)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(tfCorreoElectronicoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorreoElectronicoDominio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tfEspecialidad)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                            .addComponent(btnRegistrar)
                            .addGap(40, 40, 40))
                        .addComponent(jLabel9))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorreoElectronicoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCorreoElectronicoDominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNumeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDNIActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        //incicializo Clase Auxiliar que ingresando un string devuelve verdadero si todos los caracteres son numeros
        Auxiliares Comparador = new Auxiliares(tfDNI.getText());
        boolean esNumerico = Auxiliares.isNumeric(tfDNI.getText());  //Comparo si DNI posee Letras     

        //Comparo si DNI esta vasio o si tiene letras
        if (tfDNI.getText().equals("") || !esNumerico) {
            JOptionPane.showMessageDialog(tfDNI, "El campo DNI esta incompleto o posee letras");
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

        //Evaluo si el Nummero de telefono posee Letras (Contemplo la posibilidad de que alguien no tenga momentaneamente numero de telefono
        if (tfNumeroTelefono.getText().equals("")) {
            tfNumeroTelefono.setText("0");
        }
        if (!Auxiliares.isNumeric(tfNumeroTelefono.getText())) { //Comparo si el Nummero de telefono posee Letras
            JOptionPane.showMessageDialog(tfDNI, "El campo Numero telefonico posee letras caracteres no numericos");
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
        }
        
        //Ingreso los valores a la base de datos   
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestionturnos", "root", "");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO profesionales (Nombres,Apellidos,DNI,Mail,Nro_Telefono,Especialidad) VALUES('" + tfNombre.getText() + "','" + tfApellido.getText() + "','" + tfDNI.getText() + "','" + CorreoElectronicoConcatenado + "','" + tfNumeroTelefono.getText() + "','" + tfEspecialidad.getText() + "')");
            JOptionPane.showMessageDialog(this, "Profesional registrado con exito");
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteRegistro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "No se puede coenctar a la base de datos");
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tfDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDNIFocusGained
        tfDNI.setText("");
    }//GEN-LAST:event_tfDNIFocusGained

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        tfNombre.setText("");
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfApellidoFocusGained
        tfApellido.setText("");
    }//GEN-LAST:event_tfApellidoFocusGained

    private void tfCorreoElectronicoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorreoElectronicoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorreoElectronicoCuentaActionPerformed

    private void tfCorreoElectronicoCuentaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorreoElectronicoCuentaFocusGained
        tfCorreoElectronicoCuenta.setText("");
    }//GEN-LAST:event_tfCorreoElectronicoCuentaFocusGained

    private void tfCorreoElectronicoDominioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorreoElectronicoDominioFocusGained
        tfCorreoElectronicoDominio.setText("");
    }//GEN-LAST:event_tfCorreoElectronicoDominioFocusGained

    private void tfNumeroTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNumeroTelefonoFocusGained
        tfNumeroTelefono.setText("");
    }//GEN-LAST:event_tfNumeroTelefonoFocusGained

    private void tfEspecialidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEspecialidadFocusGained
        tfEspecialidad.setText("");
    }//GEN-LAST:event_tfEspecialidadFocusGained

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCorreoElectronicoCuenta;
    private javax.swing.JTextField tfCorreoElectronicoDominio;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfEspecialidad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNumeroTelefono;
    // End of variables declaration//GEN-END:variables
}
