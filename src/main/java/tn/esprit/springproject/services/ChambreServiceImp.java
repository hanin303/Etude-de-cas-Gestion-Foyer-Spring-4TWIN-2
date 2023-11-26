package tn.esprit.springproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.repositories.ChambreRepository;

import java.util.List;

@Service
public class ChambreServiceImp implements IChambre{
    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> findAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findById(long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public void deleteChambre(long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public Chambre findByIdWithBloc(long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

}
