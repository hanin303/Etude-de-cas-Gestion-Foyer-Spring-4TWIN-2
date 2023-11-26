package tn.esprit.springproject.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.services.ChambreServiceImp;
import tn.esprit.springproject.services.FoyerServiceImp;

import java.util.List;

@RestController
@RequestMapping("/Chambre")
@Tag(name="chambre" , description = "Operations related to Chambre")
@AllArgsConstructor
public class ChambreController {
    private ChambreServiceImp chambreServiceImp;

    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        return chambreServiceImp.addChambre(c);
    }

    @PutMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre c) {
        return chambreServiceImp.updateChambre(c);
    }

    @GetMapping("/getAll")
    public List<Chambre> findAllChambre() {
        return chambreServiceImp.findAllChambre();
    }

    @GetMapping("/get/{idChambre}")
    public Chambre findById(@PathVariable long idChambre) {
        return chambreServiceImp.findById(idChambre);
    }

    @DeleteMapping("/delete/{idChambre}")
    public void deleteFoyer(@PathVariable long idChambre) {
        chambreServiceImp.deleteChambre(idChambre);
    }

    //Récupérer le bloc d'une chambre
    @GetMapping("/getBloc/{idChambre}")
    public Bloc getBlocOfChambre(@PathVariable long idChambre) {
        Chambre chambre = chambreServiceImp.findByIdWithBloc(idChambre);
        return chambre != null ? chambre.getBloc() : null;
    }
}
