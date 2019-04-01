import java.awt.EventQueue;

public class Hauptklasse {

	public static Fragenkatalog fragenkatalog = new Fragenkatalog();
	private static int spielerzahl = 0;
	private static int punkteS1 = 0;
	private static int punkteS2 = 0;
	private static int punkteS3 = 0;
	
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

	public static int getSpielerzahl() {
		return spielerzahl;
	}

	public static void setSpielerzahl(int sz) {
		Hauptklasse.spielerzahl = sz;
	}

	public static int getPunkteS1() {
		return punkteS1;
	}

	public static void setPunkteS1(int punkteS1) {
		Hauptklasse.punkteS1 = punkteS1;
	}

	public static int getPunkteS2() {
		return punkteS2;
	}

	public static void setPunkteS2(int punkteS2) {
		Hauptklasse.punkteS2 = punkteS2;
	}

	public static int getPunkteS3() {
		return punkteS3;
	}

	public static void setPunkteS3(int punkteS3) {
		Hauptklasse.punkteS3 = punkteS3;
	}
}
	

