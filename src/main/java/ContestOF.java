/**
 * This class represents a Contest Detailed Output Format object.
 *
 * @param titolo
 * @param descrizione
 * @param url
 * @param idCreatore
 * @param idContenutoMultimediale
 **/
//TODO
public class ContestOF (){

    @JsonView(View.Synthesized.class)
    private String titolo;
    @JsonView(View.Synthesized.class)
    private String descrizione;
    @JsonView(View.Synthesized.class)
    private String url;
    @JsonView(View.Detailed.class)
    private String idCreatore;
    @JsonView(View.Detailed.class)
    private String idContenutoMultimediale;
    }
