package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrdiniController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test-ordine")
    public String creaOrdine() {
        // IMPORTANTE: Qui usi il NOME che vedi nella dashboard di Eureka (tutto maiuscolo di solito non importa, ma il nome deve coincidere)
        // Se nel primo servizio non hai cambiato nome ed è rimasto EUREKASERVICE, usa quello.
        // Se lo hai rinominato in 'servizio-prodotti', usa quello.
        String nomeServizioProdotti = "http://EUREKASERVICE";
        // Oppure "http://servizio-prodotti" se l'hai rinominato

        // Chiamiamo l'altro servizio
        String risposta = restTemplate.getForObject(nomeServizioProdotti + "/api/prodotti", String.class);

        return "Ho chiamato il servizio prodotti e mi ha risposto: " + risposta;
    }
}