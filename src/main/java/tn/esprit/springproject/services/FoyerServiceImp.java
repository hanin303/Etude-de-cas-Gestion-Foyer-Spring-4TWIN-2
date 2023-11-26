package tn.esprit.springproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.repositories.FoyerRepositoy;

import java.util.List;

@Service
public class FoyerServiceImp implements IFoyer {
    @Autowired
    private FoyerRepositoy foyerRepositoy;

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepositoy.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepositoy.save(f);
    }

    @Override
    public List<Foyer> findAllFoyer() {
        return foyerRepositoy.findAll();
    }

    @Override
    public Foyer findById(long idF) {
        return foyerRepositoy.findById(idF).orElse(null);
    }

    @Override
    public void deleteFoyer(long idF) {
        foyerRepositoy.deleteById(idF);
    }

    public Foyer getFoyerByNom(String nomFoyer){
        return foyerRepositoy.findByNomFoyer(nomFoyer);
    }
}
