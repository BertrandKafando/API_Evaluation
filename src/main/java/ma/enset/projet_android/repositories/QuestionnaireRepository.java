package ma.enset.projet_android.repositories;

import ma.enset.projet_android.entities.Questionnaire;
import org.apache.coyote.Response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire,Long> {

}
