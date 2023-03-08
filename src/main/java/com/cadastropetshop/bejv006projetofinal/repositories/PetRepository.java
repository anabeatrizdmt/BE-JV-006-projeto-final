package com.cadastropetshop.bejv006projetofinal.repositories;

import com.cadastropetshop.bejv006projetofinal.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

    List<Pet> findPetsByNomeDonoContaining(String nomeDono);

    List<Pet> findPetsByNumeroTelefoneDonoContaining(String numeroTelefoneDono);


}
