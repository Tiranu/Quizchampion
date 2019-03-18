import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Fragen extends JFrame {

	private JPanel contentPane;
	private JLabel lblFrage;
	private JLabel lblFragentext;
	private JButton btnAntwortA;
	private JButton btnAntwortB;
	private JButton btnAntwortC;
	private JButton btnAntwortD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Fragen frame = new GUI_Fragen();
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
	public GUI_Fragen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 1024);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblFrage = new JLabel("Frage: ");
		lblFrage.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFrage.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrage.setBounds(10, 149, 1164, 60);
		contentPane.add(lblFrage);
		
		lblFragentext = new JLabel("Welches Fach ist das spannendste am MCG?");
		lblFragentext.setHorizontalAlignment(SwingConstants.CENTER);
		lblFragentext.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFragentext.setBounds(10, 244, 1164, 60);
		contentPane.add(lblFragentext);
		
		btnAntwortA = new JButton("A");
		btnAntwortA.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnAntwortA.setBounds(76, 404, 70, 70);
		contentPane.add(btnAntwortA);
		
		btnAntwortB = new JButton("B");
		btnAntwortB.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnAntwortB.setBounds(76, 660, 70, 70);
		contentPane.add(btnAntwortB);
		
		btnAntwortC = new JButton("C");
		btnAntwortC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAntwortC.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnAntwortC.setBounds(614, 404, 70, 70);
		contentPane.add(btnAntwortC);
		
		btnAntwortD = new JButton("D");
		btnAntwortD.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnAntwortD.setBounds(614, 660, 70, 70);
		contentPane.add(btnAntwortD);
	}

}
