import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Font;

public class TravelGUI extends JFrame {

	private JPanel contentPane;
	private JTextField fromField;
	private JTextField toField;
	private JTextField searchTravel;
	private JTextArea searchResults;
	private JTextArea searchResults2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TravelGUI frame = new TravelGUI();
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
	public TravelGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		searchTravel = new JTextField();
		searchTravel.setBounds(231, 17, 130, 26);
		contentPane.add(searchTravel);
		searchTravel.setColumns(10);

		fromField = new JTextField();
		fromField.setBounds(44, 179, 130, 26);
		contentPane.add(fromField);
		fromField.setColumns(10);

		toField = new JTextField();
		toField.setBounds(231, 179, 130, 26);
		contentPane.add(toField);
		toField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 50, 465, 107);
		contentPane.add(scrollPane);

		searchResults = new JTextArea();
		scrollPane.setViewportView(searchResults);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 214, 465, 107);
		contentPane.add(scrollPane_1);

		searchResults2 = new JTextArea();
		scrollPane_1.setViewportView(searchResults2);

		JButton searchButton2 = new JButton("Sök resa");
		searchButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				searchResults2.setText("Hittar dina resor...");
				new TripThread().start();
			}
		});
		searchButton2.setBounds(374, 176, 97, 29);
		contentPane.add(searchButton2);

		JButton searchButton = new JButton("Sök resa");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				searchResults.setText("Hittar dina resor...");
				new StationThread().start();

				/**
				 * ArrayList<Station> searchStations = new ArrayList<Station>();
				 * searchStations.addAll(Parser.getStationsFromURL(searchTravel.
				 * getText())); for (Station s: searchStations){
				 * searchResults.append(s.getStationName() +" number: "
				 * +s.getStationNbr() + "\n"); }
				 */
			}
		});
		searchButton.setBounds(376, 17, 97, 29);
		contentPane.add(searchButton);

		JLabel lblTo = new JLabel("Till:");
		lblTo.setBounds(202, 184, 61, 16);
		contentPane.add(lblTo);

		JLabel lblFrom = new JLabel("Från:");
		lblFrom.setBounds(6, 184, 61, 16);
		contentPane.add(lblFrom);

		JLabel lblID = new JLabel("Hållplatser:");
		lblID.setBounds(154, 22, 86, 16);
		contentPane.add(lblID);

		JLabel lblSknetrafiken = new JLabel("Skånetrafiken");
		lblSknetrafiken.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblSknetrafiken.setBounds(6, 9, 143, 38);
		contentPane.add(lblSknetrafiken);
	}

	private class StationThread extends Thread {
		@Override
		public void run() {
			String findStation = searchTravel.getText(); // tar strängen från
															// stationfield
			System.out.println("// Stations when searching for stations containing \"Malm\"");
			ArrayList<Station> searchStations = new ArrayList<Station>(); // Sätter
																			// i
																			// gång
																			// arraylistan
																			// och
																			// söker
			searchStations.addAll(Parser.getStationsFromURL(findStation));
			searchResults.setText("");// Clearar sökrutan innan den börjar visa
										// sökningen
			for (Station s : searchStations) {// sätter igång
				searchResults.append(s.getStationName() + " number:" + s.getStationNbr() + "\n");
			}

		}
	}

	private class TripThread extends Thread {
		@Override
		public void run() {

			String from = fromField.getText();
			String to = toField.getText();
			String searchURL = Constants.getURL(from, to, 5);
			Journeys journeys = Parser.getJourneys(searchURL);
			searchResults2.setText("");

			for (Journey journey : journeys.getJourneys()) {
				System.out.print(journey.getStartStation() + " - ");
				System.out.print(journey.getEndStation());
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);
				searchResults2.append(" Departs " + time + " that is in " + journey.getTimeToDeparture()
						+ " minutes. And it is " + journey.getDepTimeDeviation() + " min late" + "\n");

			}
		}
	}
}
