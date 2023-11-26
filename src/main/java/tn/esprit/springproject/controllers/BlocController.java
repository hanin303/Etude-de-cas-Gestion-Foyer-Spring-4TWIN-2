package tn.esprit.springproject.controllers;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.TypeChambre;
import tn.esprit.springproject.services.BlocServiceImp;
import java.util.List;
import java.util.Set;
@RestController
@RequestMapping("/bloc")
@Tag(name="bloc" , description = "Operations related to Bloc")
@AllArgsConstructor
public class BlocController {
    //    @Autowired
    private BlocServiceImp blocServiceImp;
    @PostMapping("/add")
    public Bloc addFoyer(@RequestBody Bloc f) {
        return  blocServiceImp.addBloc(f);
    }
    @PutMapping("/update")
    public Bloc updateFoyer(@RequestBody Bloc f) {
        return  blocServiceImp.updateBloc(f);
    }

    @GetMapping("/getall")
    public List<Bloc> findAllFoyer() {
        return  blocServiceImp.findAllBloc();
    }
    @GetMapping("/get/{idF}")

    public Bloc findById(@PathVariable long idF) {
        return  blocServiceImp.findById(idF);
    }
    @DeleteMapping("/delete/{idF}")

    public void deleteFoyer(@PathVariable long idF) {
        blocServiceImp.deleteBloc(idF);
    }
    @GetMapping("/getblocbytypec/{typC}")

    public Set<Bloc> findBlocByTypeC( @PathVariable  TypeChambre typC){
        return blocServiceImp.findBlocByChambresType(typC);
    }
    //Récupérer la liste des chambres d'un bloc
    @GetMapping("/getChambres/{idBloc}")
    public List<Chambre> getChambresByBlocId(@PathVariable long idBloc) {
        Bloc bloc = blocServiceImp.findByIdWithChambres(idBloc);
        return bloc != null ? bloc.getChambres() : null;
    }
}
