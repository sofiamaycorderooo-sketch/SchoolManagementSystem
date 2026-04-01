import javax.swing.*;

public class TeacherForm extends JFrame {
    private JPanel panelmain;
    private JTextField subjectField;
    private JTextField timeField;
    private JTextField teacherField;
    private JButton saveBtn;
    private JButton backBtn;

    public TeacherForm() {
        setContentPane(panelmain);
        setTitle("Teacher Management");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        saveBtn.addActionListener(e -> {
            String teacher = teacherField.getText();
            String subject = subjectField.getText();
            String time = timeField.getText();

            if (teacher.isEmpty() || subject.isEmpty() || time.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields!");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Teacher: " + teacher +
                                "\nSubject: " + subject +
                                "\nTime: " + time);
            }
        });

        if (backBtn != null) {
            backBtn.addActionListener(e -> {
                new Dashboard().setVisible(true);
                dispose();
            });
        }

        setVisible(true);
    }
}