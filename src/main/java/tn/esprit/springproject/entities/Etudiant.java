package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtu;
    private long cin;
    private String nomEtu;
    private String prenomEtu;
    private String ecole;

    @Temporal(TemporalType.DATE)
    private Date datenaissance;
    @ManyToMany(mappedBy = "etudiants")
    @JsonIgnore
    private List<Reservation> reservations;
}
