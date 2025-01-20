package com.example.microservice_commandes.controller;

import com.example.microservice_commandes.entity.Commande;
import com.example.microservice_commandes.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Commande")
public class CommandeController {
    @Autowired
    private CommandeRepository repository;

    @GetMapping
    public List<Commande> getAllCommandes() {
        return repository.findAll();
    }

    @PostMapping
    public Commande createCommande(@RequestBody Commande commande) {
        return repository.save(commande);
    }

    // Autres méthodes pour PUT, DELETE, etc.
}
