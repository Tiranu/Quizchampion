import java.awt.EventQueue;

import javax.swing.JFrame;

public class Test {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guiErstellen();
	}

	public static void guiErstellen()
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Start window = new GUI_Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}