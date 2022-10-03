package mypack;

import mypack.*;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Settings {

    public  static Integer temp = 0;
    private  static String ans = "";
    public  static Integer tries = 0;

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
        Integer temptries = 0 ;

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
}
