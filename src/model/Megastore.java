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
public class Megastore implements Serializable{
 
   private String protein;
   private String sugars;
   private String carbs;
   private String toiletries;
   private String firstaid;
   private String clothing;
   private String blankets;
   private String water;

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getSugars() {
        return sugars;
    }

    public void setSugars(String sugars) {
        this.sugars = sugars;
    }

    public String getCarbs() {
        return carbs;
    }

    public void setCarbs(String carbs) {
        this.carbs = carbs;
    }

    public String getToiletries() {
        return toiletries;
    }

    public void setToiletries(String toiletries) {
        this.toiletries = toiletries;
    }

    public String getFirstaid() {
        return firstaid;
    }

    public void setFirstaid(String firstaid) {
        this.firstaid = firstaid;
    }

    public String getClothing() {
        return clothing;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public String getBlankets() {
        return blankets;
    }

    public void setBlankets(String blankets) {
        this.blankets = blankets;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.protein);
        hash = 37 * hash + Objects.hashCode(this.sugars);
        hash = 37 * hash + Objects.hashCode(this.carbs);
        hash = 37 * hash + Objects.hashCode(this.toiletries);
        hash = 37 * hash + Objects.hashCode(this.firstaid);
        hash = 37 * hash + Objects.hashCode(this.clothing);
        hash = 37 * hash + Objects.hashCode(this.blankets);
        hash = 37 * hash + Objects.hashCode(this.water);
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
        final Megastore other = (Megastore) obj;
        if (!Objects.equals(this.protein, other.protein)) {
            return false;
        }
        if (!Objects.equals(this.sugars, other.sugars)) {
            return false;
        }
        if (!Objects.equals(this.carbs, other.carbs)) {
            return false;
        }
        if (!Objects.equals(this.toiletries, other.toiletries)) {
            return false;
        }
        if (!Objects.equals(this.firstaid, other.firstaid)) {
            return false;
        }
        if (!Objects.equals(this.clothing, other.clothing)) {
            return false;
        }
        if (!Objects.equals(this.blankets, other.blankets)) {
            return false;
        }
        if (!Objects.equals(this.water, other.water)) {
            return false;
        }
        return true;
    }
    
    
 
}
