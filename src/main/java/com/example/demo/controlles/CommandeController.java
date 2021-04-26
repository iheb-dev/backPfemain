package com.example.demo.controlles;

import com.example.demo.entities.Client;
import com.example.demo.entities.Commande;
import com.example.demo.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/commande")
public class CommandeController {

    @Autowired
    CommandeService commandeService;

    @GetMapping("/all")
    public ResponseEntity<List<Commande>> getAllCommande(){
        List<Commande> commande = commandeService.findAllCommande();
        return new ResponseEntity<>(commande,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Commande> addCommande(  @RequestBody Commande commande){
        Commande newcommande = commandeService.addcommande(commande);
        return new ResponseEntity<>(newcommande , HttpStatus.CREATED);
    }

}
