/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurricaneprep;

import model.Player;
/**
 *
 * @author Ryan
 */
public class Hurricaneprep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Player playerOne = new Player();
    
    playerOne.setName("fred flintstone");
    playerOne.setMoney((int) 5.50);
    
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo);
    }
    
}
