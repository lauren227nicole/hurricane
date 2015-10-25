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
public class LightingAisle implements Serializable{
    
    
           private String batteries;
           private String candles;
           private String ledlantern;
           private String matches;
           private String radio;

    public String getBatteries() {
        return batteries;
    }

    public void setBatteries(String batteries) {
        this.batteries = batteries;
    }

    public String getCandles() {
        return candles;
    }

    public void setCandles(String candles) {
        this.candles = candles;
    }

    public String getLedlantern() {
        return ledlantern;
    }

    public void setLedlantern(String ledlantern) {
        this.ledlantern = ledlantern;
    }

    public String getMatches() {
        return matches;
    }

    public void setMatches(String matches) {
        this.matches = matches;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.batteries);
        hash = 29 * hash + Objects.hashCode(this.candles);
        hash = 29 * hash + Objects.hashCode(this.ledlantern);
        hash = 29 * hash + Objects.hashCode(this.matches);
        hash = 29 * hash + Objects.hashCode(this.radio);
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
        final LightingAisle other = (LightingAisle) obj;
        if (!Objects.equals(this.batteries, other.batteries)) {
            return false;
        }
        if (!Objects.equals(this.candles, other.candles)) {
            return false;
        }
        if (!Objects.equals(this.ledlantern, other.ledlantern)) {
            return false;
        }
        if (!Objects.equals(this.matches, other.matches)) {
            return false;
        }
        if (!Objects.equals(this.radio, other.radio)) {
            return false;
        }
        return true;
    }
          


    
    
    
}
