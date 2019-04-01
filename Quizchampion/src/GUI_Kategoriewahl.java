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

	int anzahlKategorien = Hauptklasse.fragenkatalog.kategorien.size();
	
	private JPanel contentPane;
	private JLabel lblWhleEineKategorie;
	JButton btnKategorie1;
	JButton btnKategorie2;
	JButton btnKategorie3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public GUI_Kategoriewahl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ArrayList<String> zufaelligeKategorien = new ArrayList<String>();
		
		lblWhleEineKategorie = new JLabel("Wähle eine Kategorie");
		lblWhleEineKategorie.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhleEineKategorie.setFont(new Font("Khmer MN", Font.PLAIN, 20));
		lblWhleEineKategorie.setBounds(125, 20, 200, 40);
		contentPane.add(lblWhleEineKategorie);
		
		btnKategorie1 = new JButton(zufaelligeKategorien.get(0));
		btnKategorie1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnKategorie1.setBounds(170, 90, 117, 29);
		contentPane.add(btnKategorie1);
		
		btnKategorie2 = new JButton(zufaelligeKategorien.get(1));
		btnKategorie2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnKategorie2.setBounds(170, 140, 117, 29);
		contentPane.add(btnKategorie2);
		
		btnKategorie3 = new JButton(zufaelligeKategorien.get(2));
		btnKategorie3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnKategorie3.setBounds(170, 190, 117, 29);
		contentPane.add(btnKategorie3);
	}
	
	public ArrayList<String> zufaelligeKategorieauswahl ()
	{ 
		int kat1 = (int) Math.round((Math.random() * anzahlKategorien));
		
		int kat2 = (int) Math.round((Math.random() * anzahlKategorien));
		while (kat1 == kat2)
		{
			kat2 = (int) Math.round((Math.random() * anzahlKategorien));
		}
		
		int kat3 = (int) Math.round((Math.random() * anzahlKategorien));
		while (kat1 == kat3 || kat2 == kat3)
		{
			kat3 = (int) Math.round((Math.random() * anzahlKategorien));
		}
		ArrayList<String> zufaelligeKategorien = new ArrayList<String>();
		
		zufaelligeKategorien.add(Hauptklasse.fragenkatalog.kategorien.get(kat1));
		zufaelligeKategorien.add(Hauptklasse.fragenkatalog.kategorien.get(kat2));
		zufaelligeKategorien.add(Hauptklasse.fragenkatalog.kategorien.get(kat3));
		
		return  zufaelligeKategorien;
	}
}
