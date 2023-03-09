package com.cadastropetshop.bejv006projetofinal.services;

import com.cadastropetshop.bejv006projetofinal.model.Pet;
import com.cadastropetshop.bejv006projetofinal.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
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

    public List<Pet> queryByNomeDono(String nomeDono) {
        return petRepository.queryByNomeDono(nomeDono);
    }
    public List<Pet> findByNomeDonoContaining(String nomeDono) {
        return petRepository.findPetsByNomeDonoContaining(nomeDono);
    }

    public List<Pet> findByNumeroTelefoneDonoContaining(String numeroTelefoneDono) {
        return petRepository.findPetsByNumeroTelefoneDonoContaining(numeroTelefoneDono);
    }

    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }

}
