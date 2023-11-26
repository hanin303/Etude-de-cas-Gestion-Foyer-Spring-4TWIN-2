package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Foyer;

public interface FoyerRepositoy extends JpaRepository<Foyer, Long> {

    public Foyer findByNomFoyer(String nomFoyer);
}
