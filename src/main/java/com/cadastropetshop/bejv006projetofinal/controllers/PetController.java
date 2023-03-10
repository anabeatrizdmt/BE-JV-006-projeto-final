package com.cadastropetshop.bejv006projetofinal.controllers;

import com.cadastropetshop.bejv006projetofinal.model.Pet;
import com.cadastropetshop.bejv006projetofinal.services.PetService;
import com.cadastropetshop.bejv006projetofinal.utils.Sexo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;


@Controller
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/pets")
    public String getAllPets(Model model){
        List<Pet> pets = petService.findAll();
        model.addAttribute("pets", pets);
        return "pets";
    }

    @PostMapping("/pets")
    public String addPet(@RequestParam("nome") String nome,
                         @RequestParam("dataNascimento") LocalDate dataNascimento,
                         @RequestParam("especie") String especie,
                         @RequestParam("raca") String raca,
                         @RequestParam("cor") String cor,
                         @RequestParam("sexo") Sexo sexo,
                         @RequestParam("nomeDono") String nomeDono,
                         @RequestParam("dddTelefoneDono") String dddTelefoneDono,
                         @RequestParam("numeroTelefoneDono") String numeroTelefoneDono){
        Pet pet = new Pet();
        pet.setNome(nome);
        pet.setDataNascimento(dataNascimento);
        pet.setEspecie(especie);
        pet.setRaca(raca);
        pet.setCor(cor);
        pet.setSexo(sexo);
        pet.setNomeDono(nomeDono);
        pet.setDddTelefoneDono(dddTelefoneDono);
        pet.setNumeroTelefoneDono(numeroTelefoneDono);
        petService.save(pet);

        return "redirect:pets";
    }

    @GetMapping("add-pets")
    public String createPet(){
        return "add-pets";
    }

    @PostMapping("/delete/{id}")
    public String deletePet(@PathVariable("id") Long id) {
        petService.deleteById(id);
        return "redirect:/pets/pets";
    }

    @PostMapping("/search")
    public String searchFor(@RequestParam("nomeDono") String nomeDono, Model model) {
        List<Pet> pets = petService.queryByNomeDono(nomeDono);
        model.addAttribute("pets", pets);
        return "pets";
    }
}
