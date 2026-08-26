package com.example.smarthome.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dispositivos")
public class DispositivoController {

    @GetMapping
    public String consultaDispositivo(){
        return "Dispositivo";
    }
    @GetMapping("/usuarios/{usuarioId}")
        public String ConsultaDispositivoPorUsuario(@PathVariable Long usuarioId){
        return "Dispositivo de Pedro ID = " + usuarioId;
    }

    @GetMapping("/empresa/{empresaId}")
    public String consultaDisposivoPorEmpresa(@PathVariable Long empresaId){
        return "Iphone do teste(" + empresaId + ")";
    }


}
