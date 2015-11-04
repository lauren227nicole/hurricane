package view;

import java.util.Scanner;

/**
 * Created by Ryan on 11/4/2015.
 */
public class DeliveryCenterView {

    public DeliveryCenterView(){


    }

    public void displayMenu(){

        System.out.println("Please select an item:");
        System.out.println("N - Deliver Supplies to the Nursing Home - $10");
        System.out.println("P - Deliver supplies to the prison - $10");

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

                if (rtn != 'N' && rtn != 'P') {

                    System.out.println("Please select a valid option.");
                    input = "";
                }
            }

        }

        return rtn;
    }

    public void doAction(char input){

        switch (input){
            case 'N' :
                nursingHomeDelivery();
                break;
            case 'P' :
                prisonDelivery();
                break;
            default:
                System.out.println("Error On Input");
        }

    }

    private void nursingHomeDelivery() {
        System.out.println("Not Implemented Yet");

    }

    private void prisonDelivery() {
        System.out.println("Not Implemented Yet");

    }



}


