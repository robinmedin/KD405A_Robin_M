package se.mah.k3.robin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class BikeStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrice;
	private JTextField txtSize;
	private JTextField txtColor;
	private BikeStore bikeStore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		
		bikeStore = new BikeStore();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPrice = new JTextField();
		txtPrice.setForeground(Color.BLACK);
		txtPrice.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtPrice.setText("");
			}

		});
		txtPrice.setText("Price (SEK)");
		txtPrice.setBounds(18, 212, 130, 26);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		
		txtSize = new JTextField();
		txtSize.setForeground(Color.BLACK);
		txtSize.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtSize.setText("");
			}
			
		});
		txtSize.setText("Size (inches)");
		txtSize.setBounds(18, 246, 130, 26);
		contentPane.add(txtSize);
		txtSize.setColumns(10);
		
		txtColor = new JTextField();
		txtColor.setForeground(Color.BLACK);
		txtColor.addFocusListener(new FocusAdapter() {
			@Override
			
			//Tar bort texten "Color" från TextField när man markerar rutan
			public void focusGained(FocusEvent e) {
				txtColor.setText("");
			}

			
		});
		txtColor.setText("Color");
		txtColor.setBounds(18, 279, 130, 26);
		contentPane.add(txtColor);
		txtColor.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(230, 23, 373, 311);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Add Bike");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String bikeColor = txtColor.getText(); 					/**Hämtar värden från textfield textColor och sätter in dem i en string, bikeColor*/
				int bikePrice = Integer.parseInt(txtPrice.getText()); 	/**Hämtar värden från textfield txtPrice, konverterar int till string*/
				int bikeSize = Integer.parseInt(txtSize.getText()); 	/**Hämtar värden från textfield txtSize, konverterar int till string*/
				
				
				bikeStore.addBike(bikeColor, bikeSize, bikePrice); 		/**Lägg till cyklar i ArrayList getAllBikes*/
				textArea.setText(bikeStore.getAllBikes()); 				/**Hämtar alla cyklarna från ArrayListen getAllBikes*/
				
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 4, 4);
		contentPane.add(scrollPane);
		btnNewButton.setBounds(14, 310, 81, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblPrice = new JLabel("Enter bike specifications here:");
		lblPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblPrice.setBounds(21, 192, 171, 16);
		contentPane.add(lblPrice);
		
		JLabel lblNewLabel = new JLabel("Lazlos Cykel och Frisör");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(18, 6, 277, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblBikarbonatsgatan = new JLabel("Bikarbonatsgatan 13");
		lblBikarbonatsgatan.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblBikarbonatsgatan.setBounds(18, 45, 171, 16);
		contentPane.add(lblBikarbonatsgatan);
		
		JLabel lblMalm = new JLabel("217 41 MALMÖ");
		lblMalm.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblMalm.setBounds(18, 63, 171, 16);
		contentPane.add(lblMalm);
		

	}
}
