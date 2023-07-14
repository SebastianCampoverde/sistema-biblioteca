package com.ucacue.backendlibros.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


//Este es mi cambio realizado en el modelo Docente :)
@Entity
@DiscriminatorValue("docente")
public class Docente extends Persona {

    private String titulo;
}

//este es un modelo docente