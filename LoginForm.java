import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginBtn;
    private JPanel mamapanel;

    public LoginForm() {
        setContentPane(mamapanel);
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        loginBtn.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());

            if (user.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter username and password first!");

            } else if (user.equals("admin") && pass.equals("1234")) {
                new Dashboard().setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}