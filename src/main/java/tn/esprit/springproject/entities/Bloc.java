package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "chambre") // to avoid potential circular references
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;
    @ManyToOne
    @JsonIgnore
    private Foyer foyer;
    //relation Bidirec + mapped by
    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambre;

    public List<Chambre> getChambres() {
        return chambre;
    }
}
