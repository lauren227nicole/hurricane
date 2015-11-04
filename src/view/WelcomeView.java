package view;

import model.Player;

import java.util.Scanner;

/**
 * Created by Ryan on 11/3/2015.
 */
public class WelcomeView {



    public WelcomeView(){



    }


    public void displayBanner(){

        System.out.println("**************************************************");
        System.out.println("Welcome to Hurricane Prep City");
        System.out.println("You find yourself staring at the news for fifth time today");
        System.out.println("You notice the banner at the bottom has changed slightly since last time.");
        System.out.println("The tropical storm is no longer just a tropical storm.");
        System.out.println("BREAKING NEWS ************ CATEGORY 5 HURRICANE");
        System.out.println("HEADED STRAIGHT TOWARDS THE TWON.");
        System.out.println("PLEASE MAKE SURE YOU ARE PREPARED BEFORE IT ARRIVES IN 5 DAYS");
        System.out.println("You must prepare your household for the storm.");
        System.out.println("Be sure you have all the necessary supplies to survive.");
        System.out.println("Good luck I hope you are ready.");

    }

    public String getPlayerName(){

        Scanner in = new Scanner(System.in);
        String name = "";

        while(name.length() < 2){
            System.out.println("Please Enter your name: ");
            name = in.nextLine();

            if(name.length() < 2) {
                System.out.println("Please enter a name with a least 2 characters");
                }
            }
        return name;
        }




    public void displayPlayerNameBanner(Player p){

        System.out.println("***********************************");
        System.out.println("Welcome " + p.getName() + "!");
        System.out.println("May your preparations be successful.");
        System.out.println("************************************");

    }
}
