/*
    Clase para crear un perfil.
    Posteriormetne será una clase para editar los datos básicos 
    de un perfil de usuario
 */
package emisora.vista;

import emisora.file.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Dacamoty
 */
public class EditarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form Editar
     */
    public EditarUsuario() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDocumento = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        passPass = new javax.swing.JPasswordField();
        jdcCalendar = new com.toedter.calendar.JDateChooser();
        cbxTipoDocu = new javax.swing.JComboBox<>();
        txtNombre2 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        passConfirm = new javax.swing.JPasswordField();
        btnGuardar = new javax.swing.JButton();
        lblBotonCerrar = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar datos de Usuario");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emisora/image/editarusuario.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Editar usuario");

        lblNombre3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre3.setText("Nombre");

        lblApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblApellido.setText("Apellido");

        lblDocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDocumento.setText("Documento");

        lblPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPass.setText("Contraseña");

        lblNacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNacimiento.setText("Fecha de Nacimiento");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellido.setToolTipText("");

        passPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbxTipoDocu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxTipoDocu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccionar)", "CC", "TI", "Pasaporte", "Conduccion", "Carnet" }));

        txtNombre2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtApellido2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyTyped(evt);
            }
        });

        passConfirm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblBotonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emisora/image/desconectar.png"))); // NOI18N
        lblBotonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonCerrarMouseClicked(evt);
            }
        });

        lblCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCorreo.setText("Correo");

        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNacimiento)
                            .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(passPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTipoDocu, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdcCalendar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblBotonCerrar)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(passConfirm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                            .addComponent(txtDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtApellido2, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar)
                                .addGap(12, 12, 12))))
                    .addComponent(txtCorreo))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBotonCerrar)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumento)
                    .addComponent(cbxTipoDocu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(passPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNacimiento))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnGuardar)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Nos salimos de la app
    private void lblBotonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonCerrarMouseClicked
        int opcion = JOptionPane.showConfirmDialog(null, "Estás a punto de cerrar la ventana \n  ¿Estás seguro de salir?",
                                                        "Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if (opcion == JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_lblBotonCerrarMouseClicked

    private void txtDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyTyped
        char c=evt.getKeyChar();
        if(Character.isAlphabetic(c)){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese solo valores numéricos.",  "Error de Dato", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtDocumentoKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        EditarGuardar edita= new EditarGuardar();
        FileDAO file =new FileDAO();
        SimpleDateFormat fecha =  new SimpleDateFormat("yyyy/MM/dd");
        edita.setNombre(txtNombre.getText());
        edita.setNombre2(txtNombre2.getText());
        edita.setApellido(txtApellido.getText());
        edita.setApellido2(txtApellido2.getText());
        edita.setTipoDocu(cbxTipoDocu.getItemAt(WIDTH));
        edita.setDocumento(txtDocumento.getText());
        edita.setPass(passPass.getText());
        edita.setCorreo(txtCorreo.getText());

        edita.setFecha(fecha.format(jdcCalendar.getDate()));
        
        if (ValidarObligatoriedad()){
            if(file.guardar(edita)){
                JOptionPane.showMessageDialog(rootPane, "Formulario actualizado satisfactoriamente");
            }                
            }else{
                JOptionPane.showMessageDialog(rootPane, "Formulario no cumple con los requisitos para actualizar");
            }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarUsuario().setVisible(true);
            }
        });
    }
    //Método para validar los campos necesario a actualizar.
    //Este método es una propuesta el cual será modificado posteriormente.
    public boolean ValidarObligatoriedad(){
        boolean validar=true;        
        if (txtNombre.getText().trim().length()==0){ 
            validar=false;
            JOptionPane.showMessageDialog(rootPane, "Por lo menos proporcina 1 nombre.",  "Error de Dato", JOptionPane.ERROR_MESSAGE);
        }
        if (txtApellido.getText().trim().length()==0){ 
            validar=false;
            JOptionPane.showMessageDialog(rootPane, "Por lo menos proporciona 1 apellido.",  "Error de Dato", JOptionPane.ERROR_MESSAGE);
        }
        if (cbxTipoDocu.getSelectedItem().toString().equals("(Seleccionar)")){ 
            validar=false;
            JOptionPane.showMessageDialog(rootPane, "El tipo de documento es dato obligatorio.",  "Error de Dato", JOptionPane.ERROR_MESSAGE);
        }
        if (txtDocumento.getText().trim().length()==0){ 
            validar=false;
            JOptionPane.showMessageDialog(rootPane, "El Documento es dato obligatorio.",  "Error de Dato", JOptionPane.ERROR_MESSAGE);
        }
        if (Double.parseDouble(txtDocumento.getText())<1){
            validar=false;
            JOptionPane.showMessageDialog(rootPane, "El documento no puede ser 0.",  "Error de Dato", JOptionPane.ERROR_MESSAGE);
        }
        if (txtDocumento.getText().trim().length()>=10){ 
            validar=false;
            JOptionPane.showMessageDialog(rootPane, "El Documento no puede exceder los 10 digitos.",  "Error de Dato", JOptionPane.ERROR_MESSAGE);
        }
        if (passPass.getText().trim().length()==0){ 
            validar=false;
            JOptionPane.showMessageDialog(rootPane, "La contraseña es un campo obligatorio.",  "Error de Dato", JOptionPane.ERROR_MESSAGE);
        }       
        if (!passPass.getText().equals(passConfirm.getText())){
            validar=false;
            JOptionPane.showMessageDialog(rootPane, "Las contraseñasdeben coincidir.",  "Error de Dato", JOptionPane.ERROR_MESSAGE);
        }
        if (txtCorreo.getText().trim().length()==0){
            validar=false;
            JOptionPane.showMessageDialog(rootPane, "El correo es un campo necesario.",  "Error de Dato", JOptionPane.ERROR_MESSAGE);
        }
        if (jdcCalendar.getCalendar()==null){
            validar=false;
            JOptionPane.showMessageDialog(rootPane, "Debe proporcionarse una fecha.",  "Error de Dato", JOptionPane.ERROR_MESSAGE);            
        }
        return validar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxTipoDocu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private com.toedter.calendar.JDateChooser jdcCalendar;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBotonCerrar;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblPass;
    private javax.swing.JPasswordField passConfirm;
    private javax.swing.JPasswordField passPass;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre2;
    // End of variables declaration//GEN-END:variables
}
