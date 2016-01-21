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

public class Main extends JFrame {
	private JTextField txtHubertHankefjord;
	private JTextField txtlkorvensEsplanad;
	private JTextField txtMalm;
	private JTextField txtxxxx;
	private JTextField textField;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 350);
		
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
		scrollPane.setBounds(0, 0, 169, 306);
		getContentPane().add(scrollPane);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Hubert Hankefjord", "Heinrich von Ludendorff", "Andrew Asfjäll", "Robert Ruddlöv", "Filip Felföding", "Staffan Stenkula", "Nosferatu Nilsson", "Brad Pittsson", "Thor Trilldrutt", "Danko Drullputte", "Uno Onkelhoffer", "Inez Ifsengrull", "Vlad Putin", "Christoph Quisling", "Joakim Franz", "Hugo Ilsenschneizer", "Hanz Hoffsenschnofsen", "Axel Avfallsansvarig", "Bo-Björn Björndahl", "Wollmert Wilderin"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		txtHubertHankefjord = new JTextField();
		txtHubertHankefjord.setText("Hubert Hankefjord");
		txtHubertHankefjord.setBounds(250, 6, 169, 26);
		getContentPane().add(txtHubertHankefjord);
		txtHubertHankefjord.setColumns(10);
		
		JLabel lblAdress = new JLabel("Namn:");
		lblAdress.setBounds(181, 11, 46, 16);
		getContentPane().add(lblAdress);
		
		JLabel lblAdress_1 = new JLabel("Adress:");
		lblAdress_1.setBounds(181, 44, 57, 16);
		getContentPane().add(lblAdress_1);
		
		txtlkorvensEsplanad = new JTextField();
		txtlkorvensEsplanad.setText("Ölkorvens Esplanad 13");
		txtlkorvensEsplanad.setColumns(10);
		txtlkorvensEsplanad.setBounds(250, 39, 169, 26);
		getContentPane().add(txtlkorvensEsplanad);
		
		txtMalm = new JTextField();
		txtMalm.setText("21741 Malmö");
		txtMalm.setColumns(10);
		txtMalm.setBounds(250, 63, 169, 26);
		getContentPane().add(txtMalm);
		
		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setBounds(181, 104, 57, 16);
		getContentPane().add(lblTelefon);
		
		txtxxxx = new JTextField();
		txtxxxx.setText("073-733XXXX");
		txtxxxx.setColumns(10);
		txtxxxx.setBounds(250, 99, 169, 26);
		getContentPane().add(txtxxxx);
		
		JLabel lblPersonnr = new JLabel("Personnr:");
		lblPersonnr.setBounds(181, 132, 70, 16);
		getContentPane().add(lblPersonnr);
		
		textField = new JTextField();
		textField.setText("120210-5132");
		textField.setColumns(10);
		textField.setBounds(250, 127, 169, 26);
		getContentPane().add(textField);
	}
}
