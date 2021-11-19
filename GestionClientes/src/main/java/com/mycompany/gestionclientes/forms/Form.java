/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestionclientes.forms;

import com.mycompany.gestionclientes.dao.ClientDao;
import com.mycompany.gestionclientes.models.Client;
import com.mysql.jdbc.StringUtils;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Bárbara
 */
public class Form extends javax.swing.JFrame {
    
    private List<Client> clientList = new ArrayList<>();


    /**
     * Creates new form Form
     */
    public Form() {
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

        nameLabel = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        signInButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        JDelete = new javax.swing.JButton();
        userSurnameTxt = new javax.swing.JTextField();
        surnameLabel = new javax.swing.JLabel();
        userEmailTxt = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        userPhoneTxt = new javax.swing.JTextField();
        JModify = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        infoId = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        nameLabel.setText("Name");

        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });

        signInButton.setText("Sign In");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList);

        JDelete.setText("Borrar");
        JDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDeleteActionPerformed(evt);
            }
        });

        userSurnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSurnameTxtActionPerformed(evt);
            }
        });

        surnameLabel.setText("Surname");

        userEmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userEmailTxtActionPerformed(evt);
            }
        });

        emailLabel.setText("Email");

        phoneLabel.setText("Phone Number");

        userPhoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPhoneTxtActionPerformed(evt);
            }
        });

        JModify.setText("Modificar");
        JModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JModifyActionPerformed(evt);
            }
        });

        idLabel.setText("Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JModify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDelete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(infoId)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(surnameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(userSurnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(emailLabel)
                                .addGap(18, 18, 18)
                                .addComponent(userEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(phoneLabel)
                                .addGap(18, 18, 18)
                                .addComponent(userPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(idLabel)
                                    .addGap(109, 109, 109))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(nameLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(signInButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JDelete)
                            .addComponent(JModify)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(infoId)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(idLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(surnameLabel)
                            .addComponent(userSurnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel)
                            .addComponent(userEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneLabel)
                            .addComponent(userPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(signInButton)
                        .addGap(9, 9, 9)))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    

    
    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        
        //Código de lo que pasa al pulsar el botón
        // Cogemos texts introducidos por el usuario en el input
       String userName = this.userNameTxt.getText();
       String userSurname = this.userSurnameTxt.getText();
       String userEmail = this.userEmailTxt.getText();
       String userPhone = this.userPhoneTxt.getText();
    
       
       //Declaramos nuevo objeto
       Client objectClient = new Client();
       
       //Añadimos a las propiedades del objeto los texts introducidos por el usuario
       objectClient.setName(userName);
       objectClient.setSurname(userSurname);
       objectClient.setEmail(userEmail);
       objectClient.setTel(userPhone);
       
          
       if(!StringUtils.isEmptyOrWhitespaceOnly(infoId.getText())){
           objectClient.setId(infoId.getText());
       }
       
       

       //Agregar cliente a la base de datos
        ClientDao dao = new ClientDao();
        dao.keepClient(objectClient);
        
       //Mostramos alerta
        JOptionPane.showMessageDialog(rootPane, "El usuario " + objectClient.getCompleteName() + " se guardó correctamente");
        
        //llamamos a la función para actualizar la lista
        refreshList();
        
        //llamamos a la función para borrar info de los inputs
        deleteInputs();
           
        
    }//GEN-LAST:event_signInButtonActionPerformed

    private void JDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDeleteActionPerformed
        //Seleccionamos el índice del nombre que ha pulsado el usuario en nuestro diseño y lo guardamos en la variable index
        int index = this.jList.getSelectedIndex();
        
        //Seleccionamos de la lista interna el cliente cuyo índice coincide con el seleccionado.
        Client client = clientList.get(index);
        
        ClientDao dao = new ClientDao();
        //Eliminamos cliente de la bbdd
        dao.deleteClient(client.getId());
        
        //actualizamos lista
        refreshList();
        
                JOptionPane.showMessageDialog(rootPane, "Se eliminó correctamente" );

    }//GEN-LAST:event_JDeleteActionPerformed

     private void refreshList() {
        
         ClientDao dao = new ClientDao();
         clientList = dao.listClient();
         
        //creamos una variable de lista (no es lo mismo que array)
        DefaultListModel data = new DefaultListModel();
        
        //capturamos elementos del array y los guardamos en la lista data
        for (int i = 0; i < clientList.size(); i++ ) {
            Client objectClient = clientList.get(i);
            data.addElement(objectClient.getCompleteName());
        }
        
        //añadimos la lista que acabamos de crear a la lista de la interfaz (jList);
        this.jList.setModel(data);
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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }
    
    private void deleteInputs() {
        
       this.userNameTxt.setText("");
       this.userSurnameTxt.setText("");
       this.userEmailTxt.setText("");
       this.userPhoneTxt.setText("");
       this.infoId.setText("");
        
    }
    private void userSurnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSurnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userSurnameTxtActionPerformed

    private void userEmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userEmailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userEmailTxtActionPerformed

    private void userPhoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPhoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPhoneTxtActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        refreshList();
        //this.infoId.setText("HOLA");

    }//GEN-LAST:event_formComponentShown

    private void JModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JModifyActionPerformed
         //Seleccionamos el índice del nombre que ha pulsado el usuario en nuestro diseño y lo guardamos en la variable index
        int index = this.jList.getSelectedIndex();
        
        //Seleccionamos de la lista interna el cliente cuyo índice coincide con el seleccionado.
        Client client = clientList.get(index);
        
        this.userNameTxt.setText(client.getName());
        this.userSurnameTxt.setText(client.getSurname());
        this.userPhoneTxt.setText(client.getTel());
        this.userEmailTxt.setText(client.getEmail());
        this.infoId.setText(client.getId());
                
    }//GEN-LAST:event_JModifyActionPerformed

    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JDelete;
    private javax.swing.JButton JModify;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel infoId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton signInButton;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JTextField userEmailTxt;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JTextField userPhoneTxt;
    private javax.swing.JTextField userSurnameTxt;
    // End of variables declaration//GEN-END:variables
}
