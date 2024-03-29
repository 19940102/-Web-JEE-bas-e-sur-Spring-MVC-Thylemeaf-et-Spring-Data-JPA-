package ou.net.hopital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ou.net.hopital.entities.Patient;
import ou.net.hopital.repository.PatientRepository;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication  implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);}

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null,"Mohamed",new Date(),false,14));
        patientRepository.save(new Patient(null,"Chaimaa",new Date(),false,44));
        patientRepository.save(new Patient(null,"Mouna",new Date(),false,21));

    }
}



