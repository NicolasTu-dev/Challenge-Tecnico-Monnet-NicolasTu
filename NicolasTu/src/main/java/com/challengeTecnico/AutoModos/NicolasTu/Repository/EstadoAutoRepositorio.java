package com.challengeTecnico.AutoModos.NicolasTu.Repository;

import com.challengeTecnico.AutoModos.NicolasTu.Entity.EstadoAuto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoAutoRepositorio extends JpaRepository<EstadoAuto, Long> {
}
