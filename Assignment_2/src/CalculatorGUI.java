import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Calculator myCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		myCalculator = new Calculator();
		
		textField = new JTextField();
		textField.setBounds(6, 6, 318, 55);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("+");
				myCalculator.plus();
			}
		});
		button.setBounds(172, 91, 46, 29);
		contentPane.add(button);
		
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("-");
				myCalculator.minus();
			}
		});
		button_1.setBounds(220, 91, 46, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("*");
				myCalculator.mult();
			}
		});
		button_2.setBounds(268, 91, 46, 29);
		contentPane.add(button_2);
		
		JButton button_4 = new JButton("13");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("13");
				myCalculator.numberButtonPressed(13);
			}
		});
		button_4.setBounds(17, 91, 46, 29);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("31");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("31");
				myCalculator.numberButtonPressed(31);
			}
		});
		button_5.setBounds(60, 121, 46, 29);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("24");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("24");
				myCalculator.numberButtonPressed(24);
			}
		});
		button_6.setBounds(60, 91, 46, 29);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("42");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("42");
				myCalculator.numberButtonPressed(42);
			}
		});
		button_7.setBounds(18, 121, 46, 29);
		contentPane.add(button_7);
		
		JButton button_3 = new JButton("=");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
				
			}
		});
		button_3.setBounds(220, 180, 94, 81);
		contentPane.add(button_3);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.clear();
				textField.setText("");
			}
		});
		btnC.setBounds(161, 206, 57, 55);
		contentPane.add(btnC);
	}
}
