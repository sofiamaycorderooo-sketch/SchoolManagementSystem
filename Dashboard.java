import javax.swing.*;

public class Dashboard extends JFrame {
    private JButton feesBtn;
    private JButton teacherBtn;
    private JButton studentBtn;
    private JPanel mpanel;

    public Dashboard() {
        setContentPane(mpanel);
        setTitle("Dashboard");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 👨‍🎓 Open Student Form
        studentBtn.addActionListener(e -> {
            new StudentForm().setVisible(true);
            dispose();
        });

        feesBtn.addActionListener(e -> {
            new FeesForm().setVisible(true);
            dispose();
        });

        teacherBtn.addActionListener(e -> {
            new TeacherForm().setVisible(true);
            dispose();
        });

        setVisible(true);
    }
}