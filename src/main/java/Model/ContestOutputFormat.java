package Model;

import Abstract.Identificabile;

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
public record ContestOutputFormat (

    // @JsonView(View.Synthesized.class)
      String idContest,
   // @JsonView(View.Synthesized.class)
     String titolo,
  //  @JsonView(View.Synthesized.class)
     String descrizione,
   // @JsonView(View.Synthesized.class)
     String url,
   // @JsonView(View.Detailed.class)
     String idCreatore,
    //@JsonView(View.Detailed.class)
     String idContenutoMultimediale
    ) {

    private static long idIncrementazione= 0;

    public static String getIdIncrementazione() {
        return String.valueOf(idIncrementazione++);
    }

}
