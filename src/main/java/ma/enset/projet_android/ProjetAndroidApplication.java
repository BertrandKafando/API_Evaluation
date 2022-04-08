package ma.enset.projet_android;

import ma.enset.projet_android.entities.*;
import ma.enset.projet_android.repositories.*;
import org.apache.coyote.Response;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProjetAndroidApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetAndroidApplication.class, args);
    }
@Bean
    CommandLineRunner commandLineRunner(EtudiantRepository etudiantRepository,
                                        ProfesseurRepository professeurRepository,
                                        QuestionnaireRepository questionnaireRepository,
                                        QuestionRepository questionRepository,
                                        ReponseRepository reponseRepository){
      return args -> {
          Reponse rep=new Reponse();
                    rep.setAnswer("le travail est dur");
                    rep.setCorrect(true);
                reponseRepository.save(rep);

            List<Reponse>reponses=new ArrayList<>();
            reponses.add(rep);

          Question question=new Question();
                    question.setTitle("Q1");
                    question.setScore(5);
                    question.setReponses(reponses);

                    questionRepository.save(question);
            List<Question>questions=new ArrayList<>();
            questions.add(question);

          Etudiant etudiant=new Etudiant();
                    etudiant.setFirstName("assmi");
                    etudiant.setEmail("dddl@gmail");
            etudiantRepository.save(etudiant);

            List<Etudiant>etudiants=new ArrayList<>();
            etudiants.add(etudiant);

          Professeur professeur =new Professeur() ;
          professeur.setFirstName("KAFAND0");
          professeur.setEmail("kaf@gmail");
          professeur.setEtudiants(etudiants);
          professeurRepository.save(professeur);

          Questionnaire questionnaire=new Questionnaire();
                        questionnaire.setTitle("informatique 2");
                        questionnaire.setQuestions(questions);
                        questionnaire.setProfesseur(professeur);

                        questionnaireRepository.save(questionnaire);


      }  ;
    }
}
