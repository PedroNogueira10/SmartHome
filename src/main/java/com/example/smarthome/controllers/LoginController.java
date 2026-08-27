package com.example.smarthome.controllers;

import DTO.LoginRequest;
import DTO.LoginResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")

public class LoginController {

    @PostMapping
    public ResponseEntity<LoginResponse> logar(@RequestBody LoginRequest LoginRequest){


        //consulta de usuario no banco

        if (LoginRequest.getLogin().equals("string") && LoginRequest.getSenha().equals("string")){

            LoginResponse loginResponse = new LoginResponse();

            loginResponse.setMensagem("Bem Vindo!");

            return ResponseEntity.ok(loginResponse);
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();

    }


}
