import java.awt.EventQueue;

import javax.swing.JFrame;

public class Test {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Fragenkatalog();
		//guiErstellen();
		testGUI_Kategorienwahl();
	}

	public static void guiErstellen()
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Start window = new GUI_Start();
					window.frmWerWirdMcgquizchampion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
	public static void testGUI_Kategorienwahl()
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Kategoriewahl frame = new GUI_Kategoriewahl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}