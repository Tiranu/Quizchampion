import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;

import java.awt.Font;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class GUI_Fragen extends JFrame {

	private JPanel contentPane;
	private JLabel lblKategorie;
	private JLabel lblFragentext;
	private JButton btnAntwortA;
	private JButton btnAntwortB;
	private JButton btnAntwortC;
	private JButton btnAntwortD;
	private JLabel lblTime;
	private int startzeit = 41;
	private int verbleibendeZeit = startzeit;
	
	private Character antwortSpieler1;
	private Character spieler1antwortA = 'q'; private Character spieler1antwortB = 'w'; private Character spieler1antwortC = 'e'; private Character spieler1antwortD = 'r';
	
	private Character antwortSpieler2;
	private Character spieler2antwortA = 'v'; private Character spieler2antwortB = 'b'; private Character spieler2antwortC = 'n'; private Character spieler2antwortD = 'm';
	
	private Character antwortSpieler3;
	private Character spieler3antwortA = 'u'; private Character spieler3antwortB = 'i'; private Character spieler3antwortC = 'o'; private Character spieler3antwortD = 'p';
 private JLabel lblPunkteSpieler1;
 private JLabel lblPunkteSpieler2;
 private JLabel lblPunkteSpieler3;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					GUI_Fragen frame = new GUI_Fragen("1", "2", "3", "4", "5", "6", 'A', 3);
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
	public GUI_Fragen(String kategorie, String frage, String antwortA, String antwortB, String antwortC, String antwortD, Character loesung, int schwierigkeitsgrad) {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 1024);
		contentPane = new JPanel();
		
		/*
		 * Der KeyboardFocusManager mit dem KeyEventDispatcher nimmt alle Keyboardeingaben entgegen. Mit einem Switch werden die einzelnen Eingaben verarbeitet
		 */
		KeyboardFocusManager.getCurrentKeyboardFocusManager()
		  .addKeyEventDispatcher(new KeyEventDispatcher() {
		      @Override
		      public boolean dispatchKeyEvent(KeyEvent e) {
		    	  tastatureingabenAuslesen(e);
				return false;
		      }
		});

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblKategorie = new JLabel("Kategorie: " + kategorie);
		lblKategorie.setFont(new Font("Khmer MN", Font.PLAIN, 40));
		lblKategorie.setHorizontalAlignment(SwingConstants.CENTER);
		lblKategorie.setBounds(300, 149, 600, 60);
		contentPane.add(lblKategorie);
		
		lblFragentext = new JLabel("Welches Fach ist das spannendste am MCG?" + frage);
		lblFragentext.setHorizontalAlignment(SwingConstants.CENTER);
		lblFragentext.setFont(new Font("Khmer Sangam MN", Font.PLAIN, 25));
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
			@Override
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
		
		lblTime = new JLabel("" + verbleibendeZeit);
		lblTime.setFont(new Font("Khmer MN", Font.PLAIN, 90));
		lblTime.setForeground(new Color(255, 0, 0));
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setBounds(1054, 40, 100, 100);
		contentPane.add(lblTime);
		
		lblPunkteSpieler1 = new JLabel("Punkte Spieler 1: ");
		lblPunkteSpieler1.setFont(new Font("Khmer MN", Font.PLAIN, 20));
		lblPunkteSpieler1.setBounds(32, 84, 150, 30);
		contentPane.add(lblPunkteSpieler1);
		
		lblPunkteSpieler2 = new JLabel("Punkte Spieler 2: ");
		lblPunkteSpieler2.setFont(new Font("Khmer MN", Font.PLAIN, 20));
		lblPunkteSpieler2.setBounds(32, 126, 150, 30);
		contentPane.add(lblPunkteSpieler2);
		
		lblPunkteSpieler3 = new JLabel("Punkte Spieler 3: ");
		lblPunkteSpieler3.setFont(new Font("Khmer MN", Font.PLAIN, 20));
		lblPunkteSpieler3.setBounds(32, 169, 150, 30);
		contentPane.add(lblPunkteSpieler3);
		
		int delay = 1000; //milliseconds
		  ActionListener taskPerformer = new ActionListener() {
		      public void actionPerformed(ActionEvent evt) {		    	  
		    	  lblTime.setText("" + verbleibendeZeit);
		    	  if (verbleibendeZeit == 0)
		    	  {
		    		  antwortAufloesen();
		    		  ((Timer)evt.getSource()).stop();
	    		  //timer.stop();
		    	  }else {
		    		  verbleibendeZeit--;
		    	  }
		      }
		  };
		  new Timer(delay,taskPerformer).start();
		  System.out.println("Timer gestartet");
		  

	}

	private void antwortAufloesen()
	{
		System.out.println("Auflösung");
	}

	private Character getAntwortSpieler1() {
		return antwortSpieler1;
	}

	private void setAntwortSpieler1(Character antwortSpieler1) {
		this.antwortSpieler1 = antwortSpieler1;
	}

	private Character getAntwortSpieler2() {
		return antwortSpieler2;
	}

	private void setAntwortSpieler2(Character antwortSpieler2) {
		this.antwortSpieler2 = antwortSpieler2;
	}

	private Character getAntwortSpieler3() {
		return antwortSpieler3;
	}

	private void setAntwortSpieler3(Character antwortSpieler3) {
		this.antwortSpieler3 = antwortSpieler3;
	}

	/**
	 * @param e
	 */
	
	private void tastatureingabenAuslesen(KeyEvent e) {
		if(Integer.parseInt(lblTime.getText()) != 0)
		  {
			  System.out.println("Got key event! " + e.getKeyChar());
			  switch (e.getKeyChar()) {
		 case 'q':
		     setAntwortSpieler1('q');
		     break;
		 case 'w':
		     setAntwortSpieler1('w');
		     break;
		 case 'e':
		     setAntwortSpieler1('e');
		     break;
		 case 'r':
		     setAntwortSpieler1('r');
		     break;
		 case 'v':
		     setAntwortSpieler2('v');
		     break;
		 case 'b':
		     setAntwortSpieler2('b');
		     break;
		 case 'n':
		     setAntwortSpieler2('n');
		     break;
		 case 'm':
		     setAntwortSpieler2('m');
		     break;
		 case 'u':
		     setAntwortSpieler3('u');
		     break;
		 case 'i':
		     setAntwortSpieler3('i');
		     break;
		 case 'o':
		     setAntwortSpieler3('o');
		     break;
		 case 'p':
		     setAntwortSpieler3('p');
		     break;
		 default:
		     System.out.println("Falsche Taste gedrückt");
		}
		System.out.println("S1 " + getAntwortSpieler1());
		System.out.println("S2 " + getAntwortSpieler2());
		System.out.println("S3 " + getAntwortSpieler3());
		}
	}
}
