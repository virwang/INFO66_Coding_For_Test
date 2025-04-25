package com.example;
import java.util.Scanner;

/**
   Filename: GuessNumberGame.java
     Author: 
       Date: Jan 23, 2024 3:45:59 p.m.
Description: This program will generate a random number between 1 & 100
             The user will input a guess for what number was generated
             If they are not correct, game will let them know if their
             guess was too high or too low.
             How many guesses the user will be allowed depends on the 
             level of difficulty for the game.
             Allow the user to enter the level of difficulty:
             1 (Easy)
             2 (Medium)
             3 (Hard)
             Number of guesses allowed will be:
             If level = 1, then the user can have unlimited guesses
             If level = 2, then the user can have only 10 guesses.
             If level = 3, then the user can have only  3 guesses.
             
             Game if finished when either user guesses correct number
             OR they hit the max number of guesses allowed.
             OR they choose to exit the game by entering -1
             
             If the user guesses the number, game should print a 
             "You won - you guessed the number correctly!" message.
             If the user does not guess the number, game should print a
             "Sorry, you lost - the correct number was: ... " message.
 */
public class GuessNumberGame
{

	public static void main(String[] args)
	{
		//intialize variables
		Scanner input = new Scanner(System.in);
		int guess = 0, level = 0, numGuesses = 0, maxGuesses=0;
		boolean win = false;
		
		//Get random number between 1 and 100
		int selectedNumber = (int)(Math.random() * 100 + 1);
		
		//Get level of difficulty from user
		System.out.println("Welcome to my Guess the number game!\n");
		
		System.out.println("Enter the level of difficulty for this game.");
		System.out.println("Enter 1 for Easy, 2 for Medium or 3 for Hard:");
		level = input.nextInt();
		
		//If user enters incorrect level, ask them to enter value again
		//until they enter a correct number
		while (level != 1 && level != 2 && level != 3) 
		{
			System.out.println("You entered an incorrect value,\n"
					  + "Please enter either the number 1, 2 or 3\n");
			level = input.nextInt();
		} 
			
		//Set max # of guesses depending on level of difficulty
		if (level == 2)
		{
			maxGuesses = 10;
		}
		else if (level == 3)
		{
			maxGuesses = 3;
		}
		
		System.out.println("What's your guess? (enter your guess or -1 to quit!)");

		//Allow user to enter their guess(es) until they guess the number
		//or enter -1 to quit or hit the max # of guesses allowed
		do
		{
			guess = input.nextInt();
			
			//Check the number, display message to user as needed
			if (guess != -1)
			{
				if (guess == selectedNumber)
				{
					System.out.println("Congrats - you won - you guessed the number correctly!");
					win = true;
				}
				else if (guess > selectedNumber)
				{
					System.out.println("That number was too high! Try again.");
				}
				else
				{
					System.out.println("That number was too low! Try again.");
				}
				
				//Keep track of the number of guesses user has had
				numGuesses++;
				
				//Exit loop if user hits max # of guesses 
				//and not on level 1 (unlimited guesses)
				if (level != 1 && numGuesses == maxGuesses)
					{
					 break;
					}
			}
		} while (guess != selectedNumber && guess != -1);
		
		//If user lost the game display message and correct number
		if (win == false)
			{
			System.out.println ("Sorry you lost! The correct number was " + selectedNumber);
			}
		
	}

}
