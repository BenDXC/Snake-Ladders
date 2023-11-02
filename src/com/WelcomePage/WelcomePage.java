package com.WelcomePage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.GameRules.GameRules;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class WelcomePage {

	private JFrame frame;
	private JButton btnRules;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage window = new WelcomePage();
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
	public WelcomePage() {
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(30, 144, 255));
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 1018, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome to Snake and Ladders");
		lblWelcome.setFont(new Font("Trebuchet MS", Font.BOLD, 57));
		lblWelcome.setBounds(10, 11, 982, 83);
		frame.getContentPane().add(lblWelcome);
		
		JButton btnPlayer1 = new JButton("1 Player");
		btnPlayer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				NameP1.main(null);
			}
		});
		btnPlayer1.setForeground(new Color(0, 0, 0));
		btnPlayer1.setBackground(new Color(0, 255, 255));
		btnPlayer1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnPlayer1.setBounds(59, 152, 189, 83);
		frame.getContentPane().add(btnPlayer1);
		
		JButton btnPlayer2 = new JButton("2 Players");
		btnPlayer2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				NameP2.main(null);
			}
		});
		btnPlayer2.setForeground(Color.BLACK);
		btnPlayer2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnPlayer2.setBackground(new Color(0, 255, 255));
		btnPlayer2.setBounds(310, 152, 189, 83);
		frame.getContentPane().add(btnPlayer2);
		
		JButton btnPlayer3 = new JButton("3 Players");
		btnPlayer3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				nameIdentifiers.main(null);
			}
		});
		btnPlayer3.setForeground(Color.BLACK);
		btnPlayer3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnPlayer3.setBackground(new Color(0, 255, 255));
		btnPlayer3.setBounds(587, 152, 189, 83);
		frame.getContentPane().add(btnPlayer3);
		
		btnRules = new JButton("Rules for Snake and Ladders");
		btnRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				GameRules.main(null);
			}
		});
		btnRules.setBackground(new Color(0, 255, 255));
		btnRules.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		btnRules.setBounds(163, 321, 550, 75);
		frame.getContentPane().add(btnRules);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
				
			}
		});
		btnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		btnExit.setBounds(773, 412, 189, 65);
		frame.getContentPane().add(btnExit);
		
	}
}
