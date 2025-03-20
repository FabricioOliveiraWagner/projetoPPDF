
package br.com.ppdf.recrutamento.controller;
import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import br.com.ppdf.recrutamento.entity.AgendamentoVisita;
import br.com.ppdf.recrutamento.service.AgendamentoVisitaService;
import br.com.ppdf.recrutamento.service.UsuarioService;






@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private AgendamentoVisitaService agendamentoVisitaService;

@PostMapping("/login")
public ResponseEntity<?> login(@RequestBody Map<String, String> loginData) {
    String username = loginData.get("username");
    String password = loginData.get("password");

    try {
        // Assuming usuarioService has a method to validate user credentials
        boolean isValidUser = usuarioService.validateUser(username, password);
        if (isValidUser) {
            // Generate OAuth2 token
            String token = usuarioService.generateOAuth2Token(username);
            return ResponseEntity.ok(Collections.singletonMap("token", token));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
    }
}

    @PostMapping("/agendarVisita")
    public AgendamentoVisita agendarVisita(@RequestBody AgendamentoVisita visita) {

        return agendamentoVisitaService.criarAgendamentoVisita(visita);
    }
}