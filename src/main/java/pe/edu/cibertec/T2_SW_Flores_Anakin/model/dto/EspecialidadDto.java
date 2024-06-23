package pe.edu.cibertec.T2_SW_Flores_Anakin.model.dto;

import lombok.Data;

@Data
public class EspecialidadDto {

    private Long idEspecialidad;

    private String titulo;

    private String funcion;

    private String fechgraduacion;
    private pe.edu.cibertec.T2_SW_Flores_Anakin.model.bd.Medico medico;

}
