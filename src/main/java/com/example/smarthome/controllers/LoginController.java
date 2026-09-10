package com.example.smarthome.controllers;

import DTO.LoginRequest;
import DTO.LoginResponse;
import com.example.smarthome.entidades.Usuario;
import com.example.smarthome.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")

public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<LoginResponse> logar(@RequestBody LoginRequest loginRequest){

        //Usuario usuarioBanco = usuarioRepository.findAll();



        //consulta de usuario no banco

        if (usuarioRepository.existsUsuarioByCpfAndSenha(loginRequest.getLogin(), loginRequest.getSenha()) ){

            LoginResponse loginResponse = new LoginResponse();

            loginResponse.setMensagem("Bem Vindo!");

            return ResponseEntity.ok(loginResponse);
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();

    }


}
