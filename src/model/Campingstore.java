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
public class Campingstore implements Serializable{
    
    
    private String lightingaisle;
    private String cookingaisle;
    private String tentaisle;

    public String getLightingaisle() {
        return lightingaisle;
    }

    public void setLightingaisle(String lightingaisle) {
        this.lightingaisle = lightingaisle;
    }

    public String getCookingaisle() {
        return cookingaisle;
    }

    public void setCookingaisle(String cookingaisle) {
        this.cookingaisle = cookingaisle;
    }

    public String getTentaisle() {
        return tentaisle;
    }

    public void setTentaisle(String tentaisle) {
        this.tentaisle = tentaisle;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.lightingaisle);
        hash = 37 * hash + Objects.hashCode(this.cookingaisle);
        hash = 37 * hash + Objects.hashCode(this.tentaisle);
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
        final Campingstore other = (Campingstore) obj;
        if (!Objects.equals(this.lightingaisle, other.lightingaisle)) {
            return false;
        }
        if (!Objects.equals(this.cookingaisle, other.cookingaisle)) {
            return false;
        }
        if (!Objects.equals(this.tentaisle, other.tentaisle)) {
            return false;
        }
        return true;
    }
    
    
    
}
