package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneUniversitaire;
    private Boolean estValide;
    @ManyToMany
    @JsonIgnore
    private List<Etudiant> etudiants;
}
