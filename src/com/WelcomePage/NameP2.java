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

public class NameP2 {

	private JFrame frame;
	private JTextField txtFieldP1;
	private JTextField textFieldP2;
	private JLabel lblP2;
	private JButton btnStartGame;
	private JLabel lblImageP1;
	private JLabel lblImageP2;
	private JButton btnMainScreen;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NameP2 window = new NameP2();
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
	public NameP2() {
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
		lblP1.setBounds(10, 96, 350, 50);
		frame.getContentPane().add(lblP1);
		
		txtFieldP1 = new JTextField();
		txtFieldP1.setBounds(20, 167, 312, 28);
		frame.getContentPane().add(txtFieldP1);
		txtFieldP1.setColumns(10);
		
		textFieldP2 = new JTextField();
		textFieldP2.setColumns(10);
		textFieldP2.setBounds(637, 157, 312, 28);
		frame.getContentPane().add(textFieldP2);
		
		lblP2 = new JLabel("Name for Player 2");
		lblP2.setHorizontalAlignment(SwingConstants.CENTER);
		lblP2.setForeground(Color.WHITE);
		lblP2.setFont(new Font("Arial", Font.BOLD, 37));
		lblP2.setBounds(599, 96, 350, 50);
		frame.getContentPane().add(lblP2);
		
	
		btnStartGame = new JButton("Start the Game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				SnakeandLadders.main(null);
			}
		});
		btnStartGame.setBackground(new Color(0, 255, 255));
		btnStartGame.setFont(new Font("Arial", Font.BOLD, 16));
		btnStartGame.setBounds(325, 324, 286, 50);
		frame.getContentPane().add(btnStartGame);
		
		lblImageP1 = new JLabel("");
		lblImageP1.setLocation(39, 254);
		lblImageP1.setIcon(new ImageIcon("I:\\Ben\\Eclipse directory\\Assignment 3 Snake & Ladders\\src\\com\\Images\\Red Coin.png"));
		lblImageP1.setSize(225,206);
		frame.getContentPane().add(lblImageP1);
		
		lblImageP2 = new JLabel("");
		lblImageP2.setLocation(668, 254);
		lblImageP2.setIcon(new ImageIcon("I:\\Ben\\Eclipse directory\\Assignment 3 Snake & Ladders\\src\\com\\Images\\Yellow Coin.jpg"));
		lblImageP2.setSize(255,206);		
		frame.getContentPane().add(lblImageP2);
		
		btnMainScreen = new JButton("Main Screen");
		btnMainScreen.setBackground(new Color(0, 255, 255));
		btnMainScreen.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		btnMainScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				WelcomePage.main(null);
			}
		});
		btnMainScreen.setBounds(321, 387, 290, 50);
		frame.getContentPane().add(btnMainScreen);
		
		
	}
}

