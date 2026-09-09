package com.example.smarthome.controllers;

import DTO.AtualizarNomeDispositivoRequest;
import DTO.DispositivoRequest;
import DTO.DispositivoResponse;
import DTO.UsuarioRequest;
import com.example.smarthome.entidades.Dispositivo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

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

    @PatchMapping("/{id}/nome")
    public ResponseEntity<DispositivoResponse> atualizarNomeDispositivo(@PathVariable Long id, AtualizarNomeDispositivoRequest dispositivoRequest){

        Dispositivo dispositivoBanco = new Dispositivo();

        if (dispositivoBanco != null){
            dispositivoBanco.setNome(dispositivoRequest.getNome());
            dispositivoBanco.setDataAtualizacao(LocalDateTime.now());
            return ResponseEntity.ok(new DispositivoResponse(dispositivoBanco.getId(), "Nome do Dispositivo atualizado com Sucesso!"));
        }

        return ResponseEntity.notFound().build();

    }

    @PutMapping("{id}")
    public ResponseEntity<DispositivoResponse> AtualizarDispositivo(@PathVariable Long id, @RequestBody DispositivoRequest dispositivoRequest){

        Dispositivo dispositivoBanco = new Dispositivo();

        if (dispositivoBanco != null){

                dispositivoBanco.setNome(dispositivoRequest.getNome());
                dispositivoBanco.setCategoria(dispositivoRequest.getCategoria());
                dispositivoBanco.setStatus(dispositivoRequest.getStatus());
                dispositivoBanco.setConexao(dispositivoRequest.getConexao());
                dispositivoBanco.setConsumoWatts(dispositivoRequest.getConsumoWatts());
                dispositivoBanco.setDataAtualizacao(LocalDateTime.now());

            return ResponseEntity.ok(new DispositivoResponse(dispositivoBanco.getId(), "Dispositivo atualizado com Sucesso!"));
        }

        return ResponseEntity.notFound().build();

    }

    @DeleteMapping("{id}")
    public ResponseEntity<DispositivoResponse> DeletarDispositivo(@PathVariable Long id){

        Dispositivo dispositivoBanco = new Dispositivo();
            if (dispositivoBanco != null){
                    dispositivoBanco.setStatusDelete("D");
                return ResponseEntity.ok().build();
            }

            return ResponseEntity.notFound().build();
    }



}