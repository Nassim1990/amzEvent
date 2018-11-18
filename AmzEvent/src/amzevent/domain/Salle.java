
package amzevent.domain;
import java.util.LinkedList;
import java.util.List;

public class Salle {

private List<ComposanteSalle> listeComposantes;
private boolean sceneAjoutee = false;
private Scene scene;
private int indexScene;
public Salle ()
    {
        listeComposantes = new LinkedList<ComposanteSalle>();
    }
public void add(ComposanteSalle composante){
        if(composante instanceof Scene){
            if(!sceneAjoutee){
                listeComposantes.add(composante);
                sceneAjoutee = true;
                this.scene = (Scene)composante;
                this.indexScene = listeComposantes.size()-1;
            }
        }
        else
            listeComposantes.add(composante);
    }
public List<ComposanteSalle> getComposantesSalle() 
    {
        if(listeComposantes.size()==0)
            return null;
        else
            return listeComposantes;
    }

public void setScene(Scene scene){
        this.scene = scene;
        listeComposantes.set(indexScene, scene);
}
public Scene getScene(){
    return scene;   
}
}
