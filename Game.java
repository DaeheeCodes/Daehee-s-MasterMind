import java.util.Scanner;
import java.util.InputMismatchException;
import mypack.*;

public class Game {

    public Game() {
        initGame();
        gameLoop();
    }

    private void initGame() {

    CLIhelper.welcome();
    Settings.setAns();    
    CLIhelper.numAttempt();
    Settings.setTries();
    //retrieve private variable tries
    Integer tries = Settings.getTries();
    System.out.println("Tries: " + tries); 
    Board.initBoard();        
    }

    private void gameLoop() {
        while(!Solver.gameOver) {
            Solver.Guess();
            Solver.CheckGuess();
            Board.setHistory();
            Board.drawHistory();
            Solver.Reset();
        }

        if(Solver.gameOver && Solver.gameWon) {
            System.out.println("You Win! Restart the program to play again.");       
            System.exit(0);
        } else if (Solver.gameOver&& !Solver.gameWon) {
             System.out.println("Game Over! Restart the Program to play again.");
            System.exit(0);
        }
    }
}
