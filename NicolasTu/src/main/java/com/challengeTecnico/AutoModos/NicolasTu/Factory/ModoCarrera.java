package com.challengeTecnico.AutoModos.NicolasTu.Factory;

import com.challengeTecnico.AutoModos.NicolasTu.Entity.EstadoAuto;

public class ModoCarrera  implements ModoAuto{
    @Override
    public void aplicar(EstadoAuto estadoAuto) {
        estadoAuto.setVelocidad(200);
    }
}
