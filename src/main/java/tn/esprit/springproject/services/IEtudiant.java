package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.Reservation;

import java.util.List;

public interface IEtudiant {
    public Etudiant addEtudiant(Etudiant e);

    public Etudiant updateEtudiant(Etudiant e);

    public List<Etudiant> findAllEtudiant();

    public Etudiant findById(long idEtu);

    public void deleteEtudiant(long idEtu);

    public  List<Reservation> getReservationsForEtudiant(long idEtu);

    public  List<Reservation> getReservationsByNomEtu(String nomEtu);
    public  List<Reservation> findReservationsByNomStartingWith(String prefix);

}
