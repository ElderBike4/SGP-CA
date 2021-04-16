package sgp.ca.businesslogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sgp.ca.domain.Member;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Esteban
 */
public class IMemberDao extends JFrame implements ActionListener{
    
    JTextField tfName;
    JTextField tfLastName;
    JTextField tfMotherLastName;
    JTextField tfUser;
    JTextField tfPassword;
    JTextField tfCellPhoneNumber;
    JTextField tfMail;
    JButton save;
    
    public IMemberDao (){
        /*this.setTitle("Add New Member");
        this.setSize(500, 800);
        this.setLayout(null);
        startComponents();
        this.setVisible(true);*/
    }
    public void startComponents(){
        JLabel lbData = new JLabel("Datas of member");
        lbData.setBounds(80, 20, 170, 30);
        
        JLabel lbName = new JLabel("Name: ");
        lbName.setBounds(60, 70, 80, 30);

        tfName = new JTextField();
        tfName.setBounds(170, 70, 230, 30);

        JLabel lbLastName = new JLabel("Last Name: ");
        lbLastName.setBounds(60, 130, 80, 30);

        tfLastName = new JTextField();
        tfLastName.setBounds(170, 130, 230, 30);

        JLabel lbMotherLastName = new JLabel("Mother Last Name: ");
        lbMotherLastName.setBounds(60, 190, 120, 30);
        
        tfMotherLastName = new JTextField();
        tfMotherLastName.setBounds(170, 190, 230, 30);

        JLabel lbUser = new JLabel("User: ");
        lbUser.setBounds(60, 250, 120, 30);

        tfUser = new JTextField();
        tfUser.setBounds(170, 250, 230, 30);

        JLabel lbPassword= new JLabel("Password: ");
        lbPassword.setBounds(60,310,80,30);

        tfPassword = new JTextField();
        tfPassword.setBounds(170,310,230,30);

        JLabel lbCellPhone= new JLabel("Cell Phone Number: ");
        lbCellPhone.setBounds(60,370,80,30);

        tfCellPhoneNumber = new JTextField();
        tfCellPhoneNumber.setBounds(170,370,230,30);
        
        JLabel lbMail = new JLabel("Mail: ");
        lbMail.setBounds(60,430,230,30);
        
        tfMail = new JTextField();
        tfMail.setBounds(170,430,230,30);
        
        save = new JButton("Save");
        save.setBounds(300, 640, 100, 30);
        save.addActionListener(this);
        
        this.add(tfName);
        this.add(lbName);
        this.add(tfLastName);
        this.add(lbLastName);
        this.add(tfMotherLastName);
        this.add(lbMotherLastName);
        this.add(tfUser);
        this.add(lbUser);
        this.add(tfPassword);
        this.add(lbPassword);
        this.add(tfCellPhoneNumber);
        this.add(lbCellPhone);
        this.add(tfMail);
        this.add(lbMail);
        this.add(save);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(save)){
            MemberDao membe = new MemberDao();
            saveMember();
            this.dispose();
        }else{
            this.dispose();
        }
    }

    public void saveMember() {
        MemberDao memberDao = new MemberDao();
        String name = tfName.getText();
        String lastName = tfLastName.getText();
        String motherLastName = tfMotherLastName.getText();
        String user = tfUser.getText();
        String password = tfPassword.getText();
        String cellPhoneNumber = tfCellPhoneNumber.getText();
        String mail = tfMail.getText();
        Member member = new Member(name, lastName,motherLastName,user,password,cellPhoneNumber,mail);
        
        memberDao.Member(member);
    }
    public void deleteMemberConfirmation(int confirmation){
        if(confirmation==1){
            JOptionPane.showMessageDialog(null,"Registro eliminado con éxito");
        }else{
            JOptionPane.showMessageDialog(null, "Lo sentimos, no se pudo eliminar el registro");
        }
    }
    
    public void registerMemberConfirmation(int confirmation){
        if(confirmation==1){
            JOptionPane.showMessageDialog(null,"Save");
        }else{
            JOptionPane.showMessageDialog(null, "No hay conexión con la base de datos");
        }
    }
    public void displayMembers(String [] registers){
        
    }

    void searchMember(String[] register) {
        
    }
    
}
