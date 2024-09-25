package it.cs.unicam.app_Comune.Abstract;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;

public interface Identificabile {

/*
    @Id
    private String id = getIdIncrementazione();
    private static long idIncrementazione= 0;


    public static String getIdIncrementazione() {
        return String.valueOf(idIncrementazione++);
    }
    */
    public long getID ();
}
