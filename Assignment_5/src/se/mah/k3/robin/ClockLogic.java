package se.mah.k3.robin;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockLogic {

	private DigitalClockGUI clockGUI;
	private int alarmHour = -1;
	private int alarmMinute = -1;


	public ClockLogic(DigitalClockGUI DigitalClockGUI) {
		this.clockGUI = DigitalClockGUI;
		new ClockThread().start();
	}

	public void setAlarm(int hour, int minute) {
		this.alarmHour = hour;
		this.alarmMinute = minute;
		System.out.println("Set");
	}

	public void clearAlarm() {
		this.alarmHour = -1;
		this.alarmMinute = -1;
		System.out.println("Clear");
	}

	public class ClockThread extends Thread {

		Thread time = new Thread();

		@Override

           public void run() {
               DecimalFormat timeFormat = new DecimalFormat("00");
               while(true) {
                   
                   try {
                       Thread.sleep(1000);
                       } catch (InterruptedException e) {} 
                   System.out.println("Starting");
                   Calendar cal = Calendar.getInstance();
                   int day = cal.get(Calendar.DAY_OF_MONTH);
                   int month = cal.get(Calendar.MONTH);
                   int year = cal.get(Calendar.YEAR);
                   
                   int second = cal.get(Calendar.SECOND);
                   int minute = cal.get(Calendar.MINUTE);
                   int hour = cal.get(Calendar.HOUR_OF_DAY);
                   clockGUI.setTimeOnLabel(timeFormat.format(hour)+":"+timeFormat.format(minute)+":"+timeFormat.format(second));
                   
               
               }
			
		}
	}
}

