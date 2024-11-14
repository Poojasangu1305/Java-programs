import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField resultField;
    private String currentInput = "";
    private double num1, num2, result;
    private String operator;

    public SimpleCalculator() {
        // Set up the frame
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize components
        resultField = new JTextField();
        resultField.setEditable(false);
        resultField.setHorizontalAlignment(JTextField.RIGHT);
        add(resultField, BorderLayout.NORTH);
        

        // Panel for the calculator buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10)); // 4x4 grid layout

        // Buttons for digits and operations
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
        };

        // Add buttons to the panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        // Add the button panel to the frame
        add(buttonPanel, BorderLayout.CENTER);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            // If it's a digit or a dot, append it to the current input
            if (command.matches("[0-9]") || command.equals(".")) {
                currentInput += command;
                resultField.setText(currentInput);
            }
            // If it's an operator, store the first number and operator
            else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/") || command.equals("%")) {
                num1 = Double.parseDouble(currentInput);
                operator = command;
                currentInput = ""; // Clear input for next number
            }
            // If the equals button is pressed, perform the calculation
            else if (command.equals("=")) {
                num2 = Double.parseDouble(currentInput);
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            throw new ArithmeticException("Cannot divide by zero");
                        }
                        result = num1 / num2;
                        break;
                    case "%":
                        result = num1 % num2;
                        break;
                }
                resultField.setText(String.valueOf(result));
                currentInput = String.valueOf(result); // Store the result for further calculations
            }
        } catch (Exception ex) {
            resultField.setText("Error");
            currentInput = "";
        }
    }

    public static void main(String[] args) {
        // Create an instance of the SimpleCalculator class to run the application
        new SimpleCalculator();
    }
}
