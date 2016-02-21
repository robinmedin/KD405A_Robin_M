package se.mah.k3.robin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private ClockLogic clockLogic;
	private JLabel clockFace;
	private final JLabel lblHour = new JLabel("Hour:");
	private JTextField textFieldHour;
	private JTextField textFieldMin;
	private JLabel lblAlarmmessage;
	private JLabel lblAlarmAt;
	public boolean activate;
	private int hour;
	private int minute;
		
	public void DigitalClockGUI() {
	}
	
	public void setTimeOnLabel(String time){
		clockFace.setText(time);
		
	}
	
	    
	    public void setAlarmOnLabel(String alarmTime){
	        lblAlarmAt.setText(alarmTime);
	    }
	    
	    public void activateAlarm(boolean activate){   
	        if(activate)
	        {
	            lblAlarmAt.setText("NEVER GONNA LET YOU SNOOZE");
	        }else{
	            lblAlarmAt.setText(" ");
	        }
	    }
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldHour = new JTextField();
		textFieldHour.setFont(new Font("Synchro LET", Font.PLAIN, 13));
		textFieldHour.setBounds(62, 233, 46, 26);
		contentPane.add(textFieldHour);
		textFieldHour.setColumns(10);
		
		textFieldMin = new JTextField();
		textFieldMin.setFont(new Font("Synchro LET", Font.PLAIN, 13));
		textFieldMin.setColumns(10);
		textFieldMin.setBounds(150, 233, 46, 26);
		contentPane.add(textFieldMin);
		
		//URTAVLAN
		clockFace = new JLabel("00:00:00");
		clockFace.setForeground(new Color(255, 0, 0));
		clockFace.setFont(new Font("Synchro LET", Font.PLAIN, 60));
		clockFace.setBounds(105, 25, 246, 73);
		contentPane.add(clockFace);
		
		JButton btnSetAlarm = new JButton("Set");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                String hourString = textFieldHour.getText();
                hour = Integer.parseInt(hourString);
                String minuteString = textFieldMin.getText();
                minute = Integer.parseInt(minuteString);
                clockLogic.setAlarm(hour, minute);
				
				lblAlarmAt.setText("Alarm at: " + textFieldHour.getText() + " : " + textFieldMin.getText());
				System.out.println(textFieldHour.getText());
				
			/**	
			if(hourString.isEmpty() || minuteString.isEmpty()){
				lblAlarmAt.setText("You have to set an alarm!");
			} else { 
			_setHour();
			_setMinute();
			
			if(hour > 24 || minute > 60){
				lblAlarmAt.setText("Du suger.");
			} else {
				clockLogic.setAlarm(hour, minute);
				lblAlarmAt.setText(textFieldHour.getText() + " : " + textFieldMin.getText());
			}
			}
			*/
				
				
			}
		});
		btnSetAlarm.setBounds(369, 231, 61, 29);
		contentPane.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("Clear");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clockLogic.clearAlarm();
                lblAlarmAt.setText(" ");
			}
		});
		btnClearAlarm.setBounds(306, 231, 61, 29);
		contentPane.add(btnClearAlarm);
		
		clockLogic = new ClockLogic(this);
		
		lblAlarmAt = new JLabel("");
		lblAlarmAt.setForeground(new Color(255, 0, 0));
		lblAlarmAt.setFont(new Font("Synchro LET", Font.PLAIN, 15));
		lblAlarmAt.setBounds(108, 90, 243, 29);
		contentPane.add(lblAlarmAt);
		lblHour.setForeground(new Color(255, 255, 255));
		lblHour.setFont(new Font("Synchro LET", Font.PLAIN, 13));
		lblHour.setBounds(21, 231, 46, 29);
		contentPane.add(lblHour);
		
		JLabel lblMin = new JLabel("Min:");
		lblMin.setForeground(Color.WHITE);
		lblMin.setFont(new Font("Synchro LET", Font.PLAIN, 13));
		lblMin.setBounds(120, 231, 46, 29);
		contentPane.add(lblMin);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/robinmedin/Desktop/KD405A_Robin_M/Assignment_5/src/se/mah/k3/robin/pics/background.png"));
		lblNewLabel.setBounds(-65, -12, 515, 369);
		contentPane.add(lblNewLabel);
		
	}
	
	private void _setMinute(){
		String text = textFieldMin.getText();
		minute = Integer.parseInt(text);
	}
	
	private void _setHour(){
		String text = textFieldHour.getText();
		hour = Integer.parseInt(text);
	}
}
