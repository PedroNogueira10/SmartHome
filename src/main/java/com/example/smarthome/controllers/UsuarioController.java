package com.example.smarthome.controllers;

import com.example.smarthome.entidades.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Usuario> CadastrarUsuario(@RequestBody Usuario usuarioRequest){

        return ResponseEntity.ok(usuarioRequest);
    }




}