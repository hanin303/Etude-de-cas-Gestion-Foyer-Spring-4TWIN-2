package tn.esprit.springproject.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.Reservation;
import tn.esprit.springproject.services.EtudiantServiceImp;
import tn.esprit.springproject.services.FoyerServiceImp;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Etudiant")
@Tag(name = "etudiant" , description = "Operations related to Etudiant")

public class EtudiantController {
    @Autowired
    private EtudiantServiceImp etudiantServiceImp;

    //jeyin m spring data JPA
    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantServiceImp.addEtudiant(e);
    }

   @PutMapping("/updateEtudiant")
   public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        return etudiantServiceImp.updateEtudiant(e);
   }

    @GetMapping("/getAllE")
    public List<Etudiant> findAllEtudiant() {
        return etudiantServiceImp.findAllEtudiant();
    }

    @GetMapping("/getE/{idEtu}")
    public Etudiant findById(@PathVariable long idEtu) {
        return etudiantServiceImp.findById(idEtu);
    }

    @DeleteMapping("/deleteE/{idEtu}")
    public void deleteEtudiant(@PathVariable long idEtu) {
        etudiantServiceImp.deleteEtudiant(idEtu);
    }

    //Récupérer la liste des réservations d'un étudiant
    @GetMapping("/getReservations/{idEtu}")
    public List<Reservation> getReservationsForEtudiant(@PathVariable long idEtu) {
        return etudiantServiceImp.getReservationsForEtudiant(idEtu);
    }
    //Récupérer la liste des réservations par le nom d'un étudiant
    @GetMapping("/getReservationsByNomEtu/{nomEtu}")
    public List<Reservation> getReservationsByNomEtu(@PathVariable String nomEtu) {
        return etudiantServiceImp.getReservationsByNomEtu(nomEtu);
    }

    //Récupérer la liste des réservations des étudiants qui ont un nom qui commencent par "AB"
    @GetMapping("/getReservationsByNomStartingWith/{prefix}")
    public List<Reservation> getReservationsByNomStartingWith(@PathVariable String prefix) {
        return etudiantServiceImp.findReservationsByNomStartingWith(prefix);
    }
}
