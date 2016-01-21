package se.mah;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.DropMode;

public class Main extends JFrame {
	private JTextField txtGymNamn;
	private JTextField txtlkorvensEsplanad;
	private JTextField txtMalm;
	private JTextField txtTele;
	private JTextField textPersonnr;
	private JTextField txtHuberthunkgmailcom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/images/gymwallpaper2.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 406);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hjälp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hjälp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 169, 362);
		getContentPane().add(scrollPane);
		
		JList list = new JList();
		list.setForeground(Color.BLACK);
		list.setBackground(Color.LIGHT_GRAY);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Olle H. Oppenheimer", "Nosferatu Nilsson", "Dan Drullputte", "Pericles Persson", "Svea Swartenbrandt", "Hubert Hoffsenschneizer", "Xerxes Hansson", "Rickard Ruddlöv", "Staffan Stenkula", "Filippa Ferdinand", "Brad Pittsson", "Hjördis Trilldrutt", "Uno Onkelhoffer", "Inez Ibsen", "Vlad Putin", "Christoph Quisling", "Hugo Hagbardsson", "Axel Avfallén", "Bo-Björn Björndahl", "Wollmert Wilderin", "Pjotr Pettersson", "Onkel P. Ottosson", "Stellan Shrödinger", "Jon Skolmen", "Vera Wagner"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		txtGymNamn = new JTextField();
		txtGymNamn.setText("Olle H. Oppenheimer");
		txtGymNamn.setBounds(250, 169, 210, 26);
		getContentPane().add(txtGymNamn);
		txtGymNamn.setColumns(10);
		
		JLabel lblAdress = new JLabel("Namn:");
		lblAdress.setForeground(Color.WHITE);
		lblAdress.setBounds(181, 174, 46, 16);
		getContentPane().add(lblAdress);
		
		JLabel lblAdress_1 = new JLabel("Adress:");
		lblAdress_1.setForeground(Color.WHITE);
		lblAdress_1.setBounds(181, 207, 57, 16);
		getContentPane().add(lblAdress_1);
		
		txtlkorvensEsplanad = new JTextField();
		txtlkorvensEsplanad.setText("Ölkorvens Esplanad 13");
		txtlkorvensEsplanad.setColumns(10);
		txtlkorvensEsplanad.setBounds(250, 202, 210, 26);
		getContentPane().add(txtlkorvensEsplanad);
		
		txtMalm = new JTextField();
		txtMalm.setText("21741 Malmö");
		txtMalm.setColumns(10);
		txtMalm.setBounds(250, 226, 210, 26);
		getContentPane().add(txtMalm);
		
		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setForeground(Color.WHITE);
		lblTelefon.setBounds(181, 267, 57, 16);
		getContentPane().add(lblTelefon);
		
		txtTele = new JTextField();
		txtTele.setText("073-7334762");
		txtTele.setColumns(10);
		txtTele.setBounds(250, 262, 210, 26);
		getContentPane().add(txtTele);
		
		JLabel lblPersonnr = new JLabel("Personnr:");
		lblPersonnr.setForeground(Color.WHITE);
		lblPersonnr.setBounds(181, 295, 70, 16);
		getContentPane().add(lblPersonnr);
		
		textPersonnr = new JTextField();
		textPersonnr.setText("120210-5132");
		textPersonnr.setColumns(10);
		textPersonnr.setBounds(250, 290, 210, 26);
		getContentPane().add(textPersonnr);
		
		JLabel lblEpost = new JLabel("E-Post");
		lblEpost.setForeground(Color.WHITE);
		lblEpost.setBounds(181, 323, 70, 16);
		getContentPane().add(lblEpost);
		
		txtHuberthunkgmailcom = new JTextField();
		txtHuberthunkgmailcom.setText("olle_babe55@gmail.com");
		txtHuberthunkgmailcom.setColumns(10);
		txtHuberthunkgmailcom.setBounds(250, 318, 210, 26);
		getContentPane().add(txtHuberthunkgmailcom);
		
		JButton btnRedigera = new JButton("Spara");
		btnRedigera.setBounds(569, 326, 117, 29);
		getContentPane().add(btnRedigera);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/images/hubertface2.jpg")));
		lblNewLabel.setBounds(252, 11, 151, 152);
		getContentPane().add(lblNewLabel);
		
		JLabel lblBkBicepsAb = new JLabel("BK Biceps AB");
		lblBkBicepsAb.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblBkBicepsAb.setForeground(Color.WHITE);
		lblBkBicepsAb.setBounds(530, 11, 143, 44);
		getContentPane().add(lblBkBicepsAb);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Main.class.getResource("/images/gymwallpaper.jpg")));
		lblNewLabel_1.setBounds(168, 0, 523, 362);
		getContentPane().add(lblNewLabel_1);
		
	}
}
