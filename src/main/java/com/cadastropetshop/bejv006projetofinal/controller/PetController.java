package com.cadastropetshop.bejv006projetofinal.controller;

import com.cadastropetshop.bejv006projetofinal.model.Pet;
import com.cadastropetshop.bejv006projetofinal.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @PostMapping("/create")
    public Pet save(@RequestBody Pet pet) {
        return petService.save(pet);
    }
}
