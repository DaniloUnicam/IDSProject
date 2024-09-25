package it.cs.unicam.app_Comune.Dtos.inputFormat;

import it.cs.unicam.app_Comune.Model.ContenutoMultimediale;

public record ContenutoInputFormat (
    ContenutoMultimediale file,
    String commento
)
{}
