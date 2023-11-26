package tn.esprit.springproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Reservation;
import tn.esprit.springproject.repositories.ReservationRepository;

import java.util.List;

@Service
public class ReservationServiceImp  implements IReservation{
    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation R) {
        return reservationRepository.save(R);
    }

    @Override
    public Reservation updateReservation(Reservation R) {
        return reservationRepository.save(R);
    }

    @Override
    public List<Reservation> findAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation findById(long idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }

    @Override
    public void deleteReservation(long idReservation) {
        reservationRepository.deleteById(idReservation);
    }
}
