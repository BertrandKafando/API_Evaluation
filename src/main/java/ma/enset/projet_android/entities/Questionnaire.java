package ma.enset.projet_android.entities;

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
    @OneToMany(mappedBy = "questionnaire",fetch = FetchType.EAGER)
    List<Question>questions=new ArrayList<>();
    @ManyToOne()
    private Professeur professeur;
    @ManyToMany()
    List<Etudiant>etudiants=new ArrayList<>();
}
