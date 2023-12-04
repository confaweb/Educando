package ar.edu.unlam.pb2.timer;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class Countdown {
	public static void main(String[] args) {
		
		JFrame jframe = new JFrame();
		JLabel jLabel = new JLabel();
		jframe.setLayout(new FlowLayout());
		jframe.setBounds(500, 300, 400, 100);
		jframe.add(jLabel);
		jframe.setVisible(true);
		Timer timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {			
			Integer i = 3600;
			public void run() {				
				 jLabel.setText("Time left: " + i+" seg ");				 
				 i--;
				if (i<=0) {
					timer.cancel();
					jLabel.setText("Time Over"+ LocalTime.now());					
				}
			}			
		}, 0, 1000);
	}
}


