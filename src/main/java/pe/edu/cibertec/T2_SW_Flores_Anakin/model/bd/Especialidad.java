package pe.edu.cibertec.T2_SW_Flores_Anakin.model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEspecialidad;

    private String titulo;

    private String funcion;

    private String fechGraduacion;

    @ManyToOne
    @JoinColumn(name = "IdMedico", nullable = false)
    private pe.edu.cibertec.T2_SW_Flores_Anakin.model.bd.Medico medico;
}
