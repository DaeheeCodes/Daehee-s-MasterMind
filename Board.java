import java.util.*;
import mypack.*;


public class Board {


    public static int length = Settings.getTries();
    public static int counter = 0; // history of rounds, it will draw up to arraylist[counter] and draw 0s
    public static String[][] history = new String[length][4];   
    public static int[] perfects = new int [length];
     public static int[] closes = new int [length];

    public static void initBoard () {
        Arrays.setAll(history, i -> {
        Arrays.fill(history[i], "0");
        return history[i];
    });
    }

    public static void setHistory() {
        String tempH = Solver.played.toString();
        for (int i = 0; i < 4; i++) {
             String s = "" + tempH.charAt(i);
            history[Solver.round - 1][i] = s;
        }
        perfects[Solver.round -1] = Solver.perfect;
        closes[Solver.round -1] = Solver.close;
    }

    public static void drawHistory() {

    try {
        int rows = history.length;
        int columns = history[0].length;
        String str = "|\t";
        System.out.println("                           ");
        System.out.println("                **Daehee's MASTERMIND**           " + "Round:" + (Solver.round - 1));

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                str += history[i][j] + "\t";
            }
            System.out.println("Perfect = " +  perfects[i] + str + "|" + "Close = " + closes[i]);
            str = "|\t";
        }
    } catch (Exception e) {
        System.out.println("Board is empty!");
    }
}


}