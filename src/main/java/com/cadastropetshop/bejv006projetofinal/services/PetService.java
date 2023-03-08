package com.cadastropetshop.bejv006projetofinal.services;

import com.cadastropetshop.bejv006projetofinal.model.Pet;
import com.cadastropetshop.bejv006projetofinal.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }

    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    public List<Pet> findByNomeDonoContaining(String nomeDono) {
        return petRepository.findPetsByNomeDonoContaining(nomeDono);
    }

    public List<Pet> findByNumeroTelefoneDonoContaining(String numeroTelefoneDono) {
        return petRepository.findPetsByNumeroTelefoneDonoContaining(numeroTelefoneDono);
    }

}
