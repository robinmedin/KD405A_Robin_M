package se.mah.k3.robin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Humans_and_Dogs_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtHumanName;
	private JTextField txtDogName;
	
	private Human human;
	private JTextField infoField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Humans_and_Dogs_GUI frame = new Humans_and_Dogs_GUI();
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
	public Humans_and_Dogs_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHumansAndDogs = new JLabel("Humans and Dogs");
		lblHumansAndDogs.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblHumansAndDogs.setBounds(25, 6, 176, 28);
		contentPane.add(lblHumansAndDogs);
		
		txtHumanName = new JTextField();
		txtHumanName.setText("Human Name");
		txtHumanName.setBounds(22, 68, 130, 26);
		contentPane.add(txtHumanName);
		txtHumanName.setColumns(10);
		
		txtDogName = new JTextField();
		txtDogName.setText("Dog Name");
		txtDogName.setBounds(22, 106, 130, 26);
		contentPane.add(txtDogName);
		txtDogName.setColumns(10);
		
		JTextArea errorMessageArea = new JTextArea();
		errorMessageArea.setForeground(Color.RED);
		errorMessageArea.setBackground(SystemColor.window);
		errorMessageArea.setBounds(22, 305, 405, 41);
		contentPane.add(errorMessageArea);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtHumanName.getText().length() > 3){
					human = new Human(txtHumanName.getText());
				}
				
				if(txtHumanName.getText().length() < 3){
					errorMessageArea.setText("ERROR: Name has to be longer than 3 characters.");
				}
				
			}
		});
		btnNewHuman.setBounds(164, 68, 117, 29);
		contentPane.add(btnNewHuman);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				errorMessageArea.setText("");
				
					Dog dog = new Dog(txtDogName.getText());
					human.buyDog(dog);
			}
		});
		
		btnBuyDog.setBounds(164, 106, 117, 29);
		contentPane.add(btnBuyDog);
		
		infoField = new JTextField();
		infoField.setBounds(22, 215, 406, 62);
		contentPane.add(infoField);
		infoField.setColumns(10);
		
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				infoField.setText(human.getInfo());
			}
		});
		btnPrintInfo.setBounds(164, 147, 117, 29);
		contentPane.add(btnPrintInfo);
		
		JLabel lblInformation = new JLabel("Information");
		lblInformation.setForeground(Color.GRAY);
		lblInformation.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblInformation.setBounds(22, 196, 107, 16);
		contentPane.add(lblInformation);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(84, 200, 343, 14);
		contentPane.add(separator);
		
		JLabel lblErrorMessages = new JLabel("Error Messages");
		lblErrorMessages.setForeground(Color.GRAY);
		lblErrorMessages.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblErrorMessages.setBounds(22, 283, 107, 16);
		contentPane.add(lblErrorMessages);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(103, 287, 327, 14);
		contentPane.add(separator_1);
		
		JLabel lblByRobinMedin = new JLabel("by Robin Medin");
		lblByRobinMedin.setForeground(Color.GRAY);
		lblByRobinMedin.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblByRobinMedin.setBounds(191, 14, 107, 16);
		contentPane.add(lblByRobinMedin);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(25, 35, 402, 14);
		contentPane.add(separator_2);
		

		

	}
}
