package Controller;

import Model.Contenuto;
import Repository.RepositoryContenuto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("generaLink")
public class ControllerGeneraLink {

    @Autowired
    RepositoryContenuto RepositoryContenuto;

    public ControllerGeneraLink() {

    }

   public Contenuto ottieniContenuto(String idContenuto){
       return ottieniContenutoDaRepository(idContenuto);
   }

   public String ottieniLink(String idContenuto){
      return ottieniContenuto(idContenuto).getUrl();
   }

   private Contenuto ottieniContenutoDaRepository(String idContenuto){
       return RepositoryContenuto.findById(idContenuto).get();
   }
}

