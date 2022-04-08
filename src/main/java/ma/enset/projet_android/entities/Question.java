package ma.enset.projet_android.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Question {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;
    private String title;
    private int score;
    @OneToMany(mappedBy = "question",fetch = FetchType.EAGER)
    List<Reponse>reponses=new ArrayList<>();
    @ManyToOne()
    private Questionnaire questionnaire;
}
