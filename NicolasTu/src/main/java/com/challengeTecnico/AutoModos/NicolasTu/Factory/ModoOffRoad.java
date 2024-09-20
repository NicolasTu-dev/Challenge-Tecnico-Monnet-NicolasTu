package com.challengeTecnico.AutoModos.NicolasTu.Factory;

import com.challengeTecnico.AutoModos.NicolasTu.Entity.EstadoAuto;

public class ModoOffRoad implements ModoAuto{
    @Override
    public void aplicar(EstadoAuto estadoAuto) {
        estadoAuto.setVelocidad(100);
    }
}
