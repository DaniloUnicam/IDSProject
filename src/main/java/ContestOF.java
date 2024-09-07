/**
 * This class represents a Contest Detailed Output Format object.
 *
 * @param titolo
 * @param descrizione
 * @param url
 * @param idCreatore
 * @param idContenutoMultimediale
 **/

public class ContestOF (

    @JsonView(View.Synthesized.class)
    private string titolo;
    @JsonView(View.Synthesized.class)
    private string descrizione;
    @JsonView(View.Synthesized.class)
    private string url;
    @JsonView(View.Detailed.class)
    private string idCreatore;
    @JsonView(View.Detailed.class)
    private string idContenutoMultimediale;
    )
