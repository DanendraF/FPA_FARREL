import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField1;
    private JTextField textField2;
    private JButton Tambah;
    private JButton Kurang;
    private JButton Kali;
    private JButton Bagi;
    private JLabel hasilLabel;

    public void initialize() {
        Color warna = new Color(55, 58, 64);
        Container wadah = getContentPane();
        wadah.setBackground(warna);

        textField1 = new JTextField();
        textField2 = new JTextField();
        Tambah = new JButton("+");
        Kurang = new JButton("-");
        Kali = new JButton("x");
        Bagi = new JButton("/");
        hasilLabel = new JLabel("Hasil:");
        
        Color warnaJlabel = new Color(255, 255, 255);
        hasilLabel.setForeground(warnaJlabel);

        wadah.setLayout(null);

        textField1.setBounds(10, 10, 150, 30);
        textField2.setBounds(170, 10, 150, 30);
        Tambah.setBounds(10, 50, 50, 30);
        Kurang.setBounds(70, 50, 50, 30);
        Kali.setBounds(130, 50, 50, 30);
        Bagi.setBounds(190, 50, 50, 30);
        hasilLabel.setBounds(10, 90, 200, 30);

        wadah.add(textField1);
        wadah.add(textField2);
        wadah.add(Tambah);
        wadah.add(Kurang);
        wadah.add(Kali);
        wadah.add(Bagi);
        wadah.add(hasilLabel);

        Tambah.addActionListener(this);
        Kurang.addActionListener(this);
        Kali.addActionListener(this);
        Bagi.addActionListener(this);

        setTitle("Kalkulator DanendraF");
        setSize(400, 180);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double bil1 = Double.parseDouble(textField1.getText());
        double bil2 = Double.parseDouble(textField2.getText());
        double hasil = 0;

        if (e.getSource() == Tambah) {
            hasil = bil1 + bil2;
        } else if (e.getSource() == Kurang) {
            hasil = bil1 - bil2;
        } else if (e.getSource() == Kali) {
            hasil = bil1 * bil2;
        } else if (e.getSource() == Bagi) {
            if (bil2 == 0) {
                JOptionPane.showMessageDialog(null, "Pembagian dengan nol tidak diizinkan!");
                return;
            }
            hasil = bil1 / bil2;
        }

        hasilLabel.setText("Hasil: " + hasil);
    }

    public static void main(String[] args) throws Exception {
        Calculator myFrame = new Calculator();
        myFrame.initialize();
    }
}