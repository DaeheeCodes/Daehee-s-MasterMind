import java.util.Scanner;
import java.util.InputMismatchException;
import mypack.*;


public class my_mastermind {

    public static void main(String[] arg) {

    //run initial CLI prompt and Answer Setter
    CLIhelper.welcome();
    Solver.setAns();    

    //Tries Setter 
    CLIhelper.numAttempt();
    Solver.setTries();
    //Get private variable tries
    Integer tries = Solver.getTries();
    System.out.println("Tries: " + tries);       
      

    while (tries > 0) {
        Solver.runGame();
        }
        round += 1;
        tries -= 1; 
        if (tries == 0 ) {
            CLIhelper.gameOver();
            System.exit(0);
        }
    }
    }
}