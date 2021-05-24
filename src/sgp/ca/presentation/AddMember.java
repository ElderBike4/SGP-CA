/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp.ca.presentation;

import java.awt.Color;
import javax.swing.JOptionPane;
import sgp.ca.businesslogic.MemberDao;
import sgp.ca.domain.Member;

/**
 *
 * @author Esteban
 */
public class AddMember extends javax.swing.JFrame {

    /**
     * Creates new form AddMember
     */
    public AddMember() {
        initComponents();
        this.setLocation(380, 200);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLName = new javax.swing.JLabel();
        jTName = new javax.swing.JTextField();
        jLLastName = new javax.swing.JLabel();
        jTLastName = new javax.swing.JTextField();
        jLMotherLastName = new javax.swing.JLabel();
        jTMotherLastName = new javax.swing.JTextField();
        jLUser = new javax.swing.JLabel();
        jTUser = new javax.swing.JTextField();
        jLPassword = new javax.swing.JLabel();
        jLNumber = new javax.swing.JLabel();
        jTNumber = new javax.swing.JTextField();
        jTMail = new javax.swing.JTextField();
        jLMail = new javax.swing.JLabel();
        jBCancel = new javax.swing.JButton();
        jBRegister = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jLMember = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCMember = new javax.swing.JComboBox<>();
        jTAge = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCProfileProdep = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTLGCA = new javax.swing.JTextField();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLName.setText("Nombre:");
        getContentPane().add(jLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jTName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNameActionPerformed(evt);
            }
        });
        jTName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNameKeyTyped(evt);
            }
        });
        getContentPane().add(jTName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 110, 30));

        jLLastName.setBackground(new java.awt.Color(255, 255, 255));
        jLLastName.setText("Apellido Paterno:");
        getContentPane().add(jLLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, -1));

        jTLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTLastNameActionPerformed(evt);
            }
        });
        jTLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTLastNameKeyTyped(evt);
            }
        });
        getContentPane().add(jTLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 110, -1));

        jLMotherLastName.setText("Apellido Materno:");
        getContentPane().add(jLMotherLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, -1));

        jTMotherLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMotherLastNameActionPerformed(evt);
            }
        });
        jTMotherLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTMotherLastNameKeyTyped(evt);
            }
        });
        getContentPane().add(jTMotherLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 110, -1));

        jLUser.setText("Usuario:");
        getContentPane().add(jLUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jTUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTUserActionPerformed(evt);
            }
        });
        getContentPane().add(jTUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 110, -1));

        jLPassword.setText("Contraseña:");
        getContentPane().add(jLPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLNumber.setText("Número de celular:");
        getContentPane().add(jLNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jTNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNumberActionPerformed(evt);
            }
        });
        jTNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNumberKeyTyped(evt);
            }
        });
        getContentPane().add(jTNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 120, -1));

        jTMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMailActionPerformed(evt);
            }
        });
        getContentPane().add(jTMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 120, -1));

        jLMail.setText("Correo Electronico:");
        getContentPane().add(jLMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        jBCancel.setText("Cancelar");
        jBCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jBCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jBRegister.setText("Registrar");
        jBRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(jBRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 110, -1));

        jLMember.setForeground(new java.awt.Color(51, 51, 51));
        jLMember.setText("Tipo Integrante:");
        getContentPane().add(jLMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel1.setText("Edad:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 174, -1, 20));

        jCMember.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Integrante", "Colaborador" }));
        jCMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMemberActionPerformed(evt);
            }
        });
        getContentPane().add(jCMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 120, -1));

        jTAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAgeActionPerformed(evt);
            }
        });
        jTAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTAgeKeyTyped(evt);
            }
        });
        getContentPane().add(jTAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 120, -1));

        jLabel2.setText("Perfil PRODEP:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        jCProfileProdep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        getContentPane().add(jCProfileProdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 120, -1));

        jLabel3.setText("LGCA :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        jTLGCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTLGCAActionPerformed(evt);
            }
        });
        jTLGCA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTLGCAKeyTyped(evt);
            }
        });
        getContentPane().add(jTLGCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 120, -1));

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgp/ca/presentation/Images/registro.png"))); // NOI18N
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -150, 620, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNameActionPerformed

    private void jTMotherLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMotherLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMotherLastNameActionPerformed

    private void jTNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNumberActionPerformed
        
    }//GEN-LAST:event_jTNumberActionPerformed

    private void jTMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMailActionPerformed

    private void jBCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelActionPerformed
        DisplaysMember displaysMember = new DisplaysMember();
        displaysMember.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBCancelActionPerformed

    private void jBRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegisterActionPerformed
        int confirmation = 0;
        boolean confirmationMember = false;
        String [] data = new String[10];
        Member member = new Member();
        data = recoverData();
        if(data ==null){
            
        }else{
            MemberDao memberDao = new MemberDao();
            member=memberDao.createMember(data);
            confirmationMember = memberDao.verifyMember(member);
            if(confirmationMember==true){
                javax.swing.JOptionPane.showMessageDialog(this,"Este Integrante ya existe en el sistema \n","Integrante Repetido",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }else{
                confirmation = memberDao.Member(member);
            }if(confirmation==1){
                javax.swing.JOptionPane.showMessageDialog(this,"Integrante registrado con éxito \n","Integrante Registrado",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                cleanText();
            }if(confirmation==2){
                javax.swing.JOptionPane.showMessageDialog(this,"No se puede registrar miembros en este momento, intentelo más tarde \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBRegisterActionPerformed

    private void jTNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNameKeyTyped
        char valide = evt.getKeyChar();
        if((valide<'a'|| valide>'z') && (valide<'A'||valide>'Z') &&(valide<' ' || valide>' '))evt.consume();
        
    }//GEN-LAST:event_jTNameKeyTyped

    private void jTNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNumberKeyTyped
        char valide = evt.getKeyChar();
        if(valide<'0'||valide>'9')evt.consume();
    }//GEN-LAST:event_jTNumberKeyTyped

    private void jTLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTLastNameActionPerformed

    private void jTLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTLastNameKeyTyped
        char valide = evt.getKeyChar();
        if((valide<'a'|| valide>'z') && (valide<'A'||valide>'Z') &&(valide<' ' || valide>' '))evt.consume();
    }//GEN-LAST:event_jTLastNameKeyTyped

    private void jTMotherLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMotherLastNameKeyTyped
        char valide = evt.getKeyChar();
        if((valide<'a'|| valide>'z') && (valide<'A'||valide>'Z') &&(valide<' ' || valide>' '))evt.consume();
    }//GEN-LAST:event_jTMotherLastNameKeyTyped

    private void jTUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUserActionPerformed

    private void jCMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMemberActionPerformed
        if(jCMember.getSelectedItem()=="Colaborador"){
            AddCollaborator addCollaborator = new AddCollaborator();
            addCollaborator.setVisible(true);
            this.dispose();    
        }
    }//GEN-LAST:event_jCMemberActionPerformed

    private void jTAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAgeActionPerformed
        
    }//GEN-LAST:event_jTAgeActionPerformed

    private void jTLGCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTLGCAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTLGCAActionPerformed

    private void jTAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAgeKeyTyped
        char valide = evt.getKeyChar();
        if(valide<'0'||valide>'9')evt.consume();
    }//GEN-LAST:event_jTAgeKeyTyped

    private void jTLGCAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTLGCAKeyTyped
        char valide = evt.getKeyChar();
        if((valide<'a'|| valide>'z') && (valide<'A'||valide>'Z') &&(valide<' ' || valide>' '))evt.consume();
    }//GEN-LAST:event_jTLGCAKeyTyped

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
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancel;
    private javax.swing.JButton jBRegister;
    private javax.swing.JComboBox<String> jCMember;
    private javax.swing.JComboBox<String> jCProfileProdep;
    private javax.swing.JLabel jLLastName;
    private javax.swing.JLabel jLMail;
    private javax.swing.JLabel jLMember;
    private javax.swing.JLabel jLMotherLastName;
    private javax.swing.JLabel jLName;
    private javax.swing.JLabel jLNumber;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JLabel jLUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTAge;
    private javax.swing.JTextField jTLGCA;
    private javax.swing.JTextField jTLastName;
    private javax.swing.JTextField jTMail;
    private javax.swing.JTextField jTMotherLastName;
    private javax.swing.JTextField jTName;
    private javax.swing.JTextField jTNumber;
    private javax.swing.JTextField jTUser;
    private javax.swing.JLabel lbl_Fondo;
    // End of variables declaration//GEN-END:variables

    private String[] recoverData() {
        String [] data = new String[10];
        boolean valide = false;
        valide = valideData();
        if(valide == false){
            data[0]=jTName.getText();
            data[1]=jTLastName.getText();
            data[2]=jTMotherLastName.getText();
            data[3]=jTUser.getText();
            data[4]=jPassword.getText().toString();
            data[5]=jTNumber.getText();
            data[6]=jTMail.getText();
            data[7]=jTAge.getText();
            data[8]=(String) jCProfileProdep.getSelectedItem();
            data[9]=jTLGCA.getText();
        }else{
            data = null;
        }
        return data;
    }

    private boolean valideData() {
        boolean valide = false;
        if(jTName.getText().equals("")){
            jTName.setBackground(Color.red);
            valide = true;
        }else{
            jTName.setBackground(Color.white);
        }
        if(jTLastName.getText().equals("")){
            jTLastName.setBackground(Color.red);
            valide = true;
        }else{
            jTLastName.setBackground(Color.white);
        }
        if(jTMotherLastName.getText().equals("")){
            jTMotherLastName.setBackground(Color.red);
            valide = true;
        }else{
            jTMotherLastName.setBackground(Color.white);
        }
        if(jTUser.getText().equals("")){
            jTUser.setBackground(Color.red);
            valide = true;
        }else{
            jTUser.setBackground(Color.white);
        }
        if(jPassword.getText().equals("")){
            jPassword.setBackground(Color.red);
            valide = true;
        }else{
            jPassword.setBackground(Color.white);
        }
        if(jTNumber.getText().equals("")){
            jTNumber.setBackground(Color.red);
            valide = true;
        }else{
            jTNumber.setBackground(Color.white);
        }
        if(jTMail.getText().equals("")){
            jTMail.setBackground(Color.red);
            valide = true;
        }else{
            jTMail.setBackground(Color.white);
        }
        if(jTAge.getText().equals("")){
            jTAge.setBackground(Color.red);
            valide = true;
        }else{
            jTAge.setBackground(Color.white);
        }
        if(jTLGCA.getText().equals("")){
            jTLGCA.setBackground(Color.red);
            valide = true;
        }else{
            jTLGCA.setBackground(Color.white);
        }
        return valide;
    }
    
    private void cleanText(){
        jTName.setText("");
        jTLastName.setText("");
        jTMotherLastName.setText("");
        jTUser.setText("");
        jPassword.setText("");
        jTNumber.setText("");
        jTMail.setText("");
        jTLGCA.setText("");
        jTAge.setText("");
        
    }
}
