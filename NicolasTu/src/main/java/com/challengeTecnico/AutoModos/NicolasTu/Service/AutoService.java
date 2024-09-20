package com.challengeTecnico.AutoModos.NicolasTu.Service;

import com.challengeTecnico.AutoModos.NicolasTu.Entity.EstadoAuto;
import com.challengeTecnico.AutoModos.NicolasTu.Factory.ModoAuto;
import com.challengeTecnico.AutoModos.NicolasTu.Factory.ModoAutoFactory;
import com.challengeTecnico.AutoModos.NicolasTu.Repository.EstadoAutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService {

    private final ModoAutoFactory modoAutoFactory;
    private final EstadoAutoRepositorio estadoAutoRepositorio;

    @Autowired
    public AutoService(ModoAutoFactory modoAutoFactory, EstadoAutoRepositorio estadoAutoRepositorio){
        this.modoAutoFactory = modoAutoFactory;
        this.estadoAutoRepositorio = estadoAutoRepositorio;
    }

    public EstadoAuto usarAuto(String dia){
        ModoAuto modo = modoAutoFactory.getModo(dia);
        EstadoAuto nuevoEstado = new EstadoAuto();

        modo.aplicar(nuevoEstado);

        estadoAutoRepositorio.save(nuevoEstado);
        return nuevoEstado;
    }

    public List<EstadoAuto> getAllAutos(){
        return estadoAutoRepositorio.findAll();
    }
}
