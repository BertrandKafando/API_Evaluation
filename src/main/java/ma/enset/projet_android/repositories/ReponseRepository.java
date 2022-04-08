package ma.enset.projet_android.repositories;

import ma.enset.projet_android.entities.Reponse;
import org.apache.coyote.Response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReponseRepository extends JpaRepository<Reponse,Long> {
}
