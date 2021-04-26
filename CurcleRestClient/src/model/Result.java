/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pp
 */
@XmlRootElement
public class Result {
    
    private double area;

    public double getArea() {
        return area;
    }
    private double cir;

    public double getCir() {
        return cir;
    }
    @XmlElement
    public void setArea(double area) {
        this.area = area;
    }
    public void setCir(double cir) {
        this.cir = cir;
    }

}
