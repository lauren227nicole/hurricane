package view;

import java.util.Scanner;

/**
 * Created by Ryan on 11/4/2015.
 */
public class MegaStoreView {

    public MegaStoreView(){


    }

    public void displayMenu(){

        System.out.println("Please select an item:");
        System.out.println("P - Protein");
        System.out.println("S -  Sweets/Sugars");
        System.out.println("C - Carbohydrates");
        System.out.println("T - Toiletries ");
        System.out.println("F - First aid and medicine");
        System.out.println("O - Clothing ");
        System.out.println("B - Blankets");
        System.out.println("W - Water");
        System.out.println("X - Game Menu");
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

                if (rtn != 'S' && rtn != 'P' && rtn != 'C' && rtn != 'T' && rtn != 'F' && rtn != 'O' && rtn != 'B' && rtn != 'W' && rtn != 'X') {

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
                sweetsSugars();
                break;
            case 'P' :
                protein();
                break;
            case 'C' :
                carbohydrates();
                break;
            case 'T' :
                toiletries();
                break;
            case 'F' :
                firstAidMedicine();
                break;
            case 'O' :
                clothing();
                break;
            case 'B' :
                blankets();
                break;
            case 'W' :
                water();
                break;
            case 'X' :
                gameMenu();
            default:
                System.out.println("Error On Input");
        }

    }

    private void gameMenu() {
        System.out.println("Not Implemented Yet");

    }

    private void water() {
        System.out.println("Not Implemented Yet");

    }

    private void blankets() {
        System.out.println("Not Implemented Yet");

    }

    private void clothing() {
        System.out.println("Not Implemented Yet");

    }

    private void firstAidMedicine() {
        System.out.println("Not Implemented Yet");

    }

    private void toiletries() {
        System.out.println("Not Implemented Yet");

    }

    private void carbohydrates() {
        System.out.println("Not Implemented Yet");

    }

    private void protein() {
        System.out.println("Not Implemented Yet");

    }

    private void sweetsSugars() {
        System.out.println("Not Implemented Yet");

    }

}
