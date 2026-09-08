package com.example.smarthome.controllers;

import DTO.RotinaRequest;
import DTO.RotinaResponse;
import com.example.smarthome.entidades.Rotina;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rotinas")
public class RotinaController {

    @GetMapping
    public String consultaPorRotina(){
        return "Consultou Rotinas!";
    }
    @GetMapping("/comodos/{comodoId}")
    public String consultaRotinaPorComodo(@PathVariable Long comodoId){
        return "Consultou Rotina do Cômodo <%d>".formatted(comodoId);
    }

    @PostMapping
    public ResponseEntity<RotinaResponse> CadastrarRotina(@RequestBody RotinaRequest rotinaRequest){
        Rotina rotinaBanco = new Rotina();

        rotinaBanco.setId(1L);
        rotinaBanco.setNome(rotinaRequest.getNome());
        rotinaBanco.setComodo(rotinaRequest.getComodo());
        rotinaBanco.setStatus(rotinaRequest.getStatus());

        return ResponseEntity.ok(new RotinaResponse(rotinaBanco.getId(), "Rotina Cadastrada com Sucesso!"));
    }

}
