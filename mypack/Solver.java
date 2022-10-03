package mypack;

import mypack.*;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Solver {

    public static boolean gameOver = false;
    public static boolean gameWon = false;
    public static int perfect = 0;
    public static int close = 0;
    public static Integer played = 0;
    public static String check = "";
    public static int round = 0;
// take in the guess

public static void Guess() {
    System.out.println("                           ");
        System.out.println("Round " + round + " Please enter your guess.");
        try {
            Scanner play = new Scanner(System.in);
            played = play.nextInt();
        }
        catch(InputMismatchException e) {
            round += 1;
            System.out.println("Input must be a 4 digit code, You've forfeit the round.");
        }
        catch(StringIndexOutOfBoundsException d) {
            round += 1;
            System.out.println("Input must be a 4 digit code, You've forfeit the round.");
        }
}

public static void Reset() {
    perfect = 0;
    close = 0;
}
    public static void CheckGuess() {
        String tempans = Settings.getAns();
        check = played.toString();
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                if ((tempans.charAt(x) == check.charAt(y))) {
                    if ( x == y) {
                        perfect += 1;
                        //System.out.println("perfect" + x + y);
                        if (perfect == 4) {
                            gameOver = true;
                            gameWon = true;
                            /*
            System.out.println("You Win! Restart the program to play again.");        
            System.exit(0);    
            */
        }
                    }
                    if (x != y) {
                        close += 1;
                        //System.out.println("close" + x + y );
                    }
                    StringBuilder tempstring = new StringBuilder(tempans);
                    tempstring.setCharAt(x, 'X');
                    tempans = tempstring.toString();
                    StringBuilder tempcheck = new StringBuilder(check);
                    tempcheck.setCharAt(y, 'Y');
                    check = tempcheck.toString();
                }
            }
    }
    System.out.println("                           ");
    System.out.println("Perfectly placed pieces: " + perfect + ", Misplaced pieces: " + close + ", Remaining tries: " + Settings.tries);
    round += 1;
    Settings.tries -= 1; 
    if (Settings.tries == 0 ) {
            gameOver = true;
        }
    }

//javac -d . Solver.java CLIhelper.java Settings.java
//javac Board.java Game.java my_mastermind.java
 }