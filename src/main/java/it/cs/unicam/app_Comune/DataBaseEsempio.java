package it.cs.unicam.app_Comune;

import it.cs.unicam.app_Comune.InformazioneTerritoriale.PuntoInteresse;
import it.cs.unicam.app_Comune.InformazioneTerritoriale.TipoStruttura;
import it.cs.unicam.app_Comune.Model.Contenuto;
import it.cs.unicam.app_Comune.Model.ContenutoMultimediale;
import it.cs.unicam.app_Comune.Model.Orario;
import it.cs.unicam.app_Comune.Model.PosizioneSatellitare;
import it.cs.unicam.app_Comune.Repository.RepositoryContenuto;
import it.cs.unicam.app_Comune.Repository.RepositoryContenutoMultimediale;
import it.cs.unicam.app_Comune.Repository.RepositoryPuntoInteresse;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataBaseEsempio {

    @Autowired
    RepositoryPuntoInteresse repositoryPuntoInteresse;

    @Autowired
    RepositoryContenuto repositoryContenuto;

    @Autowired
    RepositoryContenutoMultimediale repositoryContenutoMultimediale;


    @PostConstruct
    public void init() {
        setUpContenuto(repositoryContenuto, repositoryContenutoMultimediale);
        setUpPuntoInteresse(repositoryPuntoInteresse);

    }


    public void clear(JpaRepository repository){
        repository.deleteAll();
        repository.flush();
    }

    private void setUpContenuto(RepositoryContenuto repositoryContenuto, RepositoryContenutoMultimediale repositoryContenutoMultimediale) {
        clear(repositoryContenuto);

        // Salva prima i contenuti multimediali
        ContenutoMultimediale cm1 = new ContenutoMultimediale(
                "Foto Borgesca", "La foto dell'anno",
                "http://www.google.it/",
                new File("C:\\Users\\abiga\\OneDrive\\Desktop\\3AnnoInformaticaCD\\Progetto2024_IDS_GRUPPO\\src\\main\\resources\\Files\\RoccadeiBorgia.jpg"));

        repositoryContenutoMultimediale.save(cm1);
        repositoryContenutoMultimediale.flush();

        ContenutoMultimediale cm3 = new ContenutoMultimediale(
                "Foto Museo", "La foto dell'anno",
                "http://www.google.it/",
                new File("C:\\Users\\abiga\\OneDrive\\Desktop\\3AnnoInformaticaCD\\Progetto2024_IDS_GRUPPO\\src\\main\\resources\\Files\\MuseoArcheologicoStataleCamerino.jpg"));

        repositoryContenutoMultimediale.save(cm3);
        repositoryContenutoMultimediale.flush();

        // Ora crea i contenuti e associa i contenuti multimediali salvati
        List<Contenuto> contenuti = new ArrayList<>();
        Contenuto contenuto1 = new Contenuto(cm1);  // Usa l'oggetto persistito
        Contenuto contenuto2 = new Contenuto("Foto del Duomo di Camerino");
        Contenuto contenuto3 = new Contenuto(cm3);  // Usa l'oggetto persistito

        contenuti.addAll(Arrays.asList(contenuto1, contenuto2, contenuto3));
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