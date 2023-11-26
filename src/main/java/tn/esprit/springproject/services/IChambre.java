package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.Foyer;

import java.util.List;

public interface IChambre {
    public Chambre addChambre(Chambre c);

    public Chambre updateChambre(Chambre c);

    public List<Chambre> findAllChambre();

    public Chambre findById(long idChambre);

    public void deleteChambre(long idChambre);

    public Chambre findByIdWithBloc(long idChambre);
}
