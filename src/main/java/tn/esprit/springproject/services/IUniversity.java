package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.University;

import java.util.List;
import java.util.Map;

public interface IUniversity {
    public University addUniversity(University u);

    public University updateUniversity(University u);

    public List<University> findAllUniversity();

    public University findById(long idUniversity);

    public void deleteUniversity(long idUniversity);
    public University affecterFoyerAUniversity(long idFoyer, String nomUniversity);
    public University desaffecterFoyerAUniversity(long idUniversity) ;

    public University getByNomUniversity(String nomUniversity);
    public University getUniversityByNomFoyer(String nomFoyer);
    List<University> getByAdresse(String adresse);

    Long getNombreTotalChambresByNomUniversity(String nomUniversity);
    List<String> findFoyersWithoutUniversity();

    List<University> getByNombreMinChambres(int nombreMinChambres) ;

    Map<String, Long> getNombreTotalChambresForAllUniversities();

}
