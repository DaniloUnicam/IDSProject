package Interfacce;

public abstract class Identificabile {

    private static long idIncrementazione= 0;
    public abstract String getID ();

    public static String getIdIncrementazione() {
        return String.valueOf(idIncrementazione++);
    }

}
