package Controller;

import Model.Contenuto;
import Repository.RepositoryContenuto;

public class ControllerGeneraLink {

    public ControllerGeneraLink() {

    }

   public Contenuto ottieniContenuto(String idContenuto){
       return ottieniContenutoDaRepository(idContenuto);
   }

   public String ottieniLink(String idContenuto){
      return ottieniContenuto(idContenuto).getUrl();
   }

   private Contenuto ottieniContenutoDaRepository(String idContenuto){
       return RepositoryContenuto.getInstance().ottieni(idContenuto);
   }


}

