package ma.enset.projet_android.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @ManyToMany(mappedBy = "professeurs")
     @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    List<Etudiant> etudiants = new ArrayList<>();
    @OneToMany(mappedBy = "professeur", fetch = FetchType.EAGER)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    List<Questionnaire> questionnaires = new ArrayList<>();
}
