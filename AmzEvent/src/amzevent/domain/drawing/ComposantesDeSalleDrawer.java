
package amzevent.domain.drawing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.List;
import amzevent.domain.AmzController;
import amzevent.domain.ComposanteSalle;
import amzevent.domain.Scene;
import amzevent.domain.SectionAdmission;
import amzevent.domain.SectionReguliere;
public class ComposantesDeSalleDrawer {
  
  private final AmzController controller;
  private Dimension initialDimension;
  private int radius = 5;
 
 
  public ComposantesDeSalleDrawer(AmzController controller, Dimension initialDimension) 
  {
    this.controller = controller;
    this.initialDimension = initialDimension;
  }
 
  public void draw(Graphics g) 
  {
    drawComposante(g);
  }
 
  private void drawComposante(Graphics g){
    
    if(controller.getListeComposantes() != null){
        List<ComposanteSalle> listeComposantes = controller.getListeComposantes(); 
        for (ComposanteSalle composanteSalle: listeComposantes){
            if(composanteSalle instanceof Scene)
                drawComposanteCarre(g, (Scene)composanteSalle);
            else if(composanteSalle instanceof SectionAdmission)
                drawComposanteCarre(g, (SectionAdmission)composanteSalle);
            else if(composanteSalle instanceof SectionReguliere)
                drawComposanteCarre(g, (SectionReguliere)composanteSalle);
            else{
                Point composantePoint = composanteSalle.getPoint();
                g.fillOval((int)composantePoint.getX()-radius,(int)composantePoint.getY()-radius, radius*2, radius*2);
            }
        }
    }
  }
  
  private void drawComposanteCarre(Graphics g, ComposanteSalle composante) 
  {
    int positionX = (int)composante.getPoint().getX();
    int positionY = (int)composante.getPoint().getY();
    double largeur =0;
    double longueur=0;
    if(composante instanceof Scene){
        largeur = ((Scene)composante).getLargeur();
        longueur = ((Scene)composante).getLongueur();
    }
    else if(composante instanceof SectionAdmission){
        largeur = ((SectionAdmission)composante).getLargeur();
        longueur = ((SectionAdmission)composante).getLongueur();
    }
    else if(composante instanceof SectionReguliere){
        largeur = ((SectionReguliere)composante).getLargeur();
        longueur = ((SectionReguliere)composante).getLongueur();
    }
    g.setColor(new Color(0,0,0));
    g.drawRect(positionX, positionY, (int)largeur, (int)longueur);
  }
}
