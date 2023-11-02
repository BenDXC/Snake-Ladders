package com.SnakeandLadders;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import com.GameRules.GameRules;
import com.WelcomePage.WelcomePage;

import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class SnakeandLadders {

	private JFrame frame;
	private JLabel lblPlayer2Square;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SnakeandLadders window = new SnakeandLadders();
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
	public SnakeandLadders() {
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(30, 144, 255));
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JButton btnMainScreen = new JButton("Main Screen");
		btnMainScreen.setBackground(new Color(0, 255, 255));
		btnMainScreen.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnMainScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				WelcomePage.main(null);
			}
		});
		btnMainScreen.setBounds(10, 17, 179, 51);
		frame.getContentPane().add(btnMainScreen);
		
		JButton btnSeeRules = new JButton("See the Rules");
		btnSeeRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				GameRules.main(null);
			}
		});
		btnSeeRules.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnSeeRules.setBackground(Color.CYAN);
		btnSeeRules.setBounds(358, 11, 211, 57);
		frame.getContentPane().add(btnSeeRules);
		
		JButton btnBigStick = new JButton("Use the Big Stick?");
		btnBigStick.setBackground(new Color(0, 255, 255));
		btnBigStick.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnBigStick.setBounds(579, 11, 168, 60);
		frame.getContentPane().add(btnBigStick);
		
		JButton btnBiscuit = new JButton("Use the Biscuit?");
		btnBiscuit.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnBiscuit.setBackground(Color.CYAN);
		btnBiscuit.setBounds(791, 11, 155, 60);
		frame.getContentPane().add(btnBiscuit);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnStart.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnStart.setBackground(Color.CYAN);
		btnStart.setBounds(10, 337, 97, 42);
		frame.getContentPane().add(btnStart);
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnRestart.setBackground(Color.CYAN);
		btnRestart.setBounds(10, 390, 97, 42);
		frame.getContentPane().add(btnRestart);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});
		btnExit.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnExit.setBackground(Color.CYAN);
		btnExit.setBounds(10, 443, 97, 45);
		frame.getContentPane().add(btnExit);
		
		JLabel lblPlayer1 = new JLabel("");
		lblPlayer1.setIcon(new ImageIcon(SnakeandLadders.class.getResource("/com/Images/Red Coin.png")));
		lblPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer1.setBounds(0, 145, 86, 65);
		frame.getContentPane().add(lblPlayer1);
		
		JLabel lblPlayer2 = new JLabel("");
		lblPlayer2.setIcon(new ImageIcon(SnakeandLadders.class.getResource("/com/Images/Yellow Coin.jpg")));
		lblPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer2.setBounds(0, 213, 86, 61);
		frame.getContentPane().add(lblPlayer2);
		
		JLabel lblPlayer3 = new JLabel("");
		lblPlayer3.setIcon(new ImageIcon(SnakeandLadders.class.getResource("/com/Images/Green Coin.jpg")));
		lblPlayer3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer3.setBounds(0, 285, 86, 41);
		frame.getContentPane().add(lblPlayer3);
		
		JLabel lblPlayer1Square = new JLabel("Player 1");
		lblPlayer1Square.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer1Square.setBounds(96, 160, 72, 31);
		frame.getContentPane().add(lblPlayer1Square);
		
		lblPlayer2Square = new JLabel("Player 2");
		lblPlayer2Square.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer2Square.setBounds(96, 225, 72, 31);
		frame.getContentPane().add(lblPlayer2Square);
		
		JLabel lblPlayer3Square = new JLabel("Player 3");
		lblPlayer3Square.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer3Square.setBounds(96, 291, 72, 31);
		frame.getContentPane().add(lblPlayer3Square);
		
		JButton btnDice = new JButton("");
		btnDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(Dice.RollDice());					
			}
		});
		btnDice.setIcon(new ImageIcon(SnakeandLadders.class.getResource("/com/SnakeandLadders/animated-dice-image-0063.gif")));
		btnDice.setBounds(138, 359, 72, 73);
		frame.getContentPane().add(btnDice);
		
	}
	
	
	

}
