package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.TypeChambre;

import java.util.List;
import java.util.Set;

public interface IBloc {
    public Bloc addBloc(Bloc b);
    public Bloc updateBloc(Bloc b);
    public List<Bloc> findAllBloc();
    public Bloc findById(long idB);
    public void deleteBloc(long idB);
    public Bloc updateBloc(long idb ,String nomBloc) ;
    public Set<Bloc> findBlocByChambresType(TypeChambre typeC);
    public Bloc findByIdWithChambres(long idB);
}
