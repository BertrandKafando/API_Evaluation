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
public class Questionnaire {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionnaireId;
    private String title;
    private String description;
    @OneToMany(mappedBy = "questionnaire")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    List<Question>questions=new ArrayList<>();
    @ManyToOne()
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Professeur professeur;
    @ManyToMany()
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    List<Etudiant>etudiants=new ArrayList<>();
}
