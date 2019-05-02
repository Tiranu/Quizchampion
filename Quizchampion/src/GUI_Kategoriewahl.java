import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class GUI_Kategoriewahl extends JFrame {

	int anzahlKategorien = Hauptklasse.getFragenkatalog().kategorien.size();
	
	private JPanel contentPane;
	private JLabel lblWhleEineKategorie;
	JButton btnKategorie1;
	JButton btnKategorie2;
	JButton btnKategorie3;
	ArrayList<String> zufaelligeKategorien = new ArrayList<String>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Kategoriewahl frame = new GUI_Kategoriewahl(1);
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
	public GUI_Kategoriewahl(int schwierigkeitsgrad) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		zufaelligeKategorien = zufaelligeKategorieauswahl(anzahlKategorien-1);
		
		lblWhleEineKategorie = new JLabel("Wähle eine Kategorie");
		lblWhleEineKategorie.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhleEineKategorie.setFont(new Font("Khmer MN", Font.PLAIN, 20));
		lblWhleEineKategorie.setBounds(200, 20, 200, 40);
		contentPane.add(lblWhleEineKategorie);
		
		btnKategorie1 = new JButton(zufaelligeKategorien.get(0));
		btnKategorie1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frageStarten(zufaelligeKategorien.get(0), schwierigkeitsgrad);
			}
		});
		btnKategorie1.setBounds(230, 100, 140, 30);
		contentPane.add(btnKategorie1);
		
		btnKategorie2 = new JButton(zufaelligeKategorien.get(1));
		btnKategorie2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frageStarten(zufaelligeKategorien.get(1), schwierigkeitsgrad);
			}
		});
		btnKategorie2.setBounds(230, 175, 140, 30);
		contentPane.add(btnKategorie2);
		
		btnKategorie3 = new JButton(zufaelligeKategorien.get(2));
		btnKategorie3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frageStarten(zufaelligeKategorien.get(2), schwierigkeitsgrad);
			}
		});
		btnKategorie3.setBounds(230, 250, 140, 30);
		contentPane.add(btnKategorie3);
	}
	
	public void frageStarten(String kategorie, int schwierigkeitsgrad)
	{
		EventQueue.invokeLater(new Runnable() {
		@Override
		public void run() {
			try {
				Frage frage = zufaelligeFrageWaehlen(kategorie, schwierigkeitsgrad);
				Hauptklasse.setGuiFragen(new GUI_Fragen("1", "2", "3", "4", "5", "6", 'A', 3));  //Dummys müssen noch gegen Frage.get ... ausgetauscht werden!
				Hauptklasse.getGuiFragen().setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
	}
	
	public ArrayList<String> zufaelligeKategorieauswahl(int anzahlKategorien)
	{ 
		int kat1 = (int) Math.round(Math.random() * anzahlKategorien);
		
		int kat2 = (int) Math.round(Math.random() * anzahlKategorien);
		while (kat1 == kat2)
		{
			kat2 = (int) Math.round(Math.random() * anzahlKategorien);
		}
		
		int kat3 = (int) Math.round(Math.random() * anzahlKategorien);
		while (kat1 == kat3 || kat2 == kat3)
		{
			kat3 = (int) Math.round(Math.random() * anzahlKategorien);
		}
		ArrayList<String> zufaelligeKategorien = new ArrayList<String>();
		
		zufaelligeKategorien.add(Hauptklasse.getFragenkatalog().kategorien.get(kat1));
		zufaelligeKategorien.add(Hauptklasse.getFragenkatalog().kategorien.get(kat2));
		zufaelligeKategorien.add(Hauptklasse.getFragenkatalog().kategorien.get(kat3));
		
		return  zufaelligeKategorien;
	}
	
	public Frage zufaelligeFrageWaehlen(String kategorie, int schwierigkeitsgrad)
	{
		Frage frage = Hauptklasse.getFragenkatalog().fragenliste.get(kategorie).get(schwierigkeitsgrad).get((int) (Math.round(Math.random()*Hauptklasse.getFragenkatalog().fragenliste.get(kategorie).size())));
		return frage;
	}
}
