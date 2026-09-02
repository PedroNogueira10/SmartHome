package com.example.smarthome.controllers;

import DTO.AtualizaStatusUsuarioRequest;
import DTO.UsuarioRequest;
import DTO.UsuarioResponse;
import com.example.smarthome.entidades.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping
    public String ConsultaUsuario(){
        return "Consultou o Usuário";
    }
    @GetMapping("/empresa/{empresaId}")
    public String ConsultaUsuarioPorEmpresa(@PathVariable Long empresaId){
        return "Consultou o Usuário pela Empresa <" + empresaId + ">";
    }

    @PostMapping
    public ResponseEntity<UsuarioResponse> CadastrarUsuario(@RequestBody UsuarioRequest usuarioRequest){

        Usuario usuarioBanco = new Usuario();

        usuarioBanco.setNome(usuarioRequest.getNome());
        usuarioBanco.setCPF(usuarioRequest.getCPF());
        usuarioBanco.setDataNascimento(usuarioRequest.getNome());

        usuarioBanco.setDataCadastro(LocalDateTime.now());
        usuarioBanco.setStatus("A");

        return ResponseEntity.ok(new UsuarioResponse(usuarioBanco.getId(), "Usuário Cadastrado com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioResponse>
    AtualizarUsuario(@PathVariable Long id, @RequestBody UsuarioRequest usuarioRequest){

        //consulta no banco
        Usuario usuarioBanco = new Usuario();


        if (usuarioBanco != null){
            usuarioBanco.setNome(usuarioRequest.getNome());
            usuarioBanco.setCPF(usuarioRequest.getNome());
            usuarioBanco.setDataNascimento(usuarioRequest.getNome());

            usuarioBanco.setDataAtualizacao(LocalDateTime.now());
            return ResponseEntity.ok(new UsuarioResponse(usuarioBanco.getId(), "Cadastro Com Sucesso"));
        }

        return ResponseEntity.notFound().build();


    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<UsuarioResponse>
    AtualizarStatus(@PathVariable Long id, @RequestBody AtualizaStatusUsuarioRequest usuarioRequest){

        //consulta no banco
        Usuario usuarioBanco = new Usuario();


        if (usuarioBanco != null){

            usuarioBanco.setStatus(usuarioRequest.getStatus());


            return ResponseEntity.ok(new UsuarioResponse(usuarioBanco.getId(), "Cadastro Com Sucesso"));
        }

        return ResponseEntity.notFound().build();


    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UsuarioResponse>
    AtualizarStatus(@PathVariable Long id){

        //consulta no banco
        Usuario usuarioBanco = new Usuario();


        if (usuarioBanco != null){

            usuarioBanco.setStatus("D");


            return ResponseEntity.ok().build();
        }

        return ResponseEntity.notFound().build();


    }


}