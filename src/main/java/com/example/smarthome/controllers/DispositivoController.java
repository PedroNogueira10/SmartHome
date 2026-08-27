package com.example.smarthome.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dispositivos")
public class DispositivoController{

    @GetMapping
    public String consultaDispositivo(){
        return "Dispositivo encontrado com sucesso!";
    }

    @GetMapping("/usuarios/{usuarioId}")
    public String consultaDispositivoPorUsuario (@PathVariable Long usuarioId){
        return "Teste" + usuarioId;
    }

    @GetMapping("/empresas/{empresaId}")
    public String consultaDispositivoPorEmpresa(@PathVariable Long empresaId){
        return "Lâmpada da empresa " + empresaId;
    }






}