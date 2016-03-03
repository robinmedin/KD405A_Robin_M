package se.mah.k3.robin;

import java.awt.Color;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class DigitalBanksy {

	public static void main(String[] args) {
	
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
			//THE LETTER R
			px.setPixel(50, 10, Color.BLUE);
			px.setPixel(51, 10, Color.GREEN);
			px.setPixel(52, 10, Color.BLUE);
			px.setPixel(53, 10, Color.YELLOW);
			px.setPixel(54, 10, Color.BLACK);
			px.setPixel(55, 10, Color.GREEN);
			px.setPixel(56, 10, Color.BLUE);
			px.setPixel(57, 10, Color.YELLOW);
			
			px.setPixel(50, 11, Color.GREEN);
			px.setPixel(50, 12, Color.BLACK);
			px.setPixel(50, 13, Color.YELLOW);
			px.setPixel(50, 14, Color.BLUE);
			
			px.setPixel(51, 15, Color.BLUE);
			px.setPixel(52, 15, Color.PINK);
			px.setPixel(53, 11, Color.BLUE);
			px.setPixel(53, 12, Color.BLACK);
			px.setPixel(53, 13, Color.YELLOW);
			px.setPixel(53, 14, Color.BLUE);
			
			px.setPixel(54, 12, Color.GREEN);
			px.setPixel(55, 13, Color.BLACK);
			px.setPixel(56, 14, Color.BLUE);
			px.setPixel(57, 15, Color.YELLOW);
			
		}

	}

}
