package com.example.smarthome.controllers;

import DTO.DispositivoRequest;
import DTO.DispositivoResponse;
import com.example.smarthome.entidades.Dispositivo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dispositivos")
public class DispositivoController{

    @GetMapping
    public String ConsultaDispositivo(){
        return "Consultou por Dispositivo";
    }

    @GetMapping("/empresas/{empresaId}")
    public String ConsultaDispositivoPorEmpresa(@PathVariable Long empresaId){
        return "Consultou o dispositivo da Empresa <" + empresaId + ">";
    }


    @PostMapping
    public ResponseEntity<DispositivoResponse> CadastrarDispositivo(@RequestBody DispositivoRequest dispositivoRequest){

        Dispositivo dispositivoTeste = new Dispositivo();

        dispositivoTeste.setNome(dispositivoRequest.getNome());
        dispositivoTeste.setCategoria(dispositivoRequest.getCategoria());
        dispositivoTeste.setStatus(dispositivoRequest.getStatus());
        dispositivoTeste.setConexao(dispositivoRequest.getConexao());
        dispositivoTeste.setConsumoWatts(dispositivoRequest.getConsumoWatts());
        return ResponseEntity.ok(new DispositivoResponse(dispositivoTeste.getId(),
        "Dispositivo Cadastrado com Sucesso!"));

    }


}