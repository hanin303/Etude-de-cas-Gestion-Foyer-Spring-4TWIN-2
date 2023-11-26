package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Chambre;

import java.util.Optional;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    @EntityGraph(attributePaths = "bloc")
    Optional<Chambre> findById(Long id);
}
