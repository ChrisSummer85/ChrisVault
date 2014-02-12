
import java.util.Scanner;

public class WordGame {
	

	public static void main(String[] args) {
		
		String wordList[] = {"aardvarks", "determine",
							"different", "greatness", 
							"miserable", "trappings", 
							"valuables", "xylophone" };		//populate wordList array (all words 9 chars)
		
		
		int arraySize = wordList.length;
		
		
		double num = Math.random() * arraySize;		//randomly select value (0-8) from array
		int x = 0;
		x = (int)num;	//typecast floating number into an integer
		
		
		String word = wordList[x];	//extracting a word from the wordList array from the random integer
		
		int wordLength = word.length(); //"length" function -- getting the exact length of the word randomly selected
		
		
		
		char hiddenWord[] = new char[wordLength];	//create an array called "hiddenWord" that creates an undetermined amount of indexes
		
		char selectedWord[] = new char[wordLength]; //  " "	selectedWord   " "
		
		
		
		//for the line below: for("initializer"; "condition"; increment/decrement rule)
		
		for(int i = 0; i < wordLength; i++) {	// loop, will continue to increment "i" by 1 until condition is no longer 'True'; where the increment value refers to the index in the array (0-8)
			hiddenWord[i] = '*';
			//selectedWord[i] = 	// How to break a string into characters (remember the table drawn on the whiteboard)
									//...Need to have a string of characters for the program to compare user input against (can't compare against *'s, can't we?
		}						// Email on Monday if problem persists!
	
		
		for(int i = 0; i < wordLength; i++) {
			System.out.print(hiddenWord[i]); 
		}
		

	}

}
