package com.challengeTecnico.AutoModos.NicolasTu.Factory;

import org.springframework.stereotype.Component;

@Component
public class ModoAutoFactory {
    public ModoAuto getModo(String dia){
        switch (dia.toLowerCase()) {
            case "lunes":
                return new ModoTrabajo();
            case "martes":
                return new ModoCarrera();
            case "miercoles":
            case "jueves":
                return new ModoOffRoad();
            case "viernes":
                return new ModoAgenteSecreto();
            default:
                throw new IllegalArgumentException("Dia invalido");
        }
    }
}
