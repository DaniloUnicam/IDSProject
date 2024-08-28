package Model;

public class BuilderEvento extends BuilderInformazioneTerritoriale{

    private BuilderEvento evento;

    public BuilderEvento() {
        this.evento = new BuilderEvento();
    }
    @Override
    public void reset() {
        this.evento = new BuilderEvento();
    }



    @Override
    public BuilderInformazioneTerritoriale getResult() {
        evento = new BuilderEvento();
        this.reset();
        return evento;
    }
}
