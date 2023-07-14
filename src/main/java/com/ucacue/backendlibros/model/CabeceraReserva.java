package com.ucacue.backendlibros.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
@Entity
@Table(name = "cabecera_reserva")
public class CabeceraReserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    private Persona persona;
    private Date fechaReserva;

    @OneToMany(mappedBy = "cabeceraReserva")
    private List<DetalleReserva> detalleReserva;

}
