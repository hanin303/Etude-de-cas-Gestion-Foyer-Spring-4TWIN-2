package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.TypeChambre;

import java.util.Optional;
import java.util.Set;

public interface BlocRepository extends JpaRepository<Bloc,Long>{
    public Set<Bloc> findBlocByChambreTypeC(TypeChambre typeC);
    Optional<Bloc> findChambreByIdBloc(Long id);

}