package ma.enset.projet_android.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Reponse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerId;
    private String answer;
    private boolean correct;
    @ManyToOne()
    private Question question;
}
