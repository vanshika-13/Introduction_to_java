import javax.swing.*;
import java.awt.*;

public class practise2 extends JFrame {

    public practise2() {
        setLayout(new FlowLayout());

        this.setLayout(new FlowLayout());

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.setLayout(new FlowLayout());
        p2.setLayout(new FlowLayout());

        p1.add(new JButton(" Button 1 "));
        p1.add(new JButton(" Button 2 "));
        p1.add(new JButton(" Button 3 "));
        p2.add(new JButton(" Button 4 "));
        p2.add(new JButton(" Button 5 "));
        p2.add(new JButton(" Button 6 "));

        this.add(p1);
        this.add(p2);
    }

    public static void main(String[] args) {
        practise2 frame = new practise2();
        frame.setTitle(" Practise2 ");
        frame.setSize(600, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}