package ma.enset.projet_android.web;

import ma.enset.projet_android.entities.Etudiant;
import ma.enset.projet_android.entities.Professeur;
import ma.enset.projet_android.repositories.ProfesseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfController {
    @Autowired
    private ProfesseurRepository professeurRepository;

    @GetMapping("/profs")
    public List<Professeur> professeurs(){
        return professeurRepository.findAll();
    }

    @GetMapping("/prof")
    public Professeur etudiant(@RequestParam(name = "q",defaultValue = "") String keyword){
        Professeur professeur = professeurRepository.findByUserNameContains(keyword);
        return professeur;
    }
}
