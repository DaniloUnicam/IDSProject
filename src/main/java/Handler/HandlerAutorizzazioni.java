package Handler;

import Model.Contest;

public class HandlerAutorizzazioni {

    public boolean chiedeCreazioneContest(Contest contest){
        return contest.getIdCreatore().equals("Animatore_Autorizzato");
    }
}
