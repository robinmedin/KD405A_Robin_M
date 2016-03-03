package se.mah.k3.robin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class TryIt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryIt frame = new TryIt();
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
	public TryIt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		PixelController px = PixelController.getInstance(Screen.ASSIGNMENT_7);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		px.setPixel(10, 10, Color.BLACK);
		px.setPixel(10, 11, Color.WHITE);
		px.setPixel(10, 12, Color.BLACK);
		px.setPixel(10, 13, Color.WHITE);
	}
	
	/**
	//Connection to screen Medea 1
	PixelController px = PixelController.getInstance(Screen.MEDEA_1);
	

	//Try connecting to screen
	int i = 0;
	while (!px.isConnected() && i < 15){
		try {
			Thread.sleep(500);
			System.out.println("Attempting to connect...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
			i++;
	}
	
	//When connected, draw pixels on screen
	if(px.isConnected()){
		System.out.println("Successfully connected to screen");
		
		System.out.println("Size on screen: " + px.getNumberPixelsWidestSide() + " : " + px.getNumberPixelsShortestSide());
		
		//These pixels draw something (int x, int y, color):
		px.setPixel(50, 10, Color.BLUE);
	}
	
	
	*/
	
	
}
