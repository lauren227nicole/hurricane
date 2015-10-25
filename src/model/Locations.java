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
public class Locations implements Serializable{
    
           private String deliverycenter;
           private String campingstore;
           private String bathroom;
           private String megastore;
           private String basement;
           private String closet;
           private String garage;
           private String kitchen;
           private String bedroom;

    public String getDeliverycenter() {
        return deliverycenter;
    }

    public void setDeliverycenter(String deliverycenter) {
        this.deliverycenter = deliverycenter;
    }

    public String getCampingstore() {
        return campingstore;
    }

    public void setCampingstore(String campingstore) {
        this.campingstore = campingstore;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    public String getMegastore() {
        return megastore;
    }

    public void setMegastore(String megastore) {
        this.megastore = megastore;
    }

    public String getBasement() {
        return basement;
    }

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public String getCloset() {
        return closet;
    }

    public void setCloset(String closet) {
        this.closet = closet;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getBedroom() {
        return bedroom;
    }

    public void setBedroom(String bedroom) {
        this.bedroom = bedroom;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.deliverycenter);
        hash = 61 * hash + Objects.hashCode(this.campingstore);
        hash = 61 * hash + Objects.hashCode(this.bathroom);
        hash = 61 * hash + Objects.hashCode(this.megastore);
        hash = 61 * hash + Objects.hashCode(this.basement);
        hash = 61 * hash + Objects.hashCode(this.closet);
        hash = 61 * hash + Objects.hashCode(this.garage);
        hash = 61 * hash + Objects.hashCode(this.kitchen);
        hash = 61 * hash + Objects.hashCode(this.bedroom);
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
        final Locations other = (Locations) obj;
        if (!Objects.equals(this.deliverycenter, other.deliverycenter)) {
            return false;
        }
        if (!Objects.equals(this.campingstore, other.campingstore)) {
            return false;
        }
        if (!Objects.equals(this.bathroom, other.bathroom)) {
            return false;
        }
        if (!Objects.equals(this.megastore, other.megastore)) {
            return false;
        }
        if (!Objects.equals(this.basement, other.basement)) {
            return false;
        }
        if (!Objects.equals(this.closet, other.closet)) {
            return false;
        }
        if (!Objects.equals(this.garage, other.garage)) {
            return false;
        }
        if (!Objects.equals(this.kitchen, other.kitchen)) {
            return false;
        }
        if (!Objects.equals(this.bedroom, other.bedroom)) {
            return false;
        }
        return true;
    }
    
    
    
}
