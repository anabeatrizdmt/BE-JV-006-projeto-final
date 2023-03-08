package com.cadastropetshop.bejv006projetofinal.controller;

import com.cadastropetshop.bejv006projetofinal.model.Pet;
import com.cadastropetshop.bejv006projetofinal.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @PostMapping("/create")
    public Pet save(@RequestBody Pet pet) {
        return petService.save(pet);
    }

    @GetMapping("/findAll")
    public List<Pet> findAll() {
        return petService.findAll();
    }

    @GetMapping("/listaPorNomeDono/{nomeDono}")
    public List<Pet> findByNomeDonoContaining (@PathVariable String nomeDono) {
        return petService.findByNomeDonoContaining(nomeDono);
    }

    @GetMapping("/listaPorNumeroTelefoneDono/{numeroTelefoneDono}")
    public List<Pet> findByNumeroTelefoneDonoContaining (@PathVariable String numeroTelefoneDono) {
        return petService.findByNumeroTelefoneDonoContaining(numeroTelefoneDono);
    }

}
