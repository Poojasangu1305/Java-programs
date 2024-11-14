import javax.swing.*;

public class SimpleDivisionApp {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Simple Division");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JTextField num1Field = new JTextField(5);
        JTextField num2Field = new JTextField(5);
        JTextField resultField = new JTextField(5);
        resultField.setEditable(false); // Result field is non-editable

        JButton divideButton = new JButton("Divide");

        // Set up layout with a simple panel
        JPanel panel = new JPanel();
        panel.add(new JLabel("Num1:"));
        panel.add(num1Field);
        panel.add(new JLabel("Num2:"));
        panel.add(num2Field);
        panel.add(divideButton);
        panel.add(new JLabel("Result:"));
        panel.add(resultField);

        // Add ActionListener for the divide button
        divideButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int result = num1 / num2;
                resultField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid integers.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(frame, "Cannot divide by zero.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Add panel to frame and make it visible
        frame.add(panel);
        frame.setVisible(true);
    }
}
