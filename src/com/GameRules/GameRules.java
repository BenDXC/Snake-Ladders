package com.GameRules;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

import com.SnakeandLadders.SnakeandLadders;
import com.WelcomePage.WelcomePage;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameRules {

	private JFrame frame;
	private JTextArea txtrTheRules;
	private JButton btnMainScreen;
	private JButton btnGame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameRules window = new GameRules();
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
	public GameRules() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(30, 144, 255));
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 1018, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGameRules = new JLabel("Game Rules for Snake and Ladders");
		lblGameRules.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblGameRules.setBounds(70, 0, 837, 61);
		frame.getContentPane().add(lblGameRules);
		
		txtrTheRules = new JTextArea();
		txtrTheRules.setFont(new Font("Arial", Font.BOLD, 14));
		txtrTheRules.setText("1.\tThe rules are that this game need 1 to 3 players to play.\r\n2.\tThe next rule is that the first go is decided by whoever rolls the highest number from the dice. \r\n3.\tFurthermore, each player rolls the dice and moves the piece that corresponds with the number\r\n4.\tWhoever goes to 100 first wins, Players need to roll the exact number so they can reach 100, no more no less\r\n5.\tWhen a player's piece hit the head of a snake, that piece will slide down to the bottom of the snake. \r\n\tNothing will happen when a player hits other parts of a snake.\r\n6.\tWhen a player's piece hit the base of a ladder, that piece will be moved to the top of the ladder. \r\n7.\tWhen a person rolls a 6, you get another go\r\n8.\tThere are 2 biscuits that you can use to feed the snake and avoids it\r\n9.\tThere are 2 big sticks to avoid the snake and move the piece to 10 places above. \r\n\r\n");
		txtrTheRules.setBounds(10, 72, 922, 181);
		frame.getContentPane().add(txtrTheRules);
		
		btnMainScreen = new JButton("Go back to the main screen");
		btnMainScreen.setBackground(new Color(0, 255, 255));
		btnMainScreen.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		btnMainScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				WelcomePage.main(null);
			}
		});
		btnMainScreen.setBounds(32, 315, 353, 98);
		frame.getContentPane().add(btnMainScreen);
		
		btnGame = new JButton("Start the Game");
		btnGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SnakeandLadders.main(null);
			}
		});
		btnGame.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		btnGame.setBackground(new Color(0, 255, 255));
		btnGame.setBounds(455, 315, 353, 98);
		frame.getContentPane().add(btnGame);
	}
}
