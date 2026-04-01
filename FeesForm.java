import javax.swing.*;

public class FeesForm extends JFrame {
    private JPanel panel1;
    private JTextField tuitionField;
    private JTextField miscField;
    private JTextField labField;
    private JLabel totallabel;
    private JButton computeBtn;
    private JButton backBtn; // ✅ optional

    public FeesForm() {
        setContentPane(panel1);
        setTitle("Fees Management");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        computeBtn.addActionListener(e -> {
            try {
                double tuition = Double.parseDouble(tuitionField.getText());
                double misc = Double.parseDouble(miscField.getText());
                double lab = Double.parseDouble(labField.getText());

                double total = tuition + misc + lab;

                if (tuition < 0 || misc < 0 || lab < 0) {
                    JOptionPane.showMessageDialog(null, "Inputs must not be negative!");
                    totallabel.setText("Invalid");
                } else {
                    totallabel.setText("Total: " + total);
                    JOptionPane.showMessageDialog(null, "Fees calculated successfully!");
                }

            } catch (NumberFormatException ex) {
                totallabel.setText("Invalid input");
                JOptionPane.showMessageDialog(null, "Please enter valid numbers!");
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