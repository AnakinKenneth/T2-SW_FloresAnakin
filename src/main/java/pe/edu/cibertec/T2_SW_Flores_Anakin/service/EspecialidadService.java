package pe.edu.cibertec.T2_SW_Flores_Anakin.service;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.cibertec.T2_SW_Flores_Anakin.model.bd.Especialidad;
import pe.edu.cibertec.T2_SW_Flores_Anakin.model.dto.EspecialidadDto;
import pe.edu.cibertec.T2_SW_Flores_Anakin.repository.EspecialidadRepository;

import java.util.List;
import java.util.Optional;

public class EspecialidadService implements IEspecialidadService {

    private EspecialidadRepository especialidadRepository;
    @Override
    public Especialidad guardarMedico(Especialidad Especialidad, EspecialidadDto EspecialidadDto) {
        return null;
    }

    @Override
    public List<Especialidad> listarEspecialidad() {
        return especialidadRepository.findAll();
    }

    @Override
    public void eliminarEspecialidad(int idespecialidad) {
        especialidadRepository.deleteById(idespecialidad);
    }
}
