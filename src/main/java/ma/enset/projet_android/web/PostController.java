package ma.enset.projet_android.web;

import lombok.AllArgsConstructor;
import ma.enset.projet_android.entities.Etudiant;
import ma.enset.projet_android.repositories.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class PostController {
    EtudiantRepository etudiantRepository;
    ProfesseurRepository professeurRepository;
    QuestionnaireRepository questionnaireRepository;
    QuestionRepository questionRepository;
    ReponseRepository reponseRepository;

    @PostMapping(path = "/etudiant")
    void add(Model model, @RequestBody Etudiant etudiant){
        if(etudiant!=null){
            etudiantRepository.save(etudiant);
        }
    }

    @GetMapping("/etudiant")
    public Etudiant etudiant(@RequestParam(name = "q",defaultValue = "") String keyword){
        Etudiant etudiant = etudiantRepository.findByUserNameContains(keyword);
        return etudiant;
    }
}
