import javax.swing.*;

public class StudentForm extends JFrame {
    private JPanel panel1;
    private JTextField courseField;
    private JTextField nameField;
    private JButton submitBtn;
    private JButton backBtn;

    public StudentForm() {
        setContentPane(panel1);
        setTitle("Student Form");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submitBtn.addActionListener(e -> {
            String name = nameField.getText();
            String course = courseField.getText();

            if (name.isEmpty() || course.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields!");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Student Name: " + name +
                                "\nCourse: " + course);
            }
        });

        backBtn.addActionListener(e -> {
            new Dashboard().setVisible(true);
            dispose();
        });

        setVisible(true); // ✅ you forgot this
    }
}