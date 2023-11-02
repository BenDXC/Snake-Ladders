package com.WelcomePage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.SwingConstants;

import com.SnakeandLadders.SnakeandLadders;

public class NameP1 {

	private JFrame frame;
	private JTextField txtFieldP1;
	private JButton btnStartGame;
	private JLabel lblImage;
	private JButton btnMainScreen;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NameP1 window = new NameP1();
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
	public NameP1() {
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
		
		JLabel lblP1 = new JLabel("Name for Player 1");
		lblP1.setFont(new Font("Arial", Font.BOLD, 37));
		lblP1.setHorizontalAlignment(SwingConstants.CENTER);
		lblP1.setForeground(Color.WHITE);
		lblP1.setBounds(325, 210, 350, 50);
		frame.getContentPane().add(lblP1);
		
		txtFieldP1 = new JTextField();
		txtFieldP1.setBounds(336, 282, 312, 28);
		frame.getContentPane().add(txtFieldP1);
		txtFieldP1.setColumns(10);
		
	
		btnStartGame = new JButton("Start the Game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				SnakeandLadders.main(null);
			}
		});
		btnStartGame.setBackground(new Color(0, 255, 255));
		btnStartGame.setFont(new Font("Arial", Font.BOLD, 16));
		btnStartGame.setBounds(362, 356, 286, 50);
		frame.getContentPane().add(btnStartGame);
		
		lblImage = new JLabel();
		lblImage.setLocation(385, 11);
		lblImage.setIcon(new ImageIcon("I:\\Ben\\Eclipse directory\\Assignment 3 Snake & Ladders\\src\\com\\Images\\Red Coin.png"));
		lblImage.setSize(225,200);
		frame.getContentPane().add(lblImage);
		
	
		
		btnMainScreen = new JButton("Main Screen");
		btnMainScreen.setBackground(new Color(0, 255, 255));
		btnMainScreen.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		btnMainScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				WelcomePage.main(null);
			}
		});
		btnMainScreen.setBounds(362, 428, 286, 50);
		frame.getContentPane().add(btnMainScreen);
		
	}
}

