import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class GUI_Start {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWillkommenBeiMcgquizchampion = new JLabel("Willkommen bei MCG-Quizchampion");
		lblWillkommenBeiMcgquizchampion.setBounds(198, 24, 61, 16);
		frame.getContentPane().add(lblWillkommenBeiMcgquizchampion);
		
		JButton btnSpieler = new JButton("1 Spieler");
		btnSpieler.setBounds(172, 64, 117, 29);
		frame.getContentPane().add(btnSpieler);
		
		JButton btnSpieler_1 = new JButton("2 Spieler");
		btnSpieler_1.setBounds(172, 132, 117, 29);
		frame.getContentPane().add(btnSpieler_1);
	}
}
