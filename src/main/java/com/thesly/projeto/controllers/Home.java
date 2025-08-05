package com.thesly.projeto.controllers;

import com.thesly.projeto.models.Products;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    private Products products= new Products("Arroz","Brejeiro",4,12);

    @GetMapping
    public String home(){
        return "Hola mundo";
    }

    @GetMapping("/produtos")
    public Products produtos(){
      return  products;
    }
}
