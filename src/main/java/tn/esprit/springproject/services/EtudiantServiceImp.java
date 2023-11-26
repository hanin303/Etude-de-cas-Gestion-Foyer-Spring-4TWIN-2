package tn.esprit.springproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.entities.Reservation;
import tn.esprit.springproject.repositories.EtudiantRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EtudiantServiceImp implements IEtudiant {
    @Autowired

    private EtudiantRepository etudiantRepositoy;

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepositoy.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {

        return etudiantRepositoy.save(e);
    }

    @Override
    public List<Etudiant> findAllEtudiant() {
        return etudiantRepositoy.findAll();
    }

    @Override
    public Etudiant findById(long idEtu) {
        return etudiantRepositoy.findById(idEtu).orElse(null);
    }

    @Override
    public void deleteEtudiant(long idEtu) {
        etudiantRepositoy.deleteById(idEtu);
    }

    @Override
    public List<Reservation> getReservationsForEtudiant(long idEtud) {
        Etudiant etudiant = etudiantRepositoy.findById(idEtud).orElse(null);
        return etudiant != null ? etudiant.getReservations() : null;
    }

    @Override
    public List<Reservation> getReservationsByNomEtu(String nomEtu) {
        Optional<Etudiant> etudiantOptional = etudiantRepositoy.findByNomEtu(nomEtu);
        if (etudiantOptional.isPresent()) {
            Etudiant etudiant = etudiantOptional.get();
            return etudiant.getReservations();
        }
        return null;
    }

    public List<Reservation> findReservationsByNomStartingWith(String prefix) {
        List<Etudiant> etudiants = etudiantRepositoy.findByNomEtuStartingWith(prefix);
        List<Reservation> reservations = new ArrayList<>();
        for (Etudiant etudiant : etudiants) {
            reservations.addAll(etudiant.getReservations());
        }

        return reservations;
    }
}
