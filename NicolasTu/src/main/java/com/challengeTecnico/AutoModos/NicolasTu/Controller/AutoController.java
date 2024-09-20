package com.challengeTecnico.AutoModos.NicolasTu.Controller;

import com.challengeTecnico.AutoModos.NicolasTu.Entity.EstadoAuto;
import com.challengeTecnico.AutoModos.NicolasTu.Service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/auto")
public class AutoController {
    private final AutoService autoService;

    @Autowired
    public AutoController(AutoService autoService){
        this.autoService = autoService;
    }

    @GetMapping("/usar")
    public ResponseEntity<EstadoAuto> usarAuto(@RequestParam String dia){
        EstadoAuto estado = autoService.usarAuto(dia);
        return new ResponseEntity<>(estado, HttpStatus.OK);
    }

    @GetMapping("/traerTodos")
    public ResponseEntity<List<EstadoAuto>> getAllAutos(){
        List<EstadoAuto> estados = autoService.getAllAutos();
        return new ResponseEntity<>(estados, HttpStatus.OK);
    }
}
