package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private String numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    @OneToMany
    private List<Reservation> reservation;
    @ManyToOne
    @JoinColumn(name = "bloc_id_bloc")
    @JsonIgnore
    private Bloc bloc;
}
