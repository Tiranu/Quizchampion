import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class GUI_Start {

	JFrame frmWerWirdMcgquizchampion;
	private JLabel lblWillkommenBeiMcgquizchampion;
	private JTextField tfSpielername1;
	private JTextField tfSpielername2;
	private JTextField tfSpielername3;
	private JTextArea txtrRegeln;
	private JButton btnLaden;
	JButton btnSpieler_1;
	JButton btnSpieler_2;
	JButton btnSpieler_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public GUI_Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWerWirdMcgquizchampion = new JFrame();
		frmWerWirdMcgquizchampion.setBackground(new Color(65, 105, 225));
		frmWerWirdMcgquizchampion.setTitle("Wer wird MCG-Quizchampion");
		frmWerWirdMcgquizchampion.setResizable(false);
		frmWerWirdMcgquizchampion.setBounds(100, 100, 1000, 800);
		frmWerWirdMcgquizchampion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWerWirdMcgquizchampion.getContentPane().setLayout(null);
		
		lblWillkommenBeiMcgquizchampion = new JLabel("Willkommen bei MCG-Quizchampion");
		lblWillkommenBeiMcgquizchampion.setFont(new Font("Khmer MN", Font.PLAIN, 45));
		lblWillkommenBeiMcgquizchampion.setHorizontalAlignment(SwingConstants.CENTER);
		lblWillkommenBeiMcgquizchampion.setBounds(109, 21, 725, 79);
		frmWerWirdMcgquizchampion.getContentPane().add(lblWillkommenBeiMcgquizchampion);
		
		btnSpieler_1 = new JButton("1 Spieler");
		btnSpieler_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hauptklasse.setSpielerzahl(1);
				btnSpieler_1.setBackground(new Color(255, 37, 41));
				btnSpieler_2.setBackground(new Color (240, 240, 240));
				btnSpieler_3.setBackground(new Color(240, 240, 240));
			}
		});
		btnSpieler_1.setBounds(50, 250, 150, 40);
		btnSpieler_1.setBackground(new Color(240, 240, 240));
		frmWerWirdMcgquizchampion.getContentPane().add(btnSpieler_1);
		
		btnSpieler_2 = new JButton("2 Spieler");
		btnSpieler_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hauptklasse.setSpielerzahl(2);
				btnSpieler_1.setBackground(new Color(240, 240, 240));
				btnSpieler_2.setBackground(new Color(255, 37, 41));
				btnSpieler_3.setBackground(new Color(240, 240, 240));
			}
		});
		btnSpieler_2.setBounds(50, 350, 150, 40);
		btnSpieler_2.setBackground(new Color(240, 240, 240));
		frmWerWirdMcgquizchampion.getContentPane().add(btnSpieler_2);
		
		btnSpieler_3 = new JButton("3 Spieler");
		btnSpieler_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hauptklasse.setSpielerzahl(3);
				btnSpieler_1.setBackground(new Color(240, 240, 240));
				btnSpieler_2.setBackground(new Color(240, 240, 240));
				btnSpieler_3.setBackground(new Color(255, 37, 41));
			}
		});
		btnSpieler_3.setBounds(50, 450, 150, 40);
		btnSpieler_3.setBackground(new Color(240, 240, 240));
		frmWerWirdMcgquizchampion.getContentPane().add(btnSpieler_3);
		
		JLabel lblBitteWhleDie = new JLabel("Bitte waehle die Anzahl der Spieler!");
		lblBitteWhleDie.setHorizontalAlignment(SwingConstants.CENTER);
		lblBitteWhleDie.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblBitteWhleDie.setBounds(275, 132, 450, 40);
		frmWerWirdMcgquizchampion.getContentPane().add(lblBitteWhleDie);
		
		JButton btnStart = new JButton("Start!");
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Hauptklasse.getSpielerzahl() != 0)
				{
					switch (Hauptklasse.getSpielerzahl())
					{
					case 1: Hauptklasse.setSpielername1(tfSpielername1.getText());
					case 2: Hauptklasse.setSpielername1(tfSpielername1.getText()); 
							Hauptklasse.setSpielername2(tfSpielername2.getText());
					case 3: Hauptklasse.setSpielername1(tfSpielername1.getText()); 
							Hauptklasse.setSpielername2(tfSpielername2.getText());
							Hauptklasse.setSpielername3(tfSpielername3.getText());
					}
					Hauptklasse.fragenStarten(Hauptklasse.getAktuellerSchwierigkeitsgrad());
				}
			}
		});
		btnStart.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnStart.setBounds(50, 657, 150, 40);
		btnStart.setBackground(new Color(240, 240, 240));
		frmWerWirdMcgquizchampion.getContentPane().add(btnStart);
		
		tfSpielername1 = new JTextField();
		tfSpielername1.setBounds(50, 300, 150, 40);
		frmWerWirdMcgquizchampion.getContentPane().add(tfSpielername1);
		tfSpielername1.setColumns(10);
		
		tfSpielername2 = new JTextField();
		tfSpielername2.setColumns(10);
		tfSpielername2.setBounds(50, 402, 150, 40);
		frmWerWirdMcgquizchampion.getContentPane().add(tfSpielername2);
		
		tfSpielername3 = new JTextField();
		tfSpielername3.setColumns(10);
		tfSpielername3.setBounds(50, 502, 150, 40);
		frmWerWirdMcgquizchampion.getContentPane().add(tfSpielername3);
		
		txtrRegeln = new JTextArea();
		txtrRegeln.setLineWrap(true);
		txtrRegeln.setText("Regeln:");
		txtrRegeln.setBounds(275, 250, 600, 350);
		frmWerWirdMcgquizchampion.getContentPane().add(txtrRegeln);
		
		btnLaden = new JButton("Spiel laden");
		btnLaden.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnLaden.setBounds(251, 657, 150, 40);
		btnLaden.setBackground(new Color(240, 240, 240));
		frmWerWirdMcgquizchampion.getContentPane().add(btnLaden);
		
		
	}
}
