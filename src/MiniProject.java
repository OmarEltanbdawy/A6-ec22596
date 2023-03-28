
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;
public class MiniProject {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createWindow());
    }

    private static void createWindow() {
        JFrame frame = new JFrame("OOP Mini-project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        JLabel label = new JLabel("OOP Mini-project by ec22596");
        label.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(label, BorderLayout.NORTH);

        JButton button = new JButton("Click me");
        contentPane.add(button, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    }


