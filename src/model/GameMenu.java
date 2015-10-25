/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Ryan
 */
public class GameMenu implements Serializable{
 
    private String resumegame;
     private String savegame;
      private String help;
       private String exitgame;

    public String getResumegame() {
        return resumegame;
    }

    public void setResumegame(String resumegame) {
        this.resumegame = resumegame;
    }

    public String getSavegame() {
        return savegame;
    }

    public void setSavegame(String savegame) {
        this.savegame = savegame;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getExitgame() {
        return exitgame;
    }

    public void setExitgame(String exitgame) {
        this.exitgame = exitgame;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.resumegame);
        hash = 97 * hash + Objects.hashCode(this.savegame);
        hash = 97 * hash + Objects.hashCode(this.help);
        hash = 97 * hash + Objects.hashCode(this.exitgame);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GameMenu other = (GameMenu) obj;
        if (!Objects.equals(this.resumegame, other.resumegame)) {
            return false;
        }
        if (!Objects.equals(this.savegame, other.savegame)) {
            return false;
        }
        if (!Objects.equals(this.help, other.help)) {
            return false;
        }
        return true;
    }
     
    
    
    
}
