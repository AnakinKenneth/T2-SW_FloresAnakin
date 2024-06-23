package pe.edu.cibertec.T2_SW_Flores_Anakin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.T2_SW_Flores_Anakin.model.bd.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>  {
}
