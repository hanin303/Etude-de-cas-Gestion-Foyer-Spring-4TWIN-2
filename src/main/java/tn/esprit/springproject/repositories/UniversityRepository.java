package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.University;

public interface UniversityRepository extends JpaRepository<University, Long> {
    University findByNomUniversity(String nomUniversity);

}
