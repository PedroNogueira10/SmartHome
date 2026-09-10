package com.example.smarthome.controllers;

import DTO.ComodoRequest;
import DTO.ComodoResponse;
import com.example.smarthome.entidades.Comodo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/comodos")

public class ComodoController {

    @GetMapping
    public String ConsultaPorComodo(){
        return """
                Quarto
                Banheiro
                Cozinha
                Sala
                """;
    }


    @GetMapping("/casas/{casaId}")
    public String ConsultaComodoPorCasa(@PathVariable Long casaId){
        return String.format("""
                            Quarto da Casa %d
                            Banheiro da Casa %d
                            Cozinha da Casa %d
                            Sala da Casa %d
                            """, casaId, casaId, casaId, casaId);
    }


    @PostMapping
    public ResponseEntity<ComodoResponse> CadastrarComodo(@RequestBody ComodoRequest comodoRequest){
        Comodo comodoBanco = new Comodo();

        comodoBanco.setId(1L);
        comodoBanco.setNome(comodoRequest.getNome());
        comodoBanco.setCategoria(comodoRequest.getCategoria());


        return ResponseEntity.ok(new ComodoResponse(comodoBanco.getId(), "Cômodo Cadastrado com Sucesso!"));
    }

    @PatchMapping("/{id}/categoria")
    public ResponseEntity<ComodoResponse> AtualizarCategoriaDoComodo(@PathVariable Long id, @RequestBody ComodoRequest comodoRequest){

        Comodo comodoBanco = new Comodo();

        if (comodoBanco != null){
                comodoBanco.setCategoria(comodoBanco.getCategoria());
            return ResponseEntity.ok(new ComodoResponse(comodoBanco.getId(), "Categoria do Cômodo atualizada com Sucesso!"));
        }

        return ResponseEntity.notFound().build();

    }

    @PutMapping("/{id}")
    public ResponseEntity<ComodoResponse> AtualizarComodo(@PathVariable Long id, ComodoRequest comodoRequest){

        Comodo comodoBanco = new Comodo();

        if (comodoBanco != null) {
            comodoBanco.setNome(comodoRequest.getNome());
            comodoBanco.setCategoria(comodoRequest.getCategoria());
            comodoBanco.setDataAtualizacao(LocalDateTime.now());

            return ResponseEntity.ok(new ComodoResponse(comodoBanco.getId(), "Cômodo atualizado com Sucesso!"));
        }

        return ResponseEntity.notFound().build();

    }
}
