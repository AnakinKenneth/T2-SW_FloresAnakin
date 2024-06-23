package pe.edu.cibertec.T2_SW_Flores_Anakin.service;

import pe.edu.cibertec.T2_SW_Flores_Anakin.model.bd.Especialidad;
import pe.edu.cibertec.T2_SW_Flores_Anakin.model.bd.Medico;
import pe.edu.cibertec.T2_SW_Flores_Anakin.model.dto.EspecialidadDto;
import pe.edu.cibertec.T2_SW_Flores_Anakin.model.dto.MedicoDto;

import java.util.List;

public  interface IEspecialidadService {
    Especialidad guardarMedico(Especialidad Especialidad, EspecialidadDto EspecialidadDto);
    List<Especialidad> listarEspecialidad();
    void eliminarEspecialidad(int idespecialidad);
}
