import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI_Start extends JFrame {

	private JPanel contentPane;
	private JButton btnSpieler1;
	private JButton btnSpieler2;
	private JButton btnSpieler3;
	private JLabel lblWillkommenBeiQuizchampion;
	private JLabel lblSpieleranzahl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					GUI_Start frame = new GUI_Start();
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
	public GUI_Start() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 1024);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnSpieler1 = new JButton("1 Spieler");
		btnSpieler1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Btn 1 geklickt!");
			}
		});
		btnSpieler1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSpieler1.setBounds(459, 278, 177, 55);
		contentPane.add(btnSpieler1);
		
		btnSpieler2 = new JButton("2 Spieler");
		btnSpieler2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Btn 2 geklickt!");
			}
		});
		btnSpieler2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSpieler2.setBounds(459, 378, 177, 55);
		contentPane.add(btnSpieler2);
		
		btnSpieler3 = new JButton("3 Spieler");
		btnSpieler3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Btn 3 geklickt!");
			}
		});
		btnSpieler3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSpieler3.setBounds(459, 478, 177, 55);
		contentPane.add(btnSpieler3);
		
		lblWillkommenBeiQuizchampion = new JLabel("Willkommen bei Quizchampion des MCG!");
		lblWillkommenBeiQuizchampion.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblWillkommenBeiQuizchampion.setBounds(380, 43, 414, 49);
		contentPane.add(lblWillkommenBeiQuizchampion);
		
		lblSpieleranzahl = new JLabel("W\u00E4hle die Spieleranzahl!");
		lblSpieleranzahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpieleranzahl.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSpieleranzahl.setBounds(418, 165, 324, 31);
		contentPane.add(lblSpieleranzahl);
	}
}
