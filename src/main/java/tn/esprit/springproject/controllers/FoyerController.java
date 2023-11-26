package tn.esprit.springproject.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.services.FoyerServiceImp;

import java.util.List;

@RestController
@RequestMapping("/Foyer")
@Tag(name = "foyer", description = "Operations related to Foyer")
public class FoyerController {
    //pour crer une instance ml service wost controller controller depend m service
    @Autowired
    private FoyerServiceImp foyerServiceImp;

    //jeyin spring data JPA
    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return foyerServiceImp.addFoyer(f);
    }

    @PutMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        return foyerServiceImp.updateFoyer(f);
    }

    @GetMapping("/getAll")
    public List<Foyer> findAllFoyer() {
        return foyerServiceImp.findAllFoyer();
    }

    @GetMapping("/get/{idF}")
    public Foyer findById(@PathVariable long idF) {
        return foyerServiceImp.findById(idF);
    }

    @DeleteMapping("/delete/{idF}")
    public void deleteFoyer(@PathVariable long idF) {
        foyerServiceImp.deleteFoyer(idF);
    }

    @GetMapping("/FoyerByNom/{nomFoyer}")
    public Foyer getFoyerByNom(@PathVariable String nomFoyer){
        return foyerServiceImp.getFoyerByNom(nomFoyer);
    }
}
