import InformazioneTerritoriale.PuntoInteresse;
import InformazioneTerritoriale.TipoStruttura;
import Model.Contenuto;
import Model.ContenutoMultimediale;
import Model.Orario;
import Model.PosizioneSatellitare;
import Repository.RepositoryContenuto;
import Repository.RepositoryPuntoInteresse;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataBaseEsempio {

    @Autowired
    private RepositoryPuntoInteresse repositoryPuntoInteresse;

    @Autowired
    private RepositoryContenuto repositoryContenuto;

    @PostConstruct
    public void init() {
        setUpPuntoInteresse(repositoryPuntoInteresse);
        setUpContenuto(repositoryContenuto);

    }

    public void clear(JpaRepository repository){
        repository.deleteAll();
        repository.flush();
    }
    private void setUpContenuto(RepositoryContenuto repositoryContenuto) {
        clear(repositoryContenuto);
        List<Contenuto> contenuti = new ArrayList<>();
        contenuti.addAll(Arrays.asList(new Contenuto(new ContenutoMultimediale("Foto Borgesca", "La foto dell'anno", "http://www.google.it/")
                        , "Foto della Rocca Borgesca"),
                new Contenuto("Foto del Duomo di Camerino"),
                new Contenuto(new ContenutoMultimediale("Foto Museo", "La foto dell'anno", "http://www.google.it/"))
                ));
        repositoryContenuto.saveAll(contenuti);
        repositoryContenuto.flush();
    }

    private void setUpPuntoInteresse(RepositoryPuntoInteresse repositoryPuntoInteresse) {
        clear(repositoryPuntoInteresse);
      List<PuntoInteresse> puntiInteresse = new ArrayList<>();
      puntiInteresse.addAll(Arrays.asList(new PuntoInteresse("Rocca Borgesca", "La Rocca Borgesca, o Rocca dei Borgia, è un imponente fortificazione di Camerino, nelle Marche",
                    new Orario(00,00),new Orario(00,00),
                    TipoStruttura.PARCO,0, new PosizioneSatellitare(43.130841f,13.0624863f)),
                    new PuntoInteresse("Duomo di Camerino", "Il duomo di Camerino è la cattedrale di Camerino, in provincia di Macerata, e sede vescovile della diocesi di Camerino-San Severino Marche",
                            new Orario(00,00),new Orario(00,00),
                            TipoStruttura.ALTRO,0, new PosizioneSatellitare(43.130841f,13.0624863f)),
                    new PuntoInteresse("Museo Archeologico di Camerino", "Il Museo archeologico statale di Camerino è un museo archeologico situato a Camerino, nelle Marche",
                            new Orario(00,00),new Orario(00,00),
                            TipoStruttura.MUSEO,0, new PosizioneSatellitare(43.130841f,13.0624863f))));
        repositoryPuntoInteresse.saveAll(puntiInteresse);
        repositoryPuntoInteresse.flush();
    }

}
