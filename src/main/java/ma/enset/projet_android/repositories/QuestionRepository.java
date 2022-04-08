package ma.enset.projet_android.repositories;

import ma.enset.projet_android.entities.Question;
import org.apache.coyote.Response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Long> {
}
