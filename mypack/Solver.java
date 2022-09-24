package mypack;

import mypack.*;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Solver {

    public  static Integer temp = 0;
    private  static String ans = "";
    private  static Integer tries = 0;
    public static int round = 0;

// set goal answer
    public static void setAns() {
        try {
            Scanner scan = new Scanner(System.in);
            temp = scan.nextInt();
        }
        catch (InputMismatchException e) {
        CLIhelper.errorInput();
        }
        if (temp == 0) {
        for ( int i = 0; i < 4; i++) {
            //block scope
          int max = 9;
          int min = 0;
          int range = max - min + 1;
          Integer rand = (int)(Math.random() * range) + min;    
        ans += rand.toString();
        }
        } else {
        ans = temp.toString();
        }
    }

// getter for answer
    public static String getAns() {
        return ans;
    } 

// set number of tries

    public static void setTries() {
        Integer temptries = 0;

        try {
            Scanner setTry = new Scanner(System.in);
            temptries = setTry.nextInt();
        }
        catch(InputMismatchException e) {
            CLIhelper.errorTries();
        }
    if (temptries == 0) {
            tries = 10;
        } else {
            tries = temptries;
        }
    }

// get number of tries
    public static Integer getTries() {
        return tries;
    }

// run game
    public static void runGame() {
        int perfect = 0;
        int close = 0;
        Integer played = 0;
        String check = "";
        String tempans = Solver.getAns();
        System.out.println("Round " + round + " Please enter your guess.");
        try {
            Scanner play = new Scanner(System.in);
            played = play.nextInt();
        }
        catch(InputMismatchException e) {
            round -= 1;
            System.out.println("Input must be a 4 digit code, You've forfeit the round.");
        }
        catch(StringIndexOutOfBoundsException d) {
            round -= 1;
            System.out.println("Input must be a 4 digit code, You've forfeit the round.");
        }
        check = played.toString();
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                if ((tempans.charAt(x) == check.charAt(y))) {
                    if ( x == y) {
                        perfect += 1;
                        //System.out.println("perfect" + x + y);
                        if (perfect == 4) {
            System.out.println("You Win! Restart the program to play again.");        
            System.exit(0);    
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
    System.out.println("Perfectly placed pieces: " + perfect + ", Misplaced pieces: " + close + ", Remaining tries: " + tries);
    }
 }