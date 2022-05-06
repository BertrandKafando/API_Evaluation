package ma.enset.projet_android.repositories;

import ma.enset.projet_android.entities.Etudiant;
import ma.enset.projet_android.entities.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesseurRepository extends JpaRepository<Professeur, Long> {
    Professeur findByUserNameContains(String username);

}
