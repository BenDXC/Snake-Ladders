package com.SnakeandLadders;

import java.util.Random;

public class Dice {
	
	public static String RollDice()
	{
		  int X = new Random().nextInt(6) + 1;
		  String Dice = String.valueOf(X);
		return Dice;
	}
	
}
