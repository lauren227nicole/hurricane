package view;

import java.util.Scanner;

/**
 * Created by Ryan on 11/3/2015.
 */
public class ShowHowToMenu {

    public void showHowToMenu(){

        System.out.println("Please select an option:");
        System.out.println("G - What is the goal of this game?");
        System.out.println("S - How to view supplies needed");
        System.out.println("I -  How to view current inventory");
        System.out.println("P - How to view how many survival points earned");
        System.out.println("M - How to move locations");
        System.out.println("A - How to make money");
        System.out.println("D - How to deliver supplies");
        System.out.println("B -How to buy supplies");
        System.out.println("V - How to view what each location has\t");
        System.out.println("X - Close Help Menu");

    }
    public char getInput(){


        Scanner in = new Scanner(System.in);

        String input = "";
        char rtn = 0;


        while(input.length() < 1 ){
            showHowToMenu();
            input = in.nextLine();

            if(input.length() < 1){
                System.out.println("Please select an option");
                showHowToMenu();
            }else {

                rtn = input.toUpperCase().charAt(0);

                if (rtn != 'S' && rtn != 'G' && rtn != 'I' && rtn != 'P' && rtn != 'M' && rtn != 'A' && rtn != 'D' && rtn != 'B' && rtn != 'V' && rtn != 'X') {

                    System.out.println("Please select a valid option.");
                    input = "";
                }
            }

        }

        return rtn;
    }

    public void doAction(char input){

        switch (input){
            case 'G' :
                showGoalGameHelp();
                break;
            case 'S' :
                showNeededSuppliesHelp();
                break;
            case 'I' :
                showViewInventoryHelp();
                break;
            case 'P' :
                showViewSurvivalPointsHelp();
                break;
            case 'M' :
                showMoveLocationsHelp();
                break;
            case 'A' :
                showMakeMoneyHelp();
                break;
            case 'D' :
                showDeliverSuppliesHelp();
                break;
            case 'B' :
                showBuySuppliesHelp();
                break;
            case 'V' :
                showViewLocationHelp();
                break;
            case 'X' :
                closeHelpMenu();
                break;
            default:
                System.out.println("Error On Input");
        }

    }

    private void showViewInventoryHelp() {
        System.out.println("Not Implemented Yet");

    }

    private void showDeliverSuppliesHelp() {
        System.out.println("Not Implemented Yet");

    }

    private void showViewSurvivalPointsHelp() {
        System.out.println("Not Implemented Yet");

    }

    private void showMakeMoneyHelp() {
        System.out.println("Not Implemented Yet");

    }

    private void showBuySuppliesHelp() {
        System.out.println("Not Implemented Yet");

    }

    private void showViewLocationHelp() {
        System.out.println("Not Implemented Yet");

    }

    private void closeHelpMenu() {
        System.out.println("Not Implemented Yet");

    }

    private void showMoveLocationsHelp() {
        System.out.println("Not Implemented Yet");

    }

    private void showNeededSuppliesHelp() {
        System.out.println("Not Implemented Yet");
    }

    private void showGoalGameHelp() {
        System.out.println("Not Implemented Yet");
    }



}
