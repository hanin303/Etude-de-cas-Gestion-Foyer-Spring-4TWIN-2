package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Reservation;

import java.util.List;

public interface IReservation {
    public Reservation addReservation(Reservation R);
    public Reservation updateReservation(Reservation R);
    public List<Reservation> findAllReservation();
    public Reservation findById(long idReservation);
    public void deleteReservation(long idReservation);
}
