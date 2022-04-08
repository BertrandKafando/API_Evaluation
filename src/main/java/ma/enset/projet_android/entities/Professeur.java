package ma.enset.projet_android.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Professeur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @ManyToMany(mappedBy = "professeurs", fetch = FetchType.EAGER)
    List<Etudiant> etudiants = new ArrayList<>();
    @OneToMany(mappedBy = "professeur", fetch = FetchType.EAGER)
    List<Questionnaire> questionnaires = new ArrayList<>();
}
