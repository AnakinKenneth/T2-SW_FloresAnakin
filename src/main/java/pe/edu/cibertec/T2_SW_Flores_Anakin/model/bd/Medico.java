package pe.edu.cibertec.T2_SW_Flores_Anakin.model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMedico;

    private String nomMedico;

    private String apeMedico;

    private String fechNacMedico;

}
