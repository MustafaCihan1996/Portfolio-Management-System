package b;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewMain3 extends JFrame {
    JComboBox<String> comboBox;
    JButton button;

    public NewMain3() {
        setTitle("Combo Box Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new FlowLayout());

        comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
        add(comboBox);

        button = new JButton("Go to new window");
        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedOption = comboBox.getSelectedItem().toString();
                if (selectedOption.equals("Option 1")) {
                    JFrame newWindow = new JFrame("Option 1 Window");
                    newWindow.setSize(200, 100);
                    newWindow.setVisible(true);
                } else if (selectedOption.equals("Option 2")) {
                    JFrame newWindow = new JFrame("Option 2 Window");
                    newWindow.setSize(200, 100);
                    newWindow.setVisible(true);
                } else if (selectedOption.equals("Option 3")) {
                    JFrame newWindow = new JFrame("Option 3 Window");
                    newWindow.setSize(200, 100);
                    newWindow.setVisible(true);
                }
            }
        });
    }

    public static void main(String[] args) {
        NewMain3 comboBoxExample = new NewMain3();
        comboBoxExample.setVisible(true);
    }
}