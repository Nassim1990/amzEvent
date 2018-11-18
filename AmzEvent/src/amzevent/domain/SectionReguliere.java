/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amzevent.domain;

import java.awt.Point;

/**
 *
 * @author marc
 */
public class SectionReguliere extends ComposanteSalle{
    
     private double longueur, largeur;

     public SectionReguliere(Point point) 
     {
         super(point);
         this.longueur=2;
         this.largeur=2;
     }
     
     public void setDimensions(int longueur, int largeur){
         
         this.longueur = longueur;
         this.largeur = largeur;
         
     }
     public double getLargeur(){
         return this.largeur;
     }
    public double getLongueur(){
         return this.longueur;
     }
}
