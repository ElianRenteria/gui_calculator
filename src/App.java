import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private String calculator_screen_text = "";
    public void start() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);
        frame.setLayout(null);

        JTextField calculator_screen = new JTextField();
        calculator_screen.setEditable(false);
        calculator_screen.setBounds(20, 20, 460, 50);
        calculator_screen.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(calculator_screen);

        int x = 30, y = 100;
        JButton[] numberButtons = new JButton[10];
        for (int i = 1; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton("" + i);
            frame.add(numberButtons[i]);
            numberButtons[i].setBounds(x, y, 100, 100);
            x += 110;
            if(i%4 == 0){
                x = 30;
                y += 110;
            }
        }
        // 0 button
        numberButtons[0] = new JButton("" + 0);
        frame.add(numberButtons[0]);
        numberButtons[0].setBounds(x, y, 100, 100);
        x += 110;
        // clear button
        JButton clear_button = new JButton("clr");
        frame.add(clear_button);
        clear_button.setBounds(x, y, 100, 100);
        x += 110;
        // equals button
        JButton equals_button = new JButton("=");
        frame.add(equals_button);
        equals_button.setBounds(x, y, 100, 100);
        x = 30;
        y += 110;
        // operator buttons
        JButton addition_button = new JButton("+");
        frame.add(addition_button);
        addition_button.setBounds(x, y, 100, 100);
        x += 110;
        // subtract button
        JButton subtraction_button = new JButton("-");
        frame.add(subtraction_button);
        subtraction_button.setBounds(x, y, 100, 100);
        x += 110;
        // multiply button
        JButton multiply_button = new JButton("x");
        frame.add(multiply_button);
        multiply_button.setBounds(x, y, 100, 100);
        x += 110;
        // multiply button
        JButton division_button = new JButton("/");
        frame.add(division_button);
        division_button.setBounds(x, y, 100, 100);
        x += 110;


        // Action Listeners
        numberButtons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator_screen_text += "1";
                calculator_screen.setText(calculator_screen_text);
            }
        });


        frame.setVisible(true);
    }
    public double sum(double a, double b){
        return a + b;
    }
    public double sub(double a, double b){
        return a - b;
    }
    public double multiply(double a, double b){
        return a * b;
    }
    public double divide(double a, double b){
        return a/b;
    }
}
