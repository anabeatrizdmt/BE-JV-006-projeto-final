package com.cadastropetshop.bejv006projetofinal.controllers;

import com.cadastropetshop.bejv006projetofinal.model.Pet;
import com.cadastropetshop.bejv006projetofinal.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/pets")
public class PetRestController {

    @Autowired
    private PetService petService;

    @PostMapping("/adicionar")
    public Pet save(@RequestBody Pet pet) {
        return petService.save(pet);
    }

    @GetMapping("/listarTodos")
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

    @GetMapping("/{id}")
    public Pet findById(@PathVariable Long id){
        return petService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        petService.deleteById(id);
    }

    @PostMapping("/editar")
    public ResponseEntity<?> update(@RequestParam Long id, @RequestBody Pet pet){

        if (pet.getNome() == null){
            System.out.println("O nome não pode ser nulo!");
            return ResponseEntity.badRequest().body("O nome não pode ser nulo!");
        }

        pet.setId(id);

        try {
            petService.save(pet);
        } catch (RuntimeException e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

        return ResponseEntity.ok(pet);

    }

}
