package view;

/**
 * Created by Ryan on 11/3/2015.
 */
import java.util.Scanner;

public class MainMenuView {

    public MainMenuView(){


    }

    public void displayMenu(){

        System.out.println("Please select an option:");
        System.out.println("S - Start New Game");
        System.out.println("H - How to play");
        System.out.println("L - Load Saved Game");
        System.out.println("E - Exit Game");

    }

    public char getInput(){


        Scanner in = new Scanner(System.in);

        String input = "";
        char rtn = 0;


        while(input.length() < 1 ){
            displayMenu();
            input = in.nextLine();

            if(input.length() < 1){
                System.out.println("Please select an option");
                displayMenu();
            }else {

              rtn = input.toUpperCase().charAt(0);

                if (rtn != 'S' && rtn != 'H' && rtn != 'L' && rtn != 'E') {

                    System.out.println("Please select a valid option.");
                    input = "";
                }
            }

        }

    return rtn;
    }

    public void doAction(char input){

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
                exitGame();
                break;
            default:
                System.out.println("Error On Input");
        }

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




