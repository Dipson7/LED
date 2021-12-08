import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{

    JLabel title;
    JTextField username;
    JTextField password;
    JButton button;
    JButton button1;

    public Login() {

        setTitle("Registration");
        setBounds(0,0,1280,720);
        //setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        setLayout(null);

        title = new JLabel("Log in");
        title.setBounds(640,10,50,0);
        add(title);

        username = new JTextField("username");
        username.setBounds(338,300,289,35);
        username.setFont(new Font("Arial", Font.BOLD, 20));
        username.setBorder(null);
        add(username);

        password = new JTextField("********");
        password.setBounds(338,350,289,35);
        password.setFont(new Font("Arial", Font.BOLD, 20));
        password.setBorder(null);
        add(password);

        button = new JButton("Login");
        button.setBounds(338, 400, 289, 35);
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setBorder(null);
        add(button);

        button1 = new JButton("Sign up");
        button1.setBounds(380, 450, 200, 35);
        button1.setFont(new Font("Arial", Font.BOLD, 20));
        button1.setBorder(null);
        add(button1);

    }
    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}