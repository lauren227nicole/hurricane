package view;

import java.util.Scanner;

/**
 * Created by Ryan on 11/12/2015.
 */
public abstract class View implements ViewInterface {

    private String menu;

    public View(String menuString){

        menu = menuString;
    }

    @Override
    public void display(){
        boolean cont = true;



        do {

            System.out.println(menu);

            char in = GetInput();

            cont = doAction(in);
        } while (cont);

    }
    @Override
    public char getInput(){


        Scanner in = new Scanner(System.in);

        String input = "";
        char rtn = 0;


        while(input.length() < 1 ){
            input = in.nextLine();

            if(input.length() < 1){
                System.out.println("Please select an option");
            }else {

                rtn = input.toUpperCase().charAt(0);

            }

        }

        return rtn;
    }
}
