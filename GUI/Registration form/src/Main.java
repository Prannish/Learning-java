import java.awt.*;
import javax.swing.*;
class BCA {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("GUI");
        f1.setSize(850, 650);
        f1.setLayout(null);
        f1.getContentPane().setBackground(Color.LIGHT_GRAY);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setForeground(Color.WHITE);
        panel.setBounds(50, 50, 700, 500);

        JLabel l1 = new JLabel("User Registration details");
        l1.setBounds(250, 20, 200, 20);
        panel.add(l1);
        JLabel l2 = new JLabel("Name");
        l2.setBounds(20, 60, 100, 20);
        panel.add(l2);
        JTextField t1 = new JTextField(15);
        t1.setBounds(150, 60, 200, 20);
        panel.add(t1);
        JLabel l3 = new JLabel("Contact Number");
        l3.setBounds(20, 100, 100, 20);
        panel.add(l3);
        JTextField t2 = new JTextField(15);
        t2.setBounds(150, 100, 200, 20);
        panel.add(t2);
        JLabel l4 = new JLabel("Age");
        l4.setBounds(20, 140, 100, 20);
        panel.add(l4);
        JTextField t3 = new JTextField(15);
        t3.setBounds(150, 140, 200, 20);
        panel.add(t3);
        JLabel l5 = new JLabel("Gender");
        l5.setBounds(20, 180, 100, 20);
        panel.add(l5);
        JRadioButton b1 = new JRadioButton("Male");
        b1.setBounds(150, 180, 60, 20);
        JRadioButton b2 = new JRadioButton("Female");
        b2.setBounds(220, 180, 70, 20);
        JRadioButton b3 = new JRadioButton("Other");
        b3.setBounds(300, 180, 70, 20);
        ButtonGroup Bg = new ButtonGroup();
        Bg.add(b1);
        Bg.add(b2);
        Bg.add(b3);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        JLabel l6 = new JLabel("Hobbies");
        l6.setBounds(20, 220, 100, 20);
        panel.add(l6);
        JCheckBox c1 = new JCheckBox("Singing");
        c1.setBounds(150, 220, 100, 20);
        JCheckBox c2 = new JCheckBox("Dancing");
        c2.setBounds(250, 220, 100, 20);
        JCheckBox c3 = new JCheckBox("Playing");
        c3.setBounds(350, 220, 100, 20);
        JCheckBox c4 = new JCheckBox("Reading");
        c4.setBounds(450, 220, 100, 20);
        panel.add(c1);
        panel.add(c2);
        panel.add(c3);
        panel.add(c4);
        JTextArea A1 = new JTextArea();
        A1.setBounds(20, 260, 460, 100);
        panel.add(A1);
        JButton b4 = new JButton("Submit");
        b4.setBounds(150, 380, 100, 30);
        panel.add(b4);
        JButton b5 = new JButton("Reset");
        b5.setBounds(300, 380, 100, 30);
        panel.add(b5);
        f1.add(panel);
        f1.setVisible(true);
    }
}