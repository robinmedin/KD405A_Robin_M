import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class HouseGUI extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// UPPGIFT 1.2 SKAPA HUS
		House houseA = new House(1988, 194);
		House houseB = new House(1990, 500);
		House houseC = new House(1858, 900);

		// UPPGIFT 1.3 ARRAY
		House[] houses;
		houses = new House[10];
		houses[0] = new House(1832, 650);
		houses[1] = new House(1912, 300);
		houses[2] = new House(1945, 230);
		houses[3] = new House(1821, 600);
		houses[4] = new House(1924, 780);
		houses[5] = new House(1989, 10);
		houses[6] = new House(2011, 340);
		houses[7] = new House(2001, 200);
		houses[8] = new House(1975, 540);
		houses[9] = new House(1969, 58);

		// UPPGIFT 1.4 ARRAYLIST
		Random i = new Random();
		Random j = new Random();

		ArrayList<House> houseList = new ArrayList<House>();
		for (int qq = 0; qq < 100; qq++) {
			int ia = i.nextInt(216) + 1800; // Tar värde från 1800 och upp till 1800 + 216
											
			int jb = j.nextInt(991) + 10;   // Lägsta värdet av husens storlek + 10
											
			houseList.add(new House(ia, jb));
		}

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 487, 507);
		contentPane.add(scrollPane);

		JTextArea txtrHouses = new JTextArea();
		txtrHouses.setText("");
		scrollPane.setViewportView(txtrHouses);

		// UPPGIFT 1.2 PRINT
		String a = "Uppgift 1.2:\n";
		String b = null;
		String c = null;
		String d = null;

		if (houseA.getYearBuilt() != 0 && houseA.getSize() != 0) {
			b = "Hus A byggdes år " + houseA.getYearBuilt() + " och är " + houseA.getSize() + " kvadratmeter stort.\n";
		} else {
			b = "404 - HOUSE NOT FOUND!\n";
		}

		if (houseB.getYearBuilt() != 0 && houseB.getSize() != 0) {
			c = "Hus B byggdes år " + houseB.getYearBuilt() + " och är " + houseB.getSize() + " kvadratmeter stort.\n";
		} else {
			c = "404 - HOUSE NOT FOUND!\n";
		}

		if (houseC.getYearBuilt() != 0 && houseC.getSize() != 0) {
			d = "Hus C byggdes år " + houseC.getYearBuilt() + " och är " + houseC.getSize() + " kvadratmeter stort.\n";
		} else {
			d = "404 - HOUSE NOT FOUND!\n";
		}

		txtrHouses.append(a + b + c + d);
		System.out.println(a + b + c + d);

		// UPPGIFT 1.3 PRINT
		txtrHouses.append("\nUppgift 1.3:\n");
		for (int q = 0; q < houses.length; q++) {
			if (houses[q].getYearBuilt() != 0 && houses[q].getSize() != 0) {
				txtrHouses.append("Hus " + q + " byggdes år " + houses[q].getYearBuilt() + " och är "
						+ houses[q].getSize() + " kvadratmeter stort.\n");
			} else {
				txtrHouses.append("404 - HOUSE NOT FOUND!\n");
			}
		}

		// UPPGIFT 1.4 PRINT
		txtrHouses.append("\nUppgift 1.4:\n");
		for (House h : houseList) {
			if (h.getYearBuilt() != 0 && h.getSize() != 0) {
				txtrHouses.append("Ett annat hus byggdes år " + h.getYearBuilt() + " och är " + h.getSize()
						+ " kvadratmeter stort.\n");
			} else {
				txtrHouses.append("404 - HOUSE NOT FOUND!\n");
			}
		}

	}
}
