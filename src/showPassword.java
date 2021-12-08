import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class showPassword extends JFrame implements ActionListener{

    JLabel title;
    JLabel username;
    JLabel password;
    JLabel align;
    JTextField username_entry;
    JPasswordField password_entry;
    JCheckBox tandc;
    JButton register;
    JButton showP;
    public showPassword() {

        setTitle("Registration");

        setBounds(0,0,950,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        title = new JLabel("Registration");
        title.setBounds(360,20,100,30);
        add(title);

        username = new JLabel("Username:");
        username.setBounds(300,120,100,30);
        add(username);

        password = new JLabel("Password:");
        password.setBounds(300,180,100,30);
        add(password);

        username_entry = new JTextField("");
        username_entry.setBounds(400,120,100,30);
        add(username_entry);

        password_entry = new JPasswordField("");
        password_entry.setBounds(400,180,100,30);
        password_entry.setEchoChar('*');
        add(password_entry);

        tandc = new JCheckBox("I agree to the terms and conditions");
        tandc.setBounds(360,220,250,30);
        add(tandc);

        register = new JButton("Register");
        register.setBounds(360,260,150,30);
        register.addActionListener(this);
        add(register);

        showP = new JButton("Show");
        showP.setBounds(550,180,100,30);
        showP.addActionListener(this);
        add(showP);

        align = new JLabel("");
        align.setBounds(300,200, 100,30);
        add(align);

        setVisible(true);

    }
    public static void main(String[] args) {



        new showPassword();
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == showP) {
            if (showP.getText() == "Show") {
                password_entry.setEchoChar((char) 0);
                showP.setText("Hide");



            } else {
                password_entry.setEchoChar('*');
                showP.setText("Show");
            }
        }



        if (e.getSource().equals(register)){
            JOptionPane registered;
            registered = new JOptionPane();
            JOptionPane.showMessageDialog(username_entry, username_entry.getText());



        }
    }
}