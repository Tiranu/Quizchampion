import java.awt.EventQueue;

public class Hauptklasse {

	public static Fragenkatalog fragenkatalog = new Fragenkatalog();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Start GUI_Start = new GUI_Start();
					GUI_Start.frmWerWirdMcgquizchampion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		//new Hauptklasse();
	}

	public Hauptklasse()
	{
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Start GUI_Start = new GUI_Start();
					GUI_Start.frmWerWirdMcgquizchampion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void fragenStarten()
	{
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					//GUI_Fragen gui_Fragen = new GUI_Fragen();
					//gui_Fragen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
}
	

