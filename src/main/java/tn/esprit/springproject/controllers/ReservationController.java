package tn.esprit.springproject.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Reservation;
import tn.esprit.springproject.services.ReservationServiceImp;

import java.util.List;

@RestController
@RequestMapping("/Reservation")
@Tag(name = "reservation", description = "Operations related to Reservation")
public class ReservationController {
    @Autowired
    private ReservationServiceImp reservationServiceImp;
    @PostMapping("/add")
    public Reservation addReservation(@RequestBody Reservation r) {
        return  reservationServiceImp.addReservation(r);
    }
    @PutMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation r) {
        return  reservationServiceImp.updateReservation(r);
    }
    @GetMapping("/getall")
    public List<Reservation> findAllReservation() {
        return  reservationServiceImp.findAllReservation();
    }
    @GetMapping("/get/{idReservation}")

    public Reservation findById(@PathVariable long idReservation) {
        return  reservationServiceImp.findById(idReservation);
    }
    @DeleteMapping("/delete/{idReservation}")

    public void deleteReservation(@PathVariable long idReservation) {
        reservationServiceImp.deleteReservation(idReservation);
    }
}
