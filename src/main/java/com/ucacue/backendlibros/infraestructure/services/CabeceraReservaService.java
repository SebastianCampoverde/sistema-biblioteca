package com.ucacue.backendlibros.infraestructure.services;

import com.ucacue.backendlibros.infraestructure.repository.CabeceraReservaRepository;
import com.ucacue.backendlibros.model.CabeceraReserva;
import com.ucacue.backendlibros.model.DetalleReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Esto es un servicio
@Service
public class CabeceraReservaService {

    @Autowired
    CabeceraReservaRepository cabeceraReservaRepository;
    public List<DetalleReserva> reservasMora(){

        List<CabeceraReserva> cabeceraReservas = cabeceraReservaRepository.findAll();
        List<DetalleReserva> detalleReservasMora = new ArrayList<>();
        for (CabeceraReserva cabeceraReserva : cabeceraReservas){
            for (DetalleReserva detalleReserva : cabeceraReserva.getDetalleReserva()){
                detalleReserva.setDiasMoras();
                if(detalleReserva.getDiasMoras()>0){
                    detalleReservasMora.add(detalleReserva);
                }
            }
        }
        return detalleReservasMora;
    }
}
