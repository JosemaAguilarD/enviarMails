/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.isil.enviomensajes;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import static pe.isil.enviomensajes.EnvioMensajes.correos;
import static pe.isil.enviomensajes.EnvioMensajes.enviarCorreosMasivos;


public class formEnvioMensaje extends javax.swing.JFrame {
        
    List<String> correos = new ArrayList<>();
    EnvioMensajes envioMensaje = new EnvioMensajes();
    /**
     * Creates new form formEnvioMensaje
     */
    public formEnvioMensaje() {
        initComponents();
        lblCorreoMensaje.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPanel = new javax.swing.JTextArea();
        txtCorreoEnviar = new javax.swing.JTextField();
        txtAsunto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblCorreoMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.red);

        jLabel1.setText("Correos:");

        jLabel2.setText("Asunto:");

        jLabel3.setText("Texto: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnInsertar.setText("Enviar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        txtPanel.setColumns(20);
        txtPanel.setRows(5);
        jScrollPane1.setViewportView(txtPanel);

        txtCorreoEnviar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoEnviarKeyReleased(evt);
            }
        });

        txtTexto.setColumns(20);
        txtTexto.setRows(5);
        jScrollPane2.setViewportView(txtTexto);

        jButton1.setText("agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Destinatarios:");

        lblCorreoMensaje.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblCorreoMensaje.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInsertar)
                            .addComponent(txtCorreoEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(txtAsunto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCorreoMensaje))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(593, 593, 593))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreoMensaje))
                        .addGap(18, 18, 18)
                        .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInsertar)
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
            
            if(txtPanel.getText().trim().isEmpty() && txtCorreoEnviar.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Completar el campo de correo","Error",JOptionPane.WARNING_MESSAGE);
            }
            else if(txtTexto.getText().trim().isEmpty() || txtAsunto.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Completar el campo de texto o Asunto","Error",JOptionPane.WARNING_MESSAGE);
            }
            else if(txtPanel.getText().trim().isEmpty() && !txtCorreoEnviar.getText().trim().isEmpty()){
                System.out.println("Entro condición 2");
                correos.add(txtCorreoEnviar.getText()); 
                envioMensaje.enviarCorreosMasivos(correos, txtAsunto.getText(), txtTexto.getText());
                correos.clear();
                
            }else if(!txtPanel.getText().trim().isEmpty() && !txtCorreoEnviar.getText().trim().isEmpty()){
                                System.out.println("Entro condición 3");

                correos.add(txtCorreoEnviar.getText()); 
                envioMensaje.enviarCorreosMasivos(correos, txtAsunto.getText(), txtTexto.getText());
                correos.clear();
            }
            else if(!txtPanel.getText().trim().isEmpty() && txtCorreoEnviar.getText().trim().isEmpty()){
                                System.out.println("Entro condición 4");

                envioMensaje.enviarCorreosMasivos(correos, txtAsunto.getText(), txtTexto.getText());
                correos.clear();
            }
            

    }//GEN-LAST:event_btnInsertarActionPerformed

             
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(txtCorreoEnviar.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Completar el campo de correo","Error",JOptionPane.WARNING_MESSAGE);
        }else{
        correos.add(txtCorreoEnviar.getText());
        txtPanel.append(txtCorreoEnviar.getText()+",");
        txtCorreoEnviar.setText("");
        }
        System.out.println(correos);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCorreoEnviarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoEnviarKeyReleased
        
        if(verificar_Email(txtCorreoEnviar.getText())){
            lblCorreoMensaje.setText("");
            lblCorreoMensaje.setVisible(false);
        }
        else if(txtCorreoEnviar.getText().trim().isEmpty()){
            lblCorreoMensaje.setText(""); 
        }
        else{
            lblCorreoMensaje.setText("CORREO INVÁLIDO(*)");
            lblCorreoMensaje.setVisible(true);
        }
        
    }//GEN-LAST:event_txtCorreoEnviarKeyReleased

    public boolean verificar_Email(String correo){
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = patron.matcher(correo);
        
        if(mat.find()){
            return true;
        }
        else{
            return false;
        }
        
        //o, solo podríamos usar return math.find(); retorna una boolean
    }
    
    
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
            java.util.logging.Logger.getLogger(formEnvioMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formEnvioMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formEnvioMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formEnvioMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formEnvioMensaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCorreoMensaje;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtCorreoEnviar;
    private javax.swing.JTextArea txtPanel;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables
}
