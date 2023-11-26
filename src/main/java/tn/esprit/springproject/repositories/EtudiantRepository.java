package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.Reservation;

import java.util.List;
import java.util.Optional;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    Optional<Etudiant> findByNomEtu(String nomEtu);
    List<Etudiant> findByNomEtuStartingWith(String prefix);

}
