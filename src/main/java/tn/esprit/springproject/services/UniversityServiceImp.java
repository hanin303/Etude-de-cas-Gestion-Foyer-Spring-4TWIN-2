package tn.esprit.springproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.University;
import tn.esprit.springproject.repositories.FoyerRepositoy;
import tn.esprit.springproject.repositories.UniversityRepository;

import java.util.List;

@Service
public class UniversityServiceImp  implements IUniversity{
    @Autowired
    private UniversityRepository universityRepository;
    @Autowired
    private FoyerRepositoy foyerRepositoy;

    @Override
    public University addUniversity(University u) {
        return universityRepository.save(u);
    }

    @Override
    public University updateUniversity(University u) {
        return universityRepository.save(u);
    }

    @Override
    public List<University> findAllUniversity() {
        return universityRepository.findAll();
    }

    @Override
    public University findById(long idUniversity) {
        return universityRepository.findById(idUniversity).orElse(null);
    }

    @Override
    public void deleteUniversity(long idUniversity) {
        universityRepository.deleteById(idUniversity);
    }

    @Override
    public University affecterFoyerAUniversity(long idFoyer, String nomUniversity) {
        Foyer foyer = foyerRepositoy.findById(idFoyer).get();
        University university = universityRepository.findByNomUniversity(nomUniversity);
        university.setFoyer(foyer);
        universityRepository.save(university);

        return university;
    }

    @Override
    public University desaffecterFoyerAUniversity(long idUniversity) {
        University university = universityRepository.findById(idUniversity).get();
        university.setFoyer(null);
        universityRepository.save(university);
        return university;
    }
}
