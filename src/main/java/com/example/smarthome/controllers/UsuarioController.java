package com.example.smarthome.controllers;

import DTO.AtualizaStatusUsuarioRequest;
import DTO.UsuarioRequest;
import DTO.UsuarioResponse;
import com.example.smarthome.entidades.Usuario;
import com.example.smarthome.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> ConsultaUsuario(){
        return usuarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> ConsultaUsuarioPorId(@PathVariable Long id){
        var usuario = usuarioRepository.findById(id).orElse(null);

        if (usuario == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(usuario);

    }

    @GetMapping("/empresa/{empresaId}")
    public String ConsultaUsuarioPorEmpresa(@PathVariable Long empresaId){
        return "Consultou o Usuário pela Empresa <" + empresaId + ">";
    }

    @PostMapping
    public ResponseEntity<UsuarioResponse> CadastrarUsuario(@RequestBody UsuarioRequest usuarioRequest){

        Usuario usuarioBanco = new Usuario();

        usuarioBanco.setNome(usuarioRequest.getNome());
        usuarioBanco.setCpf(usuarioRequest.getCpf());
        usuarioBanco.setDataNascimento(usuarioRequest.getDataNascimento());

        usuarioBanco.setDataCadastro(LocalDateTime.now());
        usuarioBanco.setStatus("A");
        usuarioBanco.setSenha(usuarioRequest.getSenha());

        //Salvando no banco

        usuarioRepository.save(usuarioBanco);

        return ResponseEntity.ok(new UsuarioResponse(usuarioBanco.getId(), "Usuário Cadastrado com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioResponse>
    AtualizarUsuario(@PathVariable Long id, @RequestBody UsuarioRequest usuarioRequest){

        //consulta no banco
        Usuario usuarioBanco = usuarioRepository.findById(id).orElse(null);


        if (usuarioBanco != null){
            usuarioBanco.setNome(usuarioRequest.getNome());
            usuarioBanco.setCpf(usuarioRequest.getCpf());
            usuarioBanco.setDataNascimento(usuarioRequest.getDataNascimento());

            usuarioBanco.setDataAtualizacao(LocalDateTime.now());
            usuarioBanco.setSenha(usuarioRequest.getSenha());

            usuarioRepository.save(usuarioBanco);
            return ResponseEntity.ok(new UsuarioResponse(usuarioBanco.getId(), "Usuário atualizado Com Sucesso"));
        }

        return ResponseEntity.notFound().build();


    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<UsuarioResponse>
    AtualizarStatus(@PathVariable Long id, @RequestBody AtualizaStatusUsuarioRequest usuarioRequest){

        //consulta no banco
        Usuario usuarioBanco = usuarioRepository.findById(id).orElse(null);


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
        Usuario usuarioBanco = usuarioRepository.findById(id).orElse(null);


        if (usuarioBanco != null){

            usuarioBanco.setStatus("A");
            usuarioRepository.save(usuarioBanco);

            return ResponseEntity.ok().build();


        }

        return ResponseEntity.notFound().build();


    }


}