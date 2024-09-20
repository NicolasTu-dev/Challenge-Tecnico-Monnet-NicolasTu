package com.challengeTecnico.AutoModos.NicolasTu.Factory;

import com.challengeTecnico.AutoModos.NicolasTu.Entity.EstadoAuto;

public class ModoAgenteSecreto implements ModoAuto{
    @Override
    public void aplicar(EstadoAuto estadoAuto) {
        estadoAuto.setVelocidad(150);
        estadoAuto.setArmasActivas(true);
        estadoAuto.setCamuflajeActivo(true);
    }
}
