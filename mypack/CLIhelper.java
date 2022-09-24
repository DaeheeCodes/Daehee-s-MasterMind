package mypack;


import java.util.Scanner;
import java.util.InputMismatchException;

public class CLIhelper {  

 public static void welcome() {  
    System.out.println("Welcome to Daehee's MasterMind!");
    System.out.println("Please enter a 4 digit code to set a specific code or enter 0 to play the game");
}

 public static void errorInput() {
    System.out.println("Input must be a 4 digit code, Using default.");
 }

 public static void numAttempt() {
    System.out.println("Please enter the number of attempts, enter 0 to set to default = 0");
 }

    public static void errorTries() {
    System.out.println("Input must be a number, Using default.");
 }

    public static void gameOver() {
    System.out.println("Game Over! Restart the Program to play again.");
 }

}
