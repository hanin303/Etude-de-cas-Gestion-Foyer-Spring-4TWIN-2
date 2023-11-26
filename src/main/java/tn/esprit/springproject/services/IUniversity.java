package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.University;

import java.util.List;

public interface IUniversity {
    public University addUniversity(University u);

    public University updateUniversity(University u);

    public List<University> findAllUniversity();

    public University findById(long idUniversity);

    public void deleteUniversity(long idUniversity);
    public University affecterFoyerAUniversity(long idFoyer, String nomUniversity);
    public University desaffecterFoyerAUniversity(long idUniversity) ;
}
