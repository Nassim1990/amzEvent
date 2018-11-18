package amzevent.domain;
import java.awt.Point;
import java.util.LinkedList;
import java.util.List;

public class AmzController {
    private Salle salle;
 
    public enum TypeComposante {
	    SCENE,SECTION_R, SECTION_IR, SECTION_A
    }
    public AmzController (Salle salle)
    {
        this.salle = salle;
    }
 
    public AmzController() 
     {
        salle = new Salle();
     }
 
    private void addScene(Point mousePoint) 
     {
        Scene nouvelleScene = new Scene(mousePoint);
        salle.add(nouvelleScene);
     }
        private void addSection(Point mousePoint, TypeComposante typeComposante) 
     {
        if(typeComposante == TypeComposante.SECTION_R){
            SectionReguliere nouvelleSection = new SectionReguliere(mousePoint);
            salle.add(nouvelleSection);
        }
        else if(typeComposante == TypeComposante.SECTION_A){
            SectionAdmission nouvelleSection = new SectionAdmission(mousePoint);
            salle.add(nouvelleSection);
        }
     }
    public void addComposante(Point mousePoint, TypeComposante typeComposante )
     {
         if(typeComposante == TypeComposante.SCENE)
            addScene(mousePoint);
         else if(typeComposante == TypeComposante.SECTION_R)
             addSection(mousePoint, typeComposante);
     }
    public List<ComposanteSalle> getListeComposantes() 
     {
         return salle.getComposantesSalle();
     }
    public void modifierScene(int longueur, int largeur){
        salle.getScene().setDimensions(longueur, largeur);
        salle.setScene(salle.getScene());
    }
    public Salle getSalle(){
        return this.salle;
    }
    
}
