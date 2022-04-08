package ma.enset.projet_android;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetAndroidApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetAndroidApplication.class, args);
    }
@Bean
    CommandLineRunner commandLineRunner(){
      return args -> {

      }  ;
    }
}
