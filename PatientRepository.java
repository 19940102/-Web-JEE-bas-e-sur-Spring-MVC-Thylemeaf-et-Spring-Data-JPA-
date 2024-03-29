package ou.net.hopital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ou.net.hopital.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long>{

}

