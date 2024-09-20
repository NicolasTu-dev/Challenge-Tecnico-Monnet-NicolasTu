package com.challengeTecnico.AutoModos.NicolasTu.Factory;

import com.challengeTecnico.AutoModos.NicolasTu.Entity.EstadoAuto;

public class ModoTrabajo implements ModoAuto {
    @Override
    public void aplicar(EstadoAuto estadoAuto){
        // Esto es para darle agregados, indico que en modo trabajo la velocidad del auto para ir a trabajar van a ser 30km/h
        estadoAuto.setVelocidad(30);
    }
}
