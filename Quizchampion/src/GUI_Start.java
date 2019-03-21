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

public class GUI_Start {

	JFrame frmWerWirdMcgquizchampion;
	int spielerzahl = 0;
	private final ButtonGroup btnGroupSpielerzahl = new ButtonGroup();

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
		
		JLabel lblWillkommenBeiMcgquizchampion = new JLabel("Willkommen bei MCG-Quizchampion");
		lblWillkommenBeiMcgquizchampion.setFont(new Font("Khmer MN", Font.PLAIN, 45));
		lblWillkommenBeiMcgquizchampion.setHorizontalAlignment(SwingConstants.CENTER);
		lblWillkommenBeiMcgquizchampion.setBounds(109, 21, 725, 79);
		frmWerWirdMcgquizchampion.getContentPane().add(lblWillkommenBeiMcgquizchampion);
		
		JButton btnSpieler_1 = new JButton("1 Spieler");
		btnSpieler_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				spielerzahl = 1;
			}
		});
		btnSpieler_1.setBounds(425, 250, 150, 40);
		frmWerWirdMcgquizchampion.getContentPane().add(btnSpieler_1);
		
		JButton btnSpieler_2 = new JButton("2 Spieler");
		btnSpieler_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				spielerzahl = 2;
			}
		});
		btnSpieler_2.setBounds(425, 350, 150, 40);
		frmWerWirdMcgquizchampion.getContentPane().add(btnSpieler_2);
		
		JButton btnSpieler_3 = new JButton("3 Spieler");
		btnSpieler_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				spielerzahl = 3;
			}
		});
		btnSpieler_3.setBounds(425, 450, 150, 40);
		frmWerWirdMcgquizchampion.getContentPane().add(btnSpieler_3);
		
		JLabel lblBitteWhleDie = new JLabel("Bitte wähle die Anzahl der Spieler!");
		lblBitteWhleDie.setHorizontalAlignment(SwingConstants.CENTER);
		lblBitteWhleDie.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblBitteWhleDie.setBounds(275, 154, 450, 40);
		frmWerWirdMcgquizchampion.getContentPane().add(lblBitteWhleDie);
		
		JButton btnStart = new JButton("Start!");
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (spielerzahl != 0)
				{
					Hauptklasse.fragenStarten();
				}
			}
		});
		btnStart.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnStart.setBounds(425, 560, 150, 40);
		frmWerWirdMcgquizchampion.getContentPane().add(btnStart);
	}
}
