package tn.esprit.springproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.TypeChambre;
import tn.esprit.springproject.repositories.BlocRepository;

import java.util.List;
import java.util.Set;

@Service
public class BlocServiceImp implements IBloc{
    @Autowired
    private BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(long idb, String nomBloc) {
        Bloc b = blocRepository.findById(idb).orElse(null);
        b.setNomBloc(nomBloc);
        return blocRepository.save(b);
    }

    @Override
    public Set<Bloc> findBlocByChambresType(TypeChambre typeC) {
        return blocRepository.findBlocByChambreTypeC(typeC);
    }

    @Override
    public List<Bloc> findAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findById(long idB) {
        return blocRepository.findById(idB).orElse(null);
    }

    @Override
    public void deleteBloc(long idB) {
        blocRepository.deleteById(idB);

    }
    @Override
    public Bloc findByIdWithChambres(long idB) {
        return blocRepository.findChambreByIdBloc(idB).orElse(null);
    }
}
