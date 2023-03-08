package com.cadastropetshop.bejv006projetofinal.repositories;

import com.cadastropetshop.bejv006projetofinal.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

    Pet findByNomeDono(String nomeDono);

}
