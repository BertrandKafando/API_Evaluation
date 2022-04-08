package ma.enset.projet_android.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data @AllArgsConstructor @NoArgsConstructor
public class Questionnaire {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionnaireId;
    private String title;
    private String description;
}
