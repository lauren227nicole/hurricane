package view;

/**
 * Created by Ryan on 11/3/2015.
 */
import java.util.Scanner;

public class MainMenuView extends View {

    public MainMenuView(){

        super("Please select an option:\n " +
                "S - Start New Game\n " +
                "H - How to play\n " +
                "L - Load Saved Game\n" +
                "E - Exit Game");


    }




    @Override
    public boolean doAction(char input){

        switch (input){
            case 'S' :
                startNewGame();
                break;
            case 'H' :
                showHelpToMenu();
                break;
            case 'L' :
                showLoadGameMenu();
                break;
            case 'E' :
                return false;
            default:
                System.out.println("Error On Input");
                break;
        }

        return true;
    }

    private void startNewGame() {
    System.out.println("Not Implemented Yet");
    }

   public void showHelpToMenu() {
       System.out.println("Not Implemented Yet");
    }
    private void showLoadGameMenu() {
        System.out.println("Not Implemented Yet");

    }

    private void exitGame() {
        System.out.println("Not Implemented Yet");

    }
}




