package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString

public class University implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversity;
    private String nomUniversity;
    private String adresse;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    //@JoinColumn(name = "foyer_id_foyer", referencedColumnName = "idFoyer")
    private Foyer foyer;
}
