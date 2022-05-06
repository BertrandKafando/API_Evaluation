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
public class Etudiant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long etudiantId;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    @ManyToMany()
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    List <Professeur> professeurs = new ArrayList<>();
    @ManyToMany(mappedBy = "etudiants", fetch = FetchType.EAGER)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    List<Questionnaire> questionnaires = new ArrayList<>();
}
