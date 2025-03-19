package br.com.ppdf.recrutamento.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitaController{

    @GetMapping("/")
    public String home() {
        return "Hello, Home!";
    }
    

}