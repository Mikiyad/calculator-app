import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdvancedCalculator extends JFrame implements ActionListener {
    private JTextField textField;
    private double num1, num2, result;
    private char operator;

    public AdvancedCalculator() {
        setTitle("Advanced Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        textField = new JTextField();
        textField.setEditable(false);
        panel.add(textField);

        JButton button1 = new JButton("1");
        button1.addActionListener(this);
        panel.add(button1);

        JButton button2 = new JButton("2");
        button2.addActionListener(this);
        panel.add(button2);

        // Add more buttons for advanced calculations such as trigonometric functions, logarithmic functions, exponential functions, statistical functions, and financial functions.

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonText = e.getActionCommand();

        if (buttonText.equals("1")) {
            textField.setText(textField.getText() + "1");
        } else if (buttonText.equals("2")) {
            textField.setText(textField.getText() + "2");
        } else if (buttonText.equals("+")) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        } else if (buttonText.equals("-")) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        } else if (buttonText.equals("*")) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        } else if (buttonText.equals("/")) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        } else if (buttonText.equals("=")) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }

            textField.setText(Double.toString(result));
        }
    }

    public static void main(String[] args) {
        new AdvancedCalculator();
    }
}