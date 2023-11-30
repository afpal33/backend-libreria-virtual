package ucb.edu.bo.virtlib.backend.repository;
import org.apache.tomcat.jni.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import ucb.edu.bo.virtlib.backend.model.LibreriaModel;

public interface LibreriaRepository extends JpaRepository<LibreriaModel, Long>{
}
