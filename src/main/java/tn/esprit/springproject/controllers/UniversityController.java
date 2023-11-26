package tn.esprit.springproject.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.University;
import tn.esprit.springproject.services.FoyerServiceImp;
import tn.esprit.springproject.services.UniversityServiceImp;

import java.util.List;

@RestController
@RequestMapping("/University")
@Tag(name = "university", description = "Operations related to University")
@AllArgsConstructor
public class UniversityController {

    private UniversityServiceImp universityServiceImp;

    @PostMapping("/addUniversity")
    public  University addUniversity(@RequestBody University u) {
        return universityServiceImp.addUniversity(u);
    }

    @PutMapping("/updateUniversity")
    public University updateUniversity(@RequestBody University u) {
        return universityServiceImp.updateUniversity(u);
    }

    @GetMapping("/getAll")
    public List<University> findAllUniversity() {
        return universityServiceImp.findAllUniversity();
    }

    @GetMapping("/get/{idUniversity}")
    public University findById(@PathVariable long idUniversity) {
        return universityServiceImp.findById(idUniversity);
    }

    @DeleteMapping("/delete/{idUniversity}")
    public void deleteUniversity(@PathVariable long idUniversity) {
        universityServiceImp.deleteUniversity(idUniversity);
    }
    @PutMapping("/{idFoyer}/{nomUniversity}")
   public  University affecterFoyerAUniversity(@PathVariable("idFoyer") long idFoyer,
                                        @PathVariable("nomUniversity") String nomUniversity){
        return  universityServiceImp.affecterFoyerAUniversity(idFoyer,nomUniversity);
    }

    @PutMapping("/{idUniversity}")
    public University desaffecterFoyerAUniversity(@PathVariable("idUniversity") long idUniversity){
        return  universityServiceImp.desaffecterFoyerAUniversity(idUniversity);
    }
}
